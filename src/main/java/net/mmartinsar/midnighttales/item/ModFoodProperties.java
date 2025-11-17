package net.mmartinsar.midnighttales.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties CANDY_CORN = new FoodProperties.Builder().nutrition(5).saturationModifier(1).build();
    public static final FoodProperties CHOCOLATE_CANDY = new FoodProperties.Builder().nutrition(2).saturationModifier(0.25f).build();
    public static final FoodProperties TURNIP = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f).build();
}
