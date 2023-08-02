package net.stickmanm.axontechnologies;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.stickmanm.axontechnologies.block.ModBlockTags;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.block.ModFlammableBlockRegistry;
import net.stickmanm.axontechnologies.block.ModStrippableBlockRegistry;
import net.stickmanm.axontechnologies.effect.GlitchsterEffect;
import net.stickmanm.axontechnologies.effect.GlitchsterIIEffect;
import net.stickmanm.axontechnologies.effect.ThunderPoisoningEffect;
import net.stickmanm.axontechnologies.entity.ModEntities;
import net.stickmanm.axontechnologies.entity.custom.RedEssenceZombieEntity;
import net.stickmanm.axontechnologies.fluid.ModFluids;
import net.stickmanm.axontechnologies.item.ModItemGroup;
import net.stickmanm.axontechnologies.item.ModItems;
import net.stickmanm.axontechnologies.world.biome.ModBiomes;
import net.stickmanm.axontechnologies.world.dimension.ModDimensionOres;
import net.stickmanm.axontechnologies.world.dimension.ModDimensions;
import net.stickmanm.axontechnologies.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class AxonTechnologies implements ModInitializer {
	public static final String MOD_ID = "axontechnologies";
	public static final Logger LOGGER = LoggerFactory.getLogger("axontechnologies");
	public static final RegistryKey<PlacedFeature> DREADSTONE_DIAMOND_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID,"dreadstone_diamond_ore"));
	public static final RegistryKey<PlacedFeature> DREADSTONE_THUNDERANIUM_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID,"dreadstone_thunderanium_ore"));
	public static final RegistryKey<PlacedFeature> THUNDERANIUM_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID,"thunderanium_ore"));


	public static final RegistryKey<PlacedFeature> VOIDSTONE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID,"voidstone"));

	public static final RegistryKey<PlacedFeature> LIQUID_THUNDER_LAKE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID,"lake_liquid_thunder"));


	public static final StatusEffect GLITCHSTER = new GlitchsterEffect();
	public static final StatusEffect GLITCHSTERII = new GlitchsterIIEffect();
	public static final StatusEffect THUNDER_POISONING = new ThunderPoisoningEffect();
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
		ModDimensionOres.registerModDimensionOres();
		ModBiomes.registerModBiomes();



		FabricDefaultAttributeRegistry.register(ModEntities.RED_ESSENCE_ZOMBIE, RedEssenceZombieEntity.setAttributes());
		Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "glitchster"), GLITCHSTER);
		Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "glitchster2"), GLITCHSTERII);
		Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "thunder_poisoning"), THUNDER_POISONING);

	}
}