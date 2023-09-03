package net.stickmanm.axontechnologies.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.stickmanm.axontechnologies.effect.ModEffects;

public class ModAntiGlitchSwordItem extends SwordItem {
    public ModAntiGlitchSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        target.addStatusEffect(new StatusEffectInstance(ModEffects.ANTIGLITCHSTER, 1200, 0));

        if(attacker.hasStatusEffect(ModEffects.GLITCHSTER)) {
            attacker.addStatusEffect(new StatusEffectInstance(ModEffects.GLITCHSTERII, 900, 0));
        }
        else if (attacker.hasStatusEffect(ModEffects.GLITCHSTERII)) {
            attacker.addStatusEffect(new StatusEffectInstance(ModEffects.GLITCHSTERIII, 900, 0));

        }
        else if (attacker.hasStatusEffect(ModEffects.GLITCHSTERIII)) {
            attacker.addStatusEffect(new StatusEffectInstance(ModEffects.GLITCHSTERIV, 900, 0));

        }

        return true;
    }



}
