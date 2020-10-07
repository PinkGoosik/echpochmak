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
	public static final Item ECHPOCHMAK = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().saturationModifier(10f).hunger(14).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,20*5),0.5f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20*5),0.5f).build()));
	public static final Item SUPERECHPOCHMAK = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().saturationModifier(20f).hunger(20).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*60), 1f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20*180, 4),1f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,20*60, 3),1f).build()));
	public static final Item ONION = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().saturationModifier(2f).hunger(1).statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 20*10),1f).build()));
	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("echpochmakmod", "echpochmak"), ECHPOCHMAK);
		Registry.register(Registry.ITEM, new Identifier("echpochmakmod", "superechpochmak"), SUPERECHPOCHMAK);
		Registry.register(Registry.ITEM, new Identifier("echpochmakmod", "onion"), ONION);
		Registry.register(Registry.ITEM, new Identifier("echpochmakmod", "swordechpochmak"), new SwordEchpochmak(new ToolMaterialEchpochmak()));
		Registry.register(Registry.ITEM, new Identifier("echpochmakmod", "pickaxeechpochmak"), new PickaxeEchpochmak(new ToolMaterialEchpochmak()));
		Registry.register(Registry.ITEM, new Identifier("echpochmakmod", "axeechpochmak"), new AxeEchpochmak(new ToolMaterialEchpochmak()));
		Registry.register(Registry.ITEM, new Identifier("echpochmakmod", "shovelechpochmak"), new ShovelEchpochmak(new ToolMaterialEchpochmak()));
		Registry.register(Registry.ITEM, new Identifier("echpochmakmod", "hoeechpochmak"), new HoeEchpochmak(new ToolMaterialEchpochmak()));
		Registry.register(Registry.ITEM, new Identifier("echpochmakmod", "superswordechpochmak"), new SuperSwordEchpochmak(new ToolMaterialSuperEchpochmak()));
		Registry.register(Registry.ITEM, new Identifier("echpochmakmod", "superpickaxeechpochmak"), new SuperPickaxeEchpochmak(new ToolMaterialSuperEchpochmak()));
	}

}
