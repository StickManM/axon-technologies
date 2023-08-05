package net.stickmanm.axontechnologies.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class NeutralizedGlitchsterEffect extends StatusEffect {
    public NeutralizedGlitchsterEffect() {
        super(StatusEffectCategory.BENEFICIAL, // whether beneficial or harmful for entities
                0x2552550); // color in RGB
    }

    // This method is called every tick to check whether it should apply the status effect or not


    // This method is called when it applies the status effect. We implement custom functionality here.
    @Override
    public void applyUpdateEffect(LivingEntity entity, int Amplifier) {

            if (!entity.getWorld().isClient()) {
                ((PlayerEntity) entity).getHungerManager().add(Amplifier + 1, 1.0f);
                addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", 3f, EntityAttributeModifier.Operation.ADDITION)
                        .addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, "91AEAA56-376B-4498-935B-2F7F68070635", 10f, EntityAttributeModifier.Operation.ADDITION)
                        .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_SPEED, "AF8B6E3F-3328-4C0A-AA36-5BA2BB9DBEF3", 15f, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
                if (entity.getHealth() < entity.getMaxHealth()) {
                    entity.heal(0.01F);
                }
            }



        super.applyUpdateEffect(entity, Amplifier);
    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // In our case, we just make it return true so that it applies the status effect every tick.
        return true;
    }
}