package ru.echpochmak.items.tools.base;

import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import ru.echpochmak.EchpochmakMod;

public class BaseShovelItem extends ShovelItem {
    public BaseShovelItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
