package net.milkev.morebakedfoods.common;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;


public class RoastedCarrot extends Item {
    public RoastedCarrot() {
        super(new Properties()

                .food(new FoodProperties.Builder()
                        .nutrition(5)
                        .saturationMod(0.5F)
                        .build()
                ));
    }

}
