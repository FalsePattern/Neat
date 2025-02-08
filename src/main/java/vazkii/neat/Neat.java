package vazkii.neat;

import vazkii.neat.config.NeatConfig;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.FMLLaunchHandler;

@Mod(modid = Tags.MOD_ID,
     name = Tags.MOD_NAME,
     version = Tags.MOD_VERSION,
     guiFactory = Tags.ROOT_PKG + ".config.NeatGuiConfigFactory")
public class Neat {
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        NeatConfig.init();
        boolean client = FMLLaunchHandler.side().isClient();
        if (client) {
            MinecraftForge.EVENT_BUS.register(new HealthBarRenderer());
        }
    }


}
