package vazkii.neat.mixin.mixins.client.compat.ntm;

import com.hbm.render.util.RenderOverhead;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import vazkii.neat.HealthBarRenderer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;

@Mixin(value = RenderOverhead.class,
       priority = 999)
public abstract class RenderOverheadMixin {
    /**
     * @author kotmatross
     * @reason disable name tag rendering above the mob/player, but for hbm
     */
    @Overwrite(remap = false)
    public static boolean shouldRenderTag(EntityLivingBase p_110813_1_) {
        if (p_110813_1_ instanceof EntityPlayer) {
            return Minecraft.isGuiEnabled() && p_110813_1_ != RenderManager.instance.livingPlayer && !HealthBarRenderer.cancelNameTagRenderForPlayer &&
                   !p_110813_1_.isInvisibleToPlayer(Minecraft.getMinecraft().thePlayer) && p_110813_1_.riddenByEntity == null;
        } else {
            return Minecraft.isGuiEnabled() && p_110813_1_ != RenderManager.instance.livingPlayer && !HealthBarRenderer.cancelNameTagRender &&
                   !p_110813_1_.isInvisibleToPlayer(Minecraft.getMinecraft().thePlayer) && p_110813_1_.riddenByEntity == null;
        }
    }
}
