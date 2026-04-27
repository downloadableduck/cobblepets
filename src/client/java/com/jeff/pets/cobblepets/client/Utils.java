package com.jeff.pets.cobblepets.client;

import net.minecraft.resources.Identifier;

import static com.jeff.pets.cobblepets.Cobblepets.MOD_ID;

public class Utils {
    public static Identifier cobble(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}
