package dev.arcantha.pandora.client.handler;

import dev.arcantha.pandora.client.render.entity.RenderRealPlayer;
import dev.arcantha.pandora.client.render.model.ModelRealPlayer;
import dev.arcantha.pandora.common.entity.EntityRealPlayer;
import net.ilexiconn.llibrary.client.event.PlayerModelEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@Mod.EventBusSubscriber
public class RenderHandler {
    @SubscribeEvent
    public static void onPlayerRender(RenderPlayerEvent.Pre event) {
        if (event.getEntity() instanceof EntityPlayer) {
            event.setCanceled(true);
        }
        RenderRealPlayer renderRealPlayer = new RenderRealPlayer(Minecraft.getMinecraft().getRenderManager(), new ModelRealPlayer());
        EntityRealPlayer player = new EntityRealPlayer(Minecraft.getMinecraft().world);
        renderRealPlayer.doRender(player, 0, 0, 0, 0.5f , event.getPartialRenderTick());
    }

    @SubscribeEvent
    public void onJump(LivingEvent.LivingJumpEvent event) {
        if (event.getEntity() instanceof EntityPlayer) {
            event.getEntity().motionY *= 1.75;
        }
    }
    @SubscribeEvent
    public void onFall(LivingFallEvent event) {
        if (event.getEntity() instanceof  EntityPlayer) {
            event.setDistance(10f);
            event.setDamageMultiplier(-0.1f);
        }
    }
    @SubscribeEvent
    public void onMove(LivingEvent.LivingUpdateEvent event) {
        if (event.getEntity() instanceof EntityPlayer) {

        }
    }
}
