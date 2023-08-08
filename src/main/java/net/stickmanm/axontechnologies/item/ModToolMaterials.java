package net.stickmanm.axontechnologies.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;

import net.minecraft.recipe.Ingredient;

import net.minecraft.util.Lazy;
import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    THUNDERANIUM(5, 3031, 13.0f, 5.0f, 25, () -> Ingredient.ofItems(ModItems.THUNDERANIUM_INGOT)),
    RED_THUNDERANIUM(6, 0, 18.0f, 7.5f, 35, () -> Ingredient.ofItems(ModItems.RED_THUNDERANIUM_INGOT)),
    DARK_THUNDERANIUM(7, 0, 25.0f, 8.9f, 55, () -> Ingredient.ofItems(ModItems.DARK_THUNDERANIUM_INGOT)),
    CORRUPTINITE(7, 0, 22.0f, 8.25f, 50, () -> Ingredient.ofItems(ModItems.CORRUPTINITE)),

    AXON(2147483647, 0, 1000f, 330282346638528860000000000000000000000f, 2147483647, () -> Ingredient.ofItems(ModItems.MIMICARIUM));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
