package net.stickmanm.axontechnologies.world.dimension;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.stickmanm.axontechnologies.world.biome.ModBiomes;

import static net.stickmanm.axontechnologies.AxonTechnologies.*;





public class ModDimensionFeatures {
    public static final RegistryKey<PlacedFeature> LIQUID_THUNDER_LAKE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID,"lake_liquid_thunder"));
    public static final RegistryKey<PlacedFeature> CORRUPTIONLANDS_LAVA_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID,"lake_corruptionlands_lava"));

    public static void registerModDimensionFeatures() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.THUNDERED_PLAINS_KEY), GenerationStep.Feature.LAKES, LIQUID_THUNDER_LAKE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.CORRUPTED_PLAINS_KEY), GenerationStep.Feature.LAKES, CORRUPTIONLANDS_LAVA_PLACED_KEY);
    }
}
