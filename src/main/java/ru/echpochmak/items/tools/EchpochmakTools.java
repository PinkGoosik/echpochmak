package ru.echpochmak.items.tools;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import ru.echpochmak.EchpochmakMod;
import ru.echpochmak.items.tools.base.*;
import ru.echpochmak.items.tools.materials.EchpochmakMaterial;
import ru.echpochmak.items.tools.materials.SuperEchpochmakMaterial;

import java.util.LinkedHashMap;
import java.util.Map;

public class EchpochmakTools {
    private static final Map<Identifier, Item> TOOLITEMS = new LinkedHashMap<>();

    public static final ToolItem ECHPOCHMAK_SWORD = add("echpochmak_sword", new BaseSwordItem(EchpochmakMaterial.ECHPOCHMAK_MATERIAL, 0, -2.2f, settings()));
    public static final ToolItem ECHPOCHMAK_PICKAXE = add("echpochmak_pickaxe", new BasePickaxeItem(EchpochmakMaterial.ECHPOCHMAK_MATERIAL, 0, -2.2f, settings()));
    public static final ToolItem ECHPOCHMAK_AXE = add("echpochmak_axe", new BaseAxeItem(EchpochmakMaterial.ECHPOCHMAK_MATERIAL, 0, -2.2f, settings()));
    public static final ToolItem ECHPOCHMAK_SHOVEL = add("echpochmak_shovel", new BaseShovelItem(EchpochmakMaterial.ECHPOCHMAK_MATERIAL, 0, -2.2f, settings()));
    public static final ToolItem ECHPOCHMAK_HOE = add("echpochmak_hoe", new BaseHoeItem(EchpochmakMaterial.ECHPOCHMAK_MATERIAL, 0, -2.2f, settings()));

    public static final ToolItem SUPER_ECHPOCHMAK_SWORD = add("super_echpochmak_sword", new BaseSwordItem(SuperEchpochmakMaterial.SUPER_ECHPOCHMAK_MATERIAL, 0, -2.1f, settings().rarity(Rarity.EPIC)));
    public static final ToolItem SUPER_ECHPOCHMAK_PICKAXE = add("super_echpochmak_pickaxe", new BasePickaxeItem(SuperEchpochmakMaterial.SUPER_ECHPOCHMAK_MATERIAL, -2, -2.5f, settings().rarity(Rarity.EPIC)));
    public static final ToolItem SUPER_ECHPOCHMAK_AXE = add("super_echpochmak_axe", new BaseAxeItem(SuperEchpochmakMaterial.SUPER_ECHPOCHMAK_MATERIAL, 2, -2.7f, settings()));
    public static final ToolItem SUPER_ECHPOCHMAK_SHOVEL = add("super_echpochmak_shovel", new BaseShovelItem(SuperEchpochmakMaterial.SUPER_ECHPOCHMAK_MATERIAL, (int) -1.5f, -2.7f, settings().rarity(Rarity.EPIC)));
    public static final ToolItem SUPER_ECHPOCHMAK_HOE = add("super_echpochmak_hoe", new BaseHoeItem(SuperEchpochmakMaterial.SUPER_ECHPOCHMAK_MATERIAL,  -6, 0.3f, settings().rarity(Rarity.EPIC)));

    private static <I extends ToolItem> I add(String name, I item) {
        TOOLITEMS.put(new Identifier(EchpochmakMod.MODID, name), item);
        return item;
    }

    private static FabricItemSettings settings(){
        return new FabricItemSettings().group(EchpochmakMod.ECH_TOOLS);
    }

    public static void register() {
        for (Identifier id : TOOLITEMS.keySet()) {
            Registry.register(Registry.ITEM, id, TOOLITEMS.get(id));
        }
    }
}
