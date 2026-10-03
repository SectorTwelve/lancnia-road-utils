package com.lancnia.roadutils;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class LancniaRoadUtilsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // The markings are drawn as a transparent overlay on top of the grey concrete texture.
        ModBlocks.BLOCKS.values().forEach(block -> BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout()));
    }
}
