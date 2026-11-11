package com.example;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main entry point for the urtabtt Fabric mod.
 *
 * Gameplay features are intentionally left open while the project is being planned.
 */
public class TemplateMod implements ModInitializer {
    public static final String MOD_ID = "template-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("urtabtt Fabric mod initialized!");
    }
}
