package com.lancnia.roadutils;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LancniaRoadUtils implements ModInitializer {
    public static final String MOD_ID = "lancnia_road_utils";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModBlocks.register();
        ModItemGroups.register();
        LOGGER.info("Lancnia Road Utils loaded - {} road marking blocks registered", ModBlocks.BLOCKS.size());
    }
}
