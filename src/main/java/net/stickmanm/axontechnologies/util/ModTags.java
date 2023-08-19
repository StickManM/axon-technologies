package net.stickmanm.axontechnologies.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologies;

public class ModTags {

    public static class Blocks{
        public static final TagKey<Block> DIRT =
                createTag("dirt");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(AxonTechnologies.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(AxonTechnologies.MOD_ID, name));
        }
    }

    }




