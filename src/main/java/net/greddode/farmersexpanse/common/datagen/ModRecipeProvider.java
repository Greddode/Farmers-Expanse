package net.greddode.farmersexpanse.common.datagen;

import net.greddode.farmersexpanse.common.registry.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SmeltingRecipe;
import net.minecraft.world.item.crafting.SmokingRecipe;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.common.crafting.DifferenceIngredient;
import vectorwing.farmersdelight.client.recipebook.CookingPotRecipeBookTab;
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.common.tag.ModTags;
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder
{


    public static final int FAST_COOKING = 100;      // 5 seconds
    public static final int NORMAL_COOKING = 200;    // 10 seconds
    public static final int SLOW_COOKING = 400;      // 20 seconds

    public static final float SMALL_EXP = 0.35F;
    public static final float MEDIUM_EXP = 1.0F;
    public static final float LARGE_EXP = 2.0F;



    // TODO: Deprecate this if NeoForge removes melon_slice from the vegetables tag.
    private static Ingredient vegetablesPatch() {
        return DifferenceIngredient.of(Ingredient.of(Tags.Items.FOODS_VEGETABLE), Ingredient.of(Items.MELON_SLICE));
    }
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput)
    {
        //Ingredients
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.MAYONNAISE.get(), 1, FAST_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
                .addIngredient(Tags.Items.EGGS)
                .addIngredient(ModItems.COOKING_OIL.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .save(recipeOutput);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.KETCHUP.get(), 1, FAST_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
                .addIngredient(CommonTags.CROPS_TOMATO)
                .addIngredient(CommonTags.CROPS_TOMATO)
                .addIngredient(Items.SUGAR)
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .save(recipeOutput);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.MOLASSES.get(), 1, FAST_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
                .addIngredient(Items.SUGAR_CANE)
                .addIngredient(Items.SUGAR_CANE)
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .save(recipeOutput);
        

        //Yogurt
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.PLAIN_YOGURT.get(), 1, SLOW_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
                .addIngredient(CommonTags.FOODS_MILK)
                .addIngredient(ModItems.CREAM.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .save(recipeOutput);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.GLOW_BERRY_YOGURT.get(), 1, SLOW_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
                .addIngredient(CommonTags.FOODS_MILK)
                .addIngredient(ModItems.CREAM.get())
                .addIngredient(Items.GLOW_BERRIES)
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .save(recipeOutput);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.SWEET_BERRY_YOGURT.get(), 1, SLOW_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
                .addIngredient(CommonTags.FOODS_MILK)
                .addIngredient(ModItems.CREAM.get())
                .addIngredient(Items.SWEET_BERRIES)
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .save(recipeOutput);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.MELON_YOGURT.get(), 1, SLOW_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
                .addIngredient(CommonTags.FOODS_MILK)
                .addIngredient(ModItems.CREAM.get())
                .addIngredient(Items.MELON_SLICE)
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .save(recipeOutput);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.CHORUS_YOGURT.get(), 1, SLOW_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
                .addIngredient(CommonTags.FOODS_MILK)
                .addIngredient(ModItems.CREAM.get())
                .addIngredient(Items.CHORUS_FRUIT)
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .save(recipeOutput);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.APPLE_YOGURT.get(), 1, SLOW_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
                .addIngredient(CommonTags.FOODS_MILK)
                .addIngredient(ModItems.CREAM.get())
                .addIngredient(Items.APPLE)
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .save(recipeOutput);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.OATS_N_YOGURT.get(), 1, SLOW_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
                .addIngredient(CommonTags.FOODS_MILK)
                .addIngredient(ModItems.CREAM.get())
                .addIngredient(ModItems.OATS.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .save(recipeOutput);
    }
}
