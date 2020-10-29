package ru.echpochmakteam.mods.echpochmak.mod.instruments;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;
import ru.echpochmakteam.mods.echpochmak.mod.EchpochmakMod;

public class SuperSwordEchpochmak extends SwordItem {
    public SuperSwordEchpochmak(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, 1, -2, new Item.Settings().rarity(Rarity.EPIC).group(EchpochmakMod.ECH_GENERAL));
    }
}
