package net.milkev.morebakedfoods.common;


import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class RoastedBeetroot extends Item {
    public RoastedBeetroot() {
        super(new Properties()

                .food(new FoodProperties.Builder()
                        .nutrition(4)
                        .saturationMod(0.375F)
                        .build()
                ));
    }

}
