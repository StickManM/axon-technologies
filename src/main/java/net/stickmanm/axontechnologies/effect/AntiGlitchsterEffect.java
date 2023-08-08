package net.stickmanm.axontechnologies.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.stickmanm.axontechnologies.AxonTechnologies;
import software.bernie.shadowed.eliotlash.mclib.math.functions.classic.Mod;

public class AntiGlitchsterEffect extends StatusEffect {
    public AntiGlitchsterEffect() {
        super(StatusEffectCategory.HARMFUL, // whether beneficial or harmful for entities
                0x8B0000); // color in RGB
    }

    // This method is called every tick to check whether it should apply the status effect or not


    // This method is called when it applies the status effect. We implement custom functionality here.
    @Override
    public void applyUpdateEffect(LivingEntity entity, int Amplifier) {
        if (!entity.getWorld().isClient()) {

            if (entity.hasStatusEffect(ModEffects.GLITCHSTER)) {
                entity.removeStatusEffect(ModEffects.GLITCHSTER);
            } else if (entity.hasStatusEffect(ModEffects.GLITCHSTERII)) {
                entity.removeStatusEffect(ModEffects.GLITCHSTERII);
            } else if (entity.hasStatusEffect(ModEffects.GLITCHSTERIII)) {
                entity.removeStatusEffect(ModEffects.GLITCHSTERIII);
                entity.addStatusEffect(new StatusEffectInstance(ModEffects.NEUTRALIZED_GLITCHSTER, 40));
            } else if (entity.hasStatusEffect(ModEffects.GLITCHSTERIV)) {
                entity.removeStatusEffect(ModEffects.GLITCHSTERIV);
                entity.addStatusEffect(new StatusEffectInstance(ModEffects.NEUTRALIZED_GLITCHSTER, 40));
            } else if (entity.hasStatusEffect(ModEffects.CORRUPTED_GLITCHSTER)) {
                entity.removeStatusEffect(ModEffects.ANTIGLITCHSTER);
            }
        }


        entity.damage(entity.getDamageSources().lightningBolt(), 0.75f);



        super.applyUpdateEffect(entity, Amplifier);
    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // In our case, we just make it return true so that it applies the status effect every tick.
        return true;
    }
}