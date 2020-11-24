package ru.echpochmakteam.echpochmakmod.instruments;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import ru.echpochmakteam.echpochmakmod.EchpochmakMod;

public class PickaxeEchpochmak extends PickaxeItem {
    public PickaxeEchpochmak(ToolMaterial toolmaterial_1) {
        super(toolmaterial_1, 0, 1, new Item.Settings().group(EchpochmakMod.ECH_GENERAL));
    }
}
