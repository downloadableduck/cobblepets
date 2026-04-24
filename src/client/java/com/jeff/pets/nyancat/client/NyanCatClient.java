package com.jeff.pets.nyancat.client;

import com.jeff.pets.Central;
import com.jeff.pets.PetsClientInitializer;
import com.jeff.pets.Utils;
import com.jeff.pets.nyancat.PetsmodNyanCat;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;

import static com.jeff.pets.nyancat.PetsmodNyanCat.MOD_ID;

@SuppressWarnings("deprecation")
public class NyanCatClient implements ClientModInitializer {

    public static final String NYAN_CAT_VALUE = "nyan_cat";
    public static final String NYAN_CAT_VALUE_NO_SPACES = "nyan cat";
    public static NyanCatConfig NYAN_CAT_CONFIG;

    @Override
    public void onInitializeClient() {

        PetsClientInitializer.ADDONS.add(MOD_ID);

        Central.PETS_LIST.add(NYAN_CAT_VALUE_NO_SPACES);

        this.setUpConfig();
        this.checkForNullObjects();
        this.setUpRendering();
    }

    private void setUpConfig() {
        AutoConfig.register(NyanCatConfig.class, GsonConfigSerializer::new);
        NYAN_CAT_CONFIG = AutoConfig.getConfigHolder(NyanCatConfig.class).getConfig();
    }

    private void checkForNullObjects() {
        NYAN_CAT_CONFIG.nyanCatName = Utils.checkNullString(NYAN_CAT_CONFIG.nyanCatName);
    }

    private void setUpRendering() {
        EntityRendererRegistry.register(PetsmodNyanCat.NYAN_CAT, NyanCatRenderer::new);
        ModelLayerRegistry.registerModelLayer(NyanCatRenderer.NYAN_CAT_LOCATION, NyanCatModel::createBodyLayer);
    }
}