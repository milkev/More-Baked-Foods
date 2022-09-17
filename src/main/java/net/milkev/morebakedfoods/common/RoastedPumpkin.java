package net.milkev.morebakedfoods.common;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.milkev.morebakedfoods.common.MoreBakedFoodsTab


public class RoastedPumpkin extends Item {
    public RoastedPumpkin() {
        super(new Properties()

                .group(MoreBakedFoods.MOBFTAB)
                .food(new Food.Builder()
                        .hunger(6)
                        .saturation(0.25F)
                        .build()
                ));
    }

}
