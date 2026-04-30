package com.jeff.pets.cobblepets.client;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Vals {
    public static final String BULBASAUR = "bulbasaur";
    public static final String IVYSAUR = "ivysaur";
    public static final String VENUSAUR = "venusaur";
    public static final String CHARMANDER = "charmander";
    public static final String CHARMELEON = "charmeleon";
    public static final String CHARIZARD = "charizard";
    public static final String SQUIRTLE = "squirtle";
    public static final String WARTORTLE = "wartortle";
    public static final String BLASTOISE = "blastoise";
    public static final String CATERPIE = "caterpie";
    public static final String METAPOD = "metapod";
    public static final String BUTTERFREE = "butterfree";
    public static final String WEEDLE = "weedle";
    public static final String KAKUNA = "kakuna";
    public static final String BEEDRILL = "beedrill";
    public static final String PIDGEY = "pidgey";
    public static final String PIDGEOTTO = "pidgeotto";
    public static final String PIDGEOT = "pidgeot";
    public static final String MEW = "mew";
    public static final String MEWTWO = "mewtwo";
    public static final String DITTO = "ditto";
    public static final String RATTATA = "rattata";
    public static final String RATICATE = "raticate";
    public static final String SPEAROW = "spearow";
    public static final String FEAROW = "fearow";
    public static final String EKANS = "ekans";
    public static final String ARBOK = "arbok";
    public static final String PIKACHU = "pikachu";
    public static final String RAICHU = "raichu";
    public static final String SANDSHREW = "sandshrew";
    public static final String SANDSLASH = "sandslash";
    public static final String NIDORANF = "nidoranf";
    public static final String NIDORINA = "nidorina";
    public static final String NIDOQUEEN = "nidoqueen";
    public static final String NIDORANM = "nidoranm";
    public static final String NIDORINO = "nidorino";
    public static final String NIDOKING = "nidoking";
    public static final String CLEFAIRY = "clefairy";
    public static final String CLEFABLE = "clefable";
    public static final String VULPIX = "vulpix";
    public static final String NINETALES = "ninetales";
    public static final String JIGGLYPUFF = "jigglypuff";
    public static final String WIGGLYTUFF = "wigglytuff";
    public static final String ZUBAT = "zubat";
    public static final String GOLBAT = "golbat";
    public static final String ODDISH = "oddish";
    public static final String GLOOM = "gloom";
    public static final String VILEPLUME = "vileplume";
    public static final String PARAS = "paras";
    public static final String PARASECT = "parasect";
    public static final String VENONAT = "venonat";
    public static final String VENOMOTH = "venomoth";
    public static final String DIGLETT = "diglett";
    public static final String DUGTRIO = "dugtrio";

    public static String[] getVals() {
        List<String> vals = new ArrayList<>();
        Field[] fields = Vals.class.getDeclaredFields();
        for (Field field : fields) {
            try {
                vals.add((String) field.get(null));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return vals.toArray(new String[0]);
    }
}
