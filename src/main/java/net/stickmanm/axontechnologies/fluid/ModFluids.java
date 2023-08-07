package net.stickmanm.axontechnologies.fluid;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologies;
import net.stickmanm.axontechnologies.block.LiquidThunderFluidBlock;
import net.stickmanm.axontechnologies.item.ModItemGroup;

public class ModFluids {
    public static FlowableFluid STILL_LIQUID_THUNDER;
    public static FlowableFluid FLOWING_LIQUID_THUNDER;
    public static Block LIQUID_THUNDER_BLOCK;

    public static void register(){
        STILL_LIQUID_THUNDER = Registry.register(Registries.FLUID,
                new Identifier(AxonTechnologies.MOD_ID, "liquid_thunder"), new LiquidThunderFluid.Still());
        FLOWING_LIQUID_THUNDER = Registry.register(Registries.FLUID,
                new Identifier(AxonTechnologies.MOD_ID, "flowing_liquid_thunder"), new LiquidThunderFluid.Flowing());

        LIQUID_THUNDER_BLOCK = Registry.register(Registries.BLOCK, new Identifier(AxonTechnologies.MOD_ID, "liquid_thunder_block"),
                new LiquidThunderFluidBlock(ModFluids.STILL_LIQUID_THUNDER, FabricBlockSettings.copyOf(Blocks.LAVA)));



    }






}

