package net.stickmanm.axontechnologies.world;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

import static net.stickmanm.axontechnologies.AxonTechnologies.DREADSTONE_DIAMOND_ORE_PLACED_KEY;
import static net.stickmanm.axontechnologies.AxonTechnologies.VOIDSTONE_PLACED_KEY;

public class ModDimensionFeatures {
    public static void registerModDimensionOres() {
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, DREADSTONE_DIAMOND_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, VOIDSTONE_PLACED_KEY);


    }
}
