package net.milkev.morebakedfoods.common;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.milkev.morebakedfoods.common.MoreBakedFoods
mport net.milkev.morebakedfoods.common.MoreBakedFoodsTab
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RegistryHandler {

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreBakedFoods.MOD_ID);


    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());


    }

    public static final RegistryObject<FriedEgg> FRIED_EGG = ITEMS.register("fried_egg", FriedEgg::new);
    public static final RegistryObject<RoastedBeetroot> ROASTED_BEETROOT = ITEMS.register("roasted_beetroot", RoastedBeetroot::new);
    public static final RegistryObject<RoastedCarrot> ROASTED_CARROT = ITEMS.register("roasted_carrot", RoastedCarrot::new);
    public static final RegistryObject<RoastedPumpkin> ROASTED_PUMPKIN = ITEMS.register("roasted_pumpkin", RoastedPumpkin::new);
    public static final RegistryObject<BakedApple> BAKED_APPLE = ITEMS.register("baked_apple", BakedApple::new);

    LOGGER.info("Loading all the Items on Registry Handler");

}

