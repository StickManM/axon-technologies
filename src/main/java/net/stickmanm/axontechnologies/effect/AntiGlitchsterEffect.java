package net.stickmanm.axontechnologies.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.stickmanm.axontechnologies.AxonTechnologies;

public class AntiGlitchsterEffect extends StatusEffect {
    public AntiGlitchsterEffect() {
        super(StatusEffectCategory.NEUTRAL, // whether beneficial or harmful for entities
                0x8B0000); // color in RGB
    }

    // This method is called every tick to check whether it should apply the status effect or not


    // This method is called when it applies the status effect. We implement custom functionality here.
    @Override
    public void applyUpdateEffect(LivingEntity entity, int Amplifier) {

            entity.removeStatusEffect(ModEffects.GLITCHSTER);
            entity.removeStatusEffect(ModEffects.GLITCHSTERII);
            addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "91AEAA56-376B-4498-935B-2F7F68070635", 0f, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
        entity.damage(entity.getDamageSources().lightningBolt(), 0.5f);



        super.applyUpdateEffect(entity, Amplifier);
    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // In our case, we just make it return true so that it applies the status effect every tick.
        return true;
    }
}