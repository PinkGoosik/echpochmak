package ru.echpochmak.items.tools.base;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import ru.echpochmak.EchpochmakMod;

public class BaseAxeItem extends AxeItem {
    public BaseAxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
