package com.lancnia.roadutils;

import java.util.LinkedHashMap;
import java.util.Map;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class ModBlocks {
    /** All road marking blocks in registration order. */
    public static final Map<String, Block> BLOCKS = new LinkedHashMap<>();

    private ModBlocks() {}

    private static void add(String name, boolean directional) {
        Identifier id = Identifier.of(LancniaRoadUtils.MOD_ID, name);
        // Copying grey concrete gives identical hardness, blast resistance and tool requirement.
        AbstractBlock.Settings settings = AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE);
        Block block = directional ? new RoadMarkingBlock(settings) : new Block(settings);
        Registry.register(Registries.BLOCK, id, block);
        Registry.register(Registries.ITEM, id, new BlockItem(block, new Item.Settings()));
        BLOCKS.put(name, block);
    }

    public static void register() {
        add("give_way_line", true);
        add("give_way_centre", true);
        add("give_way_oncoming", true);
        add("give_way_triangle", true);
        add("stop_line", true);
        add("box_junction", false);
        add("box_junction_edge", true);
        add("box_junction_corner", true);
        add("white_line_center", true);
        add("white_line_dashed", true);
        add("white_line_double", true);
        add("white_line_edge", true);
        add("yellow_line_single", true);
        add("yellow_line_double", true);
        add("zebra_crossing", true);
        add("white_hatching", true);
        add("zigzag_line", true);
        add("arrow_straight", true);
        add("arrow_left", true);
        add("arrow_right", true);
        add("parking_bay_corner", true);
    }
}
