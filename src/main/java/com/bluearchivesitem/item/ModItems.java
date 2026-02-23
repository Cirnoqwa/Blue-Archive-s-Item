package com.bluearchivesitem.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import com.bluearchivesitem.BlueArchivesItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // 定义青辉石
    public static final Item QHS = new Item(new FabricItemSettings());

    public static void registerItems() {
        BlueArchivesItem.LOGGER.info("Registering Mod Items for " + BlueArchivesItem.MOD_ID);
        registerItem("qhs", QHS);
    }

    private static Item registerItem(String name, Item item) {
        // Resource assets use the folder 'blue-archives-item' (with hyphens).
        // Register the item using that namespace so Minecraft can find the
        // model/texture files located under assets/blue-archives-item/...
        return Registry.register(Registries.ITEM,
                new Identifier("blue_archives_item", name),
                item);
    }
}