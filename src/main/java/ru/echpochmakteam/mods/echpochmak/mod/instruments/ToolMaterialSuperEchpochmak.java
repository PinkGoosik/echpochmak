package ru.echpochmakteam.mods.echpochmak.mod.instruments;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import ru.echpochmakteam.mods.echpochmak.mod.EchpochmakMod;

public class ToolMaterialSuperEchpochmak implements ToolMaterial {
    @Override
    public int getDurability() {
        return 2031;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 12f;
    }

    @Override
    public float getAttackDamage() {
        return 8f;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(EchpochmakMod.SUPERECHPOCHMAK);
    }
}
