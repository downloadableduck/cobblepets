package com.jeff.pets.cobblepets.client.mixin;

import com.jeff.pets.Central;
import com.jeff.pets.PetsConfig;
import com.jeff.pets.cobblepets.client.Utils;
import com.jeff.pets.cobblepets.client.CobblepetsConfig;
import com.jeff.pets.cobblepets.client.Vals;
import com.jeff.pets.cobblepets.client.rendering.gen1.slowpoke_tree.slowpoke.SlowpokeRenderer;
import com.jeff.pets.cobblepets.pets.gen1.abra.Abra;
import com.jeff.pets.cobblepets.pets.gen1.abra.Alakazam;
import com.jeff.pets.cobblepets.pets.gen1.abra.Kadabra;
import com.jeff.pets.cobblepets.pets.gen1.bellsprout.Bellsprout;
import com.jeff.pets.cobblepets.pets.gen1.bellsprout.Victreebel;
import com.jeff.pets.cobblepets.pets.gen1.bellsprout.Weepinbell;
import com.jeff.pets.cobblepets.pets.gen1.bulbasaur.Bulbasaur;
import com.jeff.pets.cobblepets.Cobblepets;
import com.jeff.pets.cobblepets.pets.gen1.bulbasaur.Ivysaur;
import com.jeff.pets.cobblepets.pets.gen1.bulbasaur.Venusaur;
import com.jeff.pets.cobblepets.pets.gen1.bulbasaur.caterpie.Butterfree;
import com.jeff.pets.cobblepets.pets.gen1.bulbasaur.caterpie.Caterpie;
import com.jeff.pets.cobblepets.pets.gen1.bulbasaur.caterpie.Metapod;
import com.jeff.pets.cobblepets.pets.gen1.charmander.Charizard;
import com.jeff.pets.cobblepets.pets.gen1.charmander.Charmander;
import com.jeff.pets.cobblepets.pets.gen1.charmander.Charmeleon;
import com.jeff.pets.cobblepets.pets.gen1.clefairy.Clefable;
import com.jeff.pets.cobblepets.pets.gen1.clefairy.Clefairy;
import com.jeff.pets.cobblepets.pets.gen1.diglett.Diglett;
import com.jeff.pets.cobblepets.pets.gen1.diglett.Dugtrio;
import com.jeff.pets.cobblepets.pets.gen1.ditto.Ditto;
import com.jeff.pets.cobblepets.pets.gen1.doduo.Dodrio;
import com.jeff.pets.cobblepets.pets.gen1.doduo.Doduo;
import com.jeff.pets.cobblepets.pets.gen1.drowzee.Drowzee;
import com.jeff.pets.cobblepets.pets.gen1.drowzee.Hypno;
import com.jeff.pets.cobblepets.pets.gen1.ekans.Arbok;
import com.jeff.pets.cobblepets.pets.gen1.ekans.Ekans;
import com.jeff.pets.cobblepets.pets.gen1.exeggcute.Exeggcute;
import com.jeff.pets.cobblepets.pets.gen1.exeggcute.Exeggutor;
import com.jeff.pets.cobblepets.pets.gen1.farfetchd.Farfetchd;
import com.jeff.pets.cobblepets.pets.gen1.gastly.Gastly;
import com.jeff.pets.cobblepets.pets.gen1.gastly.Gengar;
import com.jeff.pets.cobblepets.pets.gen1.gastly.Haunter;
import com.jeff.pets.cobblepets.pets.gen1.geodude.Geodude;
import com.jeff.pets.cobblepets.pets.gen1.geodude.Golem;
import com.jeff.pets.cobblepets.pets.gen1.geodude.Graveler;
import com.jeff.pets.cobblepets.pets.gen1.grimer.Grimer;
import com.jeff.pets.cobblepets.pets.gen1.grimer.Muk;
import com.jeff.pets.cobblepets.pets.gen1.growlith.Arcanine;
import com.jeff.pets.cobblepets.pets.gen1.growlith.Growlith;
import com.jeff.pets.cobblepets.pets.gen1.jigglypuff.Jigglypuff;
import com.jeff.pets.cobblepets.pets.gen1.jigglypuff.Wigglytuff;
import com.jeff.pets.cobblepets.pets.gen1.krabby.Kingler;
import com.jeff.pets.cobblepets.pets.gen1.krabby.Krabby;
import com.jeff.pets.cobblepets.pets.gen1.machop.Machamp;
import com.jeff.pets.cobblepets.pets.gen1.machop.Machoke;
import com.jeff.pets.cobblepets.pets.gen1.machop.Machop;
import com.jeff.pets.cobblepets.pets.gen1.magnamite.Magnemite;
import com.jeff.pets.cobblepets.pets.gen1.magnamite.Magneton;
import com.jeff.pets.cobblepets.pets.gen1.mankey.Mankey;
import com.jeff.pets.cobblepets.pets.gen1.mankey.Primeape;
import com.jeff.pets.cobblepets.pets.gen1.meowth.Meowth;
import com.jeff.pets.cobblepets.pets.gen1.meowth.Persian;
import com.jeff.pets.cobblepets.pets.gen1.mew.Mew;
import com.jeff.pets.cobblepets.pets.gen1.mew.Mewtwo;
import com.jeff.pets.cobblepets.pets.gen1.nidoramf.Nidoqueen;
import com.jeff.pets.cobblepets.pets.gen1.nidoramf.Nidoranf;
import com.jeff.pets.cobblepets.pets.gen1.nidoramf.Nidorina;
import com.jeff.pets.cobblepets.pets.gen1.nidoranm.Nidoking;
import com.jeff.pets.cobblepets.pets.gen1.nidoranm.Nidoranm;
import com.jeff.pets.cobblepets.pets.gen1.nidoranm.Nidorino;
import com.jeff.pets.cobblepets.pets.gen1.oddish.Gloom;
import com.jeff.pets.cobblepets.pets.gen1.oddish.Oddish;
import com.jeff.pets.cobblepets.pets.gen1.oddish.Vileplume;
import com.jeff.pets.cobblepets.pets.gen1.onix.Onix;
import com.jeff.pets.cobblepets.pets.gen1.paras.Paras;
import com.jeff.pets.cobblepets.pets.gen1.paras.Parasect;
import com.jeff.pets.cobblepets.pets.gen1.pidgey.Pidgeot;
import com.jeff.pets.cobblepets.pets.gen1.pidgey.Pidgeotto;
import com.jeff.pets.cobblepets.pets.gen1.pidgey.Pidgey;
import com.jeff.pets.cobblepets.pets.gen1.pikachu.Pikachu;
import com.jeff.pets.cobblepets.pets.gen1.pikachu.Raichu;
import com.jeff.pets.cobblepets.pets.gen1.poliwag.Poliwag;
import com.jeff.pets.cobblepets.pets.gen1.poliwag.Poliwhirl;
import com.jeff.pets.cobblepets.pets.gen1.poliwag.Poliwrath;
import com.jeff.pets.cobblepets.pets.gen1.ponyta.Ponyta;
import com.jeff.pets.cobblepets.pets.gen1.ponyta.Rapidash;
import com.jeff.pets.cobblepets.pets.gen1.psyduck.Golduck;
import com.jeff.pets.cobblepets.pets.gen1.psyduck.Psyduck;
import com.jeff.pets.cobblepets.pets.gen1.rattata.Raticate;
import com.jeff.pets.cobblepets.pets.gen1.rattata.Rattata;
import com.jeff.pets.cobblepets.pets.gen1.sandshrew.Sandshrew;
import com.jeff.pets.cobblepets.pets.gen1.sandshrew.Sandslash;
import com.jeff.pets.cobblepets.pets.gen1.seel.Dewgong;
import com.jeff.pets.cobblepets.pets.gen1.seel.Seel;
import com.jeff.pets.cobblepets.pets.gen1.shellder.Cloyster;
import com.jeff.pets.cobblepets.pets.gen1.shellder.Shellder;
import com.jeff.pets.cobblepets.pets.gen1.slowpoke.Slowbro;
import com.jeff.pets.cobblepets.pets.gen1.slowpoke.Slowpoke;
import com.jeff.pets.cobblepets.pets.gen1.spearow.Fearow;
import com.jeff.pets.cobblepets.pets.gen1.spearow.Spearow;
import com.jeff.pets.cobblepets.pets.gen1.squirtle.Blastoise;
import com.jeff.pets.cobblepets.pets.gen1.squirtle.Squirtle;
import com.jeff.pets.cobblepets.pets.gen1.squirtle.Wartortle;
import com.jeff.pets.cobblepets.pets.gen1.tentacool.Tentacool;
import com.jeff.pets.cobblepets.pets.gen1.tentacool.Tentacruel;
import com.jeff.pets.cobblepets.pets.gen1.venonat.Venomoth;
import com.jeff.pets.cobblepets.pets.gen1.venonat.Venonat;
import com.jeff.pets.cobblepets.pets.gen1.voltorb.Electrode;
import com.jeff.pets.cobblepets.pets.gen1.voltorb.Voltorb;
import com.jeff.pets.cobblepets.pets.gen1.vulpix.Ninetales;
import com.jeff.pets.cobblepets.pets.gen1.vulpix.Vulpix;
import com.jeff.pets.cobblepets.pets.gen1.weedle.Beedrill;
import com.jeff.pets.cobblepets.pets.gen1.weedle.Kakuna;
import com.jeff.pets.cobblepets.pets.gen1.weedle.Weedle;
import com.jeff.pets.cobblepets.pets.gen1.zubat.Golbat;
import com.jeff.pets.cobblepets.pets.gen1.zubat.Zubat;
import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;

import static com.jeff.pets.Central.CONFIG;
import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;
import static com.jeff.pets.cobblepets.client.Vals.*;

@Mixin(Central.class)
public abstract class CentralMixin {

    @Shadow
    @Final
    public static CopyOnWriteArrayList<String> currentSuggestions;

    @Shadow
    private static void updateSuggestions(Minecraft client) {

    }

    @Unique
    private static final List<String> VALENCIAN_SKINS = List.of("normal", "valencian");
    private static final List<String> ALOLAN_SKINS = List.of("normal", "alolan");
    private static final List<String> GALARIAN_SKINS = List.of("normal", "galarian");
    private static final List<String> ALOLAN_GALARIAN_SKINS = List.of("normal", "alolan", "galarian");
    private static final List<String> HISUIAN_SKINS = List.of("normal", "hisuian");
    @Unique
    private static final List<String> POKEMON_SKINS = List.of("shiny", "not shiny");

    @Unique
    private static Bulbasaur bulbasaur;

    @Unique
    private static Ivysaur ivysaur;

    @Unique
    private static Venusaur venusaur;

    @Unique
    private static Charmander charmander;
    @Unique
    private static Charmeleon charmeleon;
    @Unique
    private static Charizard charizard;
    private static Squirtle squirtle;
    private static Wartortle wartortle;
    private static Blastoise blastoise;
    private static Caterpie caterpie;
    private static Metapod metapod;
    private static Butterfree butterfree;
    private static Weedle weedle;
    private static Kakuna kakuna;
    private static Beedrill beedrill;
    private static Pidgey pidgey;
    private static Pidgeotto pidgeotto;
    private static Pidgeot pidgeot;
    private static Mew mew;
    private static Mewtwo mewtwo;
    private static Ditto ditto;
    private static Rattata rattata;
    private static Raticate raticate;
    private static Spearow spearow;
    private static Fearow fearow;
    private static Ekans ekans;
    private static Arbok arbok;
    private static Pikachu pikachu;
    private static Raichu raichu;
    private static Sandshrew sandshrew;
    private static Sandslash sandslash;
    private static Nidoranf nidoranf;
    private static Nidorina nidorina;
    private static Nidoqueen nidoqueen;
    private static Nidoranm nidoranm;
    private static Nidorino nidorino;
    private static Nidoking nidoking;
    private static Clefairy clefairy;
    private static Clefable clefable;
    private static Vulpix vulpix;
    private static Ninetales ninetales;
    private static Jigglypuff jigglypuff;
    private static Wigglytuff wigglytuff;
    private static Zubat zubat;
    private static Golbat golbat;
    private static Oddish oddish;
    private static Gloom gloom;
    private static Vileplume vileplume;
    private static Paras paras;
    private static Parasect parasect;
    private static Venonat venonat;
    private static Venomoth venomoth;
    private static Diglett diglett;
    private static Dugtrio dugtrio;
    private static Meowth meowth;
    private static Persian persian;
    private static Psyduck psyduck;
    private static Golduck golduck;
    private static Mankey mankey;
    private static Primeape primeape;
    private static Growlith growlith;
    private static Arcanine arcanine;
    private static Poliwag poliwag;
    private static Poliwhirl poliwhirl;
    private static Poliwrath poliwrath;
    private static Abra abra;
    private static Kadabra kadabra;
    private static Alakazam alakazam;
    private static Machop machop;
    private static Machoke machoke;
    private static Machamp machamp;
    private static Bellsprout bellsprout;
    private static Weepinbell weepinbell;
    private static Victreebel victreebel;
    private static Tentacool tentacool;
    private static Tentacruel tentacruel;
    private static Geodude geodude;
    private static Graveler graveler;
    private static Golem golem;
    private static Ponyta ponyta;
    private static Rapidash rapidash;
    private static Slowpoke slowpoke;
    private static Slowbro slowbro;
    private static Magnemite magnemite;
    private static Magneton magneton;
    private static Farfetchd farfetchd;
    private static Doduo doduo;
    private static Dodrio dodrio;
    private static Seel seel;
    private static Dewgong dewgong;
    private static Grimer grimer;
    private static Muk muk;
    private static Shellder shellder;
    private static Cloyster cloyster;
    private static Gastly gastly;
    private static Haunter haunter;
    private static Gengar gengar;
    private static Onix onix;
    private static Drowzee drowzee;
    private static Hypno hypno;
    private static Krabby krabby;
    private static Kingler kingler;
    private static Voltorb voltorb;
    private static Electrode electrode;
    private static Exeggcute exeggcute;
    private static Exeggutor exeggutor;

    @Unique
    private static void spawnEntity(CommandContext<FabricClientCommandSource> context, Entity entity, String activePet) {
        Utils.setActivePet(entity, activePet);
        AutoConfig.getConfigHolder(PetsConfig.class).save();
        context.getSource().sendFeedback(Component.literal("§b[PetsMod] §aYour active pet has been switched to " + activePet.replace("_", " ")));
        Central.despawnPet();
        Central.summonPet();
        Central.refreshChatSuggestor(Minecraft.getInstance());
    }

    @Inject(at = @At("HEAD"), method = "lambda$createPetSpeciesCommand$1", cancellable = true)
    private static void createSummonCommand(CommandContext<FabricClientCommandSource> context, CallbackInfoReturnable<Integer> cir) {
        String species = StringArgumentType.getString(context, "species");
        switch (species) {
            case BULBASAUR -> spawnEntity(context, bulbasaur, BULBASAUR);
            case IVYSAUR -> spawnEntity(context, ivysaur, IVYSAUR);
            case VENUSAUR -> spawnEntity(context, venusaur, VENUSAUR);
            case CHARMANDER -> spawnEntity(context, charmander, CHARMANDER);
            case CHARMELEON -> spawnEntity(context, charmeleon, CHARMELEON);
            case CHARIZARD -> spawnEntity(context, charizard, CHARIZARD);
            case SQUIRTLE -> spawnEntity(context, squirtle, SQUIRTLE);
            case WARTORTLE -> spawnEntity(context, wartortle, WARTORTLE);
            case BLASTOISE -> spawnEntity(context, blastoise, BLASTOISE);
            case CATERPIE -> spawnEntity(context, caterpie, CATERPIE);
            case METAPOD -> spawnEntity(context, metapod, METAPOD);
            case BUTTERFREE -> spawnEntity(context, butterfree, BUTTERFREE);
            case WEEDLE -> spawnEntity(context, weedle, WEEDLE);
            case KAKUNA -> spawnEntity(context, kakuna, KAKUNA);
            case BEEDRILL -> spawnEntity(context, beedrill, BEEDRILL);
            case PIDGEY -> spawnEntity(context, pidgey, PIDGEY);
            case PIDGEOTTO -> spawnEntity(context, pidgeotto, PIDGEOTTO);
            case PIDGEOT -> spawnEntity(context, pidgeot, PIDGEOT);
            case MEW -> spawnEntity(context, mew, MEW);
            case MEWTWO -> spawnEntity(context, mewtwo, MEWTWO);
            case DITTO -> spawnEntity(context, ditto, DITTO);
            case RATTATA -> spawnEntity(context, rattata, RATTATA);
            case RATICATE -> spawnEntity(context, raticate, RATICATE);
            case SPEAROW -> spawnEntity(context, spearow, SPEAROW);
            case FEAROW -> spawnEntity(context, fearow, FEAROW);
            case EKANS -> spawnEntity(context, ekans, EKANS);
            case ARBOK -> spawnEntity(context, arbok, ARBOK);
            case PIKACHU -> spawnEntity(context, pikachu, PIKACHU);
            case RAICHU -> spawnEntity(context, raichu, RAICHU);
            case SANDSHREW -> spawnEntity(context, sandshrew, SANDSHREW);
            case SANDSLASH -> spawnEntity(context, sandslash, SANDSLASH);
            case NIDORANF -> spawnEntity(context, nidoranf, NIDORANF);
            case NIDORINA -> spawnEntity(context, nidorina, NIDORINA);
            case NIDOQUEEN -> spawnEntity(context, nidoqueen, NIDOQUEEN);
            case NIDORANM -> spawnEntity(context, nidoranm, NIDORANM);
            case NIDORINO -> spawnEntity(context, nidorino, NIDORINO);
            case NIDOKING -> spawnEntity(context, nidoking, NIDOKING);
            case CLEFAIRY -> spawnEntity(context, clefairy, CLEFAIRY);
            case CLEFABLE -> spawnEntity(context, clefable, CLEFABLE);
            case VULPIX -> spawnEntity(context, vulpix, VULPIX);
            case NINETALES -> spawnEntity(context, ninetales, NINETALES);
            case JIGGLYPUFF -> spawnEntity(context, jigglypuff, JIGGLYPUFF);
            case WIGGLYTUFF -> spawnEntity(context, wigglytuff, WIGGLYTUFF);
            case ZUBAT -> spawnEntity(context, zubat, ZUBAT);
            case GOLBAT -> spawnEntity(context, golbat, GOLBAT);
            case ODDISH -> spawnEntity(context, oddish, ODDISH);
            case GLOOM -> spawnEntity(context, gloom, GLOOM);
            case VILEPLUME -> spawnEntity(context, vileplume, VILEPLUME);
            case PARAS -> spawnEntity(context, paras, PARAS);
            case PARASECT -> spawnEntity(context, parasect, PARASECT);
            case VENONAT -> spawnEntity(context, venonat, VENONAT);
            case VENOMOTH -> spawnEntity(context, venomoth, VENOMOTH);
            case DIGLETT -> spawnEntity(context, diglett, DIGLETT);
            case DUGTRIO -> spawnEntity(context, dugtrio, DUGTRIO);
            case MEOWTH -> spawnEntity(context, meowth, MEOWTH);
            case PERSIAN -> spawnEntity(context, persian, PERSIAN);
            case PSYDUCK -> spawnEntity(context, psyduck, PSYDUCK);
            case GOLDUCK -> spawnEntity(context, golduck, GOLDUCK);
            case MANKEY -> spawnEntity(context, mankey, MANKEY);
            case PRIMEAPE -> spawnEntity(context, primeape, PRIMEAPE);
            case GROWLITHE -> spawnEntity(context, growlith, GROWLITHE);
            case ARCANINE -> spawnEntity(context, arcanine, ARCANINE);
            case POLIWAG -> spawnEntity(context, poliwag, POLIWAG);
            case POLIWHIRL -> spawnEntity(context, poliwhirl, POLIWHIRL);
            case POLIWRATH -> spawnEntity(context, poliwrath, POLIWRATH);
            case ABRA -> spawnEntity(context, abra, ABRA);
            case KADABRA -> spawnEntity(context, kadabra, KADABRA);
            case ALAKAZAM -> spawnEntity(context, alakazam, ALAKAZAM);
            case MACHOP -> spawnEntity(context, machop, MACHOP);
            case MACHOKE -> spawnEntity(context, machoke, MACHOKE);
            case MACHAMP -> spawnEntity(context, machamp, MACHAMP);
            case BELLSPROUT -> spawnEntity(context, bellsprout, BELLSPROUT);
            case WEEPINBELL -> spawnEntity(context, weepinbell, WEEPINBELL);
            case VICTREEBEL -> spawnEntity(context, victreebel, VICTREEBEL);
            case TENTACOOL -> spawnEntity(context, tentacool, TENTACOOL);
            case TENTACRUEL -> spawnEntity(context, tentacruel, TENTACRUEL);
            case GEODUDE -> spawnEntity(context, geodude, GEODUDE);
            case GRAVELER -> spawnEntity(context, graveler, GRAVELER);
            case GOLEM -> spawnEntity(context, golem, GOLEM);
            case PONYTA -> spawnEntity(context, ponyta, PONYTA);
            case RAPIDASH -> spawnEntity(context, rapidash, RAPIDASH);
            case SLOWPOKE -> spawnEntity(context, slowpoke, SLOWPOKE);
            case SLOWBRO -> spawnEntity(context, slowbro, SLOWBRO);
            case MAGNEMITE -> spawnEntity(context, magnemite, MAGNEMITE);
            case MAGNETON -> spawnEntity(context, magneton, MAGNETON);
            case FARFETCHD -> spawnEntity(context, farfetchd, FARFETCHD);
            case DODUO -> spawnEntity(context, doduo, DODUO);
            case DODRIO -> spawnEntity(context, dodrio, DODRIO);
            case SEEL -> spawnEntity(context, seel, SEEL);
            case DEWGONG -> spawnEntity(context, dewgong, DEWGONG);
            case GRIMER -> spawnEntity(context, grimer, GRIMER);
            case MUK -> spawnEntity(context, muk, MUK);
            case CLOYSTER -> spawnEntity(context, cloyster, CLOYSTER);
            case SHELLDER -> spawnEntity(context, shellder, SHELLDER);
            case GASTLY -> spawnEntity(context, gastly, GASTLY);
            case HAUNTER -> spawnEntity(context, haunter, HAUNTER);
            case GENGAR -> spawnEntity(context, gengar, GENGAR);
            case ONIX -> spawnEntity(context, onix, ONIX);
            case DROWZEE -> spawnEntity(context, drowzee, DROWZEE);
            case HYPNO -> spawnEntity(context, hypno, HYPNO);
            case KRABBY -> spawnEntity(context, krabby, KRABBY);
            case KINGLER -> spawnEntity(context, kingler, KINGLER);
            case VOLTORB -> spawnEntity(context, voltorb, VOLTORB);
            case ELECTRODE -> spawnEntity(context, electrode, ELECTRODE);
            case EXEGGCUTE -> spawnEntity(context, exeggcute, EXEGGCUTE);
            case EXEGGUTOR -> spawnEntity(context, exeggutor, EXEGGUTOR);

            case null, default -> {
            }
        }
        AutoConfig.getConfigHolder(CobblepetsConfig.class).save();
        if (Arrays.stream(getVals()).anyMatch(Predicate.isEqual(species))) {
            updateSuggestions(Minecraft.getInstance());
            cir.setReturnValue(1);
        }
    }

    @Inject(at = @At("HEAD"), method = "summonPet")
    private static void summonPet(CallbackInfo ci) {
        Level level = Minecraft.getInstance().level;
        bulbasaur = new Bulbasaur(Cobblepets.BULBASAUR, level);
        ivysaur = new Ivysaur(Cobblepets.IVYSAUR, level);
        venusaur = new Venusaur(Cobblepets.VENUSAUR, level);
        charmander = new Charmander(Cobblepets.CHARMANDER, level);
        charmeleon = new Charmeleon(Cobblepets.CHARMELEON, level);
        charizard = new Charizard(Cobblepets.CHARIZARD, level);
        squirtle = new Squirtle(Cobblepets.SQUIRTLE, level);
        wartortle = new Wartortle(Cobblepets.WARTORTLE, level);
        blastoise = new Blastoise(Cobblepets.BLASTOISE, level);
        caterpie = new Caterpie(Cobblepets.CATERPIE, level);
        metapod = new Metapod(Cobblepets.METAPOD, level);
        butterfree = new Butterfree(Cobblepets.BUTTERFREE, level);
        weedle = new Weedle(Cobblepets.WEEDLE, level);
        kakuna = new Kakuna(Cobblepets.KAKUNA, level);
        beedrill = new Beedrill(Cobblepets.BEEDRILL, level);
        pidgey = new Pidgey(Cobblepets.PIDGEY, level);
        pidgeotto = new Pidgeotto(Cobblepets.PIDGEOTTO, level);
        pidgeot = new Pidgeot(Cobblepets.PIDGEOT, level);
        mew = new Mew(Cobblepets.MEW, level);
        mewtwo = new Mewtwo(Cobblepets.MEWTWO, level);
        ditto = new Ditto(Cobblepets.DITTO, level);
        rattata = new Rattata(Cobblepets.RATTATA, level);
        raticate = new Raticate(Cobblepets.RATICATE, level);
        spearow = new Spearow(Cobblepets.SPEAROW, level);
        fearow = new Fearow(Cobblepets.FEAROW, level);
        ekans = new Ekans(Cobblepets.EKANS, level);
        arbok = new Arbok(Cobblepets.ARBOK, level);
        pikachu = new Pikachu(Cobblepets.PIKACHU, level);
        raichu = new Raichu(Cobblepets.RAICHU, level);
        sandshrew = new Sandshrew(Cobblepets.SANDSHREW, level);
        sandslash = new Sandslash(Cobblepets.SANDSLASH, level);
        nidoranf = new Nidoranf(Cobblepets.NIDORANF, level);
        nidorina = new Nidorina(Cobblepets.NIDORINA, level);
        nidoqueen = new Nidoqueen(Cobblepets.NIDOQUEEN, level);
        nidoranm = new Nidoranm(Cobblepets.NIDORANM, level);
        nidorino = new Nidorino(Cobblepets.NIDORINO, level);
        nidoking = new Nidoking(Cobblepets.NIDOKING, level);
        clefairy = new Clefairy(Cobblepets.CLEFAIRY, level);
        clefable = new Clefable(Cobblepets.CLEFABLE, level);
        vulpix = new Vulpix(Cobblepets.VULPIX, level);
        ninetales = new Ninetales(Cobblepets.NINETALES, level);
        jigglypuff = new Jigglypuff(Cobblepets.JIGGLYPUFF, level);
        wigglytuff = new Wigglytuff(Cobblepets.WIGGLYTUFF, level);
        zubat = new Zubat(Cobblepets.ZUBAT, level);
        golbat = new Golbat(Cobblepets.GOLBAT, level);
        oddish = new Oddish(Cobblepets.ODDISH, level);
        gloom = new Gloom(Cobblepets.GLOOM, level);
        vileplume = new Vileplume(Cobblepets.VILEPLUME, level);
        paras = new Paras(Cobblepets.PARAS, level);
        parasect = new Parasect(Cobblepets.PARASECT, level);
        venonat = new Venonat(Cobblepets.VENONAT, level);
        venomoth = new Venomoth(Cobblepets.VENOMOTH, level);
        diglett = new Diglett(Cobblepets.DIGLETT, level);
        dugtrio = new Dugtrio(Cobblepets.DUGTRIO, level);
        meowth = new Meowth(Cobblepets.MEOWTH, level);
        persian = new Persian(Cobblepets.PERSIAN, level);
        psyduck = new Psyduck(Cobblepets.PSYDUCK, level);
        golduck = new Golduck(Cobblepets.GOLDUCK, level);
        mankey = new Mankey(Cobblepets.MANKEY, level);
        primeape = new Primeape(Cobblepets.PRIMEAPE, level);
        growlith = new Growlith(Cobblepets.GROWLITHE, level);
        arcanine = new Arcanine(Cobblepets.ARCANINE, level);
        poliwag = new Poliwag(Cobblepets.POLIWAG, level);
        poliwhirl = new Poliwhirl(Cobblepets.POLIWHIRL, level);
        poliwrath = new Poliwrath(Cobblepets.POLIWRATH, level);
        abra = new Abra(Cobblepets.ABRA, level);
        kadabra = new Kadabra(Cobblepets.KADABRA, level);
        alakazam = new Alakazam(Cobblepets.ALAKAZAM, level);
        machop = new Machop(Cobblepets.MACHOP, level);
        machoke = new Machoke(Cobblepets.MACHOKE, level);
        machamp = new Machamp(Cobblepets.MACHAMP, level);
        bellsprout = new Bellsprout(Cobblepets.BELLSPROUT, level);
        weepinbell = new Weepinbell(Cobblepets.WEEPINBELL, level);
        victreebel = new Victreebel(Cobblepets.VICTREEBEL, level);
        tentacool = new Tentacool(Cobblepets.TENTACOOL, level);
        tentacruel = new Tentacruel(Cobblepets.TENTACRUEL, level);
        geodude = new Geodude(Cobblepets.GEODUDE, level);
        graveler = new Graveler(Cobblepets.GRAVELER, level);
        golem = new Golem(Cobblepets.GOLEM, level);
        ponyta = new Ponyta(Cobblepets.PONYTA, level);
        rapidash = new Rapidash(Cobblepets.RAPIDASH, level);
        slowbro = new Slowbro(Cobblepets.SLOWBRO, level);
        slowpoke = new Slowpoke(Cobblepets.SLOWPOKE, level);
        magneton = new Magneton(Cobblepets.MAGNETON, level);
        magnemite = new Magnemite(Cobblepets.MAGNEMITE, level);
        farfetchd = new Farfetchd(Cobblepets.FARFETCHD, level);
        doduo = new Doduo(Cobblepets.DODUO, level);
        dodrio = new Dodrio(Cobblepets.DODRIO, level);
        seel = new Seel(Cobblepets.SEEL, level);
        dewgong = new Dewgong(Cobblepets.DEWGONG, level);
        grimer = new Grimer(Cobblepets.GRIMER, level);
        muk = new Muk(Cobblepets.MUK, level);
        shellder = new Shellder(Cobblepets.SHELLDER, level);
        cloyster = new Cloyster(Cobblepets.CLOYSTER, level);
        gastly = new Gastly(Cobblepets.GASTLY, level);
        haunter = new Haunter(Cobblepets.HAUNTER, level);
        gengar = new Gengar(Cobblepets.GENGAR, level);
        onix = new Onix(Cobblepets.ONIX, level);
        drowzee = new Drowzee(Cobblepets.DROWZEE, level);
        hypno = new Hypno(Cobblepets.HYPNO, level);
        krabby = new Krabby(Cobblepets.KRABBY, level);
        kingler = new Kingler(Cobblepets.KINGLER, level);
        voltorb = new Voltorb(Cobblepets.VOLTORB, level);
        electrode = new Electrode(Cobblepets.ELECTRODE, level);
        exeggcute = new Exeggcute(Cobblepets.EXEGGCUTE, level);
        exeggutor = new Exeggutor(Cobblepets.EXEGGUTOR, level);

        switch (CONFIG.activePet) {
            case BULBASAUR -> Utils.summonPet(bulbasaur, COBBLE_CONFIG.bulbasorName);
            case IVYSAUR -> Utils.summonPet(ivysaur, COBBLE_CONFIG.ivysaurName);
            case VENUSAUR -> Utils.summonPet(venusaur, COBBLE_CONFIG.venusaurName);
            case CHARMANDER -> Utils.summonPet(charmander, COBBLE_CONFIG.charmanderName);
            case CHARMELEON -> Utils.summonPet(charmeleon, COBBLE_CONFIG.charmeleonName);
            case CHARIZARD -> Utils.summonPet(charizard, COBBLE_CONFIG.charizardName);
            case SQUIRTLE -> Utils.summonPet(squirtle, COBBLE_CONFIG.squirtleName);
            case WARTORTLE -> Utils.summonPet(wartortle, COBBLE_CONFIG.wartortleName);
            case BLASTOISE -> Utils.summonPet(blastoise, COBBLE_CONFIG.blastoiseName);
            case CATERPIE -> Utils.summonPet(caterpie, COBBLE_CONFIG.caterpieName);
            case METAPOD -> Utils.summonPet(metapod, COBBLE_CONFIG.metapodName);
            case BUTTERFREE -> Utils.summonPet(butterfree, COBBLE_CONFIG.butterfreeName);
            case WEEDLE -> Utils.summonPet(weedle, COBBLE_CONFIG.weedleName);
            case KAKUNA -> Utils.summonPet(kakuna, COBBLE_CONFIG.kakunaName);
            case BEEDRILL -> Utils.summonPet(beedrill, COBBLE_CONFIG.beedrillName);
            case PIDGEY -> Utils.summonPet(pidgey, COBBLE_CONFIG.pidgeyName);
            case PIDGEOTTO -> Utils.summonPet(pidgeotto, COBBLE_CONFIG.pidgeottoName);
            case PIDGEOT -> Utils.summonPet(pidgeot, COBBLE_CONFIG.pidgeotName);
            case MEW -> Utils.summonPet(mew, COBBLE_CONFIG.mewName);
            case MEWTWO -> Utils.summonPet(mewtwo, COBBLE_CONFIG.mewtwoName);
            case DITTO -> Utils.summonPet(ditto, COBBLE_CONFIG.dittoName);
            case RATTATA -> Utils.summonPet(rattata, COBBLE_CONFIG.rattataName);
            case RATICATE -> Utils.summonPet(raticate, COBBLE_CONFIG.raticateName);
            case SPEAROW -> Utils.summonPet(spearow, COBBLE_CONFIG.spearowName);
            case FEAROW -> Utils.summonPet(fearow, COBBLE_CONFIG.fearowName);
            case EKANS -> Utils.summonPet(ekans, COBBLE_CONFIG.ekansName);
            case ARBOK -> Utils.summonPet(arbok, COBBLE_CONFIG.arbokName);
            case PIKACHU -> Utils.summonPet(pikachu, COBBLE_CONFIG.pikachuName);
            case RAICHU -> Utils.summonPet(raichu, COBBLE_CONFIG.raichuName);
            case SANDSHREW -> Utils.summonPet(sandshrew, COBBLE_CONFIG.sandshrewName);
            case SANDSLASH -> Utils.summonPet(sandslash, COBBLE_CONFIG.sandslashName);
            case NIDORANF -> Utils.summonPet(nidoranf, COBBLE_CONFIG.nidoranfName);
            case NIDORINA -> Utils.summonPet(nidorina, COBBLE_CONFIG.nidorinaName);
            case NIDOQUEEN -> Utils.summonPet(nidoqueen, COBBLE_CONFIG.nidoqueenName);
            case NIDORANM -> Utils.summonPet(nidoranm, COBBLE_CONFIG.nidoranmName);
            case NIDORINO -> Utils.summonPet(nidorino, COBBLE_CONFIG.nidorinoName);
            case NIDOKING -> Utils.summonPet(nidoking, COBBLE_CONFIG.nidokingName);
            case CLEFAIRY -> Utils.summonPet(clefairy, COBBLE_CONFIG.clefairyName);
            case CLEFABLE -> Utils.summonPet(clefable, COBBLE_CONFIG.clefableName);
            case VULPIX -> Utils.summonPet(vulpix, COBBLE_CONFIG.vulpixName);
            case NINETALES -> Utils.summonPet(ninetales, COBBLE_CONFIG.ninetalesName);
            case WIGGLYTUFF -> Utils.summonPet(wigglytuff, COBBLE_CONFIG.wigglytuffName);
            case JIGGLYPUFF -> Utils.summonPet(jigglypuff, COBBLE_CONFIG.jigglypuffName);
            case ZUBAT -> Utils.summonPet(zubat, COBBLE_CONFIG.zubatName);
            case GOLBAT -> Utils.summonPet(golbat, COBBLE_CONFIG.golbatName);
            case ODDISH -> Utils.summonPet(oddish, COBBLE_CONFIG.oddishName);
            case GLOOM -> Utils.summonPet(gloom, COBBLE_CONFIG.gloomName);
            case VILEPLUME -> Utils.summonPet(vileplume, COBBLE_CONFIG.vileplumeName);
            case PARAS -> Utils.summonPet(paras, COBBLE_CONFIG.parasName);
            case PARASECT -> Utils.summonPet(parasect, COBBLE_CONFIG.parasectName);
            case VENONAT -> Utils.summonPet(venonat, COBBLE_CONFIG.venonatName);
            case VENOMOTH -> Utils.summonPet(venomoth, COBBLE_CONFIG.venomothName);
            case DIGLETT -> Utils.summonPet(diglett, COBBLE_CONFIG.diglettName);
            case DUGTRIO -> Utils.summonPet(dugtrio, COBBLE_CONFIG.dugtrioName);
            case MEOWTH -> Utils.summonPet(meowth, COBBLE_CONFIG.meowthName);
            case PERSIAN -> Utils.summonPet(persian, COBBLE_CONFIG.persianName);
            case PSYDUCK -> Utils.summonPet(psyduck, COBBLE_CONFIG.psyduckName);
            case GOLDUCK -> Utils.summonPet(golduck, COBBLE_CONFIG.golduckName);
            case MANKEY -> Utils.summonPet(mankey, COBBLE_CONFIG.mankeyName);
            case PRIMEAPE -> Utils.summonPet(primeape, COBBLE_CONFIG.primeapeName);
            case GROWLITHE -> Utils.summonPet(growlith, COBBLE_CONFIG.growlithName);
            case ARCANINE -> Utils.summonPet(arcanine, COBBLE_CONFIG.arcanineName);
            case POLIWAG -> Utils.summonPet(poliwag, COBBLE_CONFIG.poliwagName);
            case POLIWHIRL -> Utils.summonPet(poliwhirl, COBBLE_CONFIG.poliwhirlName);
            case POLIWRATH -> Utils.summonPet(poliwrath, COBBLE_CONFIG.poliwrathName);
            case ABRA -> Utils.summonPet(abra, COBBLE_CONFIG.abraName);
            case KADABRA -> Utils.summonPet(kadabra, COBBLE_CONFIG.kadabraName);
            case ALAKAZAM -> Utils.summonPet(alakazam, COBBLE_CONFIG.alakazamName);
            case MACHOP -> Utils.summonPet(machop, COBBLE_CONFIG.machopName);
            case MACHOKE -> Utils.summonPet(machoke, COBBLE_CONFIG.machokeName);
            case MACHAMP -> Utils.summonPet(machamp, COBBLE_CONFIG.machampName);
            case BELLSPROUT -> Utils.summonPet(bellsprout, COBBLE_CONFIG.bellsproutName);
            case WEEPINBELL -> Utils.summonPet(weepinbell, COBBLE_CONFIG.weepinbellName);
            case VICTREEBEL -> Utils.summonPet(victreebel, COBBLE_CONFIG.victreebelName);
            case TENTACOOL -> Utils.summonPet(tentacool, COBBLE_CONFIG.tentacoolName);
            case TENTACRUEL -> Utils.summonPet(tentacruel, COBBLE_CONFIG.tentacruelName);
            case GEODUDE -> Utils.summonPet(geodude, COBBLE_CONFIG.geodudeName);
            case GRAVELER -> Utils.summonPet(graveler, COBBLE_CONFIG.gravelerName);
            case GOLEM -> Utils.summonPet(golem, COBBLE_CONFIG.golemName);
            case PONYTA -> Utils.summonPet(ponyta, COBBLE_CONFIG.ponytaName);
            case RAPIDASH -> Utils.summonPet(rapidash, COBBLE_CONFIG.rapidashName);
            case SLOWPOKE -> Utils.summonPet(slowpoke, COBBLE_CONFIG.slowpokeName);
            case SLOWBRO -> Utils.summonPet(slowbro, COBBLE_CONFIG.slowbroName);
            case MAGNEMITE -> Utils.summonPet(magnemite, COBBLE_CONFIG.magnemiteName);
            case MAGNETON -> Utils.summonPet(magneton, COBBLE_CONFIG.magnetonName);
            case FARFETCHD -> Utils.summonPet(farfetchd, COBBLE_CONFIG.farfetchdName);
            case DODUO -> Utils.summonPet(doduo, COBBLE_CONFIG.doduoName);
            case DODRIO -> Utils.summonPet(dodrio, COBBLE_CONFIG.dodrioName);
            case SEEL -> Utils.summonPet(seel, COBBLE_CONFIG.seelName);
            case DEWGONG -> Utils.summonPet(dewgong, COBBLE_CONFIG.dewgongName);
            case GRIMER -> Utils.summonPet(grimer, COBBLE_CONFIG.grimerName);
            case MUK -> Utils.summonPet(muk, COBBLE_CONFIG.mukName);
            case SHELLDER -> Utils.summonPet(shellder, COBBLE_CONFIG.shellderName);
            case CLOYSTER -> Utils.summonPet(cloyster, COBBLE_CONFIG.cloysterName);
            case GASTLY -> Utils.summonPet(gastly, COBBLE_CONFIG.gastlyName);
            case HAUNTER -> Utils.summonPet(haunter, COBBLE_CONFIG.haunterName);
            case GENGAR -> Utils.summonPet(gengar, COBBLE_CONFIG.gengarName);
            case ONIX -> Utils.summonPet(onix, COBBLE_CONFIG.onixName);
            case DROWZEE -> Utils.summonPet(drowzee, COBBLE_CONFIG.drowzeeName);
            case HYPNO -> Utils.summonPet(hypno, COBBLE_CONFIG.hypnoName);
            case KRABBY -> Utils.summonPet(krabby, COBBLE_CONFIG.krabbyName);
            case KINGLER -> Utils.summonPet(kingler, COBBLE_CONFIG.kinglerName);
            case VOLTORB -> Utils.summonPet(voltorb, COBBLE_CONFIG.voltorbName);
            case ELECTRODE -> Utils.summonPet(electrode, COBBLE_CONFIG.electrodeName);
            case EXEGGCUTE -> Utils.summonPet(exeggcute, COBBLE_CONFIG.exeggcuteName);
            case EXEGGUTOR -> Utils.summonPet(exeggutor, COBBLE_CONFIG.exeggutorName);

            case null, default -> {
            }
        }
    }

    @Inject(at = @At("HEAD"), method = "despawnPet")
    private static void despawnPet(CallbackInfo ci) {
            List<Entity> entities = new ArrayList<>();
            Field[] fields = CentralMixin.class.getDeclaredFields();
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

    @Inject(at = @At("HEAD"), method = "lambda$createPetNameCommand$1")
    private static void init(CommandContext<?> context, CallbackInfoReturnable<Integer> cir) {
        String name = StringArgumentType.getString(context, "name");
        Utils.assignName(name);
    }

    @Inject(at = @At("HEAD"), method = "refreshPetNames")
    private static void refreshPetNames(CallbackInfo ci) {
        Utils.checkName(BULBASAUR, bulbasaur, COBBLE_CONFIG.bulbasorName);
        Utils.checkName(IVYSAUR, ivysaur, COBBLE_CONFIG.ivysaurName);
        Utils.checkName(VENUSAUR, venusaur, COBBLE_CONFIG.venusaurName);
        Utils.checkName(CHARMANDER, charmander, COBBLE_CONFIG.charmanderName);
        Utils.checkName(CHARMELEON, charmeleon, COBBLE_CONFIG.charmeleonName);
        Utils.checkName(CHARIZARD, charizard, COBBLE_CONFIG.charizardName);
        Utils.checkName(SQUIRTLE, squirtle, COBBLE_CONFIG.squirtleName);
        Utils.checkName(WARTORTLE, wartortle, COBBLE_CONFIG.wartortleName);
        Utils.checkName(BLASTOISE, blastoise, COBBLE_CONFIG.blastoiseName);
        Utils.checkName(CATERPIE, caterpie, COBBLE_CONFIG.caterpieName);
        Utils.checkName(METAPOD, metapod, COBBLE_CONFIG.metapodName);
        Utils.checkName(BUTTERFREE, butterfree, COBBLE_CONFIG.butterfreeName);
        Utils.checkName(WEEDLE, weedle, COBBLE_CONFIG.weedleName);
        Utils.checkName(KAKUNA, kakuna, COBBLE_CONFIG.kakunaName);
        Utils.checkName(BEEDRILL, beedrill, COBBLE_CONFIG.beedrillName);
        Utils.checkName(PIDGEY, pidgey, COBBLE_CONFIG.pidgeyName);
        Utils.checkName(PIDGEOTTO, pidgeotto, COBBLE_CONFIG.pidgeottoName);
        Utils.checkName(PIDGEOT, pidgeot, COBBLE_CONFIG.pidgeotName);
        Utils.checkName(MEW, mew, COBBLE_CONFIG.mewName);
        Utils.checkName(MEWTWO, mewtwo, COBBLE_CONFIG.mewtwoName);
        Utils.checkName(DITTO, ditto, COBBLE_CONFIG.dittoName);
        Utils.checkName(RATTATA, rattata, COBBLE_CONFIG.rattataName);
        Utils.checkName(RATICATE, raticate, COBBLE_CONFIG.raticateName);
        Utils.checkName(SPEAROW, spearow, COBBLE_CONFIG.spearowName);
        Utils.checkName(FEAROW, fearow, COBBLE_CONFIG.fearowName);
        Utils.checkName(EKANS, ekans, COBBLE_CONFIG.ekansName);
        Utils.checkName(ARBOK, arbok, COBBLE_CONFIG.arbokName);
        Utils.checkName(PIKACHU, pikachu, COBBLE_CONFIG.pikachuName);
        Utils.checkName(RAICHU, raichu, COBBLE_CONFIG.raichuName);
        Utils.checkName(SANDSHREW, sandshrew, COBBLE_CONFIG.sandshrewName);
        Utils.checkName(SANDSLASH, sandslash, COBBLE_CONFIG.sandslashName);
        Utils.checkName(NIDORANF, nidoranf, COBBLE_CONFIG.nidoranfName);
        Utils.checkName(NIDORINA, nidorina, COBBLE_CONFIG.nidorinaName);
        Utils.checkName(NIDOQUEEN, nidoqueen, COBBLE_CONFIG.nidoqueenName);
        Utils.checkName(NIDORANM, nidoranm, COBBLE_CONFIG.nidoranmName);
        Utils.checkName(NIDORINO, nidorino, COBBLE_CONFIG.nidorinoName);
        Utils.checkName(NIDOKING, nidoking, COBBLE_CONFIG.nidokingName);
        Utils.checkName(CLEFAIRY, clefairy, COBBLE_CONFIG.clefairyName);
        Utils.checkName(CLEFABLE, clefable, COBBLE_CONFIG.clefableName);
        Utils.checkName(VULPIX, vulpix, COBBLE_CONFIG.vulpixName);
        Utils.checkName(NINETALES, ninetales, COBBLE_CONFIG.ninetalesName);
        Utils.checkName(JIGGLYPUFF, jigglypuff, COBBLE_CONFIG.jigglypuffName);
        Utils.checkName(WIGGLYTUFF, wigglytuff, COBBLE_CONFIG.wigglytuffName);
        Utils.checkName(ZUBAT, zubat, COBBLE_CONFIG.zubatName);
        Utils.checkName(GOLBAT, golbat, COBBLE_CONFIG.golbatName);
        Utils.checkName(ODDISH, oddish, COBBLE_CONFIG.oddishName);
        Utils.checkName(GLOOM, gloom, COBBLE_CONFIG.gloomName);
        Utils.checkName(VILEPLUME, vileplume, COBBLE_CONFIG.vileplumeName);
        Utils.checkName(PARAS, paras, COBBLE_CONFIG.parasName);
        Utils.checkName(PARASECT, parasect, COBBLE_CONFIG.parasectName);
        Utils.checkName(VENONAT, venonat, COBBLE_CONFIG.venonatName);
        Utils.checkName(VENOMOTH, venomoth, COBBLE_CONFIG.venomothName);
        Utils.checkName(DIGLETT, diglett, COBBLE_CONFIG.diglettName);
        Utils.checkName(DUGTRIO, dugtrio, COBBLE_CONFIG.dugtrioName);
        Utils.checkName(MEOWTH, meowth, COBBLE_CONFIG.meowthName);
        Utils.checkName(PERSIAN, persian, COBBLE_CONFIG.persianName);
        Utils.checkName(PSYDUCK, psyduck, COBBLE_CONFIG.psyduckName);
        Utils.checkName(GOLDUCK, golduck, COBBLE_CONFIG.golduckName);
        Utils.checkName(MANKEY, mankey, COBBLE_CONFIG.mankeyName);
        Utils.checkName(PRIMEAPE, primeape, COBBLE_CONFIG.primeapeName);
        Utils.checkName(GROWLITHE, growlith, COBBLE_CONFIG.growlithName);
        Utils.checkName(ARCANINE, arcanine, COBBLE_CONFIG.arcanineName);
        Utils.checkName(POLIWAG, poliwag, COBBLE_CONFIG.poliwagName);
        Utils.checkName(POLIWRATH, poliwrath, COBBLE_CONFIG.poliwrathName);
        Utils.checkName(POLIWHIRL, poliwhirl, COBBLE_CONFIG.poliwhirlName);
        Utils.checkName(ABRA, abra, COBBLE_CONFIG.abraName);
        Utils.checkName(KADABRA, kadabra, COBBLE_CONFIG.kadabraName);
        Utils.checkName(ALAKAZAM, alakazam, COBBLE_CONFIG.alakazamName);
        Utils.checkName(MACHOP, machop, COBBLE_CONFIG.machopName);
        Utils.checkName(MACHOKE, machoke, COBBLE_CONFIG.machokeName);
        Utils.checkName(MACHAMP, machamp, COBBLE_CONFIG.machampName);
        Utils.checkName(BELLSPROUT, bellsprout, COBBLE_CONFIG.bellsproutName);
        Utils.checkName(WEEPINBELL, weepinbell, COBBLE_CONFIG.weepinbellName);
        Utils.checkName(VICTREEBEL, victreebel, COBBLE_CONFIG.victreebelName);
        Utils.checkName(TENTACOOL, tentacool, COBBLE_CONFIG.tentacoolName);
        Utils.checkName(TENTACRUEL, tentacruel, COBBLE_CONFIG.tentacruelName);
        Utils.checkName(GEODUDE, geodude, COBBLE_CONFIG.geodudeName);
        Utils.checkName(GRAVELER, graveler, COBBLE_CONFIG.gravelerName);
        Utils.checkName(GOLEM, golem, COBBLE_CONFIG.golemName);
        Utils.checkName(PONYTA, ponyta, COBBLE_CONFIG.ponytaName);
        Utils.checkName(RAPIDASH, rapidash, COBBLE_CONFIG.rapidashName);
        Utils.checkName(SLOWPOKE, slowpoke, COBBLE_CONFIG.slowpokeName);
        Utils.checkName(SLOWBRO, slowbro, COBBLE_CONFIG.slowbroName);
        Utils.checkName(MAGNEMITE, magnemite, COBBLE_CONFIG.magnemiteName);
        Utils.checkName(MAGNETON, magneton, COBBLE_CONFIG.magnetonName);
        Utils.checkName(FARFETCHD, farfetchd, COBBLE_CONFIG.farfetchdName);
        Utils.checkName(DODUO, doduo, COBBLE_CONFIG.doduoName);
        Utils.checkName(DODRIO, dodrio, COBBLE_CONFIG.dodrioName);
        Utils.checkName(SEEL, seel, COBBLE_CONFIG.seelName);
        Utils.checkName(DEWGONG, dewgong, COBBLE_CONFIG.dewgongName);
        Utils.checkName(GRIMER, grimer, COBBLE_CONFIG.grimerName);
        Utils.checkName(MUK, muk, COBBLE_CONFIG.mukName);
        Utils.checkName(SHELLDER, shellder, COBBLE_CONFIG.shellderName);
        Utils.checkName(CLOYSTER, cloyster, COBBLE_CONFIG.cloysterName);
        Utils.checkName(GASTLY, gastly, COBBLE_CONFIG.gastlyName);
        Utils.checkName(HAUNTER, haunter, COBBLE_CONFIG.haunterName);
        Utils.checkName(GENGAR, gengar, COBBLE_CONFIG.gengarName);
        Utils.checkName(ONIX, onix, COBBLE_CONFIG.onixName);
        Utils.checkName(DROWZEE, drowzee, COBBLE_CONFIG.drowzeeName);
        Utils.checkName(HYPNO, hypno, COBBLE_CONFIG.hypnoName);
        Utils.checkName(KRABBY, krabby, COBBLE_CONFIG.krabbyName);
        Utils.checkName(KINGLER, kingler, COBBLE_CONFIG.kinglerName);
        Utils.checkName(VOLTORB, voltorb, COBBLE_CONFIG.voltorbName);
        Utils.checkName(ELECTRODE, electrode, COBBLE_CONFIG.electrodeName);
        Utils.checkName(EXEGGCUTE, exeggcute, COBBLE_CONFIG.exeggcuteName);
        Utils.checkName(EXEGGUTOR, exeggutor, COBBLE_CONFIG.exeggutorName);
    }

    @Inject(at = @At("HEAD"), method = "lambda$createPetSkinCommand$1")
    private static void addShinyCheck(CommandContext<?> context, CallbackInfoReturnable<Integer> cir) {
        String skin = StringArgumentType.getString(context, "skin");
        if (skin.equals("shiny")) {
            COBBLE_CONFIG.isShiny = true;
        } else if (skin.equals("not shiny")) {
            COBBLE_CONFIG.isShiny = false;
        } else if (CONFIG.activePet.equals("butterfree")) {
            if (skin.equals("normal")) {
                COBBLE_CONFIG.butterfreeSkin = "normal";
            } else if (skin.equals("valencian")) {
                COBBLE_CONFIG.butterfreeSkin = "valencian";
            }
        } else if (CONFIG.activePet.equals("gloom")) {
            if (skin.equals("normal")) {
                COBBLE_CONFIG.gloomSkin = "normal";
            } else if (skin.equals("valencian")) {
                COBBLE_CONFIG.gloomSkin = "valencian";
            }
        } else if (CONFIG.activePet.equals("vileplume")) {
            if (skin.equals("normal")) {
                COBBLE_CONFIG.vileplumeSkin = "normal";
            } else if (skin.equals("valencian")) {
                COBBLE_CONFIG.vileplumeSkin = "valencian";
            }
        } else if (CONFIG.activePet.equals("diglett")) {
            if (skin.equals("normal")) {
                COBBLE_CONFIG.diglettSkin = "normal";
            } else if (skin.equals("alolan")) {
                COBBLE_CONFIG.diglettSkin = "alolan";
            }
        } else if (CONFIG.activePet.equals("dugtrio")) {
            if (skin.equals("normal")) {
                COBBLE_CONFIG.dugtrioSkin = "normal";
            } else if (skin.equals("alolan")) {
                COBBLE_CONFIG.dugtrioSkin = "alolan";
            }
        } else if (CONFIG.activePet.equals("meowth")) {
            switch (skin) {
                case "normal" -> COBBLE_CONFIG.meowthSkin = "normal";
                case "alolan" -> COBBLE_CONFIG.meowthSkin = "alolan";
                case "galarian" -> COBBLE_CONFIG.meowthSkin = "galarian";
            }
        }
        else if (CONFIG.activePet.equals("persian")) {
            switch (skin) {
                case "normal" -> COBBLE_CONFIG.persianSkin = "normal";
                case "alolan" -> COBBLE_CONFIG.persianSkin = "alolan";
                case "galarian" -> COBBLE_CONFIG.persianSkin = "galarian";
            }
        } else if (CONFIG.activePet.equals("geodude")) {
            switch(skin) {
                case "normal" -> COBBLE_CONFIG.geodudeSkin = "normal";
                case "alolan" -> COBBLE_CONFIG.geodudeSkin = "alolan";
            }
        } else if (CONFIG.activePet.equals("graveler")) {
            switch (skin) {
                case "normal" -> COBBLE_CONFIG.gravelerSkin = "normal";
                case "alolan" -> COBBLE_CONFIG.gravelerSkin = "alolan";
            }
        } else if (CONFIG.activePet.equals("golem")) {
            switch (skin) {
                case "normal" -> COBBLE_CONFIG.golemSkin = "normal";
                case "alolan" -> COBBLE_CONFIG.golemSkin = "alolan";
            }
        } else if (CONFIG.activePet.equals("ponyta")) {
            switch(skin) {
                case "normal" -> COBBLE_CONFIG.ponytaSkin = "normal";
                case "galarian" -> COBBLE_CONFIG.ponytaSkin = "galarian";
            }
        } else if (CONFIG.activePet.equals("rapidash")) {
            switch(skin) {
                case "normal" -> COBBLE_CONFIG.rapidashSkin = "normal";
                case "galarian" -> COBBLE_CONFIG.rapidashSkin = "galarian";
            }
        } else if (CONFIG.activePet.equals("slowbro")) {
            switch(skin) {
                case "normal" -> COBBLE_CONFIG.slowbroSkin = "normal";
                case "galarian" -> COBBLE_CONFIG.slowbroSkin = "galarian";
            }
        } else if (CONFIG.activePet.equals("slowpoke")) {
            switch(skin) {
                case "normal" -> COBBLE_CONFIG.slowpokeSkin = "normal";
                case "galarian" -> COBBLE_CONFIG.slowpokeSkin = "galarian";
            }
        } else if (CONFIG.activePet.equals("farfetchd")) {
            switch(skin) {
                case "normal", "galarian" -> COBBLE_CONFIG.farfetchdSkin = skin;
            }
        } else if (CONFIG.activePet.equals("grimer")) {
            switch (skin) {
                case "normal", "alolan" -> COBBLE_CONFIG.grimerSkin = skin;
            }
        } else if (CONFIG.activePet.equals("muk")) {
            switch(skin) {
                case "normal", "alolan" -> COBBLE_CONFIG.mukSkin = skin;
            }
        } else if (CONFIG.activePet.equals("voltorb")) {
            switch(skin) {
                case "normal", "hisuian" -> COBBLE_CONFIG.voltorbSkin = skin;
            }
        } else if (CONFIG.activePet.equals("electrode")) {
            switch(skin) {
                case "normal", "hisuian" -> COBBLE_CONFIG.electrodeSkin = skin;
            }
        } else if (CONFIG.activePet.equals("exeggutor")) {
            switch(skin) {
                case "normal", "alolan" -> COBBLE_CONFIG.exeggutorSkin = skin;
            }
        }
        AutoConfig.getConfigHolder(CobblepetsConfig.class).save();
    }

    @Inject(at = @At(value = "INVOKE", target = "Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;buildFuture()Ljava/util/concurrent/CompletableFuture;"),
            method = "lambda$new$0")
    private static void addSkins(CommandContext<?> context, SuggestionsBuilder builder, CallbackInfoReturnable<CompletableFuture<Void>> cir) {
        String remaining = builder.getRemainingLowerCase();
        if (Arrays.stream(getVals()).anyMatch(Predicate.isEqual(CONFIG.activePet))) {
            for (String s : POKEMON_SKINS) {
                if (s.toLowerCase().startsWith(remaining)) {
                    builder.suggest(s);
                }
            }
        }
        if (CONFIG.activePet.equals("butterfree") || CONFIG.activePet.equals("gloom") || CONFIG.activePet.equals("vileplume")) {
            for (String s : VALENCIAN_SKINS) {
                if (s.toLowerCase().startsWith(remaining)) {
                    builder.suggest(s);
                }
            }
        } else if (CONFIG.activePet.equals("diglett") || CONFIG.activePet.equals("dugtrio") || CONFIG.activePet.equals("persian")
                || CONFIG.activePet.equals("geodude") || CONFIG.activePet.equals("graveler") || CONFIG.activePet.equals("golem")
                || CONFIG.activePet.equals(GRIMER) || CONFIG.activePet.equals(MUK) || CONFIG.activePet.equals(EXEGGUTOR)) {
            for (String s : ALOLAN_SKINS) {
                if (s.toLowerCase().startsWith(remaining)) {
                    builder.suggest(s);
                }
            }
        } else if (CONFIG.activePet.equals("meowth")) {
            for (String s : ALOLAN_GALARIAN_SKINS) {
                if (s.toLowerCase().startsWith(remaining)) {
                    builder.suggest(s);
                }
            }
        } else if (CONFIG.activePet.equals("ponyta") || CONFIG.activePet.equals("rapidash") || CONFIG.activePet.equals("slowpoke") || CONFIG.activePet.equals("slowbro") || CONFIG.activePet.equals("farfetchd")) {
            for (String s : GALARIAN_SKINS) {
                if (s.toLowerCase().startsWith(remaining)) {
                    builder.suggest(s);
                }
            }
        } else if (CONFIG.activePet.equals("voltorb") || CONFIG.activePet.equals("electrode")) {
            for (String s : HISUIAN_SKINS) {
                if (s.toLowerCase().startsWith(remaining)) {
                    builder.suggest(s);
                }
            }
        }
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