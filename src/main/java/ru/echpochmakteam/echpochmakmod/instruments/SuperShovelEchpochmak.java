package ru.echpochmakteam.echpochmakmod.instruments;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;
import ru.echpochmakteam.echpochmakmod.EchpochmakMod;

public class SuperShovelEchpochmak extends ShovelItem {
    public SuperShovelEchpochmak(ToolMaterial toolmaterial1) {
        super(toolmaterial1, 0, 0, new Item.Settings().rarity(Rarity.EPIC).group(EchpochmakMod.ECH_GENERAL));
    }
}
