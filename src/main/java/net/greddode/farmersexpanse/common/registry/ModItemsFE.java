package net.greddode.farmersexpanse.common.registry;

import com.google.common.collect.Sets;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.DrinkableItem;

import java.util.LinkedHashSet;
import java.util.function.Supplier;

public class ModItemsFE {
    public static Supplier<Item> registerWithTab(String name, Supplier<Item> supplier) {
        Supplier<Item> block = ITEMS.register(name, supplier);
        CREATIVE_TAB_ITEMS.add(block);
        return block;
    }

    public static Item.Properties basicItem() {
        return new Item.Properties();
    }

    public static Item.Properties foodItem(FoodProperties food) {
        return (new Item.Properties()).food(food);
    }

    public static Item.Properties bowlFoodItem(FoodProperties food) {
        return (new Item.Properties()).food(food).craftRemainder(Items.BOWL).stacksTo(16);
    }

    public static Item.Properties drinkItem() {
        return (new Item.Properties()).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16);
    }

    public static Item.Properties stickItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.STICK);
    }

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, "farmersexpanse");
    public static LinkedHashSet<Supplier<Item>> CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();

    //Foods
    public static final Supplier<Item> CHICKEN_NUGGET = registerWithTab("chicken_nugget",
            () -> new Item(foodItem(FoodValues.CHICKEN_NUGGET)));
    public static final Supplier<Item> STEW = registerWithTab("stew",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.STEW), true));
    public static final Supplier<Item> EGGROLLS = registerWithTab("eggrolls",
            () -> new ConsumableItem(foodItem(FoodValues.EGGROLLS)));
    public static final Supplier<Item> COTTON_CANDY = registerWithTab("cotton_candy",
            () -> new ConsumableItem(stickItem(FoodValues.COTTON_CANDY), true));
    public static final Supplier<Item> MAC_N_CHEESE = registerWithTab("mac_n_cheese",
            () -> new ConsumableItem(foodItem(FoodValues.MAC_N_CHEESE), true));
    public static final Supplier<Item> OATMEAL_COOKIE = registerWithTab("oatmeal_cookie",
            () -> new ConsumableItem(foodItem(FoodValues.COOKIES)));
    public static final Supplier<Item> OAT_SCONE = registerWithTab("oat_scone",
            () -> new ConsumableItem(foodItem(FoodValues.OAT_SCONE)));
    public static final Supplier<Item> OAT_PANCAKE = registerWithTab("oat_pancake",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.OAT_PANCAKE)));



    //Drinks
    public static final Supplier<Item> ENERGY_DRINK = registerWithTab("energy_drink",
            () -> new DrinkableItem(drinkItem().food(FoodValues.ENERGY_DRINK), true));

    //Ingredients
    public static final Supplier<Item> WHEAT_FLOUR = registerWithTab("wheat_flour",
            () -> new Item(basicItem()));
    public static final Supplier<Item> OAT_FLOUR = registerWithTab("oat_flour",
            () -> new Item(basicItem()));
    public static final Supplier<Item> SALT = registerWithTab("salt",
            () -> new Item(basicItem()));
    public static final Supplier<Item> COCOA_POWDER = registerWithTab("cocoa_powder",
            () -> new Item(basicItem()));
    public static final Supplier<Item> BATTER = registerWithTab("batter",
            () -> new ConsumableItem(foodItem(FoodValues.BATTER)));
    public static final Supplier<Item> CHEESE = registerWithTab("cheese",
            () -> new ConsumableItem(foodItem(FoodValues.CHEESE)));
    public static final Supplier<Item> BUTTER = registerWithTab("butter",
            () -> new ConsumableItem(foodItem(FoodValues.BUTTER)));
    public static final Supplier<Item> CREAM = registerWithTab("cream",
            () -> new Item(drinkItem()));
    public static final Supplier<Item> VINEGAR = registerWithTab("vinegar",
            () -> new Item(drinkItem()));
    public static final Supplier<Item> MUSHROOM_OIL = registerWithTab("mushroom_oil",
            () -> new Item(drinkItem()));
    public static final Supplier<Item> COOKING_OIL = registerWithTab("cooking_oil",
            () -> new Item(drinkItem()));
    public static final Supplier<Item> CARAMEL = registerWithTab("caramel",
            () -> new ConsumableItem(foodItem(FoodValues.CARAMEL), true));
    public static final Supplier<Item> MOLASSES = registerWithTab("molasses",
            () -> new Item(drinkItem()));
    public static final Supplier<Item> KETCHUP = registerWithTab("ketchup",
            () -> new Item(drinkItem()));
    public static final Supplier<Item> MAYONNAISE = registerWithTab("mayonnaise",
            () -> new Item(drinkItem()));
    public static final Supplier<Item> MINCED_PORK = registerWithTab("minced_pork",
            () -> new ConsumableItem(foodItem(FoodValues.MINCED_PORK)));
    //Ground Pork

    //Burgers
    public static final Supplier<Item> PLAIN_HAMBURGER = registerWithTab("plain_hamburger",
            () -> new ConsumableItem(foodItem(FoodValues.BASIC_HAMBURGER)));
    public static final Supplier<Item> CHEESEBURGER = registerWithTab("cheeseburger",
            () -> new ConsumableItem(foodItem(FoodValues.CHEESEBURGER)));
    public static final Supplier<Item> BACON_CHEESEBURGER = registerWithTab("bacon_cheeseburger",
            () -> new ConsumableItem(foodItem(FoodValues.BACON_CHEESEBURGER)));
    public static final Supplier<Item> DELUXE_HAMBURGER = registerWithTab("deluxe_hamburger",
            () -> new ConsumableItem(foodItem(FoodValues.DELUXE_HAMBURGER)));


    //Sandwiches
    public static final Supplier<Item> PORK_SANDWICH = registerWithTab("pork_sandwich",
            () -> new ConsumableItem(foodItem(FoodValues.MEAT_SANDWICH)));
    public static final Supplier<Item> MUTTON_SANDWICH = registerWithTab("mutton_sandwich",
            () -> new ConsumableItem(foodItem(FoodValues.MEAT_SANDWICH)));
    public static final Supplier<Item> COD_SANDWICH = registerWithTab("cod_sandwich",
            () -> new ConsumableItem(foodItem(FoodValues.MEAT_SANDWICH)));
    public static final Supplier<Item> SALMON_SANDWICH = registerWithTab("salmon_sandwich",
            () -> new ConsumableItem(foodItem(FoodValues.MEAT_SANDWICH)));
    public static final Supplier<Item> VEGETABLE_SANDWICH = registerWithTab("vegetable_sandwich",
            () -> new ConsumableItem(foodItem(FoodValues.MEAT_SANDWICH)));
    //Bacon Chicken Sandwich

    //Hotdog
    public static final Supplier<Item> HOTDOG = registerWithTab("hotdog",
            () -> new ConsumableItem(foodItem(FoodValues.HOTDOG)));
    public static final Supplier<Item> HOTDOG_IN_A_BUN = registerWithTab("hotdog_in_a_bun",
            () -> new ConsumableItem(foodItem(FoodValues.HOTDOG_IN_A_BUN)));

    //Yogurt
    public static final Supplier<Item> PLAIN_YOGURT = registerWithTab("plain_yogurt",
            () -> new ConsumableItem(drinkItem().food(FoodValues.PLAIN_YOGURT)));
    public static final Supplier<Item> GLOW_BERRY_YOGURT = registerWithTab("glow_berry_yogurt",
            () -> new ConsumableItem(drinkItem().food(FoodValues.FRUIT_YOGURT)));
    public static final Supplier<Item> SWEET_BERRY_YOGURT = registerWithTab("sweet_berry_yogurt",
            () -> new ConsumableItem(drinkItem().food(FoodValues.FRUIT_YOGURT)));
    public static final Supplier<Item> MELON_YOGURT = registerWithTab("melon_yogurt",
            () -> new ConsumableItem(drinkItem().food(FoodValues.FRUIT_YOGURT)));
    public static final Supplier<Item> CHORUS_YOGURT = registerWithTab("chorus_yogurt",
            () -> new ConsumableItem(drinkItem().food(FoodValues.FRUIT_YOGURT)));
    public static final Supplier<Item> APPLE_YOGURT = registerWithTab("apple_yogurt",
            () -> new ConsumableItem(drinkItem().food(FoodValues.FRUIT_YOGURT)));
    public static final Supplier<Item> OATS_N_YOGURT = registerWithTab("oats_n_yogurt",
            () -> new ConsumableItem(drinkItem().food(FoodValues.OATS_N_YOGURT)));


    //Donuts
    public static final Supplier<Item> PLAIN_DONUT = registerWithTab("plain_donut",
            () -> new ConsumableItem(foodItem(FoodValues.PLAIN_DONUT)));
    public static final Supplier<Item> POWDERED_DONUT = registerWithTab("powdered_donut",
            () -> new ConsumableItem(foodItem(FoodValues.POWDERED_DONUT)));
    public static final Supplier<Item> FROSTED_DONUT = registerWithTab("frosted_donut",
            () -> new ConsumableItem(foodItem(FoodValues.FROSTED_DONUT)));
    public static final Supplier<Item> CHOCOLATE_DONUT = registerWithTab("chocolate_donut",
            () -> new ConsumableItem(foodItem(FoodValues.CHOCOLATE_DONUT)));
    public static final Supplier<Item> APPLE_DONUT = registerWithTab("apple_donut",
            () -> new ConsumableItem(foodItem(FoodValues.APPLE_DONUT)));
    public static final Supplier<Item> CHORUS_DONUT = registerWithTab("chorus_donut",
            () -> new ConsumableItem(foodItem(FoodValues.CHORUS_DONUT)));
    public static final Supplier<Item> GLOW_BERRY_DONUT = registerWithTab("glow_berry_donut",
            () -> new ConsumableItem(foodItem(FoodValues.GLOW_BERRY_DONUT), true));
    public static final Supplier<Item> MELON_DONUT = registerWithTab("melon_donut",
            () -> new ConsumableItem(foodItem(FoodValues.MELON_DONUT)));
    public static final Supplier<Item> SWEET_BERRY_DONUT = registerWithTab("sweet_berry_donut",
            () -> new ConsumableItem(foodItem(FoodValues.SWEET_BERRY_DONUT)));
    public static final Supplier<Item> CARAMEL_DONUT = registerWithTab("caramel_donut",
            () -> new ConsumableItem(foodItem(FoodValues.CARAMEL_DONUT), true));
    public static final Supplier<Item> CARROT_DONUT = registerWithTab("carrot_donut",
            () -> new ConsumableItem(foodItem(FoodValues.CARROT_DONUT)));
    public static final Supplier<Item> HONEY_GLAZED_DONUT = registerWithTab("honey_glazed_donut",
            () -> new ConsumableItem(foodItem(FoodValues.HONEY_GLAZED_DONUT)));
    public static final Supplier<Item> PUMPKIN_DONUT = registerWithTab("pumpkin_donut",
            () -> new ConsumableItem(foodItem(FoodValues.PUMPKIN_DONUT)));
    public static final Supplier<Item> SLIME_DONUT = registerWithTab("slime_donut",
            () -> new ConsumableItem(foodItem(FoodValues.SLIME_DONUT)));

    //Soups
    public static final Supplier<Item> CHICKEN_NOODLE_SOUP = registerWithTab("chicken_noodle_soup",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.CHICKEN_NOODLE_SOUP), true));
    public static final Supplier<Item> CACTUS_SOUP = registerWithTab("cactus_soup",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.CACTUS_SOUP)));
    public static final Supplier<Item> POTATO_SOUP = registerWithTab("potato_soup",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.POTATO_SOUP), true));
    public static final Supplier<Item> RABBIT_NOODLE_SOUP = registerWithTab("rabbit_noodle_soup",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.RABBIT_NOODLE_SOUP), true));
    public static final Supplier<Item> MUTTON_NOODLE_SOUP = registerWithTab("mutton_noodle_soup",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.MUTTON_NOODLE_SOUP), true));
    public static final Supplier<Item> BEEF_NOODLE_SOUP = registerWithTab("beef_noodle_soup",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.BEEF_NOODLE_SOUP), true));
    public static final Supplier<Item> FISH_NOODLE_SOUP = registerWithTab("fish_noodle_soup",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.FISH_NOODLE_SOUP), true));
    public static final Supplier<Item> CARROT_SOUP = registerWithTab("carrot_soup",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.CARROT_SOUP)));
    public static final Supplier<Item> VEGETABLE_NOODLE_SOUP = registerWithTab("vegetable_noodle_soup",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.VEGETABLE_NOODLE_SOUP), true));
    public static final Supplier<Item> SLIME_SOUP = registerWithTab("slime_soup",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.SLIME_SOUP)));

    //Oatmeals
    public static final Supplier<Item> OATMEAL = registerWithTab("oatmeal",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.OATMEAL)));
    public static final Supplier<Item> SWEET_BERRY_N_CREAM_OATMEAL = registerWithTab("sweet_berry_n_cream_oatmeal",
            () -> new ConsumableItem(bowlFoodItem(FoodValues.SWEET_BERRY_N_CREAM_OATMEAL)));

    //Crops
    public static final Supplier<Item> OATS = registerWithTab("oats",
            () -> new Item(basicItem()));
    public static final Supplier<Item> OAT_SEEDS = ITEMS.register("oat_seeds",
            () -> new ItemNameBlockItem(ModBlocksFE.OATS_CROP.get(), new Item.Properties()));

    //Wild Crops
    public static final Supplier<Item> WILD_OATS = registerWithTab("wild_oats",
            () -> new BlockItem(ModBlocksFE.WILD_OATS.get(), basicItem()));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
