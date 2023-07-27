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



    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        //Mimicarium Ore
        RuleTest mimicariumStoneReplaceables = new TagMatchRuleTest(ModBlockTags.MIMICARIUM_REPLACEABLE_STONE);
        RuleTest mimicariumDeepslateReplaceables = new TagMatchRuleTest(ModBlockTags.MIMICARIUM_REPLACEABLE_DEEPSLATE);

        List<OreFeatureConfig.Target> overworldMimicariumOres =
                List.of(OreFeatureConfig.createTarget(mimicariumStoneReplaceables, ModBlocks.MIMICARIUM_ORE.getDefaultState()),
                       OreFeatureConfig.createTarget(mimicariumDeepslateReplaceables, ModBlocks.DEEPSLATE_MIMICARIUM_ORE.getDefaultState()));
        //Dreadstone Ores







        //Thundered Tree
        register(context, THUNDERED_SAPLING_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.THUNDERED_LOG),
                new StraightTrunkPlacer(5, 6, 3),
                BlockStateProvider.of(ModBlocks.THUNDERED_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, MIMICARIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMimicariumOres, 10));
    }
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(AxonTechnologies.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
