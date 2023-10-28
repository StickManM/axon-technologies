package net.stickmanm.axontechnologies.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologies;
import net.stickmanm.axontechnologies.item.ModItems;

public class ModBlockTags {
    //Mimicarium Ore Replaceables
    public static final TagKey<Block> MIMICARIUM_REPLACEABLE_STONE = TagKey.of(RegistryKeys.BLOCK, new Identifier(AxonTechnologies.MOD_ID, "mimicarium_replaceable"));
    public static final TagKey<Block> MIMICARIUM_REPLACEABLE_DEEPSLATE = TagKey.of(RegistryKeys.BLOCK, new Identifier(AxonTechnologies.MOD_ID, "mimicarium_replaceable_deepslate"));
    public static final TagKey<Block> FAKESLATE_REPLACEABLE = TagKey.of(RegistryKeys.BLOCK, new Identifier(AxonTechnologies.MOD_ID, "fakeslate_replaceable"));
    public static final TagKey<Block> FAKESTONE_REPLACEABLE = TagKey.of(RegistryKeys.BLOCK, new Identifier(AxonTechnologies.MOD_ID, "fakestone_replaceable"));

    //Dreadstone Ores Replaceables
    public static final TagKey<Block> DREADSTONE_REPLACEABLE = TagKey.of(RegistryKeys.BLOCK, new Identifier(AxonTechnologies.MOD_ID, "dreadstone_replaceable"));
    public static final TagKey<Block> THUNDERED_STONE_REPLACEABLE = TagKey.of(RegistryKeys.BLOCK, new Identifier(AxonTechnologies.MOD_ID, "thundered_stone_replaceable"));
    public static final TagKey<Block> CORRUPTED_STONE_REPLACEABLE = TagKey.of(RegistryKeys.BLOCK, new Identifier(AxonTechnologies.MOD_ID, "corrupted_stone_replaceable"));




    public static void registerModTags() {
        AxonTechnologies.LOGGER.info("Registering ModTags for " + AxonTechnologies.MOD_ID);
    }
}
