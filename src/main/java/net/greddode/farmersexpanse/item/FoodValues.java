package net.greddode.farmersexpanse.item;

import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class FoodValues {
    public static final int BRIEF_DURATION = 600;
    public static final int SHORT_DURATION = 1200;
    public static final int MEDIUM_DURATION = 3600;
    public static final int LONG_DURATION = 6000;
    public static final FoodProperties CHICKEN_NUGGET = (new FoodProperties.Builder()).nutrition(3).saturationModifier(0.5F).fast().build();
    public static final FoodProperties ENERGY_DRINK = new FoodProperties.Builder().nutrition(0).saturationModifier(0).effect(()-> new MobEffectInstance(MobEffects.GLOWING, BRIEF_DURATION), 1).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, BRIEF_DURATION), 1).build();
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

    public FoodValues() {
    }

    public static MobEffectInstance comfort(int duration) {
        return new MobEffectInstance(ModEffects.COMFORT, duration, 0, false, false);
    }

    public static MobEffectInstance nourishment(int duration) {
        return new MobEffectInstance(ModEffects.NOURISHMENT, duration, 0, false, false);
    }
}
