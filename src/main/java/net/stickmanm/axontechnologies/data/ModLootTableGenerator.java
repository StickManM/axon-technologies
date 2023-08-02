package net.stickmanm.axontechnologies.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.item.Items;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.entity.ModEntities;
import net.stickmanm.axontechnologies.item.ModItems;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {

    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //Ores
        addDrop(ModBlocks.MIMICARIUM_ORE,oreDrops(ModBlocks.MIMICARIUM_ORE, ModItems.MIMICARIUM));
        addDrop(ModBlocks.DEEPSLATE_MIMICARIUM_ORE,oreDrops(ModBlocks.DEEPSLATE_MIMICARIUM_ORE, ModItems.MIMICARIUM));
        addDrop(ModBlocks.THUNDERANIUM_ORE,oreDrops(ModBlocks.THUNDERANIUM_ORE, ModItems.RAW_THUNDERANIUM));


        //Thundered Tree
        addDrop(ModBlocks.THUNDERED_LOG);
        addDrop(ModBlocks.THUNDERED_WOOD);
        addDrop(ModBlocks.THUNDERED_PLANKS);
        addDrop(ModBlocks.THUNDERED_SAPLING);
        addDrop(ModBlocks.STRIPPED_THUNDERED_LOG);
        addDrop(ModBlocks.STRIPPED_THUNDERED_WOOD);
        addVinePlantDrop(ModBlocks.THUNDERED_LEAVES,ModBlocks.THUNDERED_LEAVES);

        //Dreadstone and Dreadstone Ores
        addDrop(ModBlocks.DREADSTONE);
        addDrop(ModBlocks.DREADSTONE_DIAMOND_ORE,oreDrops(ModBlocks.DREADSTONE_DIAMOND_ORE, Items.DIAMOND));
        addDrop(ModBlocks.DREADSTONE_THUNDERANIUM_ORE,oreDrops(ModBlocks.DREADSTONE_THUNDERANIUM_ORE, ModItems.RAW_THUNDERANIUM));
        addDrop(ModBlocks.DREADSTONE_NETHERITE_ORE,oreDrops(ModBlocks.DREADSTONE_NETHERITE_ORE, ModItems.RAW_NETHERITE));

        //MISC
        addDrop(ModBlocks.VOIDSTONE);
        addDrop(ModBlocks.MIMIMCARIUM_PORTAL_FRAME);
        addDrop(ModBlocks.FAKESTONE);
        addDrop(ModBlocks.FAKESLATE);
        addDrop(ModBlocks.CHARGED_DIRT);
        addDrop(ModBlocks.THUNDERANIUM_PORTAL_FRAME);
        addDrop(ModBlocks.THUNDERED_STONE);
        addDrop(ModBlocks.CORRUPTED_DIRT);
        addDrop(ModBlocks.CORRUPTED_STONE);
        addDrop(ModBlocks.CORRUPTION_PORTAL_FRAME);
        addDrop(ModBlocks.CORRUPTION_BLOCK);




    }
}
