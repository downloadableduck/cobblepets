package com.jeff.pets.cobblepets.client.rendering.gen1.bulbasaur_tree.bulbasaur;

import com.geckolib.model.GeoModel;
import com.geckolib.renderer.base.GeoRenderState;
import com.jeff.pets.cobblepets.pets.gen1.bulbasaur.Bulbasaur;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.cobblepets.Cobblepets.MOD_ID;
import static com.jeff.pets.cobblepets.client.CobblepetsClient.COBBLE_CONFIG;

public class BulbasaurModel extends GeoModel<@NotNull Bulbasaur> {

	public BulbasaurModel() {
        super();
    }

    @Override
    public @NotNull Identifier getModelResource(@NotNull GeoRenderState geoRenderState) {
        return Identifier.fromNamespaceAndPath(MOD_ID, "bulbasaur");
    }

    @Override
    public @NotNull Identifier getTextureResource(@NotNull GeoRenderState geoRenderState) {
        String id = "textures/entity/bulbasaur-tree/bulbasaur/";
        return (COBBLE_CONFIG.isShiny) ? Identifier.fromNamespaceAndPath(MOD_ID, id + "shiny.png") : Identifier.fromNamespaceAndPath(MOD_ID, id + "bulbasaur.png");
    }

    @Override
    public @NotNull Identifier getAnimationResource(@NotNull Bulbasaur livingEntityRenderState) {
        return Identifier.fromNamespaceAndPath(MOD_ID, "bulbasaur");
    }
}