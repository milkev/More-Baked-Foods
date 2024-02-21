package net.milkev.morebakedfoods.common;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("morebakedfoods")
public class MoreBakedFoods {
	public static final String MOD_ID = "morebakedfoods";


	public MoreBakedFoods() {

		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::setup);

		RegistryHandler.init();
		modEventBus.addListener(this::addCreative);
		MinecraftForge.EVENT_BUS.register(this);

	}

	private void setup(final FMLCommonSetupEvent event) {

	}
	private void doClientStuff(final FMLClientSetupEvent event) {

	}

	private void addCreative(BuildCreativeModeTabContentsEvent event) {
		if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			event.accept(RegistryHandler.FRIED_EGG);
			event.accept(RegistryHandler.ROASTED_BEETROOT);
			event.accept(RegistryHandler.ROASTED_CARROT);
			event.accept(RegistryHandler.ROASTED_PUMPKIN);
		}
	}
}
