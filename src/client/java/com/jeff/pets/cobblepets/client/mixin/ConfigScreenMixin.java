package com.jeff.pets.cobblepets.client.mixin;

import com.jeff.pets.PetsConfig;
import com.jeff.pets.PetsConfigScreen;
import com.jeff.pets.cobblepets.client.CobblepetsConfig;
import com.jeff.pets.cobblepets.client.CobblepetsPetList;
import com.jeff.pets.cobblepets.client.Utils;
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
            case BELLSPROUT -> cir.setReturnValue(COBBLE_CONFIG.bellsproutName);
            case WEEPINBELL -> cir.setReturnValue(COBBLE_CONFIG.weepinbellName);
            case VICTREEBEL -> cir.setReturnValue(COBBLE_CONFIG.victreebelName);
            case TENTACOOL -> cir.setReturnValue(COBBLE_CONFIG.tentacoolName);
            case TENTACRUEL -> cir.setReturnValue(COBBLE_CONFIG.tentacruelName);
            case GEODUDE -> cir.setReturnValue(COBBLE_CONFIG.geodudeName);
            case GRAVELER -> cir.setReturnValue(COBBLE_CONFIG.gravelerName);
            case GOLEM -> cir.setReturnValue(COBBLE_CONFIG.golemName);
            case PONYTA -> cir.setReturnValue(COBBLE_CONFIG.ponytaName);
            case RAPIDASH -> cir.setReturnValue(COBBLE_CONFIG.rapidashName);
            case SLOWPOKE -> cir.setReturnValue(COBBLE_CONFIG.slowpokeName);
            case SLOWBRO -> cir.setReturnValue(COBBLE_CONFIG.slowbroName);
            case MAGNEMITE -> cir.setReturnValue(COBBLE_CONFIG.magnemiteName);
            case MAGNETON -> cir.setReturnValue(COBBLE_CONFIG.magnetonName);
            case FARFETCHD -> cir.setReturnValue(COBBLE_CONFIG.farfetchdName);
            case DODUO -> cir.setReturnValue(COBBLE_CONFIG.doduoName);
            case DODRIO -> cir.setReturnValue(COBBLE_CONFIG.dodrioName);
            case SEEL -> cir.setReturnValue(COBBLE_CONFIG.seelName);
            case DEWGONG -> cir.setReturnValue(COBBLE_CONFIG.dewgongName);
            case GRIMER -> cir.setReturnValue(COBBLE_CONFIG.grimerName);
            case MUK -> cir.setReturnValue(COBBLE_CONFIG.mukName);
            case SHELLDER -> cir.setReturnValue(COBBLE_CONFIG.shellderName);
            case CLOYSTER -> cir.setReturnValue(COBBLE_CONFIG.cloysterName);
            case GASTLY -> cir.setReturnValue(COBBLE_CONFIG.gastlyName);
            case HAUNTER -> cir.setReturnValue(COBBLE_CONFIG.haunterName);
            case GENGAR -> cir.setReturnValue(COBBLE_CONFIG.gengarName);
            case ONIX -> cir.setReturnValue(COBBLE_CONFIG.onixName);
            case DROWZEE -> cir.setReturnValue(COBBLE_CONFIG.drowzeeName);
            case HYPNO -> cir.setReturnValue(COBBLE_CONFIG.hypnoName);
            case KRABBY -> cir.setReturnValue(COBBLE_CONFIG.krabbyName);
            case KINGLER -> cir.setReturnValue(COBBLE_CONFIG.kinglerName);
            case VOLTORB -> cir.setReturnValue(COBBLE_CONFIG.voltorbName);
            case ELECTRODE -> cir.setReturnValue(COBBLE_CONFIG.electrodeName);
            case EXEGGCUTE -> cir.setReturnValue(COBBLE_CONFIG.exeggcuteName);
            case EXEGGUTOR -> cir.setReturnValue(COBBLE_CONFIG.exeggutorName);
            case RIOLU -> cir.setReturnValue(COBBLE_CONFIG.rioluName);
            case LUCARIO -> cir.setReturnValue(COBBLE_CONFIG.lucarioName);
            case SNIVY -> cir.setReturnValue(COBBLE_CONFIG.snivyName);
            case SERVINE -> cir.setReturnValue(COBBLE_CONFIG.servineName);
            case SERPERIOR -> cir.setReturnValue(COBBLE_CONFIG.serperiorName);
            case CUBONE -> cir.setReturnValue(COBBLE_CONFIG.cuboneName);
            case MAROWAK -> cir.setReturnValue(COBBLE_CONFIG.marowakName);
        }
    }

    @Inject(at = @At("HEAD"), method = "lambda$getModConfigScreenFactory$7")
    private static void setCustomEntityName(String activePet, PetsConfig CONFIG, String name, CallbackInfo ci) {
        Utils.assignName(name);
    }
}
