package net.greddode.farmersexpanse.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;

import java.util.concurrent.CompletableFuture;

public class ModDataMapProvider extends DataMapProvider
{
    protected ModDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider)
    {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather()
    {
        //getId() Does not like that I'm using supplier in the Item/block registeries
        /* this.builder(NeoForgeDataMaps.COMPOSTABLES)
                .add(ModItems.OAT_SEEDS.getId(), new Compostable(0.25f), false)
                .add(ModItems.OATS.getId(), new Compostable(0.45f), false); */
    }
}
