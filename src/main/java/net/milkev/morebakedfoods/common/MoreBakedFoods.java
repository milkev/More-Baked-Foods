package net.milkev.morebakedfoods.common;

import net.milkev.morebakedfoods.common.RegistryHandler
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
package net.milkev.morebakedfoods.common.MoreBakedFoodsTab;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MoreBakedFoods.MOD_ID)
public class MoreBakedFoods {
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
	
	public static final String MOD_ID = "morebakedfoods";

	public static final ItemGroup MOBFTAB = new MoreBakedFoodsTab();


	public MoreBakedFoods() {

		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::setup);

		RegistryHandler.init();

		MinecraftForge.EVENT_BUS.register(this);

	}

	private void setup(final FMLCommonSetupEvent event) {

	}
	private void doClientStuff(final FMLClientSetupEvent event) {

	}

}
