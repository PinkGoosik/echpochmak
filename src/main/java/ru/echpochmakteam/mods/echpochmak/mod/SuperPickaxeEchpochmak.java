package ru.echpochmakteam.mods.echpochmak.mod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class SuperPickaxeEchpochmak extends PickaxeItem {
    protected SuperPickaxeEchpochmak(ToolMaterial toolmaterial_1) {
        super(toolmaterial_1, -1, -2, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
