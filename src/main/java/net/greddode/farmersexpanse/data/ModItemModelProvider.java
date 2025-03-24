package net.greddode.farmersexpanse.data;

import net.greddode.farmersexpanse.FarmersExpance;
import net.greddode.farmersexpanse.registry.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider
{
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper)
    {
        super(output, FarmersExpance.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        basicItem(ModItems.OAT_SEEDS.get());
    }
}
