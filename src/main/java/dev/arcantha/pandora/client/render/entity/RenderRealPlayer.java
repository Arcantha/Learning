package dev.arcantha.pandora.client.render.entity;

import dev.arcantha.pandora.common.entity.EntityRealPlayer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderRealPlayer extends RenderLiving<EntityRealPlayer> {

    private static ResourceLocation realPlayerTexture = new ResourceLocation("pm:texturerealplayer.png");

    public RenderRealPlayer(RenderManager rendermanagerIn, ModelBase modelbaseIn) {
        super(rendermanagerIn, modelbaseIn, 3.0F);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityRealPlayer entity) {
        return realPlayerTexture;
    }

    @Override
    public void doRender(EntityRealPlayer entity, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    @Override
    protected void applyRotations(EntityRealPlayer entity, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entity, p_77043_2_, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityRealPlayer entitylivingbaseIn, float partialTickTime) {
        super.preRenderCallback(entitylivingbaseIn, partialTickTime);
    }

}
