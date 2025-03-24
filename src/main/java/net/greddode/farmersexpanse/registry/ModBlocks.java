package net.greddode.farmersexpanse.registry;

import net.greddode.farmersexpanse.FarmersExpance;
import net.greddode.farmersexpanse.registry.block.crop.OatsCropBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks
{
    public final static DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(FarmersExpance.MOD_ID);

    public static final DeferredBlock<Block> OATS_CROP = BLOCKS.register("oats_crop",
            () -> new OatsCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));



    private static <T extends Block>DeferredBlock<T> registerBlock(String name, Supplier<T> block)
    {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block)
    {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
