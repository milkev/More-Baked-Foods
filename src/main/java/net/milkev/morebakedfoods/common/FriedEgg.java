package net.milkev.morebakedfoods.common;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;


public class FriedEgg extends Item {
    public FriedEgg() {
        super(new Properties()

                .group(ItemGroup.MISC)
                .food(new Food.Builder()
                        .hunger(3)
                        .saturation(0.625F)
                        .build()
                ));
    }

}
