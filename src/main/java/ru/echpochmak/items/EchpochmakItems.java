package ru.echpochmak.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import ru.echpochmak.EchpochmakMod;

public class EchpochmakItems {

    public static final Item ECHPOCHMAK = new Item(new FabricItemSettings().group(EchpochmakMod.ECH_ITEMS).food(new FoodComponent.Builder().saturationModifier(10f).hunger(14).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,20*5),0.5f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20*5),0.5f).build()));
    public static final Item SUPER_ECHPOCHMAK = new Item(new FabricItemSettings().rarity(Rarity.EPIC).group(EchpochmakMod.ECH_ITEMS).food(new FoodComponent.Builder().saturationModifier(20f).hunger(20).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*60), 1f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20*180, 4),1f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,20*60, 3),1f).build()));
    public static final Item ONION = new Item(new FabricItemSettings().group(EchpochmakMod.ECH_ITEMS).food(new FoodComponent.Builder().saturationModifier(2f).hunger(1).statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 20*10),1f).build()));

    public static void register() {
        Registry.register(Registry.ITEM, new net.minecraft.util.Identifier(EchpochmakMod.MODID, "echpochmak"), ECHPOCHMAK);
        Registry.register(Registry.ITEM, new net.minecraft.util.Identifier(EchpochmakMod.MODID, "super_echpochmak"), SUPER_ECHPOCHMAK);
        Registry.register(Registry.ITEM, new Identifier(EchpochmakMod.MODID, "onion"), ONION);
    }
}
