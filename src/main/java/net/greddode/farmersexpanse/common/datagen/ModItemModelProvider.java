package net.greddode.farmersexpanse.common.datagen;

import net.greddode.farmersexpanse.FarmersExpance;
import net.greddode.farmersexpanse.common.registry.ModItems;
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
        basicItem(ModItems.VINEGAR.get());
        basicItem(ModItems.WHEAT_FLOUR.get());
        basicItem(ModItems.OAT_FLOUR.get());
        basicItem(ModItems.SALT.get());
        basicItem(ModItems.BATTER.get());
        basicItem(ModItems.BUTTER.get());
        basicItem(ModItems.CHEESE.get());
        basicItem(ModItems.COOKING_OIL.get());
        basicItem(ModItems.MUSHROOM_OIL.get());
        basicItem(ModItems.CREAM.get());
        basicItem(ModItems.CARAMEL.get());
        basicItem(ModItems.COCOA_POWDER.get());
        basicItem(ModItems.MOLASSES.get());
        basicItem(ModItems.KETCHUP.get());
        basicItem(ModItems.MAYONNAISE.get());

        //Yogurt
        basicItem(ModItems.PLAIN_YOGURT.get());
        basicItem(ModItems.GLOW_BERRY_YOGURT.get());
        basicItem(ModItems.SWEET_BERRY_YOGURT.get());
        basicItem(ModItems.MELON_YOGURT.get());
        basicItem(ModItems.CHORUS_YOGURT.get());
        basicItem(ModItems.APPLE_YOGURT.get());
        basicItem(ModItems.OATS_N_YOGURT.get());

        //Foods
        basicItem(ModItems.CHICKEN_NUGGET.get());
        basicItem(ModItems.STEW.get());
        basicItem(ModItems.MAC_N_CHEESE.get());
        basicItem(ModItems.COTTON_CANDY.get());
        basicItem(ModItems.EGGROLLS.get());
        basicItem(ModItems.OATMEAL_COOKIE.get());
        basicItem(ModItems.OAT_SCONE.get());
        basicItem(ModItems.OAT_PANCAKE.get());

        //Drinks
        basicItem(ModItems.ENERGY_DRINK.get());

        //Donuts
        basicItem(ModItems.APPLE_DONUT.get());
        basicItem(ModItems.PLAIN_DONUT.get());
        basicItem(ModItems.POWDERED_DONUT.get());
        basicItem(ModItems.FROSTED_DONUT.get());
        basicItem(ModItems.CHOCOLATE_DONUT.get());
        basicItem(ModItems.CHORUS_DONUT.get());
        basicItem(ModItems.GLOW_BERRY_DONUT.get());
        basicItem(ModItems.MELON_DONUT.get());
        basicItem(ModItems.SWEET_BERRY_DONUT.get());
        basicItem(ModItems.CARAMEL_DONUT.get());
        basicItem(ModItems.CARROT_DONUT.get());
        basicItem(ModItems.HONEY_GLAZED_DONUT.get());
        basicItem(ModItems.PUMPKIN_DONUT.get());
        basicItem(ModItems.SLIME_DONUT.get());

        //Soups
        basicItem(ModItems.CHICKEN_NOODLE_SOUP.get());
        basicItem(ModItems.CACTUS_SOUP.get());
        basicItem(ModItems.POTATO_SOUP.get());
        basicItem(ModItems.RABBIT_NOODLE_SOUP.get());
        basicItem(ModItems.MUTTON_NOODLE_SOUP.get());
        basicItem(ModItems.BEEF_NOODLE_SOUP.get());
        basicItem(ModItems.FISH_NOODLE_SOUP.get());
        basicItem(ModItems.CARROT_SOUP.get());
        basicItem(ModItems.VEGETABLE_NOODLE_SOUP.get());
        basicItem(ModItems.SLIME_SOUP.get());

        //Oatmeals
        basicItem(ModItems.OATMEAL.get());
        basicItem(ModItems.SWEET_BERRY_N_CREAM_OATMEAL.get());

        //Crops
        basicItem(ModItems.OAT_SEEDS.get());
        basicItem(ModItems.OATS.get());

        //Wild Crops
        basicItem(ModItems.WILD_OATS.get());
    }
}
