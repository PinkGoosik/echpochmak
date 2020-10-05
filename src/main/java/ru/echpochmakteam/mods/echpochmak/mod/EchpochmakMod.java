package ru.echpochmakteam.mods.echpochmak.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EchpochmakMod implements ModInitializer {
	public static final Item ECHPOCHMAK = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().saturationModifier(6f).hunger(4).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,20*10),1f).build()));
	public static final Item SUPERECHPOCHMAK = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().saturationModifier(12f).hunger(8).build()));
	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("echpochmakmod", "echpochmak"), ECHPOCHMAK);
		Registry.register(Registry.ITEM, new Identifier("echpochmakmod", "superechpochmak"), SUPERECHPOCHMAK);
	}

}
