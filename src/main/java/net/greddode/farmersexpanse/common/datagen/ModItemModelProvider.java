package net.greddode.farmersexpanse.common.datagen;

import net.greddode.farmersexpanse.FarmersExpance;
import net.greddode.farmersexpanse.common.registry.ModItemsFE;
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
        //Ingredients
        basicItem(ModItemsFE.VINEGAR.get());
        basicItem(ModItemsFE.WHEAT_FLOUR.get());
        basicItem(ModItemsFE.OAT_FLOUR.get());
        basicItem(ModItemsFE.SALT.get());
        basicItem(ModItemsFE.BATTER.get());
        basicItem(ModItemsFE.BUTTER.get());
        basicItem(ModItemsFE.CHEESE.get());
        basicItem(ModItemsFE.COOKING_OIL.get());
        basicItem(ModItemsFE.MUSHROOM_OIL.get());
        basicItem(ModItemsFE.CREAM.get());
        basicItem(ModItemsFE.CARAMEL.get());
        basicItem(ModItemsFE.COCOA_POWDER.get());
        basicItem(ModItemsFE.MOLASSES.get());
        basicItem(ModItemsFE.KETCHUP.get());
        basicItem(ModItemsFE.MAYONNAISE.get());
        basicItem(ModItemsFE.MINCED_PORK.get());

        //Hamburger
        basicItem(ModItemsFE.PLAIN_HAMBURGER.get());
        basicItem(ModItemsFE.CHEESEBURGER.get());
        basicItem(ModItemsFE.BACON_CHEESEBURGER.get());
        basicItem(ModItemsFE.DELUXE_HAMBURGER.get());

        //Sandwiches
        basicItem(ModItemsFE.PORK_SANDWICH.get());
        basicItem(ModItemsFE.MUTTON_SANDWICH.get());
        basicItem(ModItemsFE.COD_SANDWICH.get());
        basicItem(ModItemsFE.SALMON_SANDWICH.get());
        basicItem(ModItemsFE.VEGETABLE_SANDWICH.get());

        //Hotdogs
        basicItem(ModItemsFE.HOTDOG.get());
        basicItem(ModItemsFE.HOTDOG_IN_A_BUN.get());

        //Yogurt
        basicItem(ModItemsFE.PLAIN_YOGURT.get());
        basicItem(ModItemsFE.GLOW_BERRY_YOGURT.get());
        basicItem(ModItemsFE.SWEET_BERRY_YOGURT.get());
        basicItem(ModItemsFE.MELON_YOGURT.get());
        basicItem(ModItemsFE.CHORUS_YOGURT.get());
        basicItem(ModItemsFE.APPLE_YOGURT.get());
        basicItem(ModItemsFE.OATS_N_YOGURT.get());

        //Foods
        basicItem(ModItemsFE.CHICKEN_NUGGET.get());
        basicItem(ModItemsFE.STEW.get());
        basicItem(ModItemsFE.MAC_N_CHEESE.get());
        basicItem(ModItemsFE.COTTON_CANDY.get());
        basicItem(ModItemsFE.EGGROLLS.get());
        basicItem(ModItemsFE.OATMEAL_COOKIE.get());
        basicItem(ModItemsFE.OAT_SCONE.get());
        basicItem(ModItemsFE.OAT_PANCAKE.get());

        //Drinks
        basicItem(ModItemsFE.ENERGY_DRINK.get());

        //Donuts
        basicItem(ModItemsFE.APPLE_DONUT.get());
        basicItem(ModItemsFE.PLAIN_DONUT.get());
        basicItem(ModItemsFE.POWDERED_DONUT.get());
        basicItem(ModItemsFE.FROSTED_DONUT.get());
        basicItem(ModItemsFE.CHOCOLATE_DONUT.get());
        basicItem(ModItemsFE.CHORUS_DONUT.get());
        basicItem(ModItemsFE.GLOW_BERRY_DONUT.get());
        basicItem(ModItemsFE.MELON_DONUT.get());
        basicItem(ModItemsFE.SWEET_BERRY_DONUT.get());
        basicItem(ModItemsFE.CARAMEL_DONUT.get());
        basicItem(ModItemsFE.CARROT_DONUT.get());
        basicItem(ModItemsFE.HONEY_GLAZED_DONUT.get());
        basicItem(ModItemsFE.PUMPKIN_DONUT.get());
        basicItem(ModItemsFE.SLIME_DONUT.get());

        //Soups
        basicItem(ModItemsFE.CHICKEN_NOODLE_SOUP.get());
        basicItem(ModItemsFE.CACTUS_SOUP.get());
        basicItem(ModItemsFE.POTATO_SOUP.get());
        basicItem(ModItemsFE.RABBIT_NOODLE_SOUP.get());
        basicItem(ModItemsFE.MUTTON_NOODLE_SOUP.get());
        basicItem(ModItemsFE.BEEF_NOODLE_SOUP.get());
        basicItem(ModItemsFE.FISH_NOODLE_SOUP.get());
        basicItem(ModItemsFE.CARROT_SOUP.get());
        basicItem(ModItemsFE.VEGETABLE_NOODLE_SOUP.get());
        basicItem(ModItemsFE.SLIME_SOUP.get());

        //Oatmeals
        basicItem(ModItemsFE.OATMEAL.get());
        basicItem(ModItemsFE.SWEET_BERRY_N_CREAM_OATMEAL.get());

        //Crops
        basicItem(ModItemsFE.OAT_SEEDS.get());
        basicItem(ModItemsFE.OATS.get());

        //Wild Crops
        basicItem(ModItemsFE.WILD_OATS.get());
    }
}
