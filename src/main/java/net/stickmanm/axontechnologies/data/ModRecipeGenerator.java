package net.stickmanm.axontechnologies.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.SmeltingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) { //cool comment



        //Merging

        //Ores
        offerSmelting(exporter, List.of(ModBlocks.MIMICARIUM_ORE), RecipeCategory.MISC, ModItems.MIMICARIUM,
                3f, 75, "mimicarium");
        offerSmelting(exporter, List.of(ModBlocks.DEEPSLATE_MIMICARIUM_ORE), RecipeCategory.MISC, ModItems.MIMICARIUM,
                3f, 10, "mimicarium");


        offerSmelting(exporter, List.of(ModBlocks.DREADSTONE_DIAMOND_ORE), RecipeCategory.MISC, Items.DIAMOND,
                3f, 75, "diamond");

        offerSmelting(exporter, List.of(ModBlocks.DREADSTONE_NETHERITE_ORE), RecipeCategory.MISC, Items.NETHERITE_INGOT,
                3f, 75, "netherite");

        offerSmelting(exporter, List.of(ModBlocks.VOID_COAL_ORE), RecipeCategory.MISC, ModItems.VOID_COAL,
                3f, 75, "void_coal");

        offerBlasting(exporter, List.of(ModItems.RAW_NETHERITE), RecipeCategory.MISC, Items.NETHERITE_INGOT,
                3f, 75, "netherite");

        offerSmelting(exporter, List.of(ModBlocks.DREADSTONE_THUNDERANIUM_ORE), RecipeCategory.MISC, ModItems.REFINED_THUNDERANIUM,
                5f, 75, "thunderanium");

        offerSmelting(exporter, List.of(ModBlocks.THUNDERANIUM_ORE), RecipeCategory.MISC, ModItems.REFINED_THUNDERANIUM,
                5f, 75, "thunderanium");

        offerSmelting(exporter, List.of(ModBlocks.CORRUPTINITE_ORE), RecipeCategory.MISC, ModItems.UNSTABLE_CORRUPTINITE,
                5f, 75, "corruptinite");


        offerBlasting(exporter, List.of(ModItems.RAW_THUNDERANIUM), RecipeCategory.MISC, ModItems.REFINED_THUNDERANIUM,
                5f, 75, "thunderanium");

        offerBlasting(exporter, List.of(ModItems.THUNDERANIUM_CLUSTER), RecipeCategory.MISC, ModItems.THUNDERANIUM_INGOT,
                5f, 75, "thunderanium");

        offerBlasting(exporter, List.of(ModItems.RED_THUNDERANIUM_CLUSTER), RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_INGOT,
                10f, 75, "red_thunderanium");

        offerBlasting(exporter, List.of(ModItems.DARK_THUNDERANIUM_CLUSTER), RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_INGOT,
                1000f, 6000, "dark_thunderanium");

        //BLAST FURNACE +
        offerBlasting(exporter, List.of(Blocks.SAND), RecipeCategory.BUILDING_BLOCKS, Blocks.GLASS,
                5f, 100, "glass");

        offerBlasting(exporter, List.of(Blocks.RED_SAND), RecipeCategory.BUILDING_BLOCKS, Blocks.GLASS,
                5f, 100, "glass");


        offerBlasting(exporter, List.of(Items.CLAY_BALL), RecipeCategory.BUILDING_BLOCKS, Items.BRICK,
                5f, 100, "brick");

        offerBlasting(exporter, List.of(Blocks.NETHERRACK), RecipeCategory.BUILDING_BLOCKS, Items.NETHER_BRICK,
                5f, 100, "brick");


        offerBlasting(exporter, List.of(Blocks.STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_STONE_BRICKS,
                5f, 100, "cracked");

        offerBlasting(exporter, List.of(Blocks.DEEPSLATE_BRICKS), RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_DEEPSLATE_BRICKS,
                5f, 100, "cracked");

        offerBlasting(exporter, List.of(Blocks.DEEPSLATE_TILES), RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_DEEPSLATE_TILES,
                5f, 100, "cracked");

        offerBlasting(exporter, List.of(Blocks.POLISHED_BLACKSTONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS,
                5f, 100, "cracked");

        offerBlasting(exporter, List.of(Blocks.NETHER_BRICKS), RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_NETHER_BRICKS,
                5f, 100, "cracked");

        //CRAFTING +
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.HOPPER)
                .pattern("# #")
                .pattern("#B#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('B', Items.BARREL)
                .criterion(FabricRecipeProvider.hasItem(Items.BARREL),
                        FabricRecipeProvider.conditionsFromItem(Items.HOPPER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.HOPPER)));



        //Thundered Wood

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.THUNDERED_WOOD)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.THUNDERED_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.THUNDERED_LOG),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.THUNDERED_WOOD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.THUNDERED_WOOD)));

       //IGNITERS
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MIMICARIUM_IGNITER)
                .pattern(" F#")
                .pattern(" SF")
                .pattern("S  ")
                .input('#', ModItems.MIMICARIUM)
                .input('F', Items.FLINT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.MIMICARIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.MIMICARIUM_IGNITER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.MIMICARIUM_IGNITER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DREADED_IGNITER)
                .pattern("FVF")
                .pattern("V#V")
                .pattern("FVF")
                .input('#', ModItems.MIMICARIUM_IGNITER)
                .input('V', ModBlocks.VOIDSTONE)
                .input('F', Items.FLINT)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.VOIDSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DREADED_IGNITER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DREADED_IGNITER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_KEY)
                .pattern("RGR")
                .pattern("#I#")
                .pattern("RGR")
                .input('I', ModItems.DREADED_IGNITER)
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .input('G', Items.GOLD_INGOT)
                .input('R', Items.REDSTONE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_KEY))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_KEY)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTION_GATEWAY)
                .pattern("DRD")
                .pattern("#K#")
                .pattern("DRD")
                .input('K', ModItems.THUNDERANIUM_KEY)
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .input('D', ModBlocks.CORRUPTION_BLOCK)
                .input('R', ModItems.RED_THUNDERANIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CORRUPTION_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTION_GATEWAY))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTION_GATEWAY)));

        //PORTAL FRAMES
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MIMIMCARIUM_PORTAL_FRAME)
                .pattern("I#I")
                .pattern("#C#")
                .pattern("I#I")
                .input('#', ModItems.MIMICARIUM)
                .input('I', Items.IRON_INGOT)
                .input('C', Items.COAL)
                .criterion(FabricRecipeProvider.hasItem(ModItems.MIMICARIUM),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.MIMIMCARIUM_PORTAL_FRAME))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.MIMIMCARIUM_PORTAL_FRAME)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.THUNDERANIUM_PORTAL_FRAME)
                .pattern("DND")
                .pattern("#M#")
                .pattern("DND")
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .input('D', Items.DIAMOND)
                .input('M', ModBlocks.MIMIMCARIUM_PORTAL_FRAME)
                .input('N', Items.NETHERITE_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.THUNDERANIUM_PORTAL_FRAME))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.THUNDERANIUM_PORTAL_FRAME)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORRUPTION_PORTAL_FRAME)
                .pattern("DRD")
                .pattern("#F#")
                .pattern("DTD")
                .input('#', ModItems.RED_ESSENCE)
                .input('D', ModBlocks.CORRUPTION_BLOCK)
                .input('F', ModBlocks.THUNDERANIUM_PORTAL_FRAME)
                .input('T', ModItems.THUNDERANIUM_INGOT)
                .input('R', ModItems.RED_THUNDERANIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CORRUPTION_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.CORRUPTION_PORTAL_FRAME))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.CORRUPTION_PORTAL_FRAME)));

        //MISC
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_CLUSTER)
                .pattern("###")
                .pattern("TTT")
                .pattern("###")
                .input('#', ModItems.RED_ESSENCE)
                .input('T', ModItems.THUNDERANIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_ESSENCE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_CLUSTER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_CLUSTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_CLUSTER)
                .pattern("###")
                .input('#', ModItems.REFINED_THUNDERANIUM)
                .criterion(FabricRecipeProvider.hasItem(ModItems.REFINED_THUNDERANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_CLUSTER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_CLUSTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_CLUSTER)
                .pattern("###")
                .pattern("TTT")
                .pattern("###")
                .input('#', ModItems.DARK_ESSENCE)
                .input('T', ModItems.RED_THUNDERANIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_ESSENCE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_CLUSTER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_CLUSTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE)
                .pattern("###")
                .pattern("UUU")
                .pattern("###")
                .input('#', ModItems.DARK_ESSENCE)
                .input('U', ModItems.UNSTABLE_CORRUPTINITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.UNSTABLE_CORRUPTINITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TICKLE_TRAVIS_TICKLER)
                .input(ModItems.AXON_TOOL)
                .input(Items.FEATHER)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_TOOL),
                        FabricRecipeProvider.conditionsFromItem(ModItems.TICKLE_TRAVIS_TICKLER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TICKLE_TRAVIS_TICKLER)));

        //Fuels
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDER_FUEL)
                .input(ModItems.THUNDERANIUM_INGOT)
                .input(ModBlocks.VOID_COAL_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDER_FUEL))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDER_FUEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.VOID_COAL_BLOCK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.VOID_COAL)
                .criterion(FabricRecipeProvider.hasItem(ModItems.VOID_COAL),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.VOID_COAL_BLOCK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.VOID_COAL_BLOCK)));


        //Armor

        //Thunderanium
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_HELMET)
                .pattern("###")
                .pattern("# #")
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_HELMET))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_CHESTPLATE)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_CHESTPLATE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_LEGGINGS)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_LEGGINGS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_BOOTS)
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_BOOTS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_BOOTS)));

        //Red Thunderanium
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_HELMET)
                .pattern("###")
                .pattern("#T#")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT)
                .input('T', ModItems.THUNDERANIUM_HELMET)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_HELMET))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_CHESTPLATE)
                .pattern("#T#")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT)
                .input('T', ModItems.THUNDERANIUM_CHESTPLATE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_CHESTPLATE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_LEGGINGS)
                .pattern("###")
                .pattern("#T#")
                .pattern("# #")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT)
                .input('T', ModItems.THUNDERANIUM_LEGGINGS)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_LEGGINGS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_BOOTS)
                .pattern("#T#")
                .pattern("# #")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT)
                .input('T', ModItems.THUNDERANIUM_BOOTS)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_BOOTS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_BOOTS)));


        //Dark Thunderanium
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_HELMET)
                .pattern("###")
                .pattern("#T#")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT)
                .input('T', ModItems.RED_THUNDERANIUM_HELMET)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_HELMET))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_CHESTPLATE)
                .pattern("#T#")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT)
                .input('T', ModItems.RED_THUNDERANIUM_CHESTPLATE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_CHESTPLATE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_LEGGINGS)
                .pattern("###")
                .pattern("#T#")
                .pattern("# #")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT)
                .input('T', ModItems.RED_THUNDERANIUM_LEGGINGS)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_LEGGINGS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_BOOTS)
                .pattern("#T#")
                .pattern("# #")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT)
                .input('T', ModItems.RED_THUNDERANIUM_BOOTS)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_BOOTS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_BOOTS)));

        //Corruptinite
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_HELMET)
                .pattern("###")
                .pattern("#T#")
                .input('#', ModItems.CORRUPTINITE)
                .input('T', ModItems.RED_THUNDERANIUM_HELMET)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_HELMET))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_CHESTPLATE)
                .pattern("#T#")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.CORRUPTINITE)
                .input('T', ModItems.RED_THUNDERANIUM_CHESTPLATE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_CHESTPLATE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_LEGGINGS)
                .pattern("###")
                .pattern("#T#")
                .pattern("# #")
                .input('#', ModItems.CORRUPTINITE)
                .input('T', ModItems.RED_THUNDERANIUM_LEGGINGS)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_LEGGINGS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_BOOTS)
                .pattern("#T#")
                .pattern("# #")
                .input('#', ModItems.CORRUPTINITE)
                .input('T', ModItems.RED_THUNDERANIUM_BOOTS)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_BOOTS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_BOOTS)));


        //Tools

        //MISC
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ANTIGLITCH_SWORD)
                .pattern("EEE")
                .pattern("E#E")
                .pattern("EEE")
                .input('#', ModItems.RED_THUNDERANIUM_SWORD)
                .input('E', ModItems.DARK_ESSENCE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_ESSENCE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ANTIGLITCH_SWORD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.ANTIGLITCH_SWORD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_GOLD_HOE)
                .input(Items.GOLDEN_HOE)
                .input(Items.IRON_HOE)
                .criterion(FabricRecipeProvider.hasItem(Items.GOLDEN_HOE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.IRON_GOLD_HOE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.IRON_GOLD_HOE)));




        //Axon
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ULTIMATE_HOE_TROPHY)
                .input(Items.DIAMOND_HOE)
                .input(Items.NETHERITE_HOE)
                .input(Items.WOODEN_HOE)
                .input(Items.STONE_HOE)
                .input(ModItems.IRON_GOLD_HOE)
                .input(ModItems.THUNDERANIUM_HOE)
                .input(ModItems.RED_THUNDERANIUM_HOE)
                .input(ModItems.DARK_THUNDERANIUM_HOE)
                .input(ModItems.CORRUPTINITE_HOE)
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_HOE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ULTIMATE_HOE_TROPHY))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.ULTIMATE_HOE_TROPHY)));


        //Thunderanium
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_SWORD)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" S ")
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_SWORD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_PICKAXE)
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_PICKAXE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_SHOVEL)
                .pattern(" # ")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_SHOVEL))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_AXE)
                .pattern("## ")
                .pattern("#S ")
                .pattern(" S ")
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_AXE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_HOE)
                .pattern("## ")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_HOE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_HOE)));


        //Red Thunderanium
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_SWORD)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" S ")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_SWORD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_PICKAXE)
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_PICKAXE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_SHOVEL)
                .pattern(" # ")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_SHOVEL))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_AXE)
                .pattern("## ")
                .pattern("#S ")
                .pattern(" S ")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_AXE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_HOE)
                .pattern("## ")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_HOE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_HOE)));



        //Dark Thunderanium
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_SWORD)
                .pattern("E#E")
                .pattern("E#E")
                .pattern("ESE")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT)
                .input('S', ModItems.ANTIGLITCH_SWORD)
                .input('E', ModItems.DARK_ESSENCE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_SWORD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_PICKAXE)
                .pattern("###")
                .pattern("ESE")
                .pattern("EBE")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .input('E', ModItems.DARK_ESSENCE)
                .input('B', ModItems.RED_THUNDERANIUM_PICKAXE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_PICKAXE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_SHOVEL)
                .pattern("E#E")
                .pattern("ESE")
                .pattern("EBE")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .input('E', ModItems.DARK_ESSENCE)
                .input('B', ModItems.RED_THUNDERANIUM_SHOVEL)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_SHOVEL))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_AXE)
                .pattern("##E")
                .pattern("#SE")
                .pattern("EBE")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .input('E', ModItems.DARK_ESSENCE)
                .input('B', ModItems.RED_THUNDERANIUM_AXE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_AXE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_HOE)
                .pattern("##E")
                .pattern("ESE")
                .pattern("EBE")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .input('E', ModItems.DARK_ESSENCE)
                .input('B', ModItems.RED_THUNDERANIUM_HOE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_HOE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_HOE)));


        //Corruptinite
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_SWORD)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" S ")
                .input('#', ModItems.CORRUPTINITE)
                .input('S', ModItems.ANTIGLITCH_SWORD)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_SWORD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_PICKAXE)
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.CORRUPTINITE)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_PICKAXE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_SHOVEL)
                .pattern(" # ")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.CORRUPTINITE)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_SHOVEL))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_AXE)
                .pattern("## ")
                .pattern("#S ")
                .pattern(" S ")
                .input('#', ModItems.CORRUPTINITE)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_AXE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_HOE)
                .pattern("## ")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.CORRUPTINITE)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_HOE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_HOE)));




    }
}
