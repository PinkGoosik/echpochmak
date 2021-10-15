package ru.echpochmak.items.tools.base;

import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import ru.echpochmak.EchpochmakMod;

public class BasePickaxeItem extends PickaxeItem {
    public BasePickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
