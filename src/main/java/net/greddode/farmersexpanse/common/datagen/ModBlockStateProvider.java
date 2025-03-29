package net.greddode.farmersexpanse.common.datagen;

import net.greddode.farmersexpanse.FarmersExpance;
import net.greddode.farmersexpanse.common.registry.ModBlocks;
import net.greddode.farmersexpanse.common.registry.block.custom.crop.OatsCropBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import vectorwing.farmersdelight.data.BlockStates;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider
{

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, FarmersExpance.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {


        makeCrop(((CropBlock) ModBlocks.OATS_CROP.get()), "oats_crop_stage", "oats_crop_stage");
        blockItem(ModBlocks.WILD_OATS);



    }

    public void makeCrop(CropBlock block, String modelName, String textureName)
    {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }


    private ConfiguredModel[] states(BlockState state, CropBlock block, String modelName, String textureName)
    {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((OatsCropBlock) block).getAgeProperty()),
                ResourceLocation.fromNamespaceAndPath(FarmersExpance.MOD_ID, "block/" + textureName + state.getValue(((OatsCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }

    private void blockItem(DeferredBlock<?> deferredBlock)
    {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("farmersexpanse:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix)
    {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("farmersexpanse:block/" + deferredBlock.getId().getPath() + appendix));
    }

}
