package net.stickmanm.axontechnologies.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologies;
import net.stickmanm.axontechnologies.entity.ModEntities;
import net.stickmanm.axontechnologies.fluid.ModFluids;
import net.stickmanm.axontechnologies.item.custom.*;

public class ModItems {
    //MATERIALS
    public static final Item MIMICARIUM = registerItem("mimicarium",
            new Item(new FabricItemSettings()));

    public static final Item RAW_THUNDERANIUM = registerItem("raw_thunderanium",
            new Item(new FabricItemSettings()));

    public static final Item THUNDERANIUM_CLUSTER = registerItem("thunderanium_cluster",
            new Item(new FabricItemSettings()));

    public static final Item REFINED_THUNDERANIUM = registerItem("refined_thunderanium",
            new Item(new FabricItemSettings()));

    public static final Item THUNDERANIUM_INGOT = registerItem("thunderanium_ingot",
            new Item(new FabricItemSettings()));

    public static final Item RED_ESSENCE = registerItem("red_essence",
            new Item(new FabricItemSettings()));

    public static final Item RED_THUNDERANIUM_INGOT = registerItem("red_thunderanium_ingot",
            new Item(new FabricItemSettings()));

    public static final Item RED_THUNDERANIUM_CLUSTER = registerItem("red_thunderanium_cluster",
            new Item(new FabricItemSettings()));



    //SPAWN EGGS
    public static final Item RED_ESSENCE_ZOMBIE_SPAWN_EGG = registerItem("red_essence_zombie_spawn_egg",
            new SpawnEggItem(ModEntities.RED_ESSENCE_ZOMBIE, 0xFF0000, 0x000000,
                    new FabricItemSettings()));

    //Lighters
    public static final Item MIMICARIUM_IGNITER = registerItem("mimicarium_igniter",
            new Item(new FabricItemSettings()));

    public static final Item DREADED_IGNITER = registerItem("dreaded_igniter",
            new Item(new FabricItemSettings()));

    public static final Item THUNDERANIUM_KEY = registerItem("thunderanium_key",
            new Item(new FabricItemSettings()));

    //Armors
    public static final Item ARMOR_TEST_HELMET = registerItem("armor_test_helmet",
            new ArmorTestArmorItem(ModArmorMaterials.ARMOR_TEST, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ARMOR_TEST_CHESTPLATE = registerItem("armor_test_chestplate",
            new ArmorTestArmorItem(ModArmorMaterials.ARMOR_TEST, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ARMOR_TEST_LEGGINGS = registerItem("armor_test_leggings",
            new ArmorTestArmorItem(ModArmorMaterials.ARMOR_TEST, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ARMOR_TEST_BOOTS = registerItem("armor_test_boots",
            new ArmorTestArmorItem(ModArmorMaterials.ARMOR_TEST, ArmorItem.Type.BOOTS, new FabricItemSettings()));


    //Thunderanium
    public static final Item THUNDERANIUM_HELMET = registerItem("thunderanium_helmet",
            new ThunderaniumArmorItem(ModArmorMaterials.THUNDERANIUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item THUNDERANIUM_CHESTPLATE = registerItem("thunderanium_chestplate",
            new ThunderaniumArmorItem(ModArmorMaterials.THUNDERANIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item THUNDERANIUM_LEGGINGS = registerItem("thunderanium_leggings",
            new ThunderaniumArmorItem(ModArmorMaterials.THUNDERANIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item THUNDERANIUM_BOOTS = registerItem("thunderanium_boots",
            new ThunderaniumArmorItem(ModArmorMaterials.THUNDERANIUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    //Red Thunderanium
    public static final Item RED_THUNDERANIUM_HELMET = registerItem("red_thunderanium_helmet",
            new RedThunderaniumArmorItem(ModArmorMaterials.RED_THUNDERANIUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RED_THUNDERANIUM_CHESTPLATE = registerItem("red_thunderanium_chestplate",
            new RedThunderaniumArmorItem(ModArmorMaterials.RED_THUNDERANIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RED_THUNDERANIUM_LEGGINGS = registerItem("red_thunderanium_leggings",
            new RedThunderaniumArmorItem(ModArmorMaterials.RED_THUNDERANIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RED_THUNDERANIUM_BOOTS = registerItem("red_thunderanium_boots",
            new RedThunderaniumArmorItem(ModArmorMaterials.RED_THUNDERANIUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    //TOOLS

    //Thunderanium
    public static final Item THUNDERANIUM_SWORD = registerItem("thunderanium_sword",
            new SwordItem(ModToolMaterials.THUNDERANIUM, 5,-2f,
                    new FabricItemSettings()));

    public static final Item THUNDERANIUM_AXE = registerItem("thunderanium_axe",
            new ModAxeItem(ModToolMaterials.THUNDERANIUM, 8,-3.9f,
                    new FabricItemSettings()));

    public static final Item THUNDERANIUM_HOE = registerItem("thunderanium_hoe",
            new ModHoeItem(ModToolMaterials.THUNDERANIUM, 3,-2.3f,
                    new FabricItemSettings()));

    public static final Item THUNDERANIUM_SHOVEL = registerItem("thunderanium_shovel",
            new ShovelItem(ModToolMaterials.THUNDERANIUM, 3,-2.5f,
                    new FabricItemSettings()));

    public static final Item THUNDERANIUM_PICKAXE = registerItem("thunderanium_pickaxe",
            new ModPickaxeItem(ModToolMaterials.THUNDERANIUM, 3,-2.4f,
                    new FabricItemSettings()));

    //Red Thunderanium
    public static final Item RED_THUNDERANIUM_SWORD = registerItem("red_thunderanium_sword",
            new SwordItem(ModToolMaterials.RED_THUNDERANIUM, 5,-2f,
                    new FabricItemSettings()));

    public static final Item RED_THUNDERANIUM_AXE = registerItem("red_thunderanium_axe",
            new ModAxeItem(ModToolMaterials.RED_THUNDERANIUM, 8,-3.2f,
                    new FabricItemSettings()));

    public static final Item RED_THUNDERANIUM_HOE = registerItem("red_thunderanium_hoe",
            new ModHoeItem(ModToolMaterials.RED_THUNDERANIUM, 3,-2.3f,
                    new FabricItemSettings()));

    public static final Item RED_THUNDERANIUM_SHOVEL = registerItem("red_thunderanium_shovel",
            new ShovelItem(ModToolMaterials.RED_THUNDERANIUM, 3,-2.5f,
                    new FabricItemSettings()));

    public static final Item RED_THUNDERANIUM_PICKAXE = registerItem("red_thunderanium_pickaxe",
            new ModPickaxeItem(ModToolMaterials.RED_THUNDERANIUM, 3,-2.4f,
                    new FabricItemSettings()));

    //BUCKETS

    public static final Item LIQUID_THUNDER_BUCKET = registerItem("liquid_thunder_bucket",
            new BucketItem(ModFluids.STILL_LIQUID_THUNDER, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(AxonTechnologies.MOD_ID, name), item);
    }


    public static void registerModItems() {
        AxonTechnologies.LOGGER.info("Registering Mod Items for " + AxonTechnologies.MOD_ID);

    }
}
