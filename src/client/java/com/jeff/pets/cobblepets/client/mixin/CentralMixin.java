package com.jeff.pets.cobblepets.client.mixin;

import com.jeff.pets.Central;
import com.jeff.pets.PetsConfig;
import com.jeff.pets.Utils;
import com.jeff.pets.cobblepets.client.Vals;
import com.jeff.pets.cobblepets.pets.bulbasaur.Bulbasaur;
import com.jeff.pets.cobblepets.Cobblepets;
import com.jeff.pets.cobblepets.pets.bulbasaur.Ivysaur;
import com.jeff.pets.cobblepets.pets.bulbasaur.Venusaur;
import com.jeff.pets.cobblepets.pets.caterpie.Butterfree;
import com.jeff.pets.cobblepets.pets.caterpie.Caterpie;
import com.jeff.pets.cobblepets.pets.caterpie.Metapod;
import com.jeff.pets.cobblepets.pets.charmander.Charizard;
import com.jeff.pets.cobblepets.pets.charmander.Charmander;
import com.jeff.pets.cobblepets.pets.charmander.Charmeleon;
import com.jeff.pets.cobblepets.pets.ditto.Ditto;
import com.jeff.pets.cobblepets.pets.ekans.Arbok;
import com.jeff.pets.cobblepets.pets.ekans.Ekans;
import com.jeff.pets.cobblepets.pets.mew.Mew;
import com.jeff.pets.cobblepets.pets.mew.Mewtwo;
import com.jeff.pets.cobblepets.pets.pidgey.Pidgeot;
import com.jeff.pets.cobblepets.pets.pidgey.Pidgeotto;
import com.jeff.pets.cobblepets.pets.pidgey.Pidgey;
import com.jeff.pets.cobblepets.pets.rattata.Raticate;
import com.jeff.pets.cobblepets.pets.rattata.Rattata;
import com.jeff.pets.cobblepets.pets.spearow.Fearow;
import com.jeff.pets.cobblepets.pets.spearow.Spearow;
import com.jeff.pets.cobblepets.pets.squirtle.Blastoise;
import com.jeff.pets.cobblepets.pets.squirtle.Squirtle;
import com.jeff.pets.cobblepets.pets.squirtle.Wartortle;
import com.jeff.pets.cobblepets.pets.weedle.Beedrill;
import com.jeff.pets.cobblepets.pets.weedle.Kakuna;
import com.jeff.pets.cobblepets.pets.weedle.Weedle;
import com.jeff.pets.mob.vanilla.neutral.ClientBee;
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
    public static void refreshChatSuggestor(Minecraft client) {
    }

    @Unique
    private static final List<String> BUTTERFREE_SKINS = List.of("butterfree", "valencian");

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

    @Unique
    private static void spawnCustomEntity(CommandContext<FabricClientCommandSource> context, Entity entity, String activePet) {
        Utils.setActivePet(entity, activePet);
        AutoConfig.getConfigHolder(PetsConfig.class).save();
        context.getSource().sendFeedback(Component.literal("§b[PetsMod] §aYour active pet has been switched to " + activePet.replace("_", " ")));
        Central.despawnPet();
        Central.summonPet();
    }

    @Inject(at = @At("HEAD"), method = "lambda$createPetSpeciesCommand$1", cancellable = true)
    private static void createSummonCommand(CommandContext<FabricClientCommandSource> context, CallbackInfoReturnable<Integer> cir) {
        String species = StringArgumentType.getString(context, "species");
        switch (species) {
            case BULBASAUR -> spawnCustomEntity(context, bulbasaur, BULBASAUR);
            case IVYSAUR -> spawnCustomEntity(context, ivysaur, IVYSAUR);
            case VENUSAUR -> spawnCustomEntity(context, venusaur, VENUSAUR);
            case CHARMANDER -> spawnCustomEntity(context, charmander, CHARMANDER);
            case CHARMELEON -> spawnCustomEntity(context, charmeleon, CHARMELEON);
            case CHARIZARD -> spawnCustomEntity(context, charizard, CHARIZARD);
            case SQUIRTLE -> spawnCustomEntity(context, squirtle, SQUIRTLE);
            case WARTORTLE -> spawnCustomEntity(context, wartortle, WARTORTLE);
            case BLASTOISE -> spawnCustomEntity(context, blastoise, BLASTOISE);
            case CATERPIE -> spawnCustomEntity(context, caterpie, CATERPIE);
            case METAPOD -> spawnCustomEntity(context, metapod, METAPOD);
            case BUTTERFREE -> spawnCustomEntity(context, butterfree, BUTTERFREE);
            case WEEDLE -> spawnCustomEntity(context, weedle, WEEDLE);
            case KAKUNA -> spawnCustomEntity(context, kakuna, KAKUNA);
            case BEEDRILL -> spawnCustomEntity(context, beedrill, BEEDRILL);
            case PIDGEY -> spawnCustomEntity(context, pidgey, PIDGEY);
            case PIDGEOTTO -> spawnCustomEntity(context, pidgeotto, PIDGEOTTO);
            case PIDGEOT -> spawnCustomEntity(context, pidgeot, PIDGEOT);
            case MEW -> spawnCustomEntity(context, mew, MEW);
            case MEWTWO -> spawnCustomEntity(context, mewtwo, MEWTWO);
            case DITTO -> spawnCustomEntity(context, ditto, DITTO);
            case RATTATA -> spawnCustomEntity(context, rattata, RATTATA);
            case RATICATE -> spawnCustomEntity(context, raticate, RATICATE);
            case SPEAROW -> spawnCustomEntity(context, spearow, SPEAROW);
            case FEAROW -> spawnCustomEntity(context, fearow, FEAROW);
            case EKANS -> spawnCustomEntity(context, ekans, EKANS);
            case ARBOK -> spawnCustomEntity(context, arbok, ARBOK);

            case null, default -> {
            }
        }
        if (Arrays.stream(getVals()).anyMatch(Predicate.isEqual(species))) {
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

            case null, default -> {
            }
        }
    }

    @Inject(at = @At("HEAD"), method = "despawnPet")
    private static void despawnPet(CallbackInfo ci) {
        Utils.despawnEntity(bulbasaur);
        Utils.despawnEntity(ivysaur);
        Utils.despawnEntity(venusaur);
        Utils.despawnEntity(charmander);
        Utils.despawnEntity(charmeleon);
        Utils.despawnEntity(charizard);
        Utils.despawnEntity(squirtle);
        Utils.despawnEntity(wartortle);
        Utils.despawnEntity(blastoise);
        Utils.despawnEntity(caterpie);
        Utils.despawnEntity(metapod);
        Utils.despawnEntity(butterfree);
        Utils.despawnEntity(weedle);
        Utils.despawnEntity(kakuna);
        Utils.despawnEntity(beedrill);
        Utils.despawnEntity(pidgey);
        Utils.despawnEntity(pidgeotto);
        Utils.despawnEntity(pidgeot);
        Utils.despawnEntity(mew);
        Utils.despawnEntity(mewtwo);
        Utils.despawnEntity(ditto);
        Utils.despawnEntity(rattata);
        Utils.despawnEntity(raticate);
        Utils.despawnEntity(spearow);
        Utils.despawnEntity(fearow);
        Utils.despawnEntity(ekans);
        Utils.despawnEntity(arbok);
    }

    @Inject(at = @At("HEAD"), method = "lambda$createPetNameCommand$1")
    private static void init(CommandContext<?> context, CallbackInfoReturnable<Integer> cir) {

        String name = StringArgumentType.getString(context, "name");
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

            case null, default -> {
            }
        }
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
        Utils.checkName(RATTATA, raticate, COBBLE_CONFIG.rattataName);
        Utils.checkName(RATICATE, raticate, COBBLE_CONFIG.raticateName);
        Utils.checkName(SPEAROW, spearow, COBBLE_CONFIG.spearowName);
        Utils.checkName(FEAROW, fearow, COBBLE_CONFIG.fearowName);
        Utils.checkName(EKANS, ekans, COBBLE_CONFIG.ekansName);
        Utils.checkName(ARBOK, arbok, COBBLE_CONFIG.arbokName);
    }

    @Inject(at = @At("HEAD"), method = "lambda$createPetSkinCommand$1")
    private static void addShinyCheck(CommandContext<?> context, CallbackInfoReturnable<Integer> cir) {
        String skin = StringArgumentType.getString(context, "skin");
        if (skin.equals("shiny")) {
            COBBLE_CONFIG.isShiny = true;
        } else if (skin.equals("not shiny")) {
            COBBLE_CONFIG.isShiny = false;
        } else if (CONFIG.activePet.equals("butterfree")) {
            if (skin.equals("butterfree")) {
                COBBLE_CONFIG.butterfreeName = "butterfree";
            } else if (skin.equals("valencian")) {
                COBBLE_CONFIG.butterfreeSkin = "valencian";
            }
        }
    }

    @Inject(at = @At(value = "INVOKE", target = "Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;buildFuture()Ljava/util/concurrent/CompletableFuture;"),
            method = "lambda$new$0")
    private static void addSkins(CommandContext<?> context, SuggestionsBuilder builder, CallbackInfoReturnable<CompletableFuture<Void>> cir) {
        if (Arrays.stream(getVals()).anyMatch(Predicate.isEqual(CONFIG.activePet))) {
            for (String s : POKEMON_SKINS) {
                if (s.toLowerCase().startsWith(builder.getRemainingLowerCase())) {
                    builder.suggest(s);
                }
            }
        }
        if (CONFIG.activePet.equals("butterfree")) {
            for (String s : BUTTERFREE_SKINS) {
                if (s.toLowerCase().startsWith(builder.getRemainingLowerCase())) {
                    builder.suggest(s);
                }
            }
        }
    }
}