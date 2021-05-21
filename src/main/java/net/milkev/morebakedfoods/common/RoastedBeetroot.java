package net.milkev.morebakedfoods.common;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;


public class RoastedBeetroot extends Item {
    public RoastedBeetroot() {
        super(new Properties()

                .group(ItemGroup.MISC)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(0.375F)
                        .build()
                ));
    }

}