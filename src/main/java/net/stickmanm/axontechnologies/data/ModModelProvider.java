package net.stickmanm.axontechnologies.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.ModelIds;
import net.minecraft.data.client.Models;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //Ores
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MIMICARIUM_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_MIMICARIUM_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.THUNDERANIUM_ORE);


        //Thundered Tree Blocks
        blockStateModelGenerator.registerLog(ModBlocks.THUNDERED_LOG).log(ModBlocks.THUNDERED_LOG).wood(ModBlocks.THUNDERED_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_THUNDERED_LOG).log(ModBlocks.STRIPPED_THUNDERED_LOG).wood(ModBlocks.STRIPPED_THUNDERED_WOOD);


        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.THUNDERED_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.THUNDERED_LEAVES);

        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.THUNDERED_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        //Dreadstone and Dreadstone Ores
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DREADSTONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DREADSTONE_DIAMOND_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DREADSTONE_THUNDERANIUM_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DREADSTONE_NETHERITE_ORE);

        //MISC

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VOIDSTONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MIMIMCARIUM_PORTAL_FRAME);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.THUNDERANIUM_PORTAL_FRAME);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CORRUPTION_PORTAL_FRAME);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FAKESTONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FAKESLATE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHARGED_DIRT);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.THUNDERED_STONE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CORRUPTED_STONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CORRUPTED_DIRT);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CORRUPTION_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CORRUPTINITE_ORE);


        //SPAWN EGGS
        blockStateModelGenerator.registerParentedItemModel(ModItems.RED_ESSENCE_ZOMBIE_SPAWN_EGG, ModelIds.getMinecraftNamespacedItem("template_spawn_egg"));
        blockStateModelGenerator.registerParentedItemModel(ModItems.DARK_ESSENCE_ZOMBIE_SPAWN_EGG, ModelIds.getMinecraftNamespacedItem("template_spawn_egg"));

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.MIMICARIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_NETHERITE, Models.GENERATED);

        //Fuels
        itemModelGenerator.register(ModItems.THUNDER_FUEL, Models.GENERATED);

        //Igniters
        itemModelGenerator.register(ModItems.MIMICARIUM_IGNITER, Models.GENERATED);
        itemModelGenerator.register(ModItems.DREADED_IGNITER, Models.GENERATED);
        itemModelGenerator.register(ModItems.THUNDERANIUM_KEY, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORRUPTION_GATEWAY, Models.GENERATED);

        //Thunderanium
        itemModelGenerator.register(ModItems.RAW_THUNDERANIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.REFINED_THUNDERANIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.THUNDERANIUM_CLUSTER, Models.GENERATED);
        itemModelGenerator.register(ModItems.THUNDERANIUM_INGOT, Models.GENERATED);

        //Red Thunderanium
        itemModelGenerator.register(ModItems.RED_THUNDERANIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_THUNDERANIUM_CLUSTER, Models.GENERATED);

        //Essence
        itemModelGenerator.register(ModItems.RED_ESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DARK_ESSENCE, Models.GENERATED);

        //Dark Thunderanium
        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_CLUSTER, Models.GENERATED);

        //Corruptinite
        itemModelGenerator.register(ModItems.CORRUPTINITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.UNSTABLE_CORRUPTINITE, Models.GENERATED);

        //Armors
        itemModelGenerator.register(ModItems.ARMOR_TEST_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ARMOR_TEST_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ARMOR_TEST_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ARMOR_TEST_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.THUNDERANIUM_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.THUNDERANIUM_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.THUNDERANIUM_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.THUNDERANIUM_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.RED_THUNDERANIUM_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_THUNDERANIUM_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_THUNDERANIUM_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_THUNDERANIUM_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.CORRUPTINITE_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORRUPTINITE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORRUPTINITE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORRUPTINITE_BOOTS, Models.GENERATED);

        //Tools

        itemModelGenerator.register(ModItems.ANTIGLITCH_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.THUNDERANIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.THUNDERANIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.THUNDERANIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.THUNDERANIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.THUNDERANIUM_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.RED_THUNDERANIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RED_THUNDERANIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RED_THUNDERANIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RED_THUNDERANIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RED_THUNDERANIUM_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.CORRUPTINITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CORRUPTINITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CORRUPTINITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CORRUPTINITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CORRUPTINITE_HOE, Models.HANDHELD);


    }
}
