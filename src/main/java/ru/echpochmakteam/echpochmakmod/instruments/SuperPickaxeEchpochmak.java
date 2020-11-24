package ru.echpochmakteam.echpochmakmod.instruments;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Rarity;
import ru.echpochmakteam.echpochmakmod.EchpochmakMod;

public class SuperPickaxeEchpochmak extends PickaxeItem {
    public SuperPickaxeEchpochmak(ToolMaterial toolmaterial_1) {
        super(toolmaterial_1, -1, -2, new Item.Settings().rarity(Rarity.EPIC).group(EchpochmakMod.ECH_GENERAL));
    }
}
