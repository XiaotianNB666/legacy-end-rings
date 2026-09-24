package cn.gcte.legacyendrings;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(LegacyEndRingsNeoforge.MODID)
public class LegacyEndRingsNeoforge {

	public static final String MODID = "legacy_end_rings";

	public static final Logger LOGGER = LogUtils.getLogger();

	@SubscribeEvent
	public void onServerStarting(ServerStartingEvent event) {
		LOGGER.info("LegacyEndRings has been loaded!");
	}
}

