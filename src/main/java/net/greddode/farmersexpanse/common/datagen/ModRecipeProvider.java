package net.greddode.farmersexpanse.common.datagen;

import net.greddode.farmersexpanse.common.registry.ModItemsFE;
import net.greddode.farmersexpanse.common.util.ModTagsFE;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.common.crafting.DifferenceIngredient;
import vectorwing.farmersdelight.client.recipebook.CookingPotRecipeBookTab;
import vectorwing.farmersdelight.common.registry.ModItems;
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.common.tag.ModTags;
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;

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
        CookingPotRecipeBuilder.cookingPotRecipe(ModItemsFE.MAYONNAISE.get(), 1, FAST_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
                .addIngredient(Tags.Items.EGGS)
                .addIngredient(ModItemsFE.COOKING_OIL.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .save(recipeOutput);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItemsFE.KETCHUP.get(), 1, FAST_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
                .addIngredient(CommonTags.CROPS_TOMATO)
                .addIngredient(CommonTags.CROPS_TOMATO)
                .addIngredient(Items.SUGAR)
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .save(recipeOutput);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItemsFE.MOLASSES.get(), 1, FAST_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
                .addIngredient(Items.SUGAR_CANE)
                .addIngredient(Items.SUGAR_CANE)
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .save(recipeOutput);

        //Hamburger
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItemsFE.PLAIN_HAMBURGER.get())
                .pattern("AB ")
                .pattern("   ")
                .pattern("   ")
                .define('A', Items.BREAD)
                .define('B', ModItems.BEEF_PATTY.get())
                .unlockedBy("has_patty", has(ModItems.BEEF_PATTY.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItemsFE.CHEESEBURGER.get())
                .pattern("ABC")
                .pattern("   ")
                .pattern("   ")
                .define('A', Items.BREAD)
                .define('B', ModItems.BEEF_PATTY.get())
                .define('C', ModItemsFE.CHEESE.get())
                .unlockedBy("has_patty", has(ModItems.BEEF_PATTY.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItemsFE.BACON_CHEESEBURGER.get())
                .pattern("ABC")
                .pattern("D  ")
                .pattern("   ")
                .define('A', Items.BREAD)
                .define('B', ModItems.BEEF_PATTY.get())
                .define('C', ModItemsFE.CHEESE.get())
                .define('D', ModItems.COOKED_BACON.get())
                .unlockedBy("has_patty", has(ModItems.BEEF_PATTY.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItemsFE.DELUXE_HAMBURGER.get())
                .pattern("ABC")
                .pattern("DEF")
                .pattern("GH ")
                .define('A', Items.BREAD)
                .define('B', ModItems.BEEF_PATTY.get())
                .define('C', CommonTags.FOODS_LEAFY_GREEN)
                .define('D', ModItems.TOMATO.get())
                .define('E', ModItems.ONION.get())
                .define('F', ModItemsFE.CHEESE.get())
                .define('G', ModItems.COOKED_BACON.get())
                .define('H', ModTagsFE.Items.CONDIMENTS)
                .unlockedBy("has_patty", has(ModItems.BEEF_PATTY.get()))
                .save(recipeOutput);

        //Sandwiches
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItemsFE.PORK_SANDWICH.get())
                .pattern("ABD")
                .pattern("C  ")
                .pattern("   ")
                .define('A', Items.BREAD)
                .define('B', Items.COOKED_PORKCHOP)
                .define('C', ModItems.TOMATO.get())
                .define('D', CommonTags.FOODS_LEAFY_GREEN)
                .unlockedBy("has_bread", has(Items.BREAD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItemsFE.MUTTON_SANDWICH.get())
                .pattern("ABD")
                .pattern("C  ")
                .pattern("   ")
                .define('A', Items.BREAD)
                .define('B', CommonTags.FOODS_COOKED_MUTTON)
                .define('C', ModItems.TOMATO.get())
                .define('D', CommonTags.FOODS_LEAFY_GREEN)
                .unlockedBy("has_bread", has(Items.BREAD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItemsFE.COD_SANDWICH.get())
                .pattern("ABD")
                .pattern("C  ")
                .pattern("   ")
                .define('A', Items.BREAD)
                .define('B', CommonTags.FOODS_COOKED_COD)
                .define('C', ModItems.TOMATO.get())
                .define('D', CommonTags.FOODS_LEAFY_GREEN)
                .unlockedBy("has_bread", has(Items.BREAD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItemsFE.SALMON_SANDWICH.get())
                .pattern("ABD")
                .pattern("C  ")
                .pattern("   ")
                .define('A', Items.BREAD)
                .define('B', CommonTags.FOODS_COOKED_SALMON)
                .define('C', ModItems.TOMATO.get())
                .define('D', CommonTags.FOODS_LEAFY_GREEN)
                .unlockedBy("has_bread", has(Items.BREAD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItemsFE.VEGETABLE_SANDWICH.get())
                .pattern("ABB")
                .pattern("DC ")
                .pattern("   ")
                .define('A', Items.BREAD)
                .define('B', vegetablesPatch())
                .define('C', ModItems.TOMATO.get())
                .define('D', CommonTags.FOODS_LEAFY_GREEN)
                .unlockedBy("has_bread", has(Items.BREAD))
                .save(recipeOutput);


        //Yogurt
        CookingPotRecipeBuilder.cookingPotRecipe(ModItemsFE.PLAIN_YOGURT.get(), 1, SLOW_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
                .addIngredient(CommonTags.FOODS_MILK)
                .addIngredient(ModItemsFE.CREAM.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .save(recipeOutput);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItemsFE.GLOW_BERRY_YOGURT.get(), 1, SLOW_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
                .addIngredient(CommonTags.FOODS_MILK)
                .addIngredient(ModItemsFE.CREAM.get())
                .addIngredient(Items.GLOW_BERRIES)
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .save(recipeOutput);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItemsFE.SWEET_BERRY_YOGURT.get(), 1, SLOW_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
                .addIngredient(CommonTags.FOODS_MILK)
                .addIngredient(ModItemsFE.CREAM.get())
                .addIngredient(Items.SWEET_BERRIES)
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .save(recipeOutput);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItemsFE.MELON_YOGURT.get(), 1, SLOW_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
                .addIngredient(CommonTags.FOODS_MILK)
                .addIngredient(ModItemsFE.CREAM.get())
                .addIngredient(Items.MELON_SLICE)
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .save(recipeOutput);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItemsFE.CHORUS_YOGURT.get(), 1, SLOW_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
                .addIngredient(CommonTags.FOODS_MILK)
                .addIngredient(ModItemsFE.CREAM.get())
                .addIngredient(Items.CHORUS_FRUIT)
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .save(recipeOutput);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItemsFE.APPLE_YOGURT.get(), 1, SLOW_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
                .addIngredient(CommonTags.FOODS_MILK)
                .addIngredient(ModItemsFE.CREAM.get())
                .addIngredient(Items.APPLE)
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .save(recipeOutput);
        CookingPotRecipeBuilder.cookingPotRecipe(ModItemsFE.OATS_N_YOGURT.get(), 1, SLOW_COOKING, SMALL_EXP, Items.GLASS_BOTTLE)
                .addIngredient(CommonTags.FOODS_MILK)
                .addIngredient(ModItemsFE.CREAM.get())
                .addIngredient(ModItemsFE.OATS.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .save(recipeOutput);

        //Ingredients
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ModItems.BACON.get()), Ingredient.of(CommonTags.TOOLS_KNIFE), ModItemsFE.MINCED_PORK.get(), 1)
                .save(recipeOutput, "farmersexpanse:minced_pork");

        //Hotdog
        CookingPotRecipeBuilder.cookingPotRecipe(ModItemsFE.HOTDOG.get(), 1, NORMAL_COOKING, MEDIUM_EXP)
                .addIngredient(ModItemsFE.MINCED_PORK.get())
                .addIngredient(ModItems.MINCED_BEEF.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItemsFE.HOTDOG_IN_A_BUN.get())
                .pattern("AB ")
                .pattern("   ")
                .pattern("   ")
                .define('A', Items.BREAD)
                .define('B', ModItemsFE.HOTDOG.get())
                .unlockedBy("has_hotdog", has(ModItemsFE.HOTDOG.get()))
                .save(recipeOutput);

    }
}
