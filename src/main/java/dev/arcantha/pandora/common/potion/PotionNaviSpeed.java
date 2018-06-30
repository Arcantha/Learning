package dev.arcantha.pandora.common.potion;

import dev.arcantha.pandora.common.entity.EntityRealPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;

public class PotionNaviSpeed extends Potion {

    public PotionNaviSpeed(boolean isBadEffectIn, int liquidColorIn) {
        super(isBadEffectIn, liquidColorIn);
        setPotionName("navispeed");
        setRegistryName("navispeed");
    }

    @Override
    public void performEffect(EntityLivingBase entityLivingBaseIn, int amplifier) {
        entityLivingBaseIn.motionX = 0.2f;
        entityLivingBaseIn.motionZ = 0.2f;
    }

}
