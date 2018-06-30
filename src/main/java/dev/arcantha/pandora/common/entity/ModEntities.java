package dev.arcantha.pandora.common.entity;

import dev.arcantha.pandora.Pandora;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {
    public static void registerEntities() {
        registerEntity("direhorse", EntityDirehorse.class, 120, 50, 11437146, 00000000);
    }

    public static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
        EntityRegistry.registerModEntity(new ResourceLocation("pm:"), entity, name, id, Pandora.instance, range, 1, true, color1, color2);
    }
}
