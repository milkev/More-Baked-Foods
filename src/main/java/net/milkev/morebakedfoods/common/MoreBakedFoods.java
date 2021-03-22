package net.milkev.morebakedfoods.common;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MoreBakedFoods implements ModInitializer {


	public static final String MOD_ID = "morebakedfoods";
	public static final String MOD_NAME = "More Baked Foods";

	public static final FoodComponent.Builder FOOD_H_5_0_S_1_0_BUILDER = new FoodComponent.Builder().hunger(4).saturationModifier(1.0f);
	public static final FoodComponent FOOD_H_5_0_S_1_0 = FOOD_H_5_0_S_1_0_BUILDER.build();

	public static final Item BAKED_CARROT = new Item(new FabricItemSettings().food(FOOD_H_5_0_S_1_0).group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "baked_carrot"), BAKED_CARROT);

		System.out.println("More Baked Foods Initialized");
	}



}
