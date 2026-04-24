package com.jeff.pets.nyancat.client.mixin;

import com.jeff.pets.Central;
import com.jeff.pets.PetsConfig;
import com.jeff.pets.Utils;
import com.jeff.pets.nyancat.NyanCat;
import com.jeff.pets.nyancat.PetsmodNyanCat;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Objects;

import static com.jeff.pets.Central.CONFIG;
import static com.jeff.pets.nyancat.client.NyanCatClient.*;

@Mixin(Central.class)
public class CentralMixin {
    @Unique
    private static NyanCat nyanCat;

    @Unique
    private static void spawnCustomEntity(CommandContext<FabricClientCommandSource> context, Entity entity, String activePet) {
        Utils.setActivePet(entity, activePet);
        AutoConfig.getConfigHolder(PetsConfig.class).save();
        context.getSource().sendFeedback(Component.literal("§b[PetsMod] §aYour active pet has been switched to " + activePet.replace("_", " ")));
        Central.despawnPet();
        Central.summonPet();
    }

    @Inject(at = @At("HEAD"), method = "lambda$createSummonCommand$1", cancellable = true)
    private static void createSummonCommand(CommandContext<FabricClientCommandSource> context, CallbackInfoReturnable<Integer> cir) {
        String species = StringArgumentType.getString(context, "species");
        if (Objects.equals(species, NYAN_CAT_VALUE_NO_SPACES) || Objects.equals(species, NYAN_CAT_VALUE)) {
            spawnCustomEntity(context, nyanCat, NYAN_CAT_VALUE);
            cir.setReturnValue(1);
        }
    }

    @Inject(at = @At("HEAD"), method = "summonPet")
    private static void summonPet(CallbackInfo ci) {
        nyanCat = new NyanCat(PetsmodNyanCat.NYAN_CAT, Minecraft.getInstance().level);
        if (Objects.equals(CONFIG.activePet, NYAN_CAT_VALUE)) {
            Utils.summonPet(nyanCat, NYAN_CAT_CONFIG.nyanCatName);
        }
    }

    @Inject(at = @At("HEAD"), method = "despawnPet")
    private static void despawnPet(CallbackInfo ci) {
        Utils.despawnEntity(nyanCat);
    }

    @Inject(at = @At("HEAD"), method = "lambda$createNameCommand$1")
    private static void init(CommandContext<?> context, CallbackInfoReturnable<Integer> cir) {

        String name = StringArgumentType.getString(context, "name");
        if (Objects.equals(CONFIG.activePet, NYAN_CAT_VALUE)) {
            NYAN_CAT_CONFIG.nyanCatName = name;
        }
    }

    @Inject(at = @At("HEAD"), method = "refreshPetNames")
    private static void refreshPetNames(CallbackInfo ci) {
        if (Utils.checkName(NYAN_CAT_VALUE, nyanCat, NYAN_CAT_CONFIG.nyanCatName)) {
            nyanCat.setName(NYAN_CAT_CONFIG.nyanCatName);
        }
    }
}