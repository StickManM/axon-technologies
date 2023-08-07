package net.stickmanm.axontechnologies.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.stickmanm.axontechnologies.AxonTechnologies;
import net.stickmanm.axontechnologies.item.ModItemGroup;
import net.stickmanm.axontechnologies.world.tree.ThunderedSaplingGenerator;

public class ModBlocks {

    //Ore
    public static final Block MIMICARIUM_ORE = registerBlock("mimicarium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.GOLD_ORE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(3, 7)));

    public static final Block DEEPSLATE_MIMICARIUM_ORE = registerBlock("deepslate_mimicarium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_GOLD_ORE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(3, 7)));

    //Thundered Tree
    public static final Block THUNDERED_LOG = registerBlock("thundered_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2.0f)));
    public static final Block THUNDERED_WOOD = registerBlock("thundered_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2.0f)));
    public static final Block STRIPPED_THUNDERED_LOG = registerBlock("stripped_thundered_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(2.0f)));
    public static final Block STRIPPED_THUNDERED_WOOD = registerBlock("stripped_thundered_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(2.0f)));

    public static final Block THUNDERED_PLANKS = registerBlock("thundered_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0f)));
    public static final Block THUNDERED_LEAVES = registerBlock("thundered_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(1.0f).requiresTool()));

    public static final Block THUNDERED_SAPLING = registerBlock("thundered_sapling",
            new SaplingBlock(new ThunderedSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(1.0f).requiresTool()));

    //Portal Blocks
    public static final Block VOIDSTONE = registerBlock("voidstone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(4.0f).requiresTool()));
    public static final Block MIMIMCARIUM_PORTAL_FRAME = registerBlock("mimicarium_portal_frame",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

    public static final Block THUNDERANIUM_PORTAL_FRAME = registerBlock("thunderanium_portal_frame",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

    public static final Block CORRUPTION_PORTAL_FRAME = registerBlock("corruption_portal_frame",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4.2f).requiresTool()));

    //Dreadstone + Dreadstone Ores
    public static final Block DREADSTONE = registerBlock("dreadstone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(2.4f).requiresTool()));

    public static final Block DREADSTONE_DIAMOND_ORE = registerBlock("dreadstone_diamond_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE).strength(2.4f).requiresTool(),
                    UniformIntProvider.create(7, 10)));

    public static final Block DREADSTONE_THUNDERANIUM_ORE = registerBlock("dreadstone_thunderanium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE).strength(2.4f).requiresTool(),
                    UniformIntProvider.create(10, 17)));
    public static final Block DREADSTONE_NETHERITE_ORE = registerBlock("dreadstone_netherite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS).strength(4.5f).requiresTool(),
                    UniformIntProvider.create(10, 17)));



    //MISC

    //Mimic World
    public static final Block FAKESTONE = registerBlock("fakestone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(2.1f).requiresTool()));

    public static final Block FAKESLATE = registerBlock("fakeslate",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(2.4f).requiresTool()));

    //Thunderlands


    public static final Block CHARGED_DIRT = registerBlock("charged_dirt",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT).strength(0.6f)));

    public static final Block THUNDERED_STONE = registerBlock("thundered_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(2.1f).requiresTool()));

    public static final Block THUNDERANIUM_ORE = registerBlock("thunderanium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(ModBlocks.THUNDERED_STONE).strength(2.5f).requiresTool(),
                    UniformIntProvider.create(15, 25)));

    //Corruptionlands

    public static final Block CORRUPTED_DIRT = registerBlock("corrupted_dirt",
            new Block(FabricBlockSettings.copyOf(ModBlocks.CHARGED_DIRT).strength(0.8f)));

    public static final Block CORRUPTED_STONE = registerBlock("corrupted_stone",
            new Block(FabricBlockSettings.copyOf(ModBlocks.THUNDERED_STONE).strength(2.3f).requiresTool()));
    public static final Block CORRUPTION_BLOCK = registerBlock("corruption_block",
            new Block(FabricBlockSettings.copyOf(ModBlocks.THUNDERED_STONE).strength(2.3f).requiresTool()));

    public static final Block CORRUPTINITE_ORE = registerBlock("corruptinite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(ModBlocks.CORRUPTED_STONE).strength(2.5f).requiresTool(),
                    UniformIntProvider.create(20, 27)));





    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AxonTechnologies.MOD_ID, name), block);
    }



    private static Item registerBlockItem(String name, Block block){
        Item item = Registry.register(Registries.ITEM, new Identifier(AxonTechnologies.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;

    }




    public static void registerModBlocks() {
        AxonTechnologies.LOGGER.info("Registering ModBlocks for " + AxonTechnologies.MOD_ID);
    }
}
