package net.maximpixel.villagertradesseed.fabric;

import net.maximpixel.villagertradesseed.VillagerTradesSeed;
import net.fabricmc.api.ModInitializer;

public class VillagerTradesSeedFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        VillagerTradesSeed.init();
    }
}