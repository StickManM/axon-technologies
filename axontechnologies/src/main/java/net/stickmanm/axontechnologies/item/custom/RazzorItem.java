package net.stickmanm.axontechnologies.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.stickmanm.axontechnologies.effect.ModEffects;

public class RazzorItem extends SwordItem {
    public RazzorItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        for (var i = 0; i < 5; i++) {
            target.setHealth(0.0000000000000000000000001f);
            target.damage(target.getDamageSources().lightningBolt(), 999999999999999999999999999999999999f);
        }
        return super.postHit(stack, target, attacker);
    }



}
