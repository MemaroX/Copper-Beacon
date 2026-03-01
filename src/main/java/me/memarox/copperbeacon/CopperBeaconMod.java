package me.memarox.copperbeacon;

import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CopperBeaconMod.MODID)
public class CopperBeaconMod {
    public static final String MODID = "copper_beacon";
    private static final Logger LOGGER = LogManager.getLogger();

    public CopperBeaconMod() {
        // No manual registration needed for the main class in FG 7.x/Forge 61.x
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEvents {
        @SubscribeEvent
        public static void setup(final FMLCommonSetupEvent event) {
            LOGGER.info("Copper Beacon Mod Initialized");
        }
    }
}
