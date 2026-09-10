package com.jeff.pets.cobblepets.client.mixin;

import com.jeff.pets.client.Central;
import com.jeff.pets.cobblepets.Cobblepets;
import com.jeff.pets.cobblepets.client.CobblepetsConfig;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen4.riolu.Lucario;
import com.jeff.pets.cobblepets.pets.gen4.riolu.Riolu;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static com.jeff.pets.client.Central.CONFIG;
import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;
import static com.jeff.pets.cobblepets.client.Vals.*;
import static com.jeff.pets.cobblepets.client.StaticUtils.*;

@Mixin(Central.class)
public class Gen4CentralMixin {
    private static Riolu riolu;
    private static Lucario lucario;

    @Shadow
    private static void updateSuggestions(Minecraft client) {

    }

    @Inject(at = @At("HEAD"), method = "lambda$createPetSpeciesCommand$1", cancellable = true)
    private void createPetSpeciesCommand(CommandContext<FabricClientCommandSource> context, CallbackInfoReturnable<Integer> cir) {
        String species = StringArgumentType.getString(context, "species");
        boolean handled = true;
        switch(species) {
            case RIOLU -> {
                spawnEntity(context, riolu, RIOLU);
            }
            case LUCARIO -> {
                spawnEntity(context, lucario, LUCARIO);
            }
            default -> handled = false;
        }
        AutoConfig.getConfigHolder(CobblepetsConfig.class).save();
        if (handled) {
            updateSuggestions(Minecraft.getInstance());
            cir.setReturnValue(1);
        }
    }

    @Inject(at = @At("HEAD"), method = "summonPet")
    private static void summonPet(CallbackInfo ci) {
        ClientLevel level = Minecraft.getInstance().level;
        riolu = new Riolu(Cobblepets.RIOLU, level);
        lucario = new Lucario(Cobblepets.LUCARIO, level);

        switch(CONFIG.activePet) {
            case RIOLU -> Utils.summonPet(riolu, COBBLE_CONFIG.rioluName);
            case LUCARIO -> Utils.summonPet(lucario, COBBLE_CONFIG.lucarioName);
        }
    }

    @Inject(at = @At("HEAD"), method = "despawnPet")
    private static void despawnPet(CallbackInfo ci) {
        List<Entity> entities = new ArrayList<>();
        Field[] fields = Gen4CentralMixin.class.getDeclaredFields();
        for (Field field : fields) {
            try {
                if (Entity.class.isAssignableFrom(field.getType())) {
                    entities.add((Entity) field.get(null));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } for (Entity entity: entities) {
            Utils.despawnEntity(entity);
        }
    }

    @Inject(at = @At("HEAD"), method = "refreshPetNames")
    private static void refreshPetNames(CallbackInfo ci) {
        Utils.checkName(LUCARIO, lucario, COBBLE_CONFIG.lucarioName);
        Utils.checkName(RIOLU, riolu, COBBLE_CONFIG.rioluName);
    }
}
