package dev.arcantha.pandora.client.render.entity;

import dev.arcantha.pandora.client.render.model.ModelDirehorse;
import dev.arcantha.pandora.common.entity.EntityDirehorse;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDirehorse extends RenderLiving<EntityDirehorse> {

    public static final ResourceLocation TEXTURES = new ResourceLocation("pm:direhorse.png");

    public RenderDirehorse(RenderManager manager) {
        super(manager, new ModelDirehorse(), 4.0F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityDirehorse entityDirehorse) {
        return TEXTURES;
    }
}
