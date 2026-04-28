package com.jeff.pets.cobblepets;

import com.jeff.pets.cobblepets.pets.gen1.bulbasaur.Bulbasaur;
import com.jeff.pets.cobblepets.pets.GroundCobblemon;
import com.jeff.pets.cobblepets.pets.gen1.bulbasaur.Ivysaur;
import com.jeff.pets.cobblepets.pets.gen1.bulbasaur.Venusaur;
import com.jeff.pets.cobblepets.pets.gen1.bulbasaur.caterpie.Butterfree;
import com.jeff.pets.cobblepets.pets.gen1.bulbasaur.caterpie.Caterpie;
import com.jeff.pets.cobblepets.pets.gen1.bulbasaur.caterpie.Metapod;
import com.jeff.pets.cobblepets.pets.gen1.charmander.Charizard;
import com.jeff.pets.cobblepets.pets.gen1.charmander.Charmander;
import com.jeff.pets.cobblepets.pets.gen1.charmander.Charmeleon;
import com.jeff.pets.cobblepets.pets.gen1.ditto.Ditto;
import com.jeff.pets.cobblepets.pets.gen1.ekans.Arbok;
import com.jeff.pets.cobblepets.pets.gen1.ekans.Ekans;
import com.jeff.pets.cobblepets.pets.gen1.mew.Mew;
import com.jeff.pets.cobblepets.pets.gen1.mew.Mewtwo;
import com.jeff.pets.cobblepets.pets.gen1.pidgey.Pidgeot;
import com.jeff.pets.cobblepets.pets.gen1.pidgey.Pidgeotto;
import com.jeff.pets.cobblepets.pets.gen1.pidgey.Pidgey;
import com.jeff.pets.cobblepets.pets.gen1.pikachu.Pikachu;
import com.jeff.pets.cobblepets.pets.gen1.pikachu.Raichu;
import com.jeff.pets.cobblepets.pets.gen1.rattata.Raticate;
import com.jeff.pets.cobblepets.pets.gen1.rattata.Rattata;
import com.jeff.pets.cobblepets.pets.gen1.sandshrew.Sandshrew;
import com.jeff.pets.cobblepets.pets.gen1.sandshrew.Sandslash;
import com.jeff.pets.cobblepets.pets.gen1.spearow.Fearow;
import com.jeff.pets.cobblepets.pets.gen1.spearow.Spearow;
import com.jeff.pets.cobblepets.pets.gen1.squirtle.Blastoise;
import com.jeff.pets.cobblepets.pets.gen1.squirtle.Squirtle;
import com.jeff.pets.cobblepets.pets.gen1.squirtle.Wartortle;
import com.jeff.pets.cobblepets.pets.gen1.weedle.Beedrill;
import com.jeff.pets.cobblepets.pets.gen1.weedle.Kakuna;
import com.jeff.pets.cobblepets.pets.gen1.weedle.Weedle;
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

public class Cobblepets implements ModInitializer {
    public static final String MOD_ID = "cobblepets";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    private static final ResourceKey<@NotNull EntityType<?>> BULBASAUR_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "bulbasaur"));
    public static final EntityType<@NotNull Bulbasaur> BULBASAUR = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "bulbasaur"),
            EntityType.Builder.of(Bulbasaur::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .eyeHeight(1f)
                    .build(BULBASAUR_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> IVYSAUR_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "ivysaur"));
    public static final EntityType<@NotNull Ivysaur> IVYSAUR = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "ivysaur"),
            EntityType.Builder.of(Ivysaur::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .eyeHeight(1f)
                    .build(IVYSAUR_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> VENUSAUR_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "venusaur"));
    public static final EntityType<@NotNull Venusaur> VENUSAUR = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "venusaur"),
            EntityType.Builder.of(Venusaur::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(2f, 2f)
                    .eyeHeight(2f)
                    .build(VENUSAUR_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> CHARMANDER_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "charmander"));
    public static final EntityType<@NotNull Charmander> CHARMANDER = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "charmander"),
            EntityType.Builder.of(Charmander::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1.5f)
                    .eyeHeight(1.5f)
                    .build(CHARMANDER_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> CHARMELEON_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "charmeleon"));
    public static final EntityType<@NotNull Charmeleon> CHARMELEON = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "charmeleon"),
            EntityType.Builder.of(Charmeleon::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(2f, 2f)
                    .eyeHeight(2f)
                    .build(CHARMELEON_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> CHARIZARD_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "charizard"));
    public static final EntityType<@NotNull Charizard> CHARIZARD = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "charizard"),
            EntityType.Builder.of(Charizard::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(2f, 2f)
                    .eyeHeight(2f)
                    .build(CHARIZARD_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> SQUIRTLE_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "squirtle"));
    public static final EntityType<@NotNull Squirtle> SQUIRTLE = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "squirtle"),
            EntityType.Builder.of(Squirtle::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1.5f)
                    .eyeHeight(1.5f)
                    .build(SQUIRTLE_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> WARTORTLE_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "charizard"));
    public static final EntityType<@NotNull Wartortle> WARTORTLE = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "wartortle"),
            EntityType.Builder.of(Wartortle::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1.5f)
                    .eyeHeight(1.5f)
                    .build(WARTORTLE_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> BLASTOISE_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "blastoise"));
    public static final EntityType<@NotNull Blastoise> BLASTOISE = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "blastoise"),
            EntityType.Builder.of(Blastoise::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(2f, 3f)
                    .eyeHeight(2f)
                    .build(BLASTOISE_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> CATERPIE_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "caterpie"));
    public static final EntityType<@NotNull Caterpie> CATERPIE = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "caterpie"),
            EntityType.Builder.of(Caterpie::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .eyeHeight(1f)
                    .build(CATERPIE_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> METAPOD_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "metapod"));
    public static final EntityType<@NotNull Metapod> METAPOD = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "metapod"),
            EntityType.Builder.of(Metapod::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .eyeHeight(1f)
                    .build(METAPOD_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> BUTTERFREE_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "butterfree"));
    public static final EntityType<@NotNull Butterfree> BUTTERFREE = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "butterfree"),
            EntityType.Builder.of(Butterfree::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .eyeHeight(1f)
                    .build(BUTTERFREE_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> WEEDLE_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "weedle"));
    public static final EntityType<@NotNull Weedle> WEEDLE = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "weedle"),
            EntityType.Builder.of(Weedle::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .eyeHeight(1f)
                    .build(WEEDLE_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> KAKUNA_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "kakuna"));
    public static final EntityType<@NotNull Kakuna> KAKUNA = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "kakuna"),
            EntityType.Builder.of(Kakuna::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .eyeHeight(1f)
                    .build(KAKUNA_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> BEEDRILL_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "beedrill"));
    public static final EntityType<@NotNull Beedrill> BEEDRILL = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "beedrill"),
            EntityType.Builder.of(Beedrill::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(2f, 2f)
                    .eyeHeight(2f)
                    .build(BEEDRILL_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> PIDGEOT_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "pidgeot"));
    public static final EntityType<@NotNull Pidgeot> PIDGEOT = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "pidgeot"),
            EntityType.Builder.of(Pidgeot::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .eyeHeight(2f)
                    .build(PIDGEOT_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> PIDGEOTTO_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "pidgeotto"));
    public static final EntityType<@NotNull Pidgeotto> PIDGEOTTO = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "pidgeotto"),
            EntityType.Builder.of(Pidgeotto::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .eyeHeight(1f)
                    .build(PIDGEOTTO_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> PIDGEY_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "pidgey"));
    public static final EntityType<@NotNull Pidgey> PIDGEY = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "pidgey"),
            EntityType.Builder.of(Pidgey::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .eyeHeight(1f)
                    .build(PIDGEY_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> MEW_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "mew"));
    public static final EntityType<@NotNull Mew> MEW = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "mew"),
            EntityType.Builder.of(Mew::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .eyeHeight(2f)
                    .build(MEW_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> MEWTWO_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "mewtwo"));
    public static final EntityType<@NotNull Mewtwo> MEWTWO = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "mewtwo"),
            EntityType.Builder.of(Mewtwo::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(2f, 3f)
                    .eyeHeight(3f)
                    .build(MEWTWO_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> DITTO_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "ditto"));
    public static final EntityType<@NotNull Ditto> DITTO = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "ditto"),
            EntityType.Builder.of(Ditto::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .eyeHeight(1f)
                    .build(DITTO_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> RATTATA_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "rattata"));
    public static final EntityType<@NotNull Rattata> RATTATA = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "rattata"),
            EntityType.Builder.of(Rattata::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .eyeHeight(1f)
                    .build(RATTATA_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> RATICATE_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "raticate"));
    public static final EntityType<@NotNull Raticate> RATICATE = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "raticate"),
            EntityType.Builder.of(Raticate::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .eyeHeight(1f)
                    .build(RATICATE_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> SPEAROW_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "spearow"));
    public static final EntityType<@NotNull Spearow> SPEAROW = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "spearow"),
            EntityType.Builder.of(Spearow::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .eyeHeight(1f)
                    .build(SPEAROW_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> FEAROW_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "fearow"));
    public static final EntityType<@NotNull Fearow> FEAROW = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "fearow"),
            EntityType.Builder.of(Fearow::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(2f, 2f)
                    .eyeHeight(2f)
                    .build(FEAROW_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> EKANS_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "ekans"));
    public static final EntityType<@NotNull Ekans> EKANS = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "ekans"),
            EntityType.Builder.of(Ekans::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(3f, 0.5f)
                    .eyeHeight(0.5f)
                    .build(EKANS_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> ARBOK_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "arbok"));
    public static final EntityType<@NotNull Arbok> ARBOK = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "arbok"),
            EntityType.Builder.of(Arbok::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(3f, 1.5f)
                    .eyeHeight(1.5f)
                    .build(ARBOK_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> PIKACHU_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "pikachu"));
    public static final EntityType<@NotNull Pikachu> PIKACHU = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "pikachu"),
            EntityType.Builder.of(Pikachu::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .eyeHeight(1f)
                    .build(PIKACHU_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> RAICHU_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "raichu"));
    public static final EntityType<@NotNull Raichu> RAICHU = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "raichu"),
            EntityType.Builder.of(Raichu::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .eyeHeight(1f)
                    .build(RAICHU_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> SANDSHREW_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "sandshrew"));
    public static final EntityType<@NotNull Sandshrew> SANDSHREW = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "sandshrew"),
            EntityType.Builder.of(Sandshrew::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .eyeHeight(1f)
                    .build(SANDSHREW_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> SANDSLASH_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "sandslash"));
    public static final EntityType<@NotNull Sandslash> SANDSLASH = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "sandslash"),
            EntityType.Builder.of(Sandslash::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .eyeHeight(1f)
                    .build(SANDSLASH_KEY)
    );



    @Override
    public void onInitialize() {
        FabricDefaultAttributeRegistry.register(BULBASAUR, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(IVYSAUR, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(VENUSAUR, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(CHARMANDER, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(CHARMELEON, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(CHARIZARD, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(SQUIRTLE, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(WARTORTLE, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(BLASTOISE, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(CATERPIE, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(METAPOD, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(BUTTERFREE, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(WEEDLE, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(KAKUNA, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(BEEDRILL, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(PIDGEOT, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(PIDGEOTTO, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(PIDGEY, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(MEW, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(MEWTWO, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(DITTO, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(RATTATA, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(RATICATE, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(SPEAROW, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(FEAROW, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(EKANS, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(ARBOK, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(PIKACHU, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(RAICHU, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(SANDSHREW, GroundCobblemon.createAttributes().build());
        FabricDefaultAttributeRegistry.register(SANDSLASH, GroundCobblemon.createAttributes().build());
    }
}