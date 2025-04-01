package net.greddode.farmersexpanse.common.registry;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class FoodValues {
    public static final int BRIEF_DURATION = 600;
    public static final int SHORT_DURATION = 1200;
    public static final int MEDIUM_DURATION = 3600;
    public static final int LONG_DURATION = 6000;
    public static final FoodProperties CHICKEN_NUGGET = (new FoodProperties.Builder()).nutrition(3).saturationModifier(0.5F).fast().build();
    public static final FoodProperties ENERGY_DRINK = new FoodProperties.Builder().nutrition(0).alwaysEdible().saturationModifier(0).effect(()-> new MobEffectInstance(MobEffects.GLOWING, BRIEF_DURATION), 1).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, BRIEF_DURATION), 1).build();
    public static final FoodProperties STEW = new FoodProperties.Builder().nutrition(15).saturationModifier(1.2f).effect(()-> nourishment(LONG_DURATION), 1).build();
    public static final FoodProperties CHEESE = new FoodProperties.Builder().nutrition(1).saturationModifier(0.2f).build();
    public static final FoodProperties BATTER = new FoodProperties.Builder().nutrition(1).saturationModifier(0.2f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, SHORT_DURATION), 0.8f).build();
    public static final FoodProperties BUTTER = new FoodProperties.Builder().nutrition(1).saturationModifier(0.5f).build();
    public static final FoodProperties CARAMEL = new FoodProperties.Builder().nutrition(1).saturationModifier(0.5f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, BRIEF_DURATION), 1).build();
    public static final FoodProperties EGGROLLS = new FoodProperties.Builder().nutrition(7).saturationModifier(0.5f).build();
    public static final FoodProperties COTTON_CANDY = new FoodProperties.Builder().nutrition(1).saturationModifier(1f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, BRIEF_DURATION), 1).build();
    public static final FoodProperties MAC_N_CHEESE = new FoodProperties.Builder().nutrition(9).saturationModifier(0.8f).effect(()-> comfort(MEDIUM_DURATION), 1).build();
    public static final FoodProperties PLAIN_DONUT = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8f).build();
    public static final FoodProperties POWDERED_DONUT = new FoodProperties.Builder().nutrition(8).saturationModifier(1).build();
    public static final FoodProperties FROSTED_DONUT = new FoodProperties.Builder().nutrition(10).saturationModifier(0.8f).build();
    public static final FoodProperties CHOCOLATE_DONUT = new FoodProperties.Builder().nutrition(9).saturationModifier(0.8f).build();
    public static final FoodProperties APPLE_DONUT = new FoodProperties.Builder().nutrition(11).saturationModifier(0.8f).build();
    public static final FoodProperties CHORUS_DONUT = new FoodProperties.Builder().nutrition(10).saturationModifier(0.8f).build();
    public static final FoodProperties GLOW_BERRY_DONUT = new FoodProperties.Builder().nutrition(9).saturationModifier(0.8f).effect(()-> new MobEffectInstance(MobEffects.GLOWING, BRIEF_DURATION), 1).build();
    public static final FoodProperties MELON_DONUT = new FoodProperties.Builder().nutrition(9).saturationModifier(0.8f).build();
    public static final FoodProperties SWEET_BERRY_DONUT = new FoodProperties.Builder().nutrition(9).saturationModifier(0.8f).build();
    public static final FoodProperties CARAMEL_DONUT = new FoodProperties.Builder().nutrition(8).saturationModifier(0.5f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, BRIEF_DURATION), 1).build();
    public static final FoodProperties CARROT_DONUT = new FoodProperties.Builder().nutrition(9).saturationModifier(0.8f).build();
    public static final FoodProperties HONEY_GLAZED_DONUT = new FoodProperties.Builder().nutrition(9).saturationModifier(0.8f).build();
    public static final FoodProperties PUMPKIN_DONUT = new FoodProperties.Builder().nutrition(9).saturationModifier(0.8f).effect(()-> comfort(SHORT_DURATION), 1).build();
    public static final FoodProperties SLIME_DONUT = new FoodProperties.Builder().nutrition(10).saturationModifier(0.8f).build();
    public static final FoodProperties CHICKEN_NOODLE_SOUP = new FoodProperties.Builder().nutrition(14).saturationModifier(0.8f).effect(()-> comfort(MEDIUM_DURATION), 1).build();
    public static final FoodProperties CACTUS_SOUP = new FoodProperties.Builder().nutrition(7).saturationModifier(0.4f).build();
    public static final FoodProperties POTATO_SOUP = new FoodProperties.Builder().nutrition(8).saturationModifier(1).effect(()-> nourishment(MEDIUM_DURATION), 1).build();
    public static final FoodProperties RABBIT_NOODLE_SOUP = new FoodProperties.Builder().nutrition(14).saturationModifier(0.8f).effect(()-> comfort(MEDIUM_DURATION), 1).build();
    public static final FoodProperties MUTTON_NOODLE_SOUP = new FoodProperties.Builder().nutrition(14).saturationModifier(0.8f).effect(()-> comfort(MEDIUM_DURATION), 1).build();
    public static final FoodProperties BEEF_NOODLE_SOUP = new FoodProperties.Builder().nutrition(14).saturationModifier(0.8f).effect(()-> comfort(MEDIUM_DURATION), 1).build();
    public static final FoodProperties FISH_NOODLE_SOUP = new FoodProperties.Builder().nutrition(14).saturationModifier(0.8f).effect(()-> comfort(MEDIUM_DURATION), 1).build();
    public static final FoodProperties CARROT_SOUP = new FoodProperties.Builder().nutrition(7).saturationModifier(0.8f).build();
    public static final FoodProperties VEGETABLE_NOODLE_SOUP = new FoodProperties.Builder().nutrition(12).saturationModifier(0.8f).effect(()-> comfort(SHORT_DURATION), 1).build();
    public static final FoodProperties SLIME_SOUP = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8f).build();
    public static final FoodProperties OATMEAL = new FoodProperties.Builder().nutrition(6).saturationModifier(0.8f).effect(()-> comfort(SHORT_DURATION), 1).build();
    public static final FoodProperties SWEET_BERRY_N_CREAM_OATMEAL = new FoodProperties.Builder().nutrition(10).saturationModifier(0.8f).effect(()-> comfort(SHORT_DURATION), 1).build();
    public static final FoodProperties OAT_SCONE = (new FoodProperties.Builder()).nutrition(10).saturationModifier(1F).build();
    public static final FoodProperties OAT_PANCAKE = (new FoodProperties.Builder()).nutrition(8).saturationModifier(1F).effect(()-> comfort(SHORT_DURATION), 1).build();
    public static final FoodProperties COOKIES = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.1F).fast().build();
    public static final FoodProperties PLAIN_YOGURT = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.5F).build();
    public static final FoodProperties FRUIT_YOGURT = (new FoodProperties.Builder()).nutrition(7).saturationModifier(0.5F).build();
    public static final FoodProperties OATS_N_YOGURT = (new FoodProperties.Builder()).nutrition(10).saturationModifier(1F).build();
    public static final FoodProperties BASIC_HAMBURGER = (new FoodProperties.Builder()).nutrition(4).saturationModifier(1.2F).build();
    public static final FoodProperties CHEESEBURGER = (new FoodProperties.Builder()).nutrition(5).saturationModifier(1F).build();
    public static final FoodProperties BACON_CHEESEBURGER = (new FoodProperties.Builder()).nutrition(6).saturationModifier(1F).build();
    public static final FoodProperties DELUXE_HAMBURGER = (new FoodProperties.Builder()).nutrition(12).saturationModifier(1F).build();
    public static final FoodProperties MEAT_SANDWICH = (new FoodProperties.Builder()).nutrition(10).saturationModifier(1.2F).build();
    public static final FoodProperties BACON_AND_EGG_SANDWICH = (new FoodProperties.Builder()).nutrition(14).saturationModifier(0.8F).effect(()-> comfort(MEDIUM_DURATION), 1).build();
    public static final FoodProperties MINCED_PORK = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.5F).build();
    public static final FoodProperties HOTDOG = (new FoodProperties.Builder()).nutrition(5).saturationModifier(0.8F).build();
    public static final FoodProperties HOTDOG_IN_A_BUN = (new FoodProperties.Builder()).nutrition(10).saturationModifier(0.8F).build();
    public static final FoodProperties BACON_WRAPPED_MEAT = (new FoodProperties.Builder()).nutrition(12).saturationModifier(1.5F).effect(()-> nourishment(MEDIUM_DURATION),1).build();
    public static final FoodProperties BACON_WRAPPED_FISH = (new FoodProperties.Builder()).nutrition(10).saturationModifier(1.5F).effect(()-> nourishment(MEDIUM_DURATION),1).build();






    public FoodValues() {
    }

    public static MobEffectInstance comfort(int duration) {
        return new MobEffectInstance(ModEffects.COMFORT, duration, 0, false, false);
    }

    public static MobEffectInstance nourishment(int duration) {
        return new MobEffectInstance(ModEffects.NOURISHMENT, duration, 0, false, false);
    }
}
