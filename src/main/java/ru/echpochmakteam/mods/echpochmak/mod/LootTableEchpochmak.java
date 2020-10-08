package ru.echpochmakteam.mods.echpochmak.mod;
import java.util.List;

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
        FabricLootPoolBuilder SUP_ECH = FabricLootPoolBuilder.builder().rolls(ConstantLootTableRange.create(1)).with(ItemEntry.builder(EchpochmakMod.ECHPOCHMAK)).withCondition(RandomChanceLootCondition.builder(0.031F).build());
        insert(new LootTableInsert(SUP_ECH,new Identifier("minecraft", "chests/simple_dungeon" + "")));
        FabricLootPoolBuilder SUP_ECH1 = FabricLootPoolBuilder.builder().rolls(ConstantLootTableRange.create(1)).with(ItemEntry.builder(EchpochmakMod.ECHPOCHMAK)).withCondition(RandomChanceLootCondition.builder(0.031F).build());
        insert(new LootTableInsert(SUP_ECH1,new Identifier("minecraft", "chests/simple_dungeon" + "")));
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

