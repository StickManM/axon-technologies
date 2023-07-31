package net.stickmanm.axontechnologies.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologies;
import net.stickmanm.axontechnologies.block.ModBlocks;

public class ModItemGroup {
    public static ItemGroup AXONTECHNOLOGIES = Registry.register(Registries.ITEM_GROUP, new Identifier(AxonTechnologies.MOD_ID, "axontechnologiesgroup"),
            FabricItemGroup.builder()
                    .displayName(Text.literal("Axon T.E.C.H.N.O.L.O.G.I.E.S."))
                    .icon(() -> new ItemStack(ModItems.RED_THUNDERANIUM_INGOT)).entries((displayContext, entries) -> {
                        //ITEMS
                        entries.add(ModItems.MIMICARIUM);
                        entries.add(ModItems.RAW_THUNDERANIUM);
                        entries.add(ModItems.THUNDERANIUM_CLUSTER);
                        entries.add(ModItems.REFINED_THUNDERANIUM);
                        entries.add(ModItems.THUNDERANIUM_INGOT);
                        entries.add(ModItems.RED_ESSENCE_ZOMBIE_SPAWN_EGG);
                        entries.add(ModItems.MIMICARIUM_IGNITER);
                        entries.add(ModItems.DREADED_IGNITER);
                        entries.add(ModItems.THUNDERANIUM_KEY);
                        entries.add(ModItems.ARMOR_TEST_HELMET);
                        entries.add(ModItems.ARMOR_TEST_CHESTPLATE);
                        entries.add(ModItems.ARMOR_TEST_LEGGINGS);
                        entries.add(ModItems.ARMOR_TEST_BOOTS);
                        entries.add(ModItems.THUNDERANIUM_HELMET);
                        entries.add(ModItems.THUNDERANIUM_CHESTPLATE);
                        entries.add(ModItems.THUNDERANIUM_LEGGINGS);
                        entries.add(ModItems.THUNDERANIUM_BOOTS);
                        entries.add(ModItems.THUNDERANIUM_SWORD);
                        entries.add(ModItems.THUNDERANIUM_PICKAXE);
                        entries.add(ModItems.THUNDERANIUM_AXE);
                        entries.add(ModItems.THUNDERANIUM_SHOVEL);
                        entries.add(ModItems.THUNDERANIUM_HOE);
                        entries.add(ModItems.LIQUID_THUNDER_BUCKET);


                        //BLOCKS
                        entries.add(ModBlocks.MIMICARIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_MIMICARIUM_ORE);
                        entries.add(ModBlocks.THUNDERED_LOG);
                        entries.add(ModBlocks.THUNDERED_WOOD);
                        entries.add(ModBlocks.STRIPPED_THUNDERED_LOG);
                        entries.add(ModBlocks.STRIPPED_THUNDERED_WOOD);
                        entries.add(ModBlocks.THUNDERED_PLANKS);
                        entries.add(ModBlocks.THUNDERED_LEAVES);
                        entries.add(ModBlocks.THUNDERED_SAPLING);
                        entries.add(ModBlocks.VOIDSTONE);
                        entries.add(ModBlocks.MIMIMCARIUM_PORTAL_FRAME);
                        entries.add(ModBlocks.THUNDERANIUM_PORTAL_FRAME);
                        entries.add(ModBlocks.DREADSTONE);
                        entries.add(ModBlocks.DREADSTONE_DIAMOND_ORE);
                        entries.add(ModBlocks.DREADSTONE_THUNDERANIUM_ORE);
                        entries.add(ModBlocks.FAKESTONE);
                        entries.add(ModBlocks.FAKESLATE);
                        entries.add(ModBlocks.CHARGED_DIRT);
                        entries.add(ModBlocks.THUNDERED_STONE);
                        entries.add(ModBlocks.THUNDERANIUM_ORE);


                    }).build());

    public static void registerItemGroups() {

    }
}
