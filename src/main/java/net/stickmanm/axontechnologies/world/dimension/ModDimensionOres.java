package net.stickmanm.axontechnologies.world.dimension;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.stickmanm.axontechnologies.AxonTechnologies;
import net.stickmanm.axontechnologies.world.biome.ModBiomes;

import static net.stickmanm.axontechnologies.AxonTechnologies.*;

public class ModDimensionOres {
    public static void registerModDimensionOres() {
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, DREADSTONE_DIAMOND_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, DREADSTONE_THUNDERANIUM_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, DREADSTONE_NETHERITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, THUNDERANIUM_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, CORRUPTION_BLOCK_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, VOIDSTONE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.THUNDERED_PLAINS_KEY), GenerationStep.Feature.LAKES, LIQUID_THUNDER_LAKE_PLACED_KEY);



    }
}
