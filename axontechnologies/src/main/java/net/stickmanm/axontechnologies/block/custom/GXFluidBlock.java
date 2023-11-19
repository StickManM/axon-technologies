package net.stickmanm.axontechnologies.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.HorseEntity;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;
import net.stickmanm.axontechnologies.effect.ModEffects;

import java.util.Random;

public class GXFluidBlock extends FluidBlock {
    public GXFluidBlock(FlowableFluid fluid, Settings settings) {
        super(fluid, settings);
    }

    Random random = new Random();
    int overDose = 0;

    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClient && world.getDifficulty() != Difficulty.PEACEFUL) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity)entity;
                if (!livingEntity.isInvulnerableTo(world.getDamageSources().lightningBolt())) {
                     if(overDose == 1){
                         livingEntity.removeStatusEffect(ModEffects.GLITCHSTERX);
                         livingEntity.setHealth(0.0000000000000000000000001f);
                         livingEntity.damage(livingEntity.getDamageSources().lightningBolt(), 999999999999999999999999999999999999f);
                         livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1000, 255));
                         livingEntity.addStatusEffect(new StatusEffectInstance(ModEffects.THUNDER_POISONING, 1000, 255));
                         livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1000, 255));
                         livingEntity.addStatusEffect(new StatusEffectInstance(ModEffects.ANTIGLITCHSTER, 1000, 255));
                         livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1000, 255));
                         livingEntity.addStatusEffect(new StatusEffectInstance(ModEffects.ANTI_CORRUPTED_GLITCHSTER, 1000, 255));
                         livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1000, 255));
                         livingEntity.removeStatusEffect(ModEffects.GLITCHSTERX);
                         overDose = 0;
                     } else {
                         livingEntity.addStatusEffect(new StatusEffectInstance(ModEffects.GLITCHSTERX, 450));
                         livingEntity.removeStatusEffect(ModEffects.ANTIGLITCHSTER);
                         livingEntity.removeStatusEffect(ModEffects.ANTI_CORRUPTED_GLITCHSTER);
                         overDose = random.nextInt(200);
                     }
                }
            }

        }
    }
}
