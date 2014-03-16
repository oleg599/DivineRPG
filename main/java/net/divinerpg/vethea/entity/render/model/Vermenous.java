package net.divinerpg.vethea.entity.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Vermenous extends ModelBase
{
    //fields
    ModelRenderer part1;
    ModelRenderer part2;
    ModelRenderer rightarm1;
    ModelRenderer leftarm1;
    ModelRenderer rightleg1;
    ModelRenderer leftleg1;
    ModelRenderer part3;
    ModelRenderer part4;
    ModelRenderer part5;
    ModelRenderer part6;
    ModelRenderer part8;
    ModelRenderer part9;
    ModelRenderer part10;
    ModelRenderer part12;
    ModelRenderer part11;
    ModelRenderer part13;
    ModelRenderer part14;
    ModelRenderer part15;
    ModelRenderer part16;
    ModelRenderer part18;
    ModelRenderer part17;
    ModelRenderer rightarm2;
    ModelRenderer leftarm2;
    ModelRenderer rightarm3;
    ModelRenderer rightarm5;
    ModelRenderer leftleg2;
    ModelRenderer rightleg2;
    ModelRenderer leftleg3;
    ModelRenderer rightleg3;
    ModelRenderer leftleg4;
    ModelRenderer rightleg4;
    ModelRenderer leftarm3;
    ModelRenderer rightarm4;
    ModelRenderer leftarm4;
    ModelRenderer leftarm5;

    public Vermenous()
    {
        textureWidth = 64;
        textureHeight = 32;

        part1 = new ModelRenderer(this, 0, 16);
        part1.addBox(-4F, -8F, -4F, 8, 8, 8);
        part1.setRotationPoint(0F, 0F, 0F);
        part1.setTextureSize(64, 32);
        part1.mirror = true;
        setRotation(part1, 0F, 0F, 0F);
        part2 = new ModelRenderer(this, 16, 16);
        part2.addBox(-4F, 0F, -2F, 8, 12, 4);
        part2.setRotationPoint(0F, 0F, 0F);
        part2.setTextureSize(64, 32);
        part2.mirror = true;
        setRotation(part2, 0F, 0F, 0F);
        rightarm1 = new ModelRenderer(this, 42, 20);
        rightarm1.addBox(-4F, 10F, -1F, 2, 10, 2);
        rightarm1.setRotationPoint(-5F, 2F, 0F);
        rightarm1.setTextureSize(64, 32);
        rightarm1.mirror = true;
        setRotation(rightarm1, 0F, 0F, 0F);
        leftarm1 = new ModelRenderer(this, 42, 20);
        leftarm1.addBox(2F, 10F, -1F, 2, 10, 2);
        leftarm1.setRotationPoint(5F, 2F, 0F);
        leftarm1.setTextureSize(64, 32);
        leftarm1.mirror = true;
        setRotation(leftarm1, 0F, 0F, 0F);
        rightleg1 = new ModelRenderer(this, 0, 26);
        rightleg1.addBox(1F, 10F, -8F, 1, 2, 2);
        rightleg1.setRotationPoint(-3F, 12F, 0F);
        rightleg1.setTextureSize(64, 32);
        rightleg1.mirror = true;
        setRotation(rightleg1, 0F, 0F, 0F);
        leftleg1 = new ModelRenderer(this, 0, 26);
        leftleg1.addBox(1F, 10F, -8F, 1, 2, 2);
        leftleg1.setRotationPoint(3F, 12F, 0F);
        leftleg1.setTextureSize(64, 32);
        leftleg1.mirror = true;
        setRotation(leftleg1, 0F, 0F, 0F);
        part3 = new ModelRenderer(this, 0, 20);
        part3.addBox(0F, 0F, 0F, 4, 2, 3);
        part3.setRotationPoint(4F, -12F, -13F);
        part3.setTextureSize(64, 32);
        part3.mirror = true;
        setRotation(part3, 1.570796F, -1.570796F, 0F);
        part4 = new ModelRenderer(this, 0, 0);
        part4.addBox(0F, 0F, 0F, 8, 8, 8);
        part4.setRotationPoint(-4F, -23F, -14F);
        part4.setTextureSize(64, 32);
        part4.mirror = true;
        setRotation(part4, 0F, 0F, 0F);
        part5 = new ModelRenderer(this, 0, 0);
        part5.addBox(0F, 0F, 0F, 8, 8, 8);
        part5.setRotationPoint(8F, -8F, -14F);
        part5.setTextureSize(64, 32);
        part5.mirror = true;
        setRotation(part5, 0F, 0F, 0F);
        part6 = new ModelRenderer(this, 0, 0);
        part6.addBox(0F, 0F, 0F, 8, 8, 8);
        part6.setRotationPoint(-16F, -8F, -14F);
        part6.setTextureSize(64, 32);
        part6.mirror = true;
        setRotation(part6, 0F, 0F, 0F);
        part8 = new ModelRenderer(this, 32, 0);
        part8.addBox(0F, 0F, 0F, 8, 8, 8);
        part8.setRotationPoint(-13F, -17F, -14F);
        part8.setTextureSize(64, 32);
        part8.mirror = true;
        setRotation(part8, 0F, 0F, 0F);
        part9 = new ModelRenderer(this, 32, 0);
        part9.addBox(0F, 0F, 0F, 8, 8, 8);
        part9.setRotationPoint(5F, -17F, -14F);
        part9.setTextureSize(64, 32);
        part9.mirror = true;
        setRotation(part9, 0F, 0F, 0F);
        part10 = new ModelRenderer(this, 0, 20);
        part10.addBox(0F, 0F, 0F, 4, 4, 6);
        part10.setRotationPoint(-2F, -6F, -7F);
        part10.setTextureSize(64, 32);
        part10.mirror = true;
        setRotation(part10, 0F, 0F, 0F);
        part12 = new ModelRenderer(this, 0, 20);
        part12.addBox(0F, 0F, 0F, 4, 4, 6);
        part12.setRotationPoint(-2F, -6F, -13F);
        part12.setTextureSize(64, 32);
        part12.mirror = true;
        setRotation(part12, 0F, 0F, 0F);
        part11 = new ModelRenderer(this, 0, 20);
        part11.addBox(0F, 0F, 0F, 4, 4, 6);
        part11.setRotationPoint(-2F, -6F, -13F);
        part11.setTextureSize(64, 32);
        part11.mirror = true;
        setRotation(part11, 0F, -1.570796F, 0F);
        part13 = new ModelRenderer(this, 0, 20);
        part13.addBox(0F, 0F, 0F, 4, 4, 2);
        part13.setRotationPoint(-4F, -15F, -13F);
        part13.setTextureSize(64, 32);
        part13.mirror = true;
        setRotation(part13, 0F, -1.570796F, 0F);
        part14 = new ModelRenderer(this, 0, 20);
        part14.addBox(0F, 0F, 0F, 4, 2, 6);
        part14.setRotationPoint(4F, -6F, -13F);
        part14.setTextureSize(64, 32);
        part14.mirror = true;
        setRotation(part14, 1.570796F, -1.570796F, 0F);
        part15 = new ModelRenderer(this, 0, 20);
        part15.addBox(0F, 0F, 0F, 4, 2, 3);
        part15.setRotationPoint(-2F, -12F, -13F);
        part15.setTextureSize(64, 32);
        part15.mirror = true;
        setRotation(part15, 1.570796F, -1.570796F, 0F);
        part16 = new ModelRenderer(this, 0, 20);
        part16.addBox(0F, 0F, 0F, 4, 2, 6);
        part16.setRotationPoint(-2F, -6F, -13F);
        part16.setTextureSize(64, 32);
        part16.mirror = true;
        setRotation(part16, 1.570796F, -1.570796F, 0F);
        part18 = new ModelRenderer(this, 0, 20);
        part18.addBox(0F, 0F, 0F, 4, 4, 6);
        part18.setRotationPoint(8F, -6F, -13F);
        part18.setTextureSize(64, 32);
        part18.mirror = true;
        setRotation(part18, 0F, -1.570796F, 0F);
        part17 = new ModelRenderer(this, 0, 20);
        part17.addBox(0F, 0F, 0F, 4, 4, 2);
        part17.setRotationPoint(6F, -15F, -13F);
        part17.setTextureSize(64, 32);
        part17.mirror = true;
        setRotation(part17, 0F, -1.570796F, 0F);
        rightarm2 = new ModelRenderer(this, 40, 16);
        rightarm2.addBox(-1F, -2F, -2F, 2, 3, 4);
        rightarm2.setRotationPoint(-5F, 2F, 0F);
        rightarm2.setTextureSize(64, 32);
        rightarm2.mirror = true;
        setRotation(rightarm2, 0F, 0F, 0F);
        leftarm2 = new ModelRenderer(this, 42, 16);
        leftarm2.addBox(-1F, -2F, -2F, 2, 3, 4);
        leftarm2.setRotationPoint(5F, 2F, 0F);
        leftarm2.setTextureSize(64, 32);
        leftarm2.mirror = true;
        setRotation(leftarm2, 0F, 0F, 0F);
        rightarm3 = new ModelRenderer(this, 40, 16);
        rightarm3.addBox(-5F, -2F, -2F, 4, 12, 4);
        rightarm3.setRotationPoint(-5F, 2F, 0F);
        rightarm3.setTextureSize(64, 32);
        rightarm3.mirror = true;
        setRotation(rightarm3, 0F, 0F, 0F);
        rightarm5 = new ModelRenderer(this, 40, 23);
        rightarm5.addBox(-9F, 5F, -1F, 4, 3, 2);
        rightarm5.setRotationPoint(-5F, 2F, 0F);
        rightarm5.setTextureSize(64, 32);
        rightarm5.mirror = true;
        setRotation(rightarm5, 0F, 0F, 0F);
        leftleg2 = new ModelRenderer(this, 0, 16);
        leftleg2.addBox(-2F, 0F, -2F, 4, 12, 4);
        leftleg2.setRotationPoint(3F, 12F, 0F);
        leftleg2.setTextureSize(64, 32);
        leftleg2.mirror = true;
        setRotation(leftleg2, 0F, 0F, 0F);
        rightleg2 = new ModelRenderer(this, 0, 16);
        rightleg2.addBox(-2F, 0F, -2F, 4, 12, 4);
        rightleg2.setRotationPoint(-3F, 12F, 0F);
        rightleg2.setTextureSize(64, 32);
        rightleg2.mirror = true;
        setRotation(rightleg2, 0F, 0F, 0F);
        leftleg3 = new ModelRenderer(this, 0, 16);
        leftleg3.addBox(-2F, 10F, -6F, 4, 2, 4);
        leftleg3.setRotationPoint(3F, 12F, 0F);
        leftleg3.setTextureSize(64, 32);
        leftleg3.mirror = true;
        setRotation(leftleg3, 0F, 0F, 0F);
        rightleg3 = new ModelRenderer(this, 0, 16);
        rightleg3.addBox(-2F, 10F, -6F, 4, 2, 4);
        rightleg3.setRotationPoint(-3F, 12F, 0F);
        rightleg3.setTextureSize(64, 32);
        rightleg3.mirror = true;
        setRotation(rightleg3, 0F, 0F, 0F);
        leftleg4 = new ModelRenderer(this, 0, 26);
        leftleg4.addBox(-2F, 10F, -8F, 1, 2, 2);
        leftleg4.setRotationPoint(3F, 12F, 0F);
        leftleg4.setTextureSize(64, 32);
        leftleg4.mirror = true;
        setRotation(leftleg4, 0F, 0F, 0F);
        rightleg4 = new ModelRenderer(this, 0, 26);
        rightleg4.addBox(-2F, 10F, -8F, 1, 2, 2);
        rightleg4.setRotationPoint(-3F, 12F, 0F);
        rightleg4.setTextureSize(64, 32);
        rightleg4.mirror = true;
        setRotation(rightleg4, 0F, 0F, 0F);
        leftarm3 = new ModelRenderer(this, 40, 16);
        leftarm3.addBox(1F, -2F, -2F, 4, 12, 4);
        leftarm3.setRotationPoint(5F, 2F, 0F);
        leftarm3.setTextureSize(64, 32);
        leftarm3.mirror = true;
        setRotation(leftarm3, 0F, 0F, 0F);
        rightarm4 = new ModelRenderer(this, 40, 23);
        rightarm4.addBox(-9F, 0F, -1F, 4, 3, 2);
        rightarm4.setRotationPoint(-5F, 2F, 0F);
        rightarm4.setTextureSize(64, 32);
        rightarm4.mirror = true;
        setRotation(rightarm4, 0F, 0F, 0F);
        leftarm4 = new ModelRenderer(this, 40, 23);
        leftarm4.addBox(5F, 5F, -1F, 4, 3, 2);
        leftarm4.setRotationPoint(5F, 2F, 0F);
        leftarm4.setTextureSize(64, 32);
        leftarm4.mirror = true;
        setRotation(leftarm4, 0F, 0F, 0F);
        leftarm5 = new ModelRenderer(this, 40, 23);
        leftarm5.addBox(5F, 0F, -1F, 4, 3, 2);
        leftarm5.setRotationPoint(5F, 2F, 0F);
        leftarm5.setTextureSize(64, 32);
        leftarm5.mirror = true;
        setRotation(leftarm5, 0F, 0F, 0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5);
        part1.render(f5);
        part2.render(f5);
        rightarm1.render(f5);
        leftarm1.render(f5);
        rightleg1.render(f5);
        leftleg1.render(f5);
        part3.render(f5);
        part4.render(f5);
        part5.render(f5);
        part6.render(f5);
        part8.render(f5);
        part9.render(f5);
        part10.render(f5);
        part12.render(f5);
        part11.render(f5);
        part13.render(f5);
        part14.render(f5);
        part15.render(f5);
        part16.render(f5);
        part18.render(f5);
        part17.render(f5);
        rightarm2.render(f5);
        leftarm2.render(f5);
        rightarm3.render(f5);
        rightarm5.render(f5);
        leftleg2.render(f5);
        rightleg2.render(f5);
        leftleg3.render(f5);
        rightleg3.render(f5);
        leftleg4.render(f5);
        rightleg4.render(f5);
        leftarm3.render(f5);
        rightarm4.render(f5);
        leftarm4.render(f5);
        leftarm5.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
        this.leftleg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;

        this.rightleg1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;

        this.rightarm1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm5.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;

        this.leftarm1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarm2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarm3.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarm4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarm5.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
    }

}
