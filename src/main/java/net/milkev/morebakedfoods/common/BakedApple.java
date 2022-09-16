package net.milkev.morebakedfoods.common;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;


public class BakedApple extends Item {
    public BakedApple() {
        super(new Properties()

                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(5)
                        .saturation(0.625f)
                        .build()
                ));
    }

}