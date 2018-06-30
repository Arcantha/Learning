package dev.arcantha.pandora.client.handler;

import dev.arcantha.pandora.client.render.entity.RenderDirehorse;
import dev.arcantha.pandora.common.entity.EntityDirehorse;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderEntityHandler {
    public static void registerEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityDirehorse.class, new IRenderFactory<EntityDirehorse>() {
            @Override
            public Render<? super EntityDirehorse> createRenderFor(RenderManager manager) {
                return new RenderDirehorse(manager);
            }
        });
    }
}
