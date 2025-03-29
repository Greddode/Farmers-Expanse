package net.greddode.farmersexpanse.common.datagen;

import net.greddode.farmersexpanse.common.registry.block.custom.crop.OatsCropBlock;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.greddode.farmersexpanse.common.registry.ModBlocksFE;
import net.greddode.farmersexpanse.common.registry.ModItemsFE;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolSingletonContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider
{

    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate()
    {
        LootItemCondition.Builder lootItemConditionBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocksFE.OATS_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OatsCropBlock.AGE, 4));

        this.add(ModBlocksFE.OATS_CROP.get(), this.createCropDrops(ModBlocksFE.OATS_CROP.get(),
                ModItemsFE.OATS.get(), ModItemsFE.OAT_SEEDS.get(), lootItemConditionBuilder));

        add(ModBlocksFE.WILD_OATS.get(),
                block -> createWildCropDrops(ModBlocksFE.OATS_CROP.get(), ModItemsFE.OAT_SEEDS.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks()
    {
        return ModBlocksFE.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
    protected LootTable.Builder createWildCropDrops(Block cropBlock, Item seedsItem)
    {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return (LootTable.Builder)this.applyExplosionDecay(cropBlock, LootTable.lootTable().withPool(LootPool.lootPool().add(((LootPoolSingletonContainer.Builder) LootItem.lootTableItem(seedsItem)))).withPool(LootPool.lootPool().apply(ApplyBonusCount.addBonusBinomialDistributionCount(registrylookup.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))));
    }
}
