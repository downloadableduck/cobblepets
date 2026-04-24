package com.jeff.pets.nyancat;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PetsmodNyanCat implements ModInitializer {
    public static final String MOD_ID = "petsmod-nyan-cat";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    private static final ResourceKey<@NotNull EntityType<?>> NYAN_CAT_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "nyan_cat"));
    public static final EntityType<@NotNull NyanCat> NYAN_CAT = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "nyan_cat"),
            EntityType.Builder.of(NyanCat::new, MobCategory.AMBIENT)
                    .sized(2f, 1.5f)
                    .eyeHeight(1.5f)
                    .build(NYAN_CAT_KEY)
    );

    @Override
    public void onInitialize() {
        FabricDefaultAttributeRegistry.register(NYAN_CAT, NyanCat.createAttributes().build());
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("Nyan Cat for Petsmod initialized");
    }
}