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

	public static final FoodComponent.Builder FOOD_H_5_0_S_4_0_BUILDER = new FoodComponent.Builder().hunger(5).saturationModifier(0.5f);
	public static final FoodComponent FOOD_H_5_0_S_4_0 = FOOD_H_5_0_S_4_0_BUILDER.build();
	public static final FoodComponent.Builder FOOD_H_4_0_S_3_0_BUILDER = new FoodComponent.Builder().hunger(4).saturationModifier(0.375f);
	public static final FoodComponent FOOD_H_4_0_S_3_0 = FOOD_H_4_0_S_3_0_BUILDER.build();
	public static final FoodComponent.Builder FOOD_H_6_0_S_2_0_BUILDER = new FoodComponent.Builder().hunger(6).saturationModifier(0.25f);
	public static final FoodComponent FOOD_6_0_S_2_0 = FOOD_H_6_0_S_2_0_BUILDER.build();

	public static final Item BAKED_CARROT = new Item(new FabricItemSettings().food(FOOD_H_5_0_S_4_0).group(ItemGroup.MISC));
	public static final Item ROASTED_BEETROOT = new Item(new FabricItemSettings().food(FOOD_H_4_0_S_3_0).group(ItemGroup.MISC));
	public static final Item ROASTED_PUMPKIN = new Item(new FabricItemSettings().food(FOOD_6_0_S_2_0).group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "baked_carrot"), BAKED_CARROT);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "roasted_beetroot"), ROASTED_BEETROOT);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "roasted_pumpkin"), ROASTED_PUMPKIN);

		System.out.println("More Baked Foods Initialized");
	}



}
