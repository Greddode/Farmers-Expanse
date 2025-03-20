package net.greddode.farmersexpanse.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties CHICKEN_NUGGET = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(1.5f)
            .fast()
            .build();
    public static final FoodProperties ENERGY_DRINK = new FoodProperties.Builder()
            .nutrition(0)
            .saturationModifier(0)
            .effect(()-> new MobEffectInstance(MobEffects.GLOWING, 200), 1)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 1)
            .build();
}
