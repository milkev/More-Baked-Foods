package net.milkev.morebakedfoods.common;


import net.milkev.morebakedfoods.common.FriedEgg
import net.milkev.morebakedfoods.common.MoreBakedFoods
import net.milkev.morebakedfoods.common.RegistryHandler
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MoreBakedFoodsTab extends ItemGroup {
    public MoreBakedFoodsTab() {
        super("morebackedfoodtab");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(RegistryHandler.FRIED_EGG.get());
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }

}