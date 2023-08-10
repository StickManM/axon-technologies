package net.stickmanm.axontechnologies;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.stickmanm.axontechnologies.block.ModBlockTags;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.block.ModFlammableBlockRegistry;
import net.stickmanm.axontechnologies.block.ModStrippableBlockRegistry;
import net.stickmanm.axontechnologies.effect.ModEffects;
import net.stickmanm.axontechnologies.entity.ModEntities;
import net.stickmanm.axontechnologies.entity.custom.DarkEssenceZombieEntity;
import net.stickmanm.axontechnologies.entity.custom.RedEssenceZombieEntity;
import net.stickmanm.axontechnologies.fluid.ModFluids;
import net.stickmanm.axontechnologies.item.ModFuels;
import net.stickmanm.axontechnologies.item.ModItemGroup;
import net.stickmanm.axontechnologies.item.ModItems;
import net.stickmanm.axontechnologies.world.biome.ModBiomes;
import net.stickmanm.axontechnologies.world.dimension.ModDimensionFeatures;
import net.stickmanm.axontechnologies.world.dimension.ModDimensions;
import net.stickmanm.axontechnologies.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class AxonTechnologies implements ModInitializer {
	public static final String MOD_ID = "axontechnologies";
	public static final Logger LOGGER = LoggerFactory.getLogger("axontechnologies");


	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModFluids.register();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlockTags.registerModTags();
		ModWorldGeneration.generateModWorldGen();


		ModFlammableBlockRegistry.registerFlammableBlocks();
		ModStrippableBlockRegistry.registerStrippableBlocks();

		ModDimensions.registerModDimensions();
		ModDimensionFeatures.registerModDimensionFeatures();
		ModBiomes.registerModBiomes();

		ModEffects.registerModEffects();

		ModFuels.registerModFuels();

		ModEntities.registerModEntities();


	}
}