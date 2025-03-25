package net.greddode.farmersexpanse.common.datagen;

import net.greddode.farmersexpanse.FarmersExpance;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider
{

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, FarmersExpance.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {

    }
    private void blockWithItem(DeferredBlock<?> deferredBlock)
    {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
