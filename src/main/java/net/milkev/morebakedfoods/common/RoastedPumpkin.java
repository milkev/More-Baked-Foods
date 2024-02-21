package net.milkev.morebakedfoods.common;


import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class RoastedPumpkin extends Item {
    public RoastedPumpkin() {
        super(new Properties()


                .food(new FoodProperties.Builder()
                        .nutrition(6)
                        .saturationMod(0.25F)
                        .build()
                ));
    }

}
