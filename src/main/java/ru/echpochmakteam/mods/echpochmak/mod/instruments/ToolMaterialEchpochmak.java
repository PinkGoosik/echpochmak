package ru.echpochmakteam.mods.echpochmak.mod.instruments;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import ru.echpochmakteam.mods.echpochmak.mod.EchpochmakMod;

public class ToolMaterialEchpochmak implements ToolMaterial {
    @Override
    public int getDurability() {
        return 169;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 2.0f;
    }

    @Override
    public float getAttackDamage() {
        return 1.0f;
    }

    @Override
    public int getMiningLevel() {
        return 1;
    }

    @Override
    public int getEnchantability() {
        return 2;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(EchpochmakMod.ECHPOCHMAK);
    }
}
