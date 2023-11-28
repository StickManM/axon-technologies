package net.stickmanm.axontechnologies.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RazzorSkinItem extends SwordItem {
    public RazzorSkinItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        for (var i = 0; i < 5; i++) {
            target.setHealth(0.0000000000000000000000001f);
            target.damage(target.getDamageSources().lightningBolt(), 999999999999999999999999999999999999f);
        }
        return super.postHit(stack, target, attacker);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.axontechnologies.razzor_skin"));

        super.appendTooltip(stack, world, tooltip, context);
    }
}
