package net.milkev.morebakedfoods.common;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;


public class RoastedPumpkin extends Item {
    public RoastedPumpkin() {
        super(new Properties()

                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(6)
                        .saturation(0.25F)
                        .build()
                ));
    }

}
