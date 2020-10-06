package ru.echpochmakteam.mods.echpochmak.mod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class ShovelEchpochmak extends ShovelItem {
    public ShovelEchpochmak(ToolMaterial toolmaterial_1) {
        super(toolmaterial_1, 0, 0, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
