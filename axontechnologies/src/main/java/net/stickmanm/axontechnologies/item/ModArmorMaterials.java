package net.stickmanm.axontechnologies.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.stickmanm.axontechnologies.AxonTechnologies;
import net.stickmanm.axontechnologies.item.ModItems;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    THUNDERANIUM("thunderanium", 400, new int[] { 13, 17, 15, 10 }, 20,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2f, 0.1f, () -> Ingredient.ofItems(ModItems.THUNDERANIUM_INGOT)),

    RED_THUNDERANIUM("red_thunderanium", 0, new int[] { 16, 23, 20, 13 }, 35,
        SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.5f, 0.25f, () -> Ingredient.ofItems(ModItems.RED_THUNDERANIUM_INGOT)),

    DARK_THUNDERANIUM("dark_thunderanium", 0, new int[] { 21, 28, 26, 19 }, 50,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3f, 0.5f, () -> Ingredient.ofItems(ModItems.DARK_THUNDERANIUM_INGOT)),

    CORRUPTINITE("corruptinite", 0, new int[] { 20, 27, 25, 17 }, 55,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3f, 0.5f, () -> Ingredient.ofItems(ModItems.CORRUPTINITE)),

    DARK_THUNDERANIUM_AXON_ALLOY("dark_thunderanium_axon_alloy", 0, new int[] { 31, 38, 36, 29 }, 115,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 5f, 1f, () -> Ingredient.ofItems(ModItems.AXON_ALLOY)),

    CORRUPTINITE_AXON_ALLOY("corruptinite_axon_alloy", 0, new int[] { 30, 37, 35, 27 }, 125,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 5f, 1f, () -> Ingredient.ofItems(ModItems.AXON_ALLOY)),

    AXON_ALLOY("axon_alloy", 0, new int[] { 28, 35, 33, 25 }, 100,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 5f, 1f, () -> Ingredient.ofItems(ModItems.AXON_ALLOY));



    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 15, 13 };

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound,
                      float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return AxonTechnologies.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}