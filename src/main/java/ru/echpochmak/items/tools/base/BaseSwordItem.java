package ru.echpochmak.items.tools.base;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import ru.echpochmak.EchpochmakMod;

public class BaseSwordItem extends SwordItem {
    public BaseSwordItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}