package net.stickmanm.axontechnologies.world.biome;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.stickmanm.axontechnologies.AxonTechnologies;

public class ModBiomes {

    public static final RegistryKey<Biome> THUNDERED_PLAINS_KEY = RegistryKey.of(RegistryKeys.BIOME, new Identifier("axontechnologies","thundered_plains"));


    public static void registerModBiomes(){
        AxonTechnologies.LOGGER.info("Registering Mod Biomes for " + AxonTechnologies.MOD_ID);

    }
}
