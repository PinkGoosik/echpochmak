package ru.echpochmakteam.mods.echpochmak.mod;
import java.util.List;

import net.minecraft.loot.function.LootFunction;
import org.apache.commons.lang3.ArrayUtils;

import com.google.common.collect.Lists;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootSupplierBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.ConstantLootTableRange;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;


public class LootTableEchpochmak {

    private static final List<LootTableInsert> INSERTS = Lists.newArrayList();

    public static void init() {
        FabricLootPoolBuilder SUP_ECH = FabricLootPoolBuilder.builder().rolls(ConstantLootTableRange.create(1)).with(ItemEntry.builder(EchpochmakMod.SUPERECHPOCHMAK)).withCondition(RandomChanceLootCondition.builder(0.031F).build());
        insert(new LootTableInsert(SUP_ECH,new Identifier("minecraft", "chests/simple_dungeon" + "")));
        FabricLootPoolBuilder SUP_ECH1 = FabricLootPoolBuilder.builder().rolls(ConstantLootTableRange.create(1)).with(ItemEntry.builder(EchpochmakMod.SUPERECHPOCHMAK)).withCondition(RandomChanceLootCondition.builder(0.026F).build());
        insert(new LootTableInsert(SUP_ECH1,new Identifier("minecraft", "chests/desert_pyramid" + "")));
        FabricLootPoolBuilder SUP_ECH2 = FabricLootPoolBuilder.builder().rolls(ConstantLootTableRange.create(1)).with(ItemEntry.builder(EchpochmakMod.SUPERECHPOCHMAK)).withCondition(RandomChanceLootCondition.builder(0.014F).build());
        insert(new LootTableInsert(SUP_ECH2,new Identifier("minecraft", "chests/abandoned_mineshaft" + "")));
        FabricLootPoolBuilder SUP_ECH3 = FabricLootPoolBuilder.builder().rolls(ConstantLootTableRange.create(1)).with(ItemEntry.builder(EchpochmakMod.SUPERECHPOCHMAK)).withCondition(RandomChanceLootCondition.builder(0.031F).build());
        insert(new LootTableInsert(SUP_ECH3,new Identifier("minecraft", "chests/woodland_mansion" + "")));

        FabricLootPoolBuilder ONION = FabricLootPoolBuilder.builder().rolls(ConstantLootTableRange.create(1)).with(ItemEntry.builder(EchpochmakMod.ONION)).withCondition(RandomChanceLootCondition.builder(0.341F).build());
        insert(new LootTableInsert(ONION,new Identifier("minecraft", "chests/simple_dungeon" + "")));

        FabricLootPoolBuilder ONION1 = FabricLootPoolBuilder.builder().rolls(ConstantLootTableRange.create(1)).with(ItemEntry.builder(EchpochmakMod.ONION)).withCondition(RandomChanceLootCondition.builder(0.031F).build());
        insert(new LootTableInsert(ONION1,new Identifier("minecraft", "chests/woodland_mansion" + "")));

        FabricLootPoolBuilder ONION2 = FabricLootPoolBuilder.builder().rolls(ConstantLootTableRange.create(1)).with(ItemEntry.builder(EchpochmakMod.ONION)).withCondition(RandomChanceLootCondition.builder(0.3346F).build());
        insert(new LootTableInsert(ONION2,new Identifier("minecraft", "chests/stronghold_corridor" + "")));
        insert(new LootTableInsert(ONION2,new Identifier("minecraft", "chests/stronghold_corridor" + "")));
        insert(new LootTableInsert(ONION2,new Identifier("minecraft", "chests/stronghold_corridor" + "")));

        FabricLootPoolBuilder ONION3 = FabricLootPoolBuilder.builder().rolls(ConstantLootTableRange.create(1)).with(ItemEntry.builder(EchpochmakMod.ONION)).withCondition(RandomChanceLootCondition.builder(0.4754F).build());
        insert(new LootTableInsert(ONION3,new Identifier("minecraft", "chests/stronghold_crossing" + "")));
        insert(new LootTableInsert(ONION3,new Identifier("minecraft", "chests/stronghold_crossing" + "")));
        insert(new LootTableInsert(ONION3,new Identifier("minecraft", "chests/stronghold_crossing" + "")));

        FabricLootPoolBuilder ONION4 = FabricLootPoolBuilder.builder().rolls(ConstantLootTableRange.create(1)).with(ItemEntry.builder(EchpochmakMod.ONION)).withCondition(RandomChanceLootCondition.builder(0.37F).build());
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_weaponsmith" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_weaponsmith" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_weaponsmith" + "")));

        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_toolsmith" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_toolsmith" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_toolsmith" + "")));

        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_armorer" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_armorer" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_armorer" + "")));

        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_butcher" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_butcher" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_butcher" + "")));

        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_butcher" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_butcher" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_butcher" + "")));

        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_cartographer" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_cartographer" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_cartographer" + "")));

        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_snowy_house" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_snowy_house" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_snowy_house" + "")));

        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_taiga_house" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_taiga_house" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_taiga_house" + "")));

        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_mason" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_mason" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_mason" + "")));

        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_fisher" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_fisher" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_fisher" + "")));

        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_fletcher" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_fletcher" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_fletcher" + "")));

        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_plains_house" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_plains_house" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_plains_house" + "")));

        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_shepherd" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_shepherd" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_shepherd" + "")));

        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_tannery" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_tannery" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_tannery" + "")));

        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_temple" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_temple" + "")));
        insert(new LootTableInsert(ONION4,new Identifier("minecraft", "chests/village/village_temple" + "")));

        FabricLootPoolBuilder ONION5 = FabricLootPoolBuilder.builder().rolls(ConstantLootTableRange.create(1)).with(ItemEntry.builder(EchpochmakMod.ONION)).withCondition(RandomChanceLootCondition.builder(0.025F).build());
        insert(new LootTableInsert(ONION5,new Identifier("minecraft", "chests/entities/zombie" + "")));

        LootTableLoadingCallback.EVENT.register(((resourceManager, lootManager, identifier, supplier, lootTableSetter) -> {
            INSERTS.forEach(i -> {if (ArrayUtils.contains(i.tables, identifier)) {i.insert(supplier);
                }
            });
        }));
    }
    public static void insert(LootTableInsert insert) {
        INSERTS.add(insert);
    }
    public static class LootTableInsert {
        public final Identifier[] tables;
        public final FabricLootPoolBuilder lootPool;

        public LootTableInsert(FabricLootPoolBuilder lootPool, Identifier... tables) {
            this.tables = tables;
            this.lootPool = lootPool;
        }
        public void insert(FabricLootSupplierBuilder supplier) {
            supplier.pool(lootPool);
        }
    }
}