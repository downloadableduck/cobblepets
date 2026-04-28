package com.jeff.pets.cobblepets.client;

import com.jeff.pets.Central;
import com.jeff.pets.PetsClientInitializer;
import com.jeff.pets.Utils;
import com.jeff.pets.cobblepets.client.rendering.gen1.ekans_tree.bulbasaur_tree.bulbasaur.BulbasaurRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.ekans_tree.bulbasaur_tree.ivysaur.IvysaurRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.ekans_tree.bulbasaur_tree.venusaur.VenusaurRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.caterpie_tree.butterfree.ButterfreeRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.caterpie_tree.caterpie.CaterpieRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.caterpie_tree.metapod.MetapodRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.charmander_tree.charizard.CharizardRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.charmander_tree.charmander.CharmanderRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.charmander_tree.charmeleon.CharmeleonRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.ditto.DittoRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.ekans_tree.arbok.ArbokRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.ekans_tree.ekans.EkansRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.mew_tree.mew.MewRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.mew_tree.mewtwo.MewtwoRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.pidgey_tree.pidgeot.PidgeotRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.pidgey_tree.pidgeotto.PidgeottoRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.pidgey_tree.pidgey.PidgeyRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.pikachu_tree.pikachu.PikachuRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.pikachu_tree.raichu.RaichuRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.rattata_tree.raticate.RaticateRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.rattata_tree.rattata.RattataRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.sandshrew_tree.sandshrew.SandshrewRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.sandshrew_tree.sandslash.SandslashRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.spearow_tree.fearow.FearowRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.spearow_tree.spearow.SpearowRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.squirtle_tree.blastoise.BlastoiseRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.squirtle_tree.squirtle.SquirtleRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.squirtle_tree.wartortle.WartortleRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.weedle_tree.beedrill.BeedrillRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.weedle_tree.kakuna.KakunaRenderer;
import com.jeff.pets.cobblepets.client.rendering.gen1.weedle_tree.weedle.WeedleRenderer;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

import java.util.Arrays;

import static com.jeff.pets.cobblepets.Cobblepets.*;
import static com.jeff.pets.cobblepets.Cobblepets.MOD_ID;

@SuppressWarnings("deprecation")
public class CobblepetsClient implements ClientModInitializer {
    public static CobblepetsConfig COBBLE_CONFIG;

    @Override
    public void onInitializeClient() {

        PetsClientInitializer.ADDONS.add(MOD_ID);

        this.addAllToPetList(Vals.getVals());
        this.setUpConfig();
        this.checkForNullObjects();
        this.setUpRendering();
    }

    private void setUpConfig() {
        AutoConfig.register(CobblepetsConfig.class, GsonConfigSerializer::new);
        COBBLE_CONFIG = AutoConfig.getConfigHolder(CobblepetsConfig.class).getConfig();
    }

    private void checkForNullObjects() {
        COBBLE_CONFIG.bulbasorName = Utils.checkNullString(COBBLE_CONFIG.bulbasorName);
        COBBLE_CONFIG.ivysaurName = Utils.checkNullString(COBBLE_CONFIG.ivysaurName);
        COBBLE_CONFIG.venusaurName = Utils.checkNullString(COBBLE_CONFIG.venusaurName);
        COBBLE_CONFIG.charmanderName = Utils.checkNullString(COBBLE_CONFIG.charmanderName);
        COBBLE_CONFIG.charmeleonName = Utils.checkNullString(COBBLE_CONFIG.charmeleonName);
        COBBLE_CONFIG.charizardName = Utils.checkNullString(COBBLE_CONFIG.charizardName);
        COBBLE_CONFIG.squirtleName = Utils.checkNullString(COBBLE_CONFIG.squirtleName);
        COBBLE_CONFIG.wartortleName = Utils.checkNullString(COBBLE_CONFIG.wartortleName);
        COBBLE_CONFIG.blastoiseName = Utils.checkNullString(COBBLE_CONFIG.blastoiseName);
        COBBLE_CONFIG.caterpieName = Utils.checkNullString(COBBLE_CONFIG.caterpieName);
        COBBLE_CONFIG.metapodName = Utils.checkNullString(COBBLE_CONFIG.metapodName);
        COBBLE_CONFIG.butterfreeName = Utils.checkNullString(COBBLE_CONFIG.butterfreeName);
        COBBLE_CONFIG.butterfreeSkin = Utils.checkNullString(COBBLE_CONFIG.butterfreeSkin, "butterfree");
        COBBLE_CONFIG.weedleName = Utils.checkNullString(COBBLE_CONFIG.weedleName);
        COBBLE_CONFIG.kakunaName = Utils.checkNullString(COBBLE_CONFIG.kakunaName);
        COBBLE_CONFIG.beedrillName = Utils.checkNullString(COBBLE_CONFIG.beedrillName);
        COBBLE_CONFIG.pidgeyName = Utils.checkNullString(COBBLE_CONFIG.pidgeyName);
        COBBLE_CONFIG.pidgeottoName = Utils.checkNullString(COBBLE_CONFIG.pidgeottoName);
        COBBLE_CONFIG.pidgeotName = Utils.checkNullString(COBBLE_CONFIG.pidgeotName);
        COBBLE_CONFIG.mewName = Utils.checkNullString(COBBLE_CONFIG.mewName);
        COBBLE_CONFIG.mewtwoName = Utils.checkNullString(COBBLE_CONFIG.mewtwoName);
        COBBLE_CONFIG.dittoName = Utils.checkNullString(COBBLE_CONFIG.dittoName);
        COBBLE_CONFIG.rattataName = Utils.checkNullString(COBBLE_CONFIG.rattataName);
        COBBLE_CONFIG.raticateName = Utils.checkNullString(COBBLE_CONFIG.raticateName);
        COBBLE_CONFIG.spearowName = Utils.checkNullString(COBBLE_CONFIG.spearowName);
        COBBLE_CONFIG.fearowName = Utils.checkNullString(COBBLE_CONFIG.spearowName);
        COBBLE_CONFIG.ekansName = Utils.checkNullString(COBBLE_CONFIG.ekansName);
        COBBLE_CONFIG.arbokName = Utils.checkNullString(COBBLE_CONFIG.arbokName);
        COBBLE_CONFIG.pikachuName = Utils.checkNullString(COBBLE_CONFIG.pikachuName);
        COBBLE_CONFIG.raichuName = Utils.checkNullString(COBBLE_CONFIG.raichuName);
        COBBLE_CONFIG.sandshrewName = Utils.checkNullString(COBBLE_CONFIG.sandshrewName);
        COBBLE_CONFIG.sandslashName = Utils.checkNullString(COBBLE_CONFIG.sandslashName);
        AutoConfig.getConfigHolder(CobblepetsConfig.class).save();
    }

    private void setUpRendering() {
        EntityRendererRegistry.register(BULBASAUR, BulbasaurRenderer::new);
        EntityRendererRegistry.register(IVYSAUR, IvysaurRenderer::new);
        EntityRendererRegistry.register(VENUSAUR, VenusaurRenderer::new);
        EntityRendererRegistry.register(CHARMANDER, CharmanderRenderer::new);
        EntityRendererRegistry.register(CHARMELEON, CharmeleonRenderer::new);
        EntityRendererRegistry.register(CHARIZARD, CharizardRenderer::new);
        EntityRendererRegistry.register(SQUIRTLE, SquirtleRenderer::new);
        EntityRendererRegistry.register(WARTORTLE, WartortleRenderer::new);
        EntityRendererRegistry.register(BLASTOISE, BlastoiseRenderer::new);
        EntityRendererRegistry.register(CATERPIE, CaterpieRenderer::new);
        EntityRendererRegistry.register(METAPOD, MetapodRenderer::new);
        EntityRendererRegistry.register(BUTTERFREE, ButterfreeRenderer::new);
        EntityRendererRegistry.register(WEEDLE, WeedleRenderer::new);
        EntityRendererRegistry.register(KAKUNA, KakunaRenderer::new);
        EntityRendererRegistry.register(BEEDRILL, BeedrillRenderer::new);
        EntityRendererRegistry.register(PIDGEY, PidgeyRenderer::new);
        EntityRendererRegistry.register(PIDGEOTTO, PidgeottoRenderer::new);
        EntityRendererRegistry.register(PIDGEOT, PidgeotRenderer::new);
        EntityRendererRegistry.register(MEW, MewRenderer::new);
        EntityRendererRegistry.register(MEWTWO, MewtwoRenderer::new);
        EntityRendererRegistry.register(DITTO, DittoRenderer::new);
        EntityRendererRegistry.register(RATTATA, RattataRenderer::new);
        EntityRendererRegistry.register(RATICATE, RaticateRenderer::new);
        EntityRendererRegistry.register(SPEAROW, SpearowRenderer::new);
        EntityRendererRegistry.register(FEAROW, FearowRenderer::new);
        EntityRendererRegistry.register(EKANS, EkansRenderer::new);
        EntityRendererRegistry.register(ARBOK, ArbokRenderer::new);
        EntityRendererRegistry.register(PIKACHU, PikachuRenderer::new);
        EntityRendererRegistry.register(RAICHU, RaichuRenderer::new);
        EntityRendererRegistry.register(SANDSHREW, SandshrewRenderer::new);
        EntityRendererRegistry.register(SANDSLASH, SandslashRenderer::new);
    }

    private void addAllToPetList(String ... s) {
        Central.PETS_LIST.addAll(Arrays.asList(s));
    }
}