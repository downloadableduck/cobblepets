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
