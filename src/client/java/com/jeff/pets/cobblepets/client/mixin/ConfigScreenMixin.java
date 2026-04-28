package com.jeff.pets.cobblepets.client.mixin;

import com.jeff.pets.PetsConfig;
import com.jeff.pets.PetsConfigScreen;
import com.jeff.pets.cobblepets.client.CobblepetsConfig;
import com.jeff.pets.cobblepets.client.CobblepetsPetList;
import com.jeff.pets.cobblepets.client.Vals;
import com.jeff.pets.cobblepets.client.enums.ButterfreeSkins;
import me.shedaniel.autoconfig.AutoConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Arrays;
import java.util.function.Predicate;

import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;
import static com.jeff.pets.cobblepets.client.Vals.*;

@Mixin(PetsConfigScreen.class)
public class ConfigScreenMixin {

    @Inject(at = @At("HEAD"), method = "lambda$getModConfigScreenFactory$4", cancellable = true)
    private static void addCustomEntitySpecies(PetsConfig CONFIG, CallbackInfoReturnable<Enum<?>> cir) {
        if (Arrays.stream(getVals()).anyMatch(Predicate.isEqual(CONFIG.activePet))) {
            cir.setReturnValue(CobblepetsPetList.valueOf(CONFIG.activePet));
        }
    }

    @Inject(at = @At("HEAD"), method = "lambda$getModConfigScreenFactory$8", cancellable = true)
    private static void addCustomEntitySkin(PetsConfig CONFIG, CallbackInfoReturnable<Enum<?>> cir) {
        if (CONFIG.activePet.equals("butterfree")) {
            cir.setReturnValue(ButterfreeSkins.valueOf(COBBLE_CONFIG.butterfreeSkin));
        }
        else if (Arrays.stream(getVals()).anyMatch(Predicate.isEqual(CONFIG.activePet)) && !CONFIG.activePet.equals("butterfree")) {
            cir.setReturnValue(CobblepetsPetList.valueOf(CONFIG.activePet));
        }
    }

    @Inject(at = @At("HEAD"), method = "lambda$getModConfigScreenFactory$6", cancellable = true)
    private static void addCustomEntityName(PetsConfig CONFIG, CallbackInfoReturnable<String> cir) {
        switch (CONFIG.activePet) {
            case BULBASAUR -> cir.setReturnValue(COBBLE_CONFIG.bulbasorName);
            case IVYSAUR -> cir.setReturnValue(COBBLE_CONFIG.ivysaurName);
            case VENUSAUR -> cir.setReturnValue(COBBLE_CONFIG.venusaurName);
            case CHARMANDER -> cir.setReturnValue(COBBLE_CONFIG.charmanderName);
            case CHARMELEON -> cir.setReturnValue(COBBLE_CONFIG.charmeleonName);
            case CHARIZARD -> cir.setReturnValue(COBBLE_CONFIG.charizardName);
            case SQUIRTLE -> cir.setReturnValue(COBBLE_CONFIG.squirtleName);
            case WARTORTLE -> cir.setReturnValue(COBBLE_CONFIG.wartortleName);
            case BLASTOISE -> cir.setReturnValue(COBBLE_CONFIG.blastoiseName);
            case CATERPIE -> cir.setReturnValue(COBBLE_CONFIG.caterpieName);
            case METAPOD -> cir.setReturnValue(COBBLE_CONFIG.metapodName);
            case BUTTERFREE -> cir.setReturnValue(COBBLE_CONFIG.butterfreeName);
            case WEEDLE -> cir.setReturnValue(COBBLE_CONFIG.weedleName);
            case KAKUNA -> cir.setReturnValue(COBBLE_CONFIG.kakunaName);
            case BEEDRILL -> cir.setReturnValue(COBBLE_CONFIG.beedrillName);
            case PIDGEY -> cir.setReturnValue(COBBLE_CONFIG.pidgeyName);
            case PIDGEOTTO -> cir.setReturnValue(COBBLE_CONFIG.pidgeottoName);
            case PIDGEOT -> cir.setReturnValue(COBBLE_CONFIG.pidgeotName);
            case MEW -> cir.setReturnValue(COBBLE_CONFIG.mewName);
            case MEWTWO -> cir.setReturnValue(COBBLE_CONFIG.mewtwoName);
            case DITTO -> cir.setReturnValue(COBBLE_CONFIG.dittoName);
            case RATTATA -> cir.setReturnValue(COBBLE_CONFIG.rattataName);
            case RATICATE -> cir.setReturnValue(COBBLE_CONFIG.raticateName);
            case SPEAROW -> cir.setReturnValue(COBBLE_CONFIG.spearowName);
            case FEAROW -> cir.setReturnValue(COBBLE_CONFIG.fearowName);
            case EKANS -> cir.setReturnValue(COBBLE_CONFIG.ekansName);
            case ARBOK -> cir.setReturnValue(COBBLE_CONFIG.arbokName);
            case PIKACHU -> cir.setReturnValue(COBBLE_CONFIG.pikachuName);
            case RAICHU -> cir.setReturnValue(COBBLE_CONFIG.raichuName);
            case SANDSHREW -> cir.setReturnValue(COBBLE_CONFIG.sandshrewName);
            case SANDSLASH -> cir.setReturnValue(COBBLE_CONFIG.sandslashName);
        }
    }

    @Inject(at = @At("HEAD"), method = "lambda$getModConfigScreenFactory$7")
    private static void setCustomEntityName(String activePet, PetsConfig CONFIG, String name, CallbackInfo ci) {
        switch (CONFIG.activePet) {
            case BULBASAUR -> COBBLE_CONFIG.bulbasorName = name;
            case IVYSAUR -> COBBLE_CONFIG.ivysaurName = name;
            case VENUSAUR -> COBBLE_CONFIG.venusaurName = name;
            case CHARMANDER -> COBBLE_CONFIG.charmanderName = name;
            case CHARMELEON ->  COBBLE_CONFIG.charmeleonName = name;
            case CHARIZARD -> COBBLE_CONFIG.charizardName = name;
            case SQUIRTLE -> COBBLE_CONFIG.squirtleName = name;
            case BLASTOISE -> COBBLE_CONFIG.blastoiseName = name;
            case WARTORTLE -> COBBLE_CONFIG.wartortleName = name;
            case CATERPIE -> COBBLE_CONFIG.caterpieName = name;
            case METAPOD -> COBBLE_CONFIG.metapodName = name;
            case BUTTERFREE -> COBBLE_CONFIG.butterfreeName = name;
            case WEEDLE -> COBBLE_CONFIG.weedleName = name;
            case KAKUNA -> COBBLE_CONFIG.kakunaName = name;
            case BEEDRILL -> COBBLE_CONFIG.beedrillName = name;
            case PIDGEY -> COBBLE_CONFIG.pidgeyName = name;
            case PIDGEOTTO -> COBBLE_CONFIG.pidgeottoName = name;
            case PIDGEOT -> COBBLE_CONFIG.pidgeotName = name;
            case MEW -> COBBLE_CONFIG.mewName = name;
            case MEWTWO -> COBBLE_CONFIG.mewtwoName = name;
            case DITTO -> COBBLE_CONFIG.dittoName = name;
            case RATICATE -> COBBLE_CONFIG.raticateName = name;
            case RATTATA -> COBBLE_CONFIG.rattataName = name;
            case SPEAROW -> COBBLE_CONFIG.spearowName = name;
            case FEAROW -> COBBLE_CONFIG.fearowName = name;
            case EKANS -> COBBLE_CONFIG.ekansName = name;
            case ARBOK -> COBBLE_CONFIG.arbokName = name;
            case PIKACHU -> COBBLE_CONFIG.pikachuName = name;
            case RAICHU -> COBBLE_CONFIG.raichuName = name;
            case SANDSHREW -> COBBLE_CONFIG.sandshrewName = name;
            case SANDSLASH -> COBBLE_CONFIG.sandslashName = name;
        }
        AutoConfig.getConfigHolder(CobblepetsConfig.class).save();
    }
}
