package net.greddode.farmersexpanse.common.datagen;

import net.greddode.farmersexpanse.FarmersExpance;
import net.greddode.farmersexpanse.common.registry.ModItemsFE;
import net.greddode.farmersexpanse.common.util.ModTagsFE;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import vectorwing.farmersdelight.common.registry.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider
{
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, blockTags, FarmersExpance.MOD_ID, existingFileHelper);
    }


    @Override
    protected void addTags(HolderLookup.Provider provider)
    {
        tag(ModTagsFE.Items.CONDIMENTS)
                .add(ModItemsFE.MAYONNAISE.get())
                .add(ModItemsFE.KETCHUP.get())
                .add(ModItemsFE.MOLASSES.get());
        tag(ModTagsFE.Items.VINEGAR_INGREDIENTS)
                .add(ModItems.TOMATO.get())
                .add(Items.APPLE)
                .add(Items.CHORUS_FRUIT)
                .add(Items.SWEET_BERRIES)
                .add(Items.MELON_SLICE)
                .add(ModItemsFE.OATS.get());
        tag(ModTagsFE.Items.FRYINGOIL)
                .add(ModItemsFE.COOKING_OIL.get())
                .add(ModItemsFE.MUSHROOM_OIL.get());
        tag(ModTagsFE.Items.DOUGH)
                .add(ModItems.WHEAT_DOUGH.get());
        tag(ModTagsFE.Items.FLOUR)
                .add(ModItemsFE.WHEAT_FLOUR.get())
                .add(ModItemsFE.OAT_FLOUR.get());
        tag(ModTagsFE.Items.GRAIN)
                .add(Items.WHEAT)
                .add(ModItemsFE.OATS.get());

    }
}
