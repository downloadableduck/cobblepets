package com.jeff.pets.cobblepets.client.mixin;

import com.jeff.pets.PetsConfig;
import com.jeff.pets.PetsConfigScreen;
import com.jeff.pets.cobblepets.client.CobblepetsConfig;
import com.jeff.pets.cobblepets.client.CobblepetsPetList;
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
        if (Arrays.stream(getVals()).anyMatch(Predicate.isEqual(CONFIG.activePet))) {
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
            case NIDORANF -> cir.setReturnValue(COBBLE_CONFIG.nidoranfName);
            case NIDORINA -> cir.setReturnValue(COBBLE_CONFIG.nidorinaName);
            case NIDOQUEEN -> cir.setReturnValue(COBBLE_CONFIG.nidoqueenName);
            case NIDORANM -> cir.setReturnValue(COBBLE_CONFIG.nidoranmName);
            case NIDORINO -> cir.setReturnValue(COBBLE_CONFIG.nidorinoName);
            case NIDOKING -> cir.setReturnValue(COBBLE_CONFIG.nidokingName);
            case CLEFAIRY -> cir.setReturnValue(COBBLE_CONFIG.clefairyName);
            case CLEFABLE -> cir.setReturnValue(COBBLE_CONFIG.clefableName);
            case VULPIX -> cir.setReturnValue(COBBLE_CONFIG.vulpixName);
            case NINETALES -> cir.setReturnValue(COBBLE_CONFIG.ninetalesName);
            case JIGGLYPUFF -> cir.setReturnValue(COBBLE_CONFIG.jigglypuffName);
            case WIGGLYTUFF -> cir.setReturnValue(COBBLE_CONFIG.wigglytuffName);
            case ZUBAT -> cir.setReturnValue(COBBLE_CONFIG.zubatName);
            case GOLBAT -> cir.setReturnValue(COBBLE_CONFIG.golbatName);
            case ODDISH -> cir.setReturnValue(COBBLE_CONFIG.oddishName);
            case GLOOM -> cir.setReturnValue(COBBLE_CONFIG.gloomName);
            case VILEPLUME -> cir.setReturnValue(COBBLE_CONFIG.vileplumeName);
            case PARAS -> cir.setReturnValue(COBBLE_CONFIG.parasName);
            case PARASECT -> cir.setReturnValue(COBBLE_CONFIG.parasectName);
            case VENONAT -> cir.setReturnValue(COBBLE_CONFIG.venonatName);
            case VENOMOTH -> cir.setReturnValue(COBBLE_CONFIG.venomothName);
            case DIGLETT -> cir.setReturnValue(COBBLE_CONFIG.diglettName);
            case DUGTRIO -> cir.setReturnValue(COBBLE_CONFIG.dugtrioName);
            case MEOWTH -> cir.setReturnValue(COBBLE_CONFIG.meowthName);
            case PERSIAN -> cir.setReturnValue(COBBLE_CONFIG.persianName);
            case PSYDUCK -> cir.setReturnValue(COBBLE_CONFIG.psyduckName);
            case GOLDUCK -> cir.setReturnValue(COBBLE_CONFIG.golduckName);
            case MANKEY -> cir.setReturnValue(COBBLE_CONFIG.mankeyName);
            case PRIMEAPE -> cir.setReturnValue(COBBLE_CONFIG.primeapeName);
            case GROWLITHE -> cir.setReturnValue(COBBLE_CONFIG.growlithName);
            case ARCANINE -> cir.setReturnValue(COBBLE_CONFIG.arcanineName);
            case POLIWAG -> cir.setReturnValue(COBBLE_CONFIG.poliwagName);
            case POLIWHIRL -> cir.setReturnValue(COBBLE_CONFIG.poliwhirlName);
            case POLIWRATH -> cir.setReturnValue(COBBLE_CONFIG.poliwrathName);
            case ABRA -> cir.setReturnValue(COBBLE_CONFIG.abraName);
            case KADABRA -> cir.setReturnValue(COBBLE_CONFIG.kadabraName);
            case ALAKAZAM -> cir.setReturnValue(COBBLE_CONFIG.alakazamName);
            case MACHOP -> cir.setReturnValue(COBBLE_CONFIG.machopName);
            case MACHOKE -> cir.setReturnValue(COBBLE_CONFIG.machokeName);
            case MACHAMP -> cir.setReturnValue(COBBLE_CONFIG.machampName);
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
            case NIDORANF -> COBBLE_CONFIG.nidoranfName = name;
            case NIDORINA -> COBBLE_CONFIG.nidorinaName = name;
            case NIDOQUEEN -> COBBLE_CONFIG.nidoqueenName = name;
            case NIDORANM -> COBBLE_CONFIG.nidoranmName = name;
            case NIDORINO -> COBBLE_CONFIG.nidorinoName = name;
            case NIDOKING -> COBBLE_CONFIG.nidokingName = name;
            case CLEFAIRY -> COBBLE_CONFIG.clefairyName = name;
            case CLEFABLE -> COBBLE_CONFIG.clefableName = name;
            case VULPIX -> COBBLE_CONFIG.vulpixName = name;
            case NINETALES -> COBBLE_CONFIG.ninetalesName = name;
            case JIGGLYPUFF -> COBBLE_CONFIG.jigglypuffName = name;
            case WIGGLYTUFF -> COBBLE_CONFIG.wigglytuffName = name;
            case ZUBAT -> COBBLE_CONFIG.zubatName = name;
            case GOLBAT -> COBBLE_CONFIG.golbatName = name;
            case ODDISH -> COBBLE_CONFIG.oddishName = name;
            case GLOOM -> COBBLE_CONFIG.gloomName = name;
            case VILEPLUME -> COBBLE_CONFIG.vileplumeName = name;
            case PARAS -> COBBLE_CONFIG.parasName = name;
            case PARASECT -> COBBLE_CONFIG.parasectName = name;
            case VENONAT -> COBBLE_CONFIG.venonatName = name;
            case VENOMOTH -> COBBLE_CONFIG.venomothName = name;
            case DIGLETT -> COBBLE_CONFIG.diglettName = name;
            case DUGTRIO -> COBBLE_CONFIG.dugtrioName = name;
            case MEOWTH -> COBBLE_CONFIG.meowthName = name;
            case PERSIAN -> COBBLE_CONFIG.persianName = name;
            case PSYDUCK -> COBBLE_CONFIG.psyduckName = name;
            case GOLDUCK -> COBBLE_CONFIG.golduckName = name;
            case MANKEY -> COBBLE_CONFIG.mankeyName = name;
            case PRIMEAPE -> COBBLE_CONFIG.primeapeName = name;
            case GROWLITHE -> COBBLE_CONFIG.growlithName = name;
            case ARCANINE -> COBBLE_CONFIG.arcanineName = name;
            case POLIWAG -> COBBLE_CONFIG.poliwagName = name;
            case POLIWHIRL -> COBBLE_CONFIG.poliwhirlName = name;
            case POLIWRATH -> COBBLE_CONFIG.poliwrathName = name;
            case ABRA -> COBBLE_CONFIG.abraName = name;
            case KADABRA -> COBBLE_CONFIG.kadabraName = name;
            case ALAKAZAM -> COBBLE_CONFIG.alakazamName = name;
            case MACHOP -> COBBLE_CONFIG.machopName = name;
            case MACHOKE -> COBBLE_CONFIG.machokeName = name;
            case MACHAMP -> COBBLE_CONFIG.machampName = name;
        }
        AutoConfig.getConfigHolder(CobblepetsConfig.class).save();
    }
}
