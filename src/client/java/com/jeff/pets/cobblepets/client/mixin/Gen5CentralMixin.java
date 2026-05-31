package com.jeff.pets.cobblepets.client.mixin;

import com.jeff.pets.Central;
import com.jeff.pets.cobblepets.Cobblepets;
import com.jeff.pets.cobblepets.client.CobblepetsConfig;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.pets.gen4.riolu.Lucario;
import com.jeff.pets.cobblepets.pets.gen4.riolu.Riolu;
import com.jeff.pets.cobblepets.pets.gen5.snivy.Serperior;
import com.jeff.pets.cobblepets.pets.gen5.snivy.Servine;
import com.jeff.pets.cobblepets.pets.gen5.snivy.Snivy;
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

import static com.jeff.pets.Central.CONFIG;
import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;
import static com.jeff.pets.cobblepets.client.StaticUtils.spawnEntity;
import static com.jeff.pets.cobblepets.client.Vals.*;

@Mixin(Central.class)
public class Gen5CentralMixin {
    private static Snivy snivy;
    private static Servine servine;
    private static Serperior serperior;

    @Shadow
    private static void updateSuggestions(Minecraft client) {

    }

    @Inject(at = @At("HEAD"), method = "lambda$createPetSpeciesCommand$1", cancellable = true)
    private void createPetSpeciesCommand(CommandContext<FabricClientCommandSource> context, CallbackInfoReturnable<Integer> cir) {
        String species = StringArgumentType.getString(context, "species");
        boolean handled = true;
        switch(species) {
            case SNIVY -> {
                spawnEntity(context, snivy, SNIVY);
            }
            case SERVINE -> {
                spawnEntity(context, servine, SERVINE);
            }
            case SERPERIOR -> {
                spawnEntity(context, serperior, SERPERIOR);
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
        snivy = new Snivy(Cobblepets.SNIVY, level);
        servine = new Servine(Cobblepets.SERVINE, level);
        serperior = new Serperior(Cobblepets.SERPERIOR, level);

        switch(CONFIG.activePet) {
            case SNIVY -> Utils.summonPet(snivy, COBBLE_CONFIG.snivyName);
            case SERVINE -> Utils.summonPet(servine, COBBLE_CONFIG.servineName);
            case SERPERIOR -> Utils.summonPet(serperior, COBBLE_CONFIG.serperiorName);
        }
    }
    @Inject(at = @At("HEAD"), method = "despawnPet")
    private static void despawnPet(CallbackInfo ci) {
        List<Entity> entities = new ArrayList<>();
        Field[] fields = Gen5CentralMixin.class.getDeclaredFields();
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
        Utils.checkName(SNIVY, snivy, COBBLE_CONFIG.snivyName);
        Utils.checkName(SERVINE, servine, COBBLE_CONFIG.servineName);
        Utils.checkName(SERPERIOR, serperior, COBBLE_CONFIG.serperiorName);
    }
}
