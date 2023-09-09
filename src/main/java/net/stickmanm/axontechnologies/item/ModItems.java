package net.stickmanm.axontechnologies.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
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

    public static final Item RAW_NETHERITE = registerItem("raw_netherite",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item RAW_THUNDERANIUM = registerItem("raw_thunderanium",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item THUNDERANIUM_CLUSTER = registerItem("thunderanium_cluster",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item REFINED_THUNDERANIUM = registerItem("refined_thunderanium",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item THUNDERANIUM_INGOT = registerItem("thunderanium_ingot",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item RED_ESSENCE = registerItem("red_essence",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item RED_THUNDERANIUM_INGOT = registerItem("red_thunderanium_ingot",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item AXON_ALLOY = registerItem("axon_alloy",
            new Item(new FabricItemSettings().fireproof()));


    public static final Item RED_THUNDERANIUM_CLUSTER = registerItem("red_thunderanium_cluster",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item DARK_ESSENCE = registerItem("dark_essence",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item DARK_THUNDERANIUM_INGOT = registerItem("dark_thunderanium_ingot",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item DARK_THUNDERANIUM_CLUSTER = registerItem("dark_thunderanium_cluster",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item CORRUPTINITE = registerItem("corruptinite",
            new Item(new FabricItemSettings().fireproof()));
    public static final Item UNSTABLE_CORRUPTINITE = registerItem("unstable_corruptinite",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item RAZZORIUM = registerItem("razzorium",
            new Item(new FabricItemSettings().fireproof()));

    //Fuels
    public static final Item THUNDER_FUEL = registerItem("thunder_fuel",
            new Item(new FabricItemSettings()));

    public static final Item VOID_COAL = registerItem("void_coal",
            new Item(new FabricItemSettings()));

    //Compressed Sticks
    public static final Item COMPRESSED_STICK = registerItem("compressed_stick",
            new CompressedStickItem(new FabricItemSettings()));

    public static final Item DOUBLE_COMPRESSED_STICK = registerItem("double_compressed_stick",
            new CompressedStickItem(new FabricItemSettings()));

    public static final Item TRIPLE_COMPRESSED_STICK = registerItem("triple_compressed_stick",
            new CompressedStickItem(new FabricItemSettings()));

    public static final Item QUADRUPLE_COMPRESSED_STICK = registerItem("quadruple_compressed_stick",
            new CompressedStickItem(new FabricItemSettings()));

    public static final Item QUINTUPLE_COMPRESSED_STICK = registerItem("quintuple_compressed_stick",
            new CompressedStickItem(new FabricItemSettings().fireproof()));


    public static final Item QUATTUORDECUPLE_COMPRESSED_STICK = registerItem("quattuordecuple_compressed_stick",
            new CompressedStickItem(new FabricItemSettings().fireproof()));






    //SPAWN EGGS
    public static final Item RED_ESSENCE_ZOMBIE_SPAWN_EGG = registerItem("red_essence_zombie_spawn_egg",
            new SpawnEggItem(ModEntities.RED_ESSENCE_ZOMBIE, 0xFF0000, 0x000000,
                    new FabricItemSettings()));

    public static final Item DARK_ESSENCE_ZOMBIE_SPAWN_EGG = registerItem("dark_essence_zombie_spawn_egg",
            new SpawnEggItem(ModEntities.DARK_ESSENCE_ZOMBIE, 0x301934, 0x000000,
                    new FabricItemSettings()));

    public static final Item LOST_MINER_SPAWN_EGG = registerItem("lost_miner_spawn_egg",
            new SpawnEggItem(ModEntities.LOST_MINER, 0x301934, 0xFFD700,
                    new FabricItemSettings()));

    //Lighters
    public static final Item MIMICARIUM_IGNITER = registerItem("mimicarium_igniter",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item DREADED_IGNITER = registerItem("dreaded_igniter",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item THUNDERANIUM_KEY = registerItem("thunderanium_key",
            new Item(new FabricItemSettings().fireproof()));
    public static final Item CORRUPTION_GATEWAY = registerItem("corruption_gateway",
            new Item(new FabricItemSettings().fireproof()));

    //Armors



    //Thunderanium
    public static final Item THUNDERANIUM_HELMET = registerItem("thunderanium_helmet",
            new ThunderaniumArmorItem(ModArmorMaterials.THUNDERANIUM, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item THUNDERANIUM_CHESTPLATE = registerItem("thunderanium_chestplate",
            new ThunderaniumArmorItem(ModArmorMaterials.THUNDERANIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item THUNDERANIUM_LEGGINGS = registerItem("thunderanium_leggings",
            new ThunderaniumArmorItem(ModArmorMaterials.THUNDERANIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item THUNDERANIUM_BOOTS = registerItem("thunderanium_boots",
            new ThunderaniumArmorItem(ModArmorMaterials.THUNDERANIUM, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    //Red Thunderanium
    public static final Item RED_THUNDERANIUM_HELMET = registerItem("red_thunderanium_helmet",
            new RedThunderaniumArmorItem(ModArmorMaterials.RED_THUNDERANIUM, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item RED_THUNDERANIUM_CHESTPLATE = registerItem("red_thunderanium_chestplate",
            new RedThunderaniumArmorItem(ModArmorMaterials.RED_THUNDERANIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item RED_THUNDERANIUM_LEGGINGS = registerItem("red_thunderanium_leggings",
            new RedThunderaniumArmorItem(ModArmorMaterials.RED_THUNDERANIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item RED_THUNDERANIUM_BOOTS = registerItem("red_thunderanium_boots",
            new RedThunderaniumArmorItem(ModArmorMaterials.RED_THUNDERANIUM, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    //Dark Thunderanium
    public static final Item DARK_THUNDERANIUM_HELMET = registerItem("dark_thunderanium_helmet",
            new DarkThunderaniumArmorItem(ModArmorMaterials.DARK_THUNDERANIUM, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item DARK_THUNDERANIUM_CHESTPLATE = registerItem("dark_thunderanium_chestplate",
            new DarkThunderaniumArmorItem(ModArmorMaterials.DARK_THUNDERANIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item DARK_THUNDERANIUM_LEGGINGS = registerItem("dark_thunderanium_leggings",
            new DarkThunderaniumArmorItem(ModArmorMaterials.DARK_THUNDERANIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item DARK_THUNDERANIUM_BOOTS = registerItem("dark_thunderanium_boots",
            new DarkThunderaniumArmorItem(ModArmorMaterials.DARK_THUNDERANIUM, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    //Corruptinite
    public static final Item CORRUPTINITE_HELMET = registerItem("corruptinite_helmet",
            new CorruptiniteArmorItem(ModArmorMaterials.CORRUPTINITE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item CORRUPTINITE_CHESTPLATE = registerItem("corruptinite_chestplate",
            new CorruptiniteArmorItem(ModArmorMaterials.CORRUPTINITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item CORRUPTINITE_LEGGINGS = registerItem("corruptinite_leggings",
            new CorruptiniteArmorItem(ModArmorMaterials.CORRUPTINITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item CORRUPTINITE_BOOTS = registerItem("corruptinite_boots",
            new CorruptiniteArmorItem(ModArmorMaterials.CORRUPTINITE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item CORRUPTINITE_AXON_ALLOY_HELMET = registerItem("corruptinite_axon_alloy_helmet",
            new CorruptiniteAxonAlloyArmorItem(ModArmorMaterials.CORRUPTINITE_AXON_ALLOY_ARMOR, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item CORRUPTINITE_AXON_ALLOY_CHESTPLATE = registerItem("corruptinite_axon_alloy_chestplate",
            new CorruptiniteAxonAlloyArmorItem(ModArmorMaterials.CORRUPTINITE_AXON_ALLOY_ARMOR, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item CORRUPTINITE_AXON_ALLOY_LEGGINGS = registerItem("corruptinite_axon_alloy_leggings",
            new CorruptiniteAxonAlloyArmorItem(ModArmorMaterials.CORRUPTINITE_AXON_ALLOY_ARMOR, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item CORRUPTINITE_AXON_ALLOY_BOOTS = registerItem("corruptinite_axon_alloy_boots",
            new CorruptiniteAxonAlloyArmorItem(ModArmorMaterials.CORRUPTINITE_AXON_ALLOY_ARMOR, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item DARK_THUNDERANIUM_AXON_ALLOY_HELMET = registerItem("dark_thunderanium_axon_alloy_helmet",
            new DarkThunderaniumAxonAlloyArmorItem(ModArmorMaterials.DARK_THUNDERANIUM_AXON_ALLOY_ARMOR, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item DARK_THUNDERANIUM_AXON_ALLOY_CHESTPLATE = registerItem("dark_thunderanium_axon_alloy_chestplate",
            new DarkThunderaniumAxonAlloyArmorItem(ModArmorMaterials.DARK_THUNDERANIUM_AXON_ALLOY_ARMOR, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item DARK_THUNDERANIUM_AXON_ALLOY_LEGGINGS = registerItem("dark_thunderanium_axon_alloy_leggings",
            new DarkThunderaniumAxonAlloyArmorItem(ModArmorMaterials.DARK_THUNDERANIUM_AXON_ALLOY_ARMOR, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item DARK_THUNDERANIUM_AXON_ALLOY_BOOTS = registerItem("dark_thunderanium_axon_alloy_boots",
            new DarkThunderaniumAxonAlloyArmorItem(ModArmorMaterials.DARK_THUNDERANIUM_AXON_ALLOY_ARMOR, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item AXON_ALLOY_HELMET = registerItem("axon_alloy_helmet",
            new AxonAlloyArmorItem(ModArmorMaterials.AXON_ALLOY_ARMOR, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item AXON_ALLOY_CHESTPLATE = registerItem("axon_alloy_chestplate",
            new AxonAlloyArmorItem(ModArmorMaterials.AXON_ALLOY_ARMOR, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item AXON_ALLOY_LEGGINGS = registerItem("axon_alloy_leggings",
            new AxonAlloyArmorItem(ModArmorMaterials.AXON_ALLOY_ARMOR, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item AXON_ALLOY_BOOTS = registerItem("axon_alloy_boots",
            new AxonAlloyArmorItem(ModArmorMaterials.AXON_ALLOY_ARMOR, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    //TOOLS

    //MISC TOOLS
    public static final Item ANTIGLITCH_SWORD = registerItem("antiglitch_sword",
            new AntiGlitchSwordItem(ModToolMaterials.RED_THUNDERANIUM, 4,-2.5f,
                    new FabricItemSettings().fireproof()));

    public static final Item VANILLA_HOE = registerItem("vanilla_hoe",
            new HoeItem(ToolMaterials.NETHERITE, 2,1f,
                    new FabricItemSettings()));

    public static final Item ULTIMATE_HOE_TROPHY = registerItem("ultimate_hoe_trophy",
            new ModHoeItem(ModToolMaterials.DARK_THUNDERANIUM, 0,-3f,
                    new FabricItemSettings()));

    public static final Item AXON_TOOL = registerItem("axon_tool",
            new AxonToolItem(ModToolMaterials.RAZZORIUM, 2147483646,100000f,
                    new FabricItemSettings()));

    public static final Item TICKLE_TRAVIS_TICKLER = registerItem("tickle_travis_tickler",
            new AxonToolItem(ModToolMaterials.RAZZORIUM, 2147483646,100000f,
                    new FabricItemSettings()));


    //Thunderanium
    public static final Item THUNDERANIUM_SWORD = registerItem("thunderanium_sword",
            new ModSwordItem(ModToolMaterials.THUNDERANIUM, 5,-2f,
                    new FabricItemSettings().fireproof()));

    public static final Item THUNDERANIUM_AXE = registerItem("thunderanium_axe",
            new ModAxeItem(ModToolMaterials.THUNDERANIUM, 8,-3.9f,
                    new FabricItemSettings().fireproof()));

    public static final Item THUNDERANIUM_HOE = registerItem("thunderanium_hoe",
            new ModHoeItem(ModToolMaterials.THUNDERANIUM, 3,-2.3f,
                    new FabricItemSettings().fireproof()));

    public static final Item THUNDERANIUM_SHOVEL = registerItem("thunderanium_shovel",
            new ShovelItem(ModToolMaterials.THUNDERANIUM, 3,-2.5f,
                    new FabricItemSettings().fireproof()));

    public static final Item THUNDERANIUM_PICKAXE = registerItem("thunderanium_pickaxe",
            new ModPickaxeItem(ModToolMaterials.THUNDERANIUM, 3,-2.4f,
                    new FabricItemSettings().fireproof()));

    //Red Thunderanium
    public static final Item RED_THUNDERANIUM_SWORD = registerItem("red_thunderanium_sword",
            new ModSwordItem(ModToolMaterials.RED_THUNDERANIUM, 5,-2f,
                    new FabricItemSettings().fireproof()));
    public static final Item RED_THUNDERANIUM_AXE = registerItem("red_thunderanium_axe",
            new ModAxeItem(ModToolMaterials.RED_THUNDERANIUM, 8,-3.9f,
                    new FabricItemSettings().fireproof()));
    public static final Item RED_THUNDERANIUM_HOE = registerItem("red_thunderanium_hoe",
            new ModHoeItem(ModToolMaterials.RED_THUNDERANIUM, -1,-2.3f,
                    new FabricItemSettings().fireproof()));
    public static final Item RED_THUNDERANIUM_SHOVEL = registerItem("red_thunderanium_shovel",
            new ShovelItem(ModToolMaterials.RED_THUNDERANIUM, 3,-2.5f,
                    new FabricItemSettings().fireproof()));

    public static final Item RED_THUNDERANIUM_PICKAXE = registerItem("red_thunderanium_pickaxe",
            new ModPickaxeItem(ModToolMaterials.RED_THUNDERANIUM, 3,-2.4f,
                    new FabricItemSettings().fireproof()));

    //Dark Thunderanium
    public static final Item DARK_THUNDERANIUM_SWORD = registerItem("dark_thunderanium_sword",
            new DarkThunderaniumSwordItem(ModToolMaterials.DARK_THUNDERANIUM, 5,-2f,
                    new FabricItemSettings().fireproof()));
    public static final Item DARK_THUNDERANIUM_AXE = registerItem("dark_thunderanium_axe",
            new ModAxeItem(ModToolMaterials.DARK_THUNDERANIUM, 8,-3.9f,
                    new FabricItemSettings().fireproof()));
    public static final Item DARK_THUNDERANIUM_HOE = registerItem("dark_thunderanium_hoe",
            new ModHoeItem(ModToolMaterials.DARK_THUNDERANIUM, -1,-2.3f,
                    new FabricItemSettings().fireproof()));
    public static final Item DARK_THUNDERANIUM_SHOVEL = registerItem("dark_thunderanium_shovel",
            new ShovelItem(ModToolMaterials.DARK_THUNDERANIUM, 3,-2.5f,
                    new FabricItemSettings().fireproof()));
    public static final Item DARK_THUNDERANIUM_PICKAXE = registerItem("dark_thunderanium_pickaxe",
            new ModPickaxeItem(ModToolMaterials.DARK_THUNDERANIUM, 3,-2.4f,
                    new FabricItemSettings().fireproof()));
    //Corruptinite
    public static final Item CORRUPTINITE_SWORD = registerItem("corruptinite_sword",
            new CorruptiniteSwordItem(ModToolMaterials.CORRUPTINITE, 5,-2f,
                    new FabricItemSettings().fireproof()));
    public static final Item CORRUPTINITE_AXE = registerItem("corruptinite_axe",
            new ModAxeItem(ModToolMaterials.CORRUPTINITE, 8,-3.9f,
                    new FabricItemSettings().fireproof()));
    public static final Item CORRUPTINITE_HOE = registerItem("corruptinite_hoe",
            new ModHoeItem(ModToolMaterials.CORRUPTINITE, -1,-2.3f,
                    new FabricItemSettings().fireproof()));
    public static final Item CORRUPTINITE_SHOVEL = registerItem("corruptinite_shovel",
            new ShovelItem(ModToolMaterials.CORRUPTINITE, 3,-2.5f,
                    new FabricItemSettings().fireproof()));
    public static final Item CORRUPTINITE_PICKAXE = registerItem("corruptinite_pickaxe",
            new ModPickaxeItem(ModToolMaterials.CORRUPTINITE, 3,-2.4f,
                    new FabricItemSettings().fireproof()));

    //Axon Allot G
    public static final Item DARK_THUNDERANIUM_AXON_ALLOY_SWORD = registerItem("dark_thunderanium_axon_alloy_sword",
            new ModSwordItem(ModToolMaterials.DARK_THUNDERANIUM_AXON_ALLOY, 6,-2f,
                    new FabricItemSettings().fireproof()));
    public static final Item DARK_THUNDERANIUM_AXON_ALLOY_AXE = registerItem("dark_thunderanium_axon_alloy_axe",
            new ModAxeItem(ModToolMaterials.DARK_THUNDERANIUM_AXON_ALLOY, 9,-3.9f,
                    new FabricItemSettings().fireproof()));
    public static final Item DARK_THUNDERANIUM_AXON_ALLOY_HOE = registerItem("dark_thunderanium_axon_alloy_hoe",
            new ModHoeItem(ModToolMaterials.DARK_THUNDERANIUM_AXON_ALLOY, -2,-2.3f,
                    new FabricItemSettings().fireproof()));
    public static final Item DARK_THUNDERANIUM_AXON_ALLOY_SHOVEL = registerItem("dark_thunderanium_axon_alloy_shovel",
            new ShovelItem(ModToolMaterials.DARK_THUNDERANIUM_AXON_ALLOY, 4,-2.5f,
                    new FabricItemSettings().fireproof()));
    public static final Item DARK_THUNDERANIUM_AXON_ALLOY_PICKAXE = registerItem("dark_thunderanium_axon_alloy_pickaxe",
            new ModPickaxeItem(ModToolMaterials.DARK_THUNDERANIUM_AXON_ALLOY, 4,-2.4f,
                    new FabricItemSettings().fireproof()));

    //Axon Alloy C
    public static final Item CORRUPTINITE_AXON_ALLOY_SWORD = registerItem("corruptinite_axon_alloy_sword",
            new ModSwordItem(ModToolMaterials.CORRUPTINITE_AXON_ALLOY, 6,-2f,
                    new FabricItemSettings().fireproof()));
    public static final Item CORRUPTINITE_AXON_ALLOY_AXE = registerItem("corruptinite_axon_alloy_axe",
            new ModAxeItem(ModToolMaterials.CORRUPTINITE_AXON_ALLOY, 9,-3.9f,
                    new FabricItemSettings().fireproof()));
    public static final Item CORRUPTINITE_AXON_ALLOY_HOE = registerItem("corruptinite_axon_alloy_hoe",
            new ModHoeItem(ModToolMaterials.CORRUPTINITE_AXON_ALLOY, -2,-2.3f,
                    new FabricItemSettings().fireproof()));
    public static final Item CORRUPTINITE_AXON_ALLOY_SHOVEL = registerItem("corruptinite_axon_alloy_shovel",
            new ShovelItem(ModToolMaterials.CORRUPTINITE_AXON_ALLOY, 4,-2.5f,
                    new FabricItemSettings().fireproof()));
    public static final Item CORRUPTINITE_AXON_ALLOY_PICKAXE = registerItem("corruptinite_axon_alloy_pickaxe",
            new ModPickaxeItem(ModToolMaterials.CORRUPTINITE_AXON_ALLOY, 4,-2.4f,
                    new FabricItemSettings().fireproof()));
    //Axon Alloy A
    public static final Item AXON_ALLOY_SWORD = registerItem("axon_alloy_sword",
            new ModSwordItem(ModToolMaterials.CORRUPTINITE_AXON_ALLOY, 6,-2f,
                    new FabricItemSettings().fireproof()));
    public static final Item AXON_ALLOY_AXE = registerItem("axon_alloy_axe",
            new ModAxeItem(ModToolMaterials.CORRUPTINITE_AXON_ALLOY, 9,-3.9f,
                    new FabricItemSettings().fireproof()));
    public static final Item AXON_ALLOY_HOE = registerItem("axon_alloy_hoe",
            new ModHoeItem(ModToolMaterials.CORRUPTINITE_AXON_ALLOY, -2,-2.3f,
                    new FabricItemSettings().fireproof()));
    public static final Item AXON_ALLOY_SHOVEL = registerItem("axon_alloy_shovel",
            new ShovelItem(ModToolMaterials.CORRUPTINITE_AXON_ALLOY, 4,-2.5f,
                    new FabricItemSettings().fireproof()));
    public static final Item AXON_ALLOY_PICKAXE = registerItem("axon_alloy_pickaxe",
            new ModPickaxeItem(ModToolMaterials.CORRUPTINITE_AXON_ALLOY, 4,-2.4f,
                    new FabricItemSettings().fireproof()));

    //BUCKETS

    public static final Item LIQUID_THUNDER_BUCKET = registerItem("liquid_thunder_bucket",
            new BucketItem(ModFluids.STILL_LIQUID_THUNDER, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1).fireproof()));

    public static final Item GX_BUCKET = registerItem("gx_bucket",
            new BucketItem(ModFluids.STILL_GX, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1).fireproof()));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(AxonTechnologies.MOD_ID, name), item);
    }


    public static void registerModItems() {
        AxonTechnologies.LOGGER.info("Registering Mod Items for " + AxonTechnologies.MOD_ID);

    }
}
