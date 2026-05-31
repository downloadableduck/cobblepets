package com.jeff.pets.cobblepets.client.mixin;

import com.jeff.pets.Central;
import com.jeff.pets.cobblepets.client.Utils;
import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
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
import static com.jeff.pets.Central.currentSuggestions;
import static com.jeff.pets.cobblepets.client.Vals.getVals;

@Mixin(Central.class)
public class CentralMixin {

    @Inject(at = @At("HEAD"), method = "lambda$createPetNameCommand$1")
    private static void init(CommandContext<?> context, CallbackInfoReturnable<Integer> cir) {
        String name = StringArgumentType.getString(context, "name");
        Utils.assignName(name);
    }

    @Inject(at = @At("TAIL"), method = "updateSuggestions")
    private static void updateSuggestions(Minecraft client, CallbackInfo ci, @Local(name="skinSuggestions") List<String> skinSuggestions) {
        if (Arrays.stream(getVals()).anyMatch(Predicate.isEqual(CONFIG.activePet))) {
            currentSuggestions.remove("adult");
            currentSuggestions.remove("baby");
            currentSuggestions.removeAll(skinSuggestions);
        }
    }
}
