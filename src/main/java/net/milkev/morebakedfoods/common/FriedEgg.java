package net.milkev.morebakedfoods.common;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;


public class FriedEgg extends Item {
    public FriedEgg() {
        super(new Properties()


                .food(new FoodProperties.Builder()
                        .nutrition(3)
                        .saturationMod(0.625F)
                        .build()
                ));
    }

}
