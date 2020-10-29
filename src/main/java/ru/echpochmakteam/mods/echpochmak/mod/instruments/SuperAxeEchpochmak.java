package ru.echpochmakteam.mods.echpochmak.mod.instruments;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;
import ru.echpochmakteam.mods.echpochmak.mod.EchpochmakMod;

public class SuperAxeEchpochmak extends AxeItem {
    public SuperAxeEchpochmak(ToolMaterial toolmaterial1) {
        super(toolmaterial1, 0, 0, new Item.Settings().rarity(Rarity.EPIC).group(EchpochmakMod.ECH_GENERAL));
    }
}
