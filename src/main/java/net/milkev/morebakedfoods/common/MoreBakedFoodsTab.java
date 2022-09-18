package net.milkev.morebakedfoods.common;


import net.milkev.morebakedfoods.common.FriedEgg
import net.milkev.morebakedfoods.common.MoreBakedFoods
import net.milkev.morebakedfoods.common.RegistryHandler
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.milkev.morebakedfoods.common.MoreBakedFoods
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.milkev.morebakedfoods.common.MoreBakedFoods

public class MoreBakedFoodsTab extends ItemGroup {
    public MoreBakedFoodsTab() {
        super("morebakedfoodsitemstab");
    }

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    
    @Override
    public ItemStack createIcon() {
        return new ItemStack(RegistryHandler.FRIED_EGG.get());
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }
    LOGGER.info("Loading The Food Tab");

}