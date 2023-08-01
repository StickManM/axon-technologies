package net.stickmanm.axontechnologies.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.SmeltingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
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
                3f, 10, "mimicarium");
        offerSmelting(exporter, List.of(ModBlocks.DEEPSLATE_MIMICARIUM_ORE), RecipeCategory.MISC, ModItems.MIMICARIUM,
                3f, 10, "mimicarium");

        offerSmelting(exporter, List.of(ModBlocks.DREADSTONE_DIAMOND_ORE), RecipeCategory.MISC, Items.DIAMOND,
                3f, 10, "diamond");

        offerSmelting(exporter, List.of(ModBlocks.DREADSTONE_THUNDERANIUM_ORE), RecipeCategory.MISC, ModItems.RAW_THUNDERANIUM,
                5f, 10, "thunderanium");

        offerSmelting(exporter, List.of(ModBlocks.THUNDERANIUM_ORE), RecipeCategory.MISC, ModItems.RAW_THUNDERANIUM,
                5f, 10, "thunderanium");

        offerSmelting(exporter, List.of(ModItems.RAW_THUNDERANIUM), RecipeCategory.MISC, ModItems.REFINED_THUNDERANIUM,
                5f, 10, "thunderanium");

        offerSmelting(exporter, List.of(ModItems.THUNDERANIUM_CLUSTER), RecipeCategory.MISC, ModItems.THUNDERANIUM_INGOT,
                5f, 10, "thunderanium");

        offerSmelting(exporter, List.of(ModItems.RED_THUNDERANIUM_CLUSTER), RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_INGOT,
                10f, 15, "red_thunderanium");


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
                .pattern("DED")
                .pattern("#M#")
                .pattern("DED")
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .input('D', Items.DIAMOND)
                .input('M', ModBlocks.MIMIMCARIUM_PORTAL_FRAME)
                .input('E', Items.ENDER_PEARL)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.THUNDERANIUM_PORTAL_FRAME))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.THUNDERANIUM_PORTAL_FRAME)));

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
                .pattern("##")
                .pattern("##")
                .input('#', ModItems.REFINED_THUNDERANIUM)
                .criterion(FabricRecipeProvider.hasItem(ModItems.REFINED_THUNDERANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_CLUSTER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_CLUSTER)));

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


        //Tools

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
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_HOE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_HOE)));




    }
}
