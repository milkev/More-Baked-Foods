package net.milkev.morebakedfoods.common;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.milkev.morebakedfoods.common.MoreBakedFoodsTab
import net.milkev.morebakedfoods.common.MoreBakedFoods
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class BakedApple extends Item {

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public BakedApple() {
        super(new Properties()

                .group(MoreBakedFoods.MOBFTAB)
                .food(new Food.Builder()
                        .hunger(5)
                        .saturation(0.625f)
                        .build()
                ));
    }
    LOGGER.info("Loading the Baked Apple");

}