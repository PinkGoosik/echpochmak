package ru.echpochmak;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import ru.echpochmak.items.EchpochmakItems;
import ru.echpochmak.items.tools.EchpochmakTools;
import ru.echpochmak.util.EchpochmakLootTables;

public class EchpochmakMod implements ModInitializer {

	public static final String MODID = "echpochmakmod";

	public static final ItemGroup ECH_ITEMS = FabricItemGroupBuilder.build(
			new Identifier(MODID,"items"),
			()->new ItemStack(EchpochmakItems.ECHPOCHMAK));

	public static final ItemGroup ECH_TOOLS = FabricItemGroupBuilder.build(
			new Identifier(MODID,"tools"),
			()->new ItemStack(EchpochmakTools.ECHPOCHMAK_SWORD));

	@Override
	public void onInitialize() {
		EchpochmakItems.register();
		EchpochmakTools.register();
		EchpochmakLootTables.register();
	}
}
