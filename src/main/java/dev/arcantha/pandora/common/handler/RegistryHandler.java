package dev.arcantha.pandora.common.handler;

import dev.arcantha.pandora.client.handler.RenderEntityHandler;
import dev.arcantha.pandora.common.entity.ModEntities;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class RegistryHandler {
    public static void preInitRegistries() {
        ModEntities.registerEntities();
        RenderEntityHandler.registerEntityRenders();
    }
}
