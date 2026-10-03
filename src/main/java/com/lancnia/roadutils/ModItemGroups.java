package com.lancnia.roadutils;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public final class ModItemGroups {
    private ModItemGroups() {}

    public static void register() {
        Registry.register(Registries.ITEM_GROUP, Identifier.of(LancniaRoadUtils.MOD_ID, "main"),
            FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModBlocks.BLOCKS.get("give_way_triangle")))
                .displayName(Text.translatable("itemGroup." + LancniaRoadUtils.MOD_ID + ".main"))
                .entries((context, entries) -> ModBlocks.BLOCKS.values().forEach(entries::add))
                .build());
    }
}
