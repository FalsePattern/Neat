package vazkii.neat.config;

import com.falsepattern.lib.config.ConfigException;
import com.falsepattern.lib.config.SimpleGuiConfig;
import vazkii.neat.Tags;

import net.minecraft.client.gui.GuiScreen;

public class NeatGuiConfig extends SimpleGuiConfig {
    public NeatGuiConfig(GuiScreen parent) throws ConfigException {
        super(parent, NeatConfig.class, Tags.MOD_ID, Tags.MOD_NAME);
    }
}
