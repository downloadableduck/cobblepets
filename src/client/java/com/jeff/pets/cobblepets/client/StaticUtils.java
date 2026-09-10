package com.jeff.pets.cobblepets.client;

import com.jeff.pets.client.Central;
import com.jeff.pets.client.PetsConfig;
import com.mojang.brigadier.context.CommandContext;
import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;

import java.util.List;

public class StaticUtils {
    public static final List<String> VALENCIAN_SKINS = List.of("normal", "valencian");
    public static final List<String> ALOLAN_SKINS = List.of("normal", "alolan");
    public static final List<String> GALARIAN_SKINS = List.of("normal", "galarian");
    public static final List<String> ALOLAN_GALARIAN_SKINS = List.of("normal", "alolan", "galarian");
    public static final List<String> HISUIAN_SKINS = List.of("normal", "hisuian");
    public static final List<String> POKEMON_SKINS = List.of("shiny", "not shiny");

    public static void spawnEntity(CommandContext<FabricClientCommandSource> context, Entity entity, String activePet) {
        Utils.setActivePet(entity, activePet);
        AutoConfig.getConfigHolder(PetsConfig.class).save();
        context.getSource().sendFeedback(Component.literal("§b[PetsMod] §aYour active pet has been switched to " + activePet.replace("_", " ")));
        Central.despawnPet();
        Central.summonPet();
        Central.refreshChatSuggestor(Minecraft.getInstance());
    }
}
