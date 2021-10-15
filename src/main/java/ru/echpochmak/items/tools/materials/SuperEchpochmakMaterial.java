package ru.echpochmak.items.tools.materials;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import ru.echpochmak.items.EchpochmakItems;

public class SuperEchpochmakMaterial implements ToolMaterial {

    public static final SuperEchpochmakMaterial SUPER_ECHPOCHMAK_MATERIAL = new SuperEchpochmakMaterial();

    @Override
    public int getDurability() {
        return 2031;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 9;
    }

    @Override
    public float getAttackDamage() {
        return 7;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 18;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(EchpochmakItems.SUPER_ECHPOCHMAK);
    }
}
