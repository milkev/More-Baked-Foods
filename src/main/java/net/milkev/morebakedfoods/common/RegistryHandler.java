package net.milkev.morebakedfoods.common;

import net.minecraft.world.item.Item;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreBakedFoods.MOD_ID);


    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<FriedEgg> FRIED_EGG = ITEMS.register("fried_egg", FriedEgg::new);
    public static final RegistryObject<RoastedBeetroot> ROASTED_BEETROOT = ITEMS.register("roasted_beetroot", RoastedBeetroot::new);
    public static final RegistryObject<RoastedCarrot> ROASTED_CARROT = ITEMS.register("roasted_carrot", RoastedCarrot::new);
    public static final RegistryObject<RoastedPumpkin> ROASTED_PUMPKIN = ITEMS.register("roasted_pumpkin", RoastedPumpkin::new);

}

