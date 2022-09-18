package net.milkev.morebakedfoods.common;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.milkev.morebakedfoods.common.MoreBakedFoodsTab
import net.milkev.morebakedfoods.common.MoreBakedFoods
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.milkev.morebakedfoods.common.MoreBakedFoods


public class RoastedBeetroot extends Item {

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public RoastedBeetroot() {
        super(new Properties()

                .group(MoreBakedFoods.MOBFTAB)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(0.375F)
                        .build()
                ));
    }

    LOGGER.info("Loading the RoastedBeetroot");

}
