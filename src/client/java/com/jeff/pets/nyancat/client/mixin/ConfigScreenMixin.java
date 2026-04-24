package com.jeff.pets.nyancat.client.mixin;

import com.jeff.pets.PetsConfig;
import com.jeff.pets.PetsConfigScreen;
import com.jeff.pets.nyancat.client.NyanCatValues;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static com.jeff.pets.nyancat.client.NyanCatClient.NYAN_CAT_CONFIG;
import static com.jeff.pets.nyancat.client.NyanCatClient.NYAN_CAT_VALUE;

@Mixin(PetsConfigScreen.class)
public class ConfigScreenMixin {

    @Inject(at = @At("HEAD"), method = "lambda$getModConfigScreenFactory$4", cancellable = true)
    private static void addCustomEntitySpecies(PetsConfig CONFIG, CallbackInfoReturnable<Enum<?>> cir) {
        if (CONFIG.activePet.equals(NYAN_CAT_VALUE)) {
            cir.setReturnValue(NyanCatValues.valueOf(CONFIG.activePet));
        }
    }

    @Inject(at = @At("HEAD"), method = "lambda$getModConfigScreenFactory$8", cancellable = true)
    private static void addCustomEntitySkin(PetsConfig CONFIG, CallbackInfoReturnable<Enum<?>> cir) {
        if (CONFIG.activePet.equals(NYAN_CAT_VALUE)) {
            cir.setReturnValue(NyanCatValues.valueOf(CONFIG.activePet));
        }
    }

    @Inject(at = @At("HEAD"), method = "lambda$getModConfigScreenFactory$6", cancellable = true)
    private static void addCustomEntityName(PetsConfig CONFIG, CallbackInfoReturnable<String> cir) {
        if (CONFIG.activePet.equals(NYAN_CAT_VALUE)) {
            cir.setReturnValue(NYAN_CAT_CONFIG.nyanCatName);
        }
    }

    @Inject(at = @At("HEAD"), method = "lambda$getModConfigScreenFactory$7")
    private static void setCustomEntityName(String activePet, PetsConfig CONFIG, String name, CallbackInfo ci) {
        if (CONFIG.activePet.equals(NYAN_CAT_VALUE)) {
            NYAN_CAT_CONFIG.nyanCatName = name;
        }
    }
}
