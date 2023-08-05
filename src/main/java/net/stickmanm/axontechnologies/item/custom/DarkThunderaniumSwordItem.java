package net.stickmanm.axontechnologies.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.stickmanm.axontechnologies.effect.ModEffects;

public class DarkThunderaniumSwordItem extends SwordItem {
    public DarkThunderaniumSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        if(target.hasStatusEffect(ModEffects.CORRUPTED_GLITCHSTER)) {
            target.addStatusEffect(new StatusEffectInstance(ModEffects.ANTI_CORRUPTED_GLITCHSTER, 300, 0));
        }

        if (attacker.hasStatusEffect(ModEffects.GLITCHSTERIII)) {
            attacker.addStatusEffect(new StatusEffectInstance(ModEffects.GLITCHSTERIV, 600, 0));

        }

        return true;
    }


}
