package net.stickmanm.axontechnologies.world;

import net.minecraft.block.Block;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.stickmanm.axontechnologies.AxonTechnologies;
import net.stickmanm.axontechnologies.block.ModBlockTags;
import net.stickmanm.axontechnologies.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> THUNDERED_SAPLING_KEY = registerKey("thundered_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MIMICARIUM_ORE_KEY = registerKey("mimicarium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DREADSTONE_DIAMOND_ORE_KEY = registerKey("dreadstone_diamond_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DREADSTONE_THUNDERANIUM_ORE_KEY = registerKey("dreadstone_thunderanium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DREADSTONE_NETHERITE_ORE_KEY = registerKey("dreadstone_netherite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VOID_COAL_ORE_KEY = registerKey("void_coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DIMENSION_CORE_ORE_KEY = registerKey("dimension_core_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RENDERIUM_ORE_KEY = registerKey("renderium_ore");



    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        //Mimicarium Ore
        RuleTest mimicariumStoneReplaceables = new TagMatchRuleTest(ModBlockTags.MIMICARIUM_REPLACEABLE_STONE);
        RuleTest mimicariumDeepslateReplaceables = new TagMatchRuleTest(ModBlockTags.MIMICARIUM_REPLACEABLE_DEEPSLATE);
        RuleTest mimicWorld = new TagMatchRuleTest(ModBlockTags.FAKESLATE_REPLACEABLE);
        RuleTest dreadCaverns = new TagMatchRuleTest(ModBlockTags.DREADSTONE_REPLACEABLE);
        RuleTest thunderlands = new TagMatchRuleTest(ModBlockTags.THUNDERED_STONE_REPLACEABLE);
        RuleTest corruptionlands = new TagMatchRuleTest(ModBlockTags.CORRUPTED_STONE_REPLACEABLE);

        List<OreFeatureConfig.Target> overworldMimicariumOres =
                List.of(OreFeatureConfig.createTarget(mimicariumStoneReplaceables, ModBlocks.MIMICARIUM_ORE.getDefaultState()),
                       OreFeatureConfig.createTarget(mimicariumDeepslateReplaceables, ModBlocks.DEEPSLATE_MIMICARIUM_ORE.getDefaultState()));

        //Dimension Cores
        List<OreFeatureConfig.Target> dimensionCoreOres =
                List.of(OreFeatureConfig.createTarget(mimicWorld, ModBlocks.MWDC_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(dreadCaverns, ModBlocks.DCDC_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(thunderlands, ModBlocks.TLDC_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(corruptionlands, ModBlocks.CLDC_ORE.getDefaultState()));

        //Dreadstone Ores
        List<OreFeatureConfig.Target> dreadstoneDiamondOres = List.of(OreFeatureConfig.createTarget(dreadCaverns, ModBlocks.DREADSTONE_DIAMOND_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> dreadstoneThunderaniumOres = List.of(OreFeatureConfig.createTarget(dreadCaverns, ModBlocks.DREADSTONE_THUNDERANIUM_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> dreadstoneNetheriteOres = List.of(OreFeatureConfig.createTarget(dreadCaverns, ModBlocks.DREADSTONE_NETHERITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> voidCoalOres = List.of(OreFeatureConfig.createTarget(dreadCaverns, ModBlocks.VOID_COAL_ORE.getDefaultState()));

        //Thunderlands
        List<OreFeatureConfig.Target> renderiumOres = List.of(OreFeatureConfig.createTarget(thunderlands, ModBlocks.RENDERIUM_ORE.getDefaultState()));






        //Thundered Tree
        register(context, THUNDERED_SAPLING_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.THUNDERED_LOG),
                new StraightTrunkPlacer(5, 6, 3),
                BlockStateProvider.of(ModBlocks.THUNDERED_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        //register
        register(context, MIMICARIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMimicariumOres, 10));
        register(context, DIMENSION_CORE_ORE_KEY, Feature.ORE, new OreFeatureConfig(dimensionCoreOres, 2));
        register(context, RENDERIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(renderiumOres, 3));


        //Dreadstone Ores
        register(context, DREADSTONE_DIAMOND_ORE_KEY, Feature.ORE, new OreFeatureConfig(dreadstoneDiamondOres, 8));
        register(context, DREADSTONE_NETHERITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(dreadstoneNetheriteOres, 4));
        register(context, DREADSTONE_THUNDERANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(dreadstoneThunderaniumOres, 4));
        register(context, VOID_COAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(voidCoalOres, 10));
    }
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(AxonTechnologies.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
