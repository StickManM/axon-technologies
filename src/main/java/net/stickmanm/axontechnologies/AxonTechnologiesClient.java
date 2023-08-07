package net.stickmanm.axontechnologies;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.entity.ModEntities;
import net.stickmanm.axontechnologies.entity.client.DarkEssenceZombieRenderer;
import net.stickmanm.axontechnologies.entity.client.RedEssenceZombieRenderer;
import net.stickmanm.axontechnologies.fluid.ModFluids;

public class AxonTechnologiesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.THUNDERED_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.THUNDERED_SAPLING, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModEntities.RED_ESSENCE_ZOMBIE, RedEssenceZombieRenderer::new);
        EntityRendererRegistry.register(ModEntities.DARK_ESSENCE_ZOMBIE, DarkEssenceZombieRenderer::new);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_LIQUID_THUNDER, new SimpleFluidRenderHandler(
                SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY,
                0xD3D3D3));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.FLOWING_LIQUID_THUNDER, new SimpleFluidRenderHandler(
                SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY,
                0xD3D3D3));

    }
}
