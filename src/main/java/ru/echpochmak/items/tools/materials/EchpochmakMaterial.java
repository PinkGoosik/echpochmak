package ru.echpochmak.items.tools.materials;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import ru.echpochmak.items.EchpochmakItems;

public class EchpochmakMaterial implements ToolMaterial {

    public static final EchpochmakMaterial ECHPOCHMAK_MATERIAL = new EchpochmakMaterial();

    @Override
    public int getDurability() {
        return 354;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 5.0f;
    }

    @Override
    public float getAttackDamage() {
        return 5;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 12;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(EchpochmakItems.ECHPOCHMAK);
    }
}
