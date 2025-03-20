package net.greddode.farmersexpanse.item;

import com.google.common.collect.Sets;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.DrinkableItem;

import java.util.LinkedHashSet;
import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS;
    public static LinkedHashSet<Supplier<Item>> CREATIVE_TAB_ITEMS;
    public static final Supplier<Item> CHICKEN_NUGGET;
    public static final Supplier<Item> ENERGY_DRINK;
    public static final Supplier<Item> FLOUR;
    public static final Supplier<Item> STEW;
    public static final Supplier<Item> SALT;

    public ModItems() {
    }

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
    static {
        ITEMS = DeferredRegister.create(Registries.ITEM, "farmersexpanse");
        CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();
        CHICKEN_NUGGET = registerWithTab("chicken_nugget", () -> new Item(foodItem(FoodValues.CHICKEN_NUGGET)));
        ENERGY_DRINK = registerWithTab("energy_drink", () -> new DrinkableItem(drinkItem().food(FoodValues.ENERGY_DRINK)));
        FLOUR = registerWithTab("flour", () -> new Item(basicItem()));
        STEW = registerWithTab("stew", () -> new ConsumableItem(bowlFoodItem(FoodValues.STEW)));
        SALT = registerWithTab("salt", () -> new Item(basicItem()));
    }
    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
