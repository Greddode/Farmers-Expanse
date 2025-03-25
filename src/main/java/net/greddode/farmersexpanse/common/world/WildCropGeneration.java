package net.greddode.farmersexpanse.common.world;

import net.greddode.farmersexpanse.FarmersExpance;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class WildCropGeneration
{
    public static ResourceKey<PlacedFeature> PATCH_WILD_OATS = ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(FarmersExpance.MOD_ID, "patch_wild_oats"));
}
