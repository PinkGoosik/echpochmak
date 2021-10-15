package ru.echpochmak.items.tools.base;

import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import ru.echpochmak.EchpochmakMod;

public class BaseHoeItem extends HoeItem {
    public BaseHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
