package dev.arcantha.pandora.client.render.model;

import dev.arcantha.pandora.common.entity.EntityRealPlayer;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelPlayerThree - Arcantha
 * Created using Tabula 7.0.0
 */
public class ModelRealPlayer extends AdvancedModelBase {
    public AdvancedModelRenderer Body;
    public AdvancedModelRenderer RightLegJoint;
    public AdvancedModelRenderer LeftLegJoint;
    public AdvancedModelRenderer Torso;
    public AdvancedModelRenderer Tail1;
    public AdvancedModelRenderer RightLegThigh;
    public AdvancedModelRenderer RightLegKnee;
    public AdvancedModelRenderer RightLeg;
    public AdvancedModelRenderer RightFoot;
    public AdvancedModelRenderer LeftLegThigh;
    public AdvancedModelRenderer LeftLegKnee;
    public AdvancedModelRenderer LeftLeg;
    public AdvancedModelRenderer LeftFoot;
    public AdvancedModelRenderer Torso2;
    public AdvancedModelRenderer Chest;
    public AdvancedModelRenderer LeftArmJoint;
    public AdvancedModelRenderer RightArmJoint;
    public AdvancedModelRenderer Neck;
    public AdvancedModelRenderer LeftBicep;
    public AdvancedModelRenderer LeftArmJoint2;
    public AdvancedModelRenderer LeftTricep;
    public AdvancedModelRenderer LeftHand;
    public AdvancedModelRenderer RightBicep;
    public AdvancedModelRenderer RightArmJoint2;
    public AdvancedModelRenderer RightTricep;
    public AdvancedModelRenderer RightHand;
    public AdvancedModelRenderer Head;
    public AdvancedModelRenderer Hair1;
    public AdvancedModelRenderer EarRight;
    public AdvancedModelRenderer EarLeft;
    public AdvancedModelRenderer Nose;
    public AdvancedModelRenderer Hair2;
    public AdvancedModelRenderer Hair3;
    public AdvancedModelRenderer Hair4;
    public AdvancedModelRenderer Hair5;
    public AdvancedModelRenderer Tail2;
    public AdvancedModelRenderer Tail3;
    public AdvancedModelRenderer Tail4;

    public ModelRealPlayer() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.EarLeft = new AdvancedModelRenderer(this, 0, 0);
        this.EarLeft.setRotationPoint(5.5F, 0.3F, 3.5F);
        this.EarLeft.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(EarLeft, -0.136659280431156F, 0.0F, 0.045553093477052F);
        this.LeftArmJoint2 = new AdvancedModelRenderer(this, 0, 0);
        this.LeftArmJoint2.setRotationPoint(0.0F, 6.5F, 0.0F);
        this.LeftArmJoint2.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(LeftArmJoint2, 0.0F, 0.0F, -0.045553093477052F);
        this.LeftHand = new AdvancedModelRenderer(this, 0, 0);
        this.LeftHand.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.LeftHand.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(LeftHand, -0.091106186954104F, 0.0F, -0.045553093477052F);
        this.RightLegThigh = new AdvancedModelRenderer(this, 0, 0);
        this.RightLegThigh.setRotationPoint(-0.5F, 3.0F, 0.3F);
        this.RightLegThigh.addBox(0.0F, 0.0F, 0.0F, 4, 12, 5, 0.0F);
        this.setRotateAngle(RightLegThigh, -0.045553093477052F, 0.0F, 0.0F);
        this.Hair4 = new AdvancedModelRenderer(this, 0, 0);
        this.Hair4.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.Hair4.addBox(0.0F, 0.0F, 0.0F, 2, 6, 1, 0.0F);
        this.setRotateAngle(Hair4, -0.136659280431156F, 0.0F, 0.0F);
        this.Hair5 = new AdvancedModelRenderer(this, 0, 0);
        this.Hair5.setRotationPoint(0.5F, 5.5F, 0.0F);
        this.Hair5.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.RightTricep = new AdvancedModelRenderer(this, 0, 0);
        this.RightTricep.setRotationPoint(0.5F, 2.5F, 0.5F);
        this.RightTricep.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(RightTricep, -0.136659280431156F, 0.0F, 0.0F);
        this.RightLegJoint = new AdvancedModelRenderer(this, 0, 0);
        this.RightLegJoint.setRotationPoint(-1.3F, 3.5F, -0.2F);
        this.RightLegJoint.addBox(0.0F, 0.0F, 0.0F, 4, 4, 5, 0.0F);
        this.setRotateAngle(RightLegJoint, 0.0F, 0.0F, 0.045553093477052F);
        this.LeftTricep = new AdvancedModelRenderer(this, 0, 0);
        this.LeftTricep.setRotationPoint(0.5F, 2.5F, 0.5F);
        this.LeftTricep.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(LeftTricep, -0.136659280431156F, 0.0F, 0.0F);
        this.RightLeg = new AdvancedModelRenderer(this, 0, 0);
        this.RightLeg.setRotationPoint(0.5F, 3.5F, 1.5F);
        this.RightLeg.addBox(0.0F, 0.0F, 0.0F, 3, 12, 4, 0.0F);
        this.RightFoot = new AdvancedModelRenderer(this, 0, 0);
        this.RightFoot.setRotationPoint(-0.5F, 10.0F, -4.0F);
        this.RightFoot.addBox(0.0F, 0.0F, 0.0F, 4, 3, 9, 0.0F);
        this.setRotateAngle(RightFoot, 0.136659280431156F, 0.0F, 0.0F);
        this.LeftLegKnee = new AdvancedModelRenderer(this, 0, 0);
        this.LeftLegKnee.setRotationPoint(0.5F, 11.0F, -0.5F);
        this.LeftLegKnee.addBox(0.0F, 0.0F, 0.0F, 4, 4, 5, 0.0F);
        this.setRotateAngle(LeftLegKnee, 0.045553093477052F, 0.0F, 0.0F);
        this.Hair1 = new AdvancedModelRenderer(this, 0, 0);
        this.Hair1.setRotationPoint(-0.5F, -0.5F, 1.5F);
        this.Hair1.addBox(0.0F, 0.0F, 0.0F, 6, 6, 5, 0.0F);
        this.LeftBicep = new AdvancedModelRenderer(this, 0, 0);
        this.LeftBicep.setRotationPoint(0.0F, 3.0F, 0.5F);
        this.LeftBicep.addBox(0.0F, 0.0F, 0.0F, 3, 7, 3, 0.0F);
        this.setRotateAngle(LeftBicep, 0.0F, 0.0F, 0.06981317007977318F);
        this.Torso = new AdvancedModelRenderer(this, 0, 0);
        this.Torso.setRotationPoint(-0.5F, -4.5F, 0.3F);
        this.Torso.addBox(0.0F, 0.0F, 0.0F, 6, 5, 4, 0.0F);
        this.Torso2 = new AdvancedModelRenderer(this, 0, 0);
        this.Torso2.setRotationPoint(-1.0F, -2.5F, -0.2F);
        this.Torso2.addBox(0.0F, 0.0F, 0.0F, 8, 3, 5, 0.0F);
        this.Neck = new AdvancedModelRenderer(this, 0, 0);
        this.Neck.setRotationPoint(3.0F, -3.5F, 2.0F);
        this.Neck.addBox(0.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F);
        this.RightArmJoint2 = new AdvancedModelRenderer(this, 0, 0);
        this.RightArmJoint2.setRotationPoint(0.0F, 6.5F, 0.0F);
        this.RightArmJoint2.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(RightArmJoint2, 0.0F, 0.0F, -0.045553093477052F);
        this.LeftLeg = new AdvancedModelRenderer(this, 0, 0);
        this.LeftLeg.setRotationPoint(0.5F, 3.5F, 1.5F);
        this.LeftLeg.addBox(0.0F, 0.0F, 0.0F, 3, 12, 4, 0.0F);
        this.Body = new AdvancedModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(-2.5F, -8.0F, 0.0F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 5, 4, 4, 0.0F);
        this.LeftFoot = new AdvancedModelRenderer(this, 0, 0);
        this.LeftFoot.setRotationPoint(-0.5F, 10.0F, -4.0F);
        this.LeftFoot.addBox(0.0F, 0.0F, 0.0F, 4, 3, 9, 0.0F);
        this.setRotateAngle(LeftFoot, 0.136659280431156F, 0.0F, 0.0F);
        this.Nose = new AdvancedModelRenderer(this, 0, 0);
        this.Nose.setRotationPoint(2.0F, 2.5F, -0.5F);
        this.Nose.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Nose, -0.091106186954104F, 0.0F, 0.0F);
        this.RightHand = new AdvancedModelRenderer(this, 0, 0);
        this.RightHand.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.RightHand.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(RightHand, -0.091106186954104F, 0.0F, 0.045553093477052F);
        this.Hair2 = new AdvancedModelRenderer(this, 0, 0);
        this.Hair2.setRotationPoint(1.5F, 3.5F, 2.7F);
        this.Hair2.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.LeftLegJoint = new AdvancedModelRenderer(this, 0, 0);
        this.LeftLegJoint.setRotationPoint(2.3F, 3.5F, -0.2F);
        this.LeftLegJoint.addBox(0.0F, 0.0F, 0.0F, 4, 4, 5, 0.0F);
        this.setRotateAngle(LeftLegJoint, 0.0F, 0.0F, -0.045553093477052F);
        this.Chest = new AdvancedModelRenderer(this, 0, 0);
        this.Chest.setRotationPoint(-0.5F, -4.5F, -1.0F);
        this.Chest.addBox(0.0F, 0.0F, 0.0F, 9, 5, 7, 0.0F);
        this.LeftArmJoint = new AdvancedModelRenderer(this, 0, 0);
        this.LeftArmJoint.setRotationPoint(-3.0F, 0.5F, 1.0F);
        this.LeftArmJoint.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        this.Tail2 = new AdvancedModelRenderer(this, 0, 0);
        this.Tail2.setRotationPoint(0.5F, 2.0F, 2.5F);
        this.Tail2.addBox(0.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F);
        this.setRotateAngle(Tail2, 0.22759093446006054F, 0.0F, 0.0F);
        this.Tail3 = new AdvancedModelRenderer(this, 0, 0);
        this.Tail3.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.Tail3.addBox(0.0F, 0.0F, 0.0F, 2, 6, 1, 0.0F);
        this.setRotateAngle(Tail3, -0.091106186954104F, 0.0F, 0.0F);
        this.LeftLegThigh = new AdvancedModelRenderer(this, 0, 0);
        this.LeftLegThigh.setRotationPoint(0.5F, 3.0F, 0.3F);
        this.LeftLegThigh.addBox(0.0F, 0.0F, 0.0F, 4, 12, 5, 0.0F);
        this.setRotateAngle(LeftLegThigh, -0.045553093477052F, 0.0F, 0.0F);
        this.RightArmJoint = new AdvancedModelRenderer(this, 0, 0);
        this.RightArmJoint.setRotationPoint(8.0F, 0.5F, 1.0F);
        this.RightArmJoint.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        this.Hair3 = new AdvancedModelRenderer(this, 0, 0);
        this.Hair3.setRotationPoint(0.5F, 2.0F, 2.5F);
        this.Hair3.addBox(0.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F);
        this.setRotateAngle(Hair3, 0.136659280431156F, 0.0F, 0.0F);
        this.EarRight = new AdvancedModelRenderer(this, 0, 0);
        this.EarRight.setRotationPoint(-1.5F, 0.3F, 3.5F);
        this.EarRight.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(EarRight, -0.136659280431156F, 0.0F, -0.045553093477052F);
        this.Tail4 = new AdvancedModelRenderer(this, 0, 0);
        this.Tail4.setRotationPoint(0.5F, 5.5F, 0.0F);
        this.Tail4.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(Tail4, -0.136659280431156F, 0.0F, 0.0F);
        this.RightLegKnee = new AdvancedModelRenderer(this, 0, 0);
        this.RightLegKnee.setRotationPoint(-0.5F, 11.0F, -0.5F);
        this.RightLegKnee.addBox(0.0F, 0.0F, 0.0F, 4, 4, 5, 0.0F);
        this.setRotateAngle(RightLegKnee, 0.045553093477052F, 0.0F, 0.0F);
        this.RightBicep = new AdvancedModelRenderer(this, 0, 0);
        this.RightBicep.setRotationPoint(1.0F, 3.0F, 0.5F);
        this.RightBicep.addBox(0.0F, 0.0F, 0.0F, 3, 7, 3, 0.0F);
        this.setRotateAngle(RightBicep, 0.0F, 0.0F, -0.06981317007977318F);
        this.Tail1 = new AdvancedModelRenderer(this, 0, 0);
        this.Tail1.setRotationPoint(1.0F, 2.5F, 2.0F);
        this.Tail1.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.Head = new AdvancedModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(-1.0F, -5.0F, -1.5F);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 5, 6, 6, 0.0F);
        this.Head.addChild(this.EarLeft);
        this.LeftBicep.addChild(this.LeftArmJoint2);
        this.LeftTricep.addChild(this.LeftHand);
        this.RightLegJoint.addChild(this.RightLegThigh);
        this.Hair3.addChild(this.Hair4);
        this.Hair4.addChild(this.Hair5);
        this.RightArmJoint2.addChild(this.RightTricep);
        this.Body.addChild(this.RightLegJoint);
        this.LeftArmJoint2.addChild(this.LeftTricep);
        this.RightLegKnee.addChild(this.RightLeg);
        this.RightLeg.addChild(this.RightFoot);
        this.LeftLegThigh.addChild(this.LeftLegKnee);
        this.Head.addChild(this.Hair1);
        this.LeftArmJoint.addChild(this.LeftBicep);
        this.Body.addChild(this.Torso);
        this.Torso.addChild(this.Torso2);
        this.Chest.addChild(this.Neck);
        this.RightBicep.addChild(this.RightArmJoint2);
        this.LeftLegKnee.addChild(this.LeftLeg);
        this.LeftLeg.addChild(this.LeftFoot);
        this.Head.addChild(this.Nose);
        this.RightTricep.addChild(this.RightHand);
        this.Hair1.addChild(this.Hair2);
        this.Body.addChild(this.LeftLegJoint);
        this.Torso2.addChild(this.Chest);
        this.Chest.addChild(this.LeftArmJoint);
        this.Tail1.addChild(this.Tail2);
        this.Tail2.addChild(this.Tail3);
        this.LeftLegJoint.addChild(this.LeftLegThigh);
        this.Chest.addChild(this.RightArmJoint);
        this.Hair2.addChild(this.Hair3);
        this.Head.addChild(this.EarRight);
        this.Tail3.addChild(this.Tail4);
        this.RightLegThigh.addChild(this.RightLegKnee);
        this.RightArmJoint.addChild(this.RightBicep);
        this.Body.addChild(this.Tail1);
        this.Neck.addChild(this.Head);
        updateDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.Body.render(f5);

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        resetToDefaultPose();

        f = entity.ticksExisted;
        f1 = 0.5f;

        float globalSpeed = 1;
        float globalHeight = 1;
        float globalDegree = 1;

        walk(LeftLegJoint, 1.2f * globalSpeed, 0.5f * globalDegree, true, 0, 0.5f, f, f1);
    }
}
