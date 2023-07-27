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
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        //Ores
        offerSmelting(exporter, List.of(ModBlocks.MIMICARIUM_ORE), RecipeCategory.MISC, ModItems.MIMICARIUM,
                3f, 10, "mimicarium");
        offerSmelting(exporter, List.of(ModBlocks.DEEPSLATE_MIMICARIUM_ORE), RecipeCategory.MISC, ModItems.MIMICARIUM,
                3f, 10, "mimicarium");

        offerSmelting(exporter, List.of(ModBlocks.DREADSTONE_DIAMOND_ORE), RecipeCategory.MISC, Items.DIAMOND,
                3f, 10, "diamond");

        offerSmelting(exporter, List.of(ModBlocks.DREADSTONE_THUNDERANIUM_ORE), RecipeCategory.MISC, ModItems.RAW_THUNDERANIUM,
                5f, 10, "thunderanium");

        offerSmelting(exporter, List.of(ModItems.RAW_THUNDERANIUM), RecipeCategory.MISC, ModItems.REFINED_THUNDERANIUM,
                5f, 10, "thunderanium");

        offerSmelting(exporter, List.of(ModItems.THUNDERANIUM_CLUSTER), RecipeCategory.MISC, ModItems.THUNDERANIUM_INGOT,
                5f, 10, "thunderanium");


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
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_CLUSTER)
                .pattern("##")
                .pattern("##")
                .input('#', ModItems.REFINED_THUNDERANIUM)
                .criterion(FabricRecipeProvider.hasItem(ModItems.REFINED_THUNDERANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_CLUSTER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_CLUSTER)));


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




    }
}
