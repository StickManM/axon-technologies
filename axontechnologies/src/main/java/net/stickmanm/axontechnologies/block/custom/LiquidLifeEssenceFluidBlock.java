package net.stickmanm.axontechnologies.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;
import net.stickmanm.axontechnologies.effect.ModEffects;


public class LiquidLifeEssenceFluidBlock extends FluidBlock {
    public LiquidLifeEssenceFluidBlock(FlowableFluid fluid, Settings settings) {
        super(fluid, settings);
    }

    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClient && world.getDifficulty() != Difficulty.PEACEFUL) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity)entity;
                         livingEntity.removeStatusEffect(ModEffects.ANTI_CORRUPTED_GLITCHSTER);
                         livingEntity.removeStatusEffect(ModEffects.ANTIGLITCHSTER);
                         livingEntity.removeStatusEffect(ModEffects.THUNDER_POISONING);
                         livingEntity.removeStatusEffect(StatusEffects.POISON);
                         livingEntity.removeStatusEffect(StatusEffects.WITHER);
                         livingEntity.removeStatusEffect(StatusEffects.WEAKNESS);
                         livingEntity.removeStatusEffect(StatusEffects.BLINDNESS);
                         livingEntity.removeStatusEffect(StatusEffects.SLOWNESS);
                         livingEntity.removeStatusEffect(StatusEffects.NAUSEA);
                         livingEntity.removeStatusEffect(StatusEffects.BAD_OMEN);
                         livingEntity.removeStatusEffect(StatusEffects.INSTANT_DAMAGE);
                         livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2, 4));
                         livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 2, 4));
                         livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 2, 4));
                         livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2, 4));
                         livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 2, 4));
                         livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 2, 4));
                         livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2, 3));
                         livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 2, 4));
                         livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 2, 4));
                         livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 2, 4));


            }
        }
    }
}
