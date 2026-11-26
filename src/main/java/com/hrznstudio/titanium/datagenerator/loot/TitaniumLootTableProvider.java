/*
 * This file is part of Titanium
 * Copyright (C) 2026, Horizon Studio <contact@hrznstudio.com>.
 *
 * This code is licensed under GNU Lesser General Public License v3.0, the full license text can be found in LICENSE.txt
 */

package com.hrznstudio.titanium.datagenerator.loot;

import com.hrznstudio.titanium.datagenerator.loot.block.BasicBlockLootTables;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class TitaniumLootTableProvider extends LootTableProvider {
    private final Supplier<List<Block>> blocksToProcess;

    public TitaniumLootTableProvider(DataGenerator dataGenerator, Supplier<List<Block>> blocks, CompletableFuture<HolderLookup.Provider> providerCompletableFuture) {
        this(blocks);
    }

    public TitaniumLootTableProvider(Supplier<List<Block>> blocks) {
        super(java.util.Set.of(), java.util.List.of());
        this.blocksToProcess = blocks;
    }

    public List<SubProviderEntry> getTables() {
        return Collections.singletonList(
            new SubProviderEntry(this::createBlockLootTables, LootContextParamSets.BLOCK)
        );
    }

    protected BasicBlockLootTables createBlockLootTables(net.minecraft.data.loot.LootTableSubProvider.Context context) {
        return new BasicBlockLootTables(blocksToProcess, context);
    }

    @Override
    public void run(net.minecraft.data.worldgen.BootstrapContext<LootTable> context) {
        new LootTableProvider(java.util.Set.of(), getTables()).run(context);
    }
}
