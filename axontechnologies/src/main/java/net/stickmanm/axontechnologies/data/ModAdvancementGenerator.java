package net.stickmanm.axontechnologies.data;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologies;
import net.stickmanm.axontechnologies.item.ModItems;

import java.util.function.Consumer;

public class ModAdvancementGenerator extends FabricAdvancementProvider {


    public ModAdvancementGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
        public void generateAdvancement(Consumer<AdvancementEntry> consumer) {

            AdvancementEntry getMimicarium = Advancement.Builder.create()
                    .display(
                            ModItems.MIMICARIUM, // The display icon
                            Text.translatable("advancement.axontechnologies.get_mimicarium.title"), // The title
                            Text.translatable("advancement.axontechnologies.get_mimicarium.description"), // The description
                            new Identifier("textures/gui/advancements/backgrounds/adventure.png"), // Background image used
                            AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                            true, // Show toast top right
                            true, // Announce to chat
                            false // Hidden in the advancement tab
                    )
                    // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                    .criterion("got_mimicarium", InventoryChangedCriterion.Conditions.items(ModItems.MIMICARIUM))
                    .build(consumer, AxonTechnologies.MOD_ID + "/got_mimicarium");

            AdvancementEntry getThunderaniumIngot = Advancement.Builder.create().parent(getMimicarium)
                    .display(
                            ModItems.THUNDERANIUM_INGOT, // The display icon
                            Text.translatable("advancement.axontechnologies.get_thunderanium_ingot.title"), // The title
                            Text.translatable("advancement.axontechnologies.get_thunderanium_ingot.description"), // The description
                            null,
                            AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                            true, // Show toast top right
                            true, // Announce to chat
                            false // Hidden in the advancement tab
                    )
                    // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                    .criterion("got_thunderanium_ingot", InventoryChangedCriterion.Conditions.items(ModItems.THUNDERANIUM_INGOT))
                    .build(consumer, AxonTechnologies.MOD_ID + "/got_thunderanium_ingot");

            AdvancementEntry getThunderaniumArmor = Advancement.Builder.create().parent(getThunderaniumIngot)
                    .display(
                            ModItems.THUNDERANIUM_CHESTPLATE, // The display icon
                            Text.translatable("advancement.axontechnologies.get_thunderanium_armor.title"), // The title
                            Text.translatable("advancement.axontechnologies.get_thunderanium_armor.description"), // The description
                            null,
                            AdvancementFrame.GOAL, // Options: TASK, CHALLENGE, GOAL
                            true, // Show toast top right
                            true, // Announce to chat
                            false // Hidden in the advancement tab
                    )
                    // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                    .criterion("got_thunderanium_helmet", InventoryChangedCriterion.Conditions.items(ModItems.THUNDERANIUM_HELMET))
                    .criterion("got_thunderanium_chestplate", InventoryChangedCriterion.Conditions.items(ModItems.THUNDERANIUM_CHESTPLATE))
                    .criterion("got_thunderanium_leggings", InventoryChangedCriterion.Conditions.items(ModItems.THUNDERANIUM_LEGGINGS))
                    .criterion("got_thunderanium_boots", InventoryChangedCriterion.Conditions.items(ModItems.THUNDERANIUM_BOOTS))
                    .build(consumer, AxonTechnologies.MOD_ID + "/has_thunderanium_armor");

        AdvancementEntry getRenderium = Advancement.Builder.create().parent(getThunderaniumArmor)
                .display(
                        ModItems.RENDERIUM, // The display icon
                        Text.translatable("advancement.axontechnologies.get_renderium.title"), // The title
                        Text.translatable("advancement.axontechnologies.get_renderium.description"), // The description
                        null,
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_renderium", InventoryChangedCriterion.Conditions.items(ModItems.RENDERIUM))
                .build(consumer, AxonTechnologies.MOD_ID + "/got_renderium");

            AdvancementEntry getRedEssence = Advancement.Builder.create().parent(getThunderaniumArmor)
                    .display(
                            ModItems.RED_ESSENCE, // The display icon
                            Text.translatable("advancement.axontechnologies.get_red_essence.title"), // The title
                            Text.translatable("advancement.axontechnologies.get_red_essence.description"), // The description
                            null,
                            AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                            true, // Show toast top right
                            true, // Announce to chat
                            false // Hidden in the advancement tab
                    )
                    // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                    .criterion("got_red_essence", InventoryChangedCriterion.Conditions.items(ModItems.RED_ESSENCE))
                    .build(consumer, AxonTechnologies.MOD_ID + "/got_red_essence");

            AdvancementEntry getRedThunderaniumIngot = Advancement.Builder.create().parent(getRedEssence)
                    .display(
                            ModItems.RED_THUNDERANIUM_INGOT, // The display icon
                            Text.translatable("advancement.axontechnologies.get_red_thunderanium_ingot.title"), // The title
                            Text.translatable("advancement.axontechnologies.get_red_thunderanium_ingot.description"), // The description
                            null,
                            AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                            true, // Show toast top right
                            true, // Announce to chat
                            false // Hidden in the advancement tab
                    )
                    // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                    .criterion("got_red_thunderanium_ingot", InventoryChangedCriterion.Conditions.items(ModItems.RED_THUNDERANIUM_INGOT))
                    .build(consumer, AxonTechnologies.MOD_ID + "/got_red_thunderanium_ingot");

            AdvancementEntry getRedThunderaniumArmor = Advancement.Builder.create().parent(getRedThunderaniumIngot)
                    .display(
                            ModItems.RED_THUNDERANIUM_CHESTPLATE, // The display icon
                            Text.translatable("advancement.axontechnologies.get_red_thunderanium_armor.title"), // The title
                            Text.translatable("advancement.axontechnologies.get_red_thunderanium_armor.description"), // The description
                            null,
                            AdvancementFrame.GOAL, // Options: TASK, CHALLENGE, GOAL
                            true, // Show toast top right
                            true, // Announce to chat
                            false // Hidden in the advancement tab
                    )
                    // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                    .criterion("got_red_thunderanium_helmet", InventoryChangedCriterion.Conditions.items(ModItems.RED_THUNDERANIUM_HELMET))
                    .criterion("got_red_thunderanium_chestplate", InventoryChangedCriterion.Conditions.items(ModItems.RED_THUNDERANIUM_CHESTPLATE))
                    .criterion("got_red_thunderanium_leggings", InventoryChangedCriterion.Conditions.items(ModItems.RED_THUNDERANIUM_LEGGINGS))
                    .criterion("got_red_thunderanium_boots", InventoryChangedCriterion.Conditions.items(ModItems.RED_THUNDERANIUM_BOOTS))
                    .build(consumer, AxonTechnologies.MOD_ID + "/has_red_thunderanium_armor");

        AdvancementEntry getDenderium = Advancement.Builder.create().parent(getRedThunderaniumArmor)
                .display(
                        ModItems.DENDERIUM, // The display icon
                        Text.translatable("advancement.axontechnologies.get_denderium.title"), // The title
                        Text.translatable("advancement.axontechnologies.get_denderium.description"), // The description
                        null,
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_denderium", InventoryChangedCriterion.Conditions.items(ModItems.DENDERIUM))
                .build(consumer, AxonTechnologies.MOD_ID + "/got_denderium");

            AdvancementEntry getDarkEssence = Advancement.Builder.create().parent(getRedThunderaniumArmor)
                    .display(
                            ModItems.DARK_ESSENCE, // The display icon
                            Text.translatable("advancement.axontechnologies.get_dark_essence.title"), // The title
                            Text.translatable("advancement.axontechnologies.get_dark_essence.description"), // The description
                            null,
                            AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                            true, // Show toast top right
                            true, // Announce to chat
                            false // Hidden in the advancement tab
                    )
                    // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                    .criterion("got_dark_essence", InventoryChangedCriterion.Conditions.items(ModItems.DARK_ESSENCE))
                    .build(consumer, AxonTechnologies.MOD_ID + "/got_dark_essence");


            AdvancementEntry getDarkThunderaniumIngot = Advancement.Builder.create().parent(getDarkEssence)
                    .display(
                            ModItems.DARK_THUNDERANIUM_INGOT, // The display icon
                            Text.translatable("advancement.axontechnologies.get_dark_thunderanium_ingot.title"), // The title
                            Text.translatable("advancement.axontechnologies.get_dark_thunderanium_ingot.description"), // The description
                            null,
                            AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                            true, // Show toast top right
                            true, // Announce to chat
                            false // Hidden in the advancement tab
                    )
                    // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                    .criterion("got_dark_thunderanium_ingot", InventoryChangedCriterion.Conditions.items(ModItems.DARK_THUNDERANIUM_INGOT))
                    .build(consumer, AxonTechnologies.MOD_ID + "/got_dark_thunderanium_ingot");

            AdvancementEntry getCorruptinite = Advancement.Builder.create().parent(getDarkEssence)
                    .display(
                            ModItems.CORRUPTINITE, // The display icon
                            Text.translatable("advancement.axontechnologies.get_corruptinite.title"), // The title
                            Text.translatable("advancement.axontechnologies.get_corruptinite.description"), // The description
                            null,
                            AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                            true, // Show toast top right
                            true, // Announce to chat
                            false // Hidden in the advancement tab
                    )
                    // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                    .criterion("got_corruptinite", InventoryChangedCriterion.Conditions.items(ModItems.CORRUPTINITE))
                    .build(consumer, AxonTechnologies.MOD_ID + "/got_corruptinite");

            AdvancementEntry getDarkThunderaniumArmor = Advancement.Builder.create().parent(getDarkThunderaniumIngot)
                    .display(
                            ModItems.DARK_THUNDERANIUM_CHESTPLATE, // The display icon
                            Text.translatable("advancement.axontechnologies.get_dark_thunderanium_armor.title"), // The title
                            Text.translatable("advancement.axontechnologies.get_dark_thunderanium_armor.description"), // The description
                            null,
                            AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
                            true, // Show toast top right
                            true, // Announce to chat
                            false // Hidden in the advancement tab
                    )
                    // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                    .criterion("got_dark_thunderanium_helmet", InventoryChangedCriterion.Conditions.items(ModItems.DARK_THUNDERANIUM_HELMET))
                    .criterion("got_dark_thunderanium_chestplate", InventoryChangedCriterion.Conditions.items(ModItems.DARK_THUNDERANIUM_CHESTPLATE))
                    .criterion("got_dark_thunderanium_leggings", InventoryChangedCriterion.Conditions.items(ModItems.DARK_THUNDERANIUM_LEGGINGS))
                    .criterion("got_dark_thunderanium_boots", InventoryChangedCriterion.Conditions.items(ModItems.DARK_THUNDERANIUM_BOOTS))
                    .build(consumer, AxonTechnologies.MOD_ID + "/has_dark_thunderanium_armor");

            AdvancementEntry getCorruptiniteArmor = Advancement.Builder.create().parent(getCorruptinite)
                    .display(
                            ModItems.CORRUPTINITE_CHESTPLATE, // The display icon
                            Text.translatable("advancement.axontechnologies.get_corruptinite_armor.title"), // The title
                            Text.translatable("advancement.axontechnologies.get_corruptinite_armor.description"), // The description
                            null,
                            AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
                            true, // Show toast top right
                            true, // Announce to chat
                            false // Hidden in the advancement tab
                    )
                    // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                    .criterion("got_corruptinite_helmet", InventoryChangedCriterion.Conditions.items(ModItems.CORRUPTINITE_HELMET))
                    .criterion("got_corruptinite_chestplate", InventoryChangedCriterion.Conditions.items(ModItems.CORRUPTINITE_CHESTPLATE))
                    .criterion("got_corruptinite_leggings", InventoryChangedCriterion.Conditions.items(ModItems.CORRUPTINITE_LEGGINGS))
                    .criterion("got_corruptinite_boots", InventoryChangedCriterion.Conditions.items(ModItems.CORRUPTINITE_BOOTS))
                    .build(consumer, AxonTechnologies.MOD_ID + "/has_corruptinite_armor");

            AdvancementEntry getAxonAlloy = Advancement.Builder.create().parent(getDarkEssence)
                    .display(
                            ModItems.AXON_ALLOY, // The display icon
                            Text.translatable("advancement.axontechnologies.get_axon_alloy.title"), // The title
                            Text.translatable("advancement.axontechnologies.get_axon_alloy.description"), // The description
                            null,
                            AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                            true, // Show toast top right
                            true, // Announce to chat
                            false // Hidden in the advancement tab
                    )
                    // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                    .criterion("got_axon_alloy", InventoryChangedCriterion.Conditions.items(ModItems.AXON_ALLOY))
                    .build(consumer, AxonTechnologies.MOD_ID + "/got_axon_alloy");

            AdvancementEntry getCorruptiniteAxonAlloyArmor = Advancement.Builder.create().parent(getAxonAlloy)
                    .display(
                            ModItems.CORRUPTINITE_AXON_ALLOY_CHESTPLATE, // The display icon
                            Text.translatable("advancement.axontechnologies.get_corruptinite_axon_alloy_armor.title"), // The title
                            Text.translatable("advancement.axontechnologies.get_corruptinite_axon_alloy_armor.description"), // The description
                            null,
                            AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
                            true, // Show toast top right
                            true, // Announce to chat
                            false // Hidden in the advancement tab
                    )
                    // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                    .criterion("got_axon_alloy_corruptinite_helmet", InventoryChangedCriterion.Conditions.items(ModItems.CORRUPTINITE_AXON_ALLOY_HELMET))
                    .criterion("got_axon_alloy_corruptinite_chestplate", InventoryChangedCriterion.Conditions.items(ModItems.CORRUPTINITE_AXON_ALLOY_CHESTPLATE))
                    .criterion("got_axon_alloy_corruptinite_leggings", InventoryChangedCriterion.Conditions.items(ModItems.CORRUPTINITE_AXON_ALLOY_LEGGINGS))
                    .criterion("got_axon_alloy_corruptinite_boots", InventoryChangedCriterion.Conditions.items(ModItems.CORRUPTINITE_AXON_ALLOY_BOOTS))
                    .build(consumer, AxonTechnologies.MOD_ID + "/has_axon_alloy_corruptinite_armor");

            AdvancementEntry getDarkThunderaniumAxonAlloyArmor = Advancement.Builder.create().parent(getAxonAlloy)
                    .display(
                            ModItems.DARK_THUNDERANIUM_AXON_ALLOY_CHESTPLATE, // The display icon
                            Text.translatable("advancement.axontechnologies.get_dark_thunderanium_axon_alloy_armor.title"), // The title
                            Text.translatable("advancement.axontechnologies.get_dark_thunderanium_axon_alloy_armor.description"), // The description
                            null,
                            AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
                            true, // Show toast top right
                            true, // Announce to chat
                            false // Hidden in the advancement tab
                    )
                    // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                    .criterion("got_axon_alloy_dark_thunderanium_helmet", InventoryChangedCriterion.Conditions.items(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_HELMET))
                    .criterion("got_axon_alloy_dark_thunderanium_chestplate", InventoryChangedCriterion.Conditions.items(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_CHESTPLATE))
                    .criterion("got_axon_alloy_dark_thunderanium_leggings", InventoryChangedCriterion.Conditions.items(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_LEGGINGS))
                    .criterion("got_axon_alloy_dark_thunderanium_boots", InventoryChangedCriterion.Conditions.items(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_BOOTS))
                    .build(consumer, AxonTechnologies.MOD_ID + "/has_axon_alloy_dark_thunderanium_armor");

            AdvancementEntry getAxonAlloyArmor = Advancement.Builder.create().parent(getAxonAlloy)
                    .display(
                            ModItems.AXON_ALLOY_CHESTPLATE, // The display icon
                            Text.translatable("advancement.axontechnologies.get_axon_alloy_armor.title"), // The title
                            Text.translatable("advancement.axontechnologies.get_axon_alloy_armor.description"), // The description
                            null,
                            AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
                            true, // Show toast top right
                            true, // Announce to chat
                            false // Hidden in the advancement tab
                    )
                    // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                    .criterion("got_axon_alloy_helmet", InventoryChangedCriterion.Conditions.items(ModItems.AXON_ALLOY_HELMET))
                    .criterion("got_axon_alloy_chestplate", InventoryChangedCriterion.Conditions.items(ModItems.AXON_ALLOY_CHESTPLATE))
                    .criterion("got_axon_alloy_leggings", InventoryChangedCriterion.Conditions.items(ModItems.AXON_ALLOY_LEGGINGS))
                    .criterion("got_axon_alloy_boots", InventoryChangedCriterion.Conditions.items(ModItems.AXON_ALLOY_BOOTS))
                    .build(consumer, AxonTechnologies.MOD_ID + "/has_axon_alloy_armor");

            AdvancementEntry getUltimateHoeTrophy = Advancement.Builder.create().parent(getAxonAlloy)
                    .display(
                            ModItems.ULTIMATE_HOE_TROPHY, // The display icon
                            Text.translatable("advancement.axontechnologies.get_ultimate_hoe_trophy.title"), // The title
                            Text.translatable("advancement.axontechnologies.get_ultimate_hoe_trophy.description"), // The description
                            null,
                            AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
                            true, // Show toast top right
                            true, // Announce to chat
                            false // Hidden in the advancement tab
                    )
                    // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                    .criterion("got_ultimate_hoe_trophy", InventoryChangedCriterion.Conditions.items(ModItems.ULTIMATE_HOE_TROPHY))
                    .build(consumer, AxonTechnologies.MOD_ID + "/got_ultimate_hoe_trophy");

        AdvancementEntry getRazzorium = Advancement.Builder.create().parent(getUltimateHoeTrophy)
                .display(
                        ModItems.RAZZORIUM, // The display icon
                        Text.translatable("advancement.axontechnologies.get_razzorium.title"), // The title
                        Text.translatable("advancement.axontechnologies.get_razzorium.description"), // The description
                        null,
                        AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_razzorium", InventoryChangedCriterion.Conditions.items(ModItems.RAZZORIUM))
                .build(consumer, AxonTechnologies.MOD_ID + "/got_razzorium");

        AdvancementEntry getRazzor = Advancement.Builder.create().parent(getRazzorium)
                .display(
                        ModItems.RAZZORIUM, // The display icon
                        Text.translatable("advancement.axontechnologies.get_razzor.title"), // The title
                        Text.translatable("advancement.axontechnologies.get_razzor.description"), // The description
                        null,
                        AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_razzor", InventoryChangedCriterion.Conditions.items(ModItems.RAZZOR))
                .build(consumer, AxonTechnologies.MOD_ID + "/got_razzor");

        }
    }

