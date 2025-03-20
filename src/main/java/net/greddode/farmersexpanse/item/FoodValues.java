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
    public static final FoodProperties CHICKEN_NUGGET = (new FoodProperties.Builder()).nutrition(3).saturationModifier(1.2F).fast().build();
    public static final FoodProperties ENERGY_DRINK = new FoodProperties.Builder().nutrition(0).saturationModifier(0).effect(()-> new MobEffectInstance(MobEffects.GLOWING, BRIEF_DURATION), 1).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, BRIEF_DURATION), 1).build();
    public static final FoodProperties STEW = new FoodProperties.Builder().nutrition(15).saturationModifier(1.2f).effect(()-> nourishment(LONG_DURATION), 1).build();

    public FoodValues() {
    }

    public static MobEffectInstance comfort(int duration) {
        return new MobEffectInstance(ModEffects.COMFORT, duration, 0, false, false);
    }

    public static MobEffectInstance nourishment(int duration) {
        return new MobEffectInstance(ModEffects.NOURISHMENT, duration, 0, false, false);
    }
}
