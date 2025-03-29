package net.greddode.farmersexpanse.common.util;

import net.greddode.farmersexpanse.FarmersExpance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTagsFE
{
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(FarmersExpance.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> CONDIMENTS = createTag("condiments");
        public static final TagKey<Item> VINEGAR_INGREDIENTS = createTag("vinegar_ingredients");
        public static final TagKey<Item> FRYINGOIL = createTag("fryingoil");
        public static final TagKey<Item> DOUGH = createTag("dough");
        public static final TagKey<Item> FLOUR = createTag("flour");
        public static final TagKey<Item> GRAIN = createTag("grain");




        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(FarmersExpance.MOD_ID, name));
        }
    }
}
