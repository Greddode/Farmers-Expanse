package net.greddode.farmersexpanse.data;

import net.greddode.farmersexpanse.common.registry.ModBlocks;
import net.greddode.farmersexpanse.common.registry.ModItems;
import net.greddode.farmersexpanse.common.block.crop.OatsCropBlock;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries)
    {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate()
    {
        LootItemCondition.Builder lootItemConditionBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.OATS_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OatsCropBlock.AGE, 4));

        this.add(ModBlocks.OATS_CROP.get(), this.createCropDrops(ModBlocks.OATS_CROP.get(),
                ModItems.OATS.get(), ModItems.OAT_SEEDS.get(), lootItemConditionBuilder));
    }

    @Override
    protected Iterable<Block> getKnownBlocks()
    {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
