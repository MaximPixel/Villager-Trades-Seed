package net.maximpixel.villagertradesseed.forge;

import dev.architectury.platform.forge.EventBuses;
import net.maximpixel.villagertradesseed.VillagerTradesSeed;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(VillagerTradesSeed.MOD_ID)
public class VillagerTradesSeedForge {
    public VillagerTradesSeedForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(VillagerTradesSeed.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        VillagerTradesSeed.init();
    }
}