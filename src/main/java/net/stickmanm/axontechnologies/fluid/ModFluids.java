package net.stickmanm.axontechnologies.fluid;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologies;
import net.stickmanm.axontechnologies.block.GXFluidBlock;
import net.stickmanm.axontechnologies.block.LiquidThunderFluidBlock;

public class ModFluids {
    public static FlowableFluid STILL_LIQUID_THUNDER;
    public static FlowableFluid FLOWING_LIQUID_THUNDER;
    public static Block LIQUID_THUNDER_BLOCK;

    public static FlowableFluid STILL_GX;
    public static FlowableFluid FLOWING_GX;
    public static Block GX_BLOCK;

    public static void register(){
        STILL_LIQUID_THUNDER = Registry.register(Registries.FLUID,
                new Identifier(AxonTechnologies.MOD_ID, "liquid_thunder"), new LiquidThunderFluid.Still());
        FLOWING_LIQUID_THUNDER = Registry.register(Registries.FLUID,
                new Identifier(AxonTechnologies.MOD_ID, "flowing_liquid_thunder"), new LiquidThunderFluid.Flowing());

        LIQUID_THUNDER_BLOCK = Registry.register(Registries.BLOCK, new Identifier(AxonTechnologies.MOD_ID, "liquid_thunder_block"),
                new LiquidThunderFluidBlock(ModFluids.STILL_LIQUID_THUNDER, FabricBlockSettings.copyOf(Blocks.LAVA).liquid().pistonBehavior(PistonBehavior.DESTROY).replaceable()));

        STILL_GX = Registry.register(Registries.FLUID,
                new Identifier(AxonTechnologies.MOD_ID, "gx"), new GXFluid.Still());
        FLOWING_GX = Registry.register(Registries.FLUID,
                new Identifier(AxonTechnologies.MOD_ID, "flowing_gx"), new GXFluid.Flowing());

        GX_BLOCK = Registry.register(Registries.BLOCK, new Identifier(AxonTechnologies.MOD_ID, "gx_block"),
                new GXFluidBlock(ModFluids.STILL_GX, FabricBlockSettings.copyOf(Blocks.WATER).replaceable().pistonBehavior(PistonBehavior.DESTROY)));



    }






}

