package ru.echpochmakteam.mods.echpochmak.mod;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class SuperAxeEchpochmak extends AxeItem {
    public SuperAxeEchpochmak(ToolMaterial toolmaterial1) {
        super(toolmaterial1, 0, 0, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
