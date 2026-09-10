package com.jeff.pets.cobblepets.client;

import me.shedaniel.autoconfig.AutoConfig;
import net.minecraft.resources.Identifier;

import static com.jeff.pets.client.Central.CONFIG;
import static com.jeff.pets.cobblepets.Cobblepets.MOD_ID;
import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;
import static com.jeff.pets.cobblepets.client.Vals.*;

public class Utils extends com.jeff.pets.client.Utils {
    public static Identifier cobble(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
    public static Identifier getSkin(String base, String name) {
        if (name.endsWith(".png")) {
            throw new IllegalArgumentException(name + " ended in .png. Remove the extension; it is automatically handled for you.");
        }
        return COBBLE_CONFIG.isShiny ? cobble(base + "shiny.png") : cobble(base + name + ".png");
    }
    public static Identifier getSkin(String skin, String base, String name) {
        if (name.endsWith(".png")) throw new IllegalArgumentException(name + " ended in .png. Remove the extension; it is automatically handled for you.");
        switch (skin) {
            case "normal" -> {
                if (COBBLE_CONFIG.isShiny) {
                    return cobble(base + "shiny.png");
                }
                return cobble(base + name + ".png");
            }
            case "galarian" -> {
                if (COBBLE_CONFIG.isShiny) {
                    return cobble(base + "galarian_shiny.png");
                }
                return cobble(base + "galarian.png");
            }
            case "alolan" -> {
                if (COBBLE_CONFIG.isShiny) {
                    return cobble(base + "alolan_shiny.png");
                }
                return cobble(base + "alolan.png");
            } case "hisuian" -> {
                if (COBBLE_CONFIG.isShiny) {
                    return cobble(base + "hisuian_shiny.png");
                }
                return cobble(base + "hisuian.png");
            }
            case null, default -> throw new IllegalArgumentException("Skin for pet " + name + " did not match any accepted skins! Skin: " + skin);
        }
    }
    public static void assignName(String name) {
        switch (CONFIG.activePet) {
            case BULBASAUR -> COBBLE_CONFIG.bulbasorName = name;
            case IVYSAUR -> COBBLE_CONFIG.ivysaurName = name;
            case VENUSAUR -> COBBLE_CONFIG.venusaurName = name;
            case CHARMANDER -> COBBLE_CONFIG.charmanderName = name;
            case CHARMELEON -> COBBLE_CONFIG.charmeleonName = name;
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
            case RATTATA -> COBBLE_CONFIG.rattataName = name;
            case RATICATE -> COBBLE_CONFIG.raticateName = name;
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
            case BELLSPROUT -> COBBLE_CONFIG.bellsproutName = name;
            case WEEPINBELL -> COBBLE_CONFIG.weepinbellName = name;
            case VICTREEBEL -> COBBLE_CONFIG.victreebelName = name;
            case TENTACOOL -> COBBLE_CONFIG.tentacoolName = name;
            case TENTACRUEL -> COBBLE_CONFIG.tentacruelName = name;
            case GEODUDE -> COBBLE_CONFIG.geodudeName = name;
            case GRAVELER -> COBBLE_CONFIG.gravelerName = name;
            case GOLEM -> COBBLE_CONFIG.golemName = name;
            case PONYTA -> COBBLE_CONFIG.ponytaName = name;
            case RAPIDASH -> COBBLE_CONFIG.rapidashName = name;
            case SLOWPOKE -> COBBLE_CONFIG.slowpokeName = name;
            case SLOWBRO -> COBBLE_CONFIG.slowbroName = name;
            case MAGNEMITE -> COBBLE_CONFIG.magnemiteName = name;
            case MAGNETON -> COBBLE_CONFIG.magnetonName = name;
            case FARFETCHD -> COBBLE_CONFIG.farfetchdName = name;
            case DODUO -> COBBLE_CONFIG.doduoName = name;
            case DODRIO -> COBBLE_CONFIG.dodrioName = name;
            case SEEL -> COBBLE_CONFIG.seelName = name;
            case DEWGONG -> COBBLE_CONFIG.dewgongName = name;
            case GRIMER -> COBBLE_CONFIG.grimerName = name;
            case MUK -> COBBLE_CONFIG.mukName = name;
            case SHELLDER -> COBBLE_CONFIG.shellderName = name;
            case CLOYSTER -> COBBLE_CONFIG.cloysterName = name;
            case GASTLY -> COBBLE_CONFIG.gastlyName = name;
            case HAUNTER -> COBBLE_CONFIG.haunterName = name;
            case GENGAR -> COBBLE_CONFIG.gengarName = name;
            case ONIX -> COBBLE_CONFIG.onixName = name;
            case DROWZEE -> COBBLE_CONFIG.drowzeeName = name;
            case HYPNO -> COBBLE_CONFIG.hypnoName = name;
            case KRABBY -> COBBLE_CONFIG.krabbyName = name;
            case KINGLER -> COBBLE_CONFIG.kinglerName = name;
            case VOLTORB -> COBBLE_CONFIG.voltorbName = name;
            case ELECTRODE -> COBBLE_CONFIG.electrodeName = name;
            case EXEGGCUTE -> COBBLE_CONFIG.exeggcuteName = name;
            case EXEGGUTOR -> COBBLE_CONFIG.exeggutorName = name;
            case RIOLU -> COBBLE_CONFIG.rioluName = name;
            case LUCARIO -> COBBLE_CONFIG.lucarioName = name;
            case SNIVY -> COBBLE_CONFIG.snivyName = name;
            case SERVINE -> COBBLE_CONFIG.servineName = name;
            case SERPERIOR -> COBBLE_CONFIG.serperiorName = name;
            case CUBONE -> COBBLE_CONFIG.cuboneName = name;
            case MAROWAK -> COBBLE_CONFIG.marowakName = name;

            case null, default -> {
            }
        }
        AutoConfig.getConfigHolder(CobblepetsConfig.class).save();
    }

    public static boolean isShiny() {
        return COBBLE_CONFIG.isShiny;
    }
}
