package net.divinerpg.vethea.entity.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class LadyLuna extends ModelBase
{
    //fields
    ModelRenderer part1;
    ModelRenderer leftarm1;
    ModelRenderer leftleg1;
    ModelRenderer rightleg1;
    ModelRenderer rightleg2;
    ModelRenderer leftleg2;
    ModelRenderer leftleg3;
    ModelRenderer rightleg3;
    ModelRenderer rightleg4;
    ModelRenderer leftleg4;
    ModelRenderer rightleg5;
    ModelRenderer leftleg5;
    ModelRenderer leftleg6;
    ModelRenderer rightleg6;
    ModelRenderer leftleg7;
    ModelRenderer rightleg7;
    ModelRenderer leftleg8;
    ModelRenderer rightleg8;
    ModelRenderer part2;
    ModelRenderer part3;
    ModelRenderer leftarm2;
    ModelRenderer rightarm7;
    ModelRenderer leftarm4;
    ModelRenderer leftarm5;
    ModelRenderer rightarm1;
    ModelRenderer rightarm2;
    ModelRenderer rightarm3;
    ModelRenderer rightarm4;
    ModelRenderer rightarm5;
    ModelRenderer rightarm6;
    ModelRenderer leftarm6;
    ModelRenderer leftarm7;
    ModelRenderer leftarm8;
    ModelRenderer leftarm9;
    ModelRenderer leftarm10;
    ModelRenderer leftarm3;
    ModelRenderer part4;
    ModelRenderer part5;
    ModelRenderer part6;
    ModelRenderer part7;
    ModelRenderer part8;
    ModelRenderer part9;
    ModelRenderer part11;
    ModelRenderer part12;
    ModelRenderer part13;
    ModelRenderer part14;
    ModelRenderer part15;
    ModelRenderer part16;
    ModelRenderer part17;
    ModelRenderer part18;
    ModelRenderer part19;
    ModelRenderer part20;
    ModelRenderer part21;
    ModelRenderer part22;
    ModelRenderer part23;
    ModelRenderer part24;
    ModelRenderer part25;
    ModelRenderer part26;
    ModelRenderer part27;

    public LadyLuna()
    {
        textureWidth = 256;
        textureHeight = 32;

        part1 = new ModelRenderer(this, 3, 8);
        part1.addBox(-1F, -11F, -1F, 4, 5, 2);
        part1.setRotationPoint(-1F, -9F, -1F);
        part1.setTextureSize(256, 32);
        part1.mirror = true;
        setRotation(part1, 0.3490659F, 0F, 0F);
        leftarm1 = new ModelRenderer(this, 236, 9);
        leftarm1.addBox(-2F, 10F, -1F, 2, 8, 2);
        leftarm1.setRotationPoint(-5F, -14F, -3F);
        leftarm1.setTextureSize(256, 32);
        leftarm1.mirror = true;
        setRotation(leftarm1, 0.1047198F, 0F, 0.1745329F);
        leftleg1 = new ModelRenderer(this, 132, 22);
        leftleg1.addBox(0F, 16F, -7F, 2, 2, 8);
        leftleg1.setRotationPoint(5F, 6F, 1F);
        leftleg1.setTextureSize(256, 32);
        leftleg1.mirror = true;
        setRotation(leftleg1, 0F, 0F, 0F);
        rightleg1 = new ModelRenderer(this, 132, 22);
        rightleg1.addBox(1F, 16F, -7F, 2, 2, 8);
        rightleg1.setRotationPoint(-4F, 6F, 1F);
        rightleg1.setTextureSize(256, 32);
        rightleg1.mirror = true;
        setRotation(rightleg1, 0F, 0F, 0F);
        rightleg2 = new ModelRenderer(this, 133, 9);
        rightleg2.addBox(-1F, 7F, 0F, 1, 8, 2);
        rightleg2.setRotationPoint(-4F, 6F, 1F);
        rightleg2.setTextureSize(256, 32);
        rightleg2.mirror = true;
        setRotation(rightleg2, -0.5235988F, -0.5235988F, 0F);
        leftleg2 = new ModelRenderer(this, 133, 9);
        leftleg2.addBox(-2F, 7F, 0F, 1, 8, 2);
        leftleg2.setRotationPoint(5F, 6F, 1F);
        leftleg2.setTextureSize(256, 32);
        leftleg2.mirror = true;
        setRotation(leftleg2, -0.5235988F, -0.5235988F, 0F);
        leftleg3 = new ModelRenderer(this, 172, 1);
        leftleg3.addBox(-3F, -4F, -3F, 4, 4, 4);
        leftleg3.setRotationPoint(5F, 6F, 1F);
        leftleg3.setTextureSize(256, 32);
        leftleg3.mirror = true;
        setRotation(leftleg3, -0.2617994F, 0F, 0F);
        rightleg3 = new ModelRenderer(this, 172, 1);
        rightleg3.addBox(-2F, -4F, -3F, 4, 4, 4);
        rightleg3.setRotationPoint(-4F, 6F, 1F);
        rightleg3.setTextureSize(256, 32);
        rightleg3.mirror = true;
        setRotation(rightleg3, -0.2617994F, 0F, 0F);
        rightleg4 = new ModelRenderer(this, 156, 10);
        rightleg4.addBox(-2F, 5F, -3F, 4, 4, 4);
        rightleg4.setRotationPoint(-4F, 6F, 1F);
        rightleg4.setTextureSize(256, 32);
        rightleg4.mirror = true;
        setRotation(rightleg4, -0.2617994F, 0F, 0F);
        leftleg4 = new ModelRenderer(this, 156, 10);
        leftleg4.addBox(-3F, 5F, -3F, 4, 4, 4);
        leftleg4.setRotationPoint(5F, 6F, 1F);
        leftleg4.setTextureSize(256, 32);
        leftleg4.mirror = true;
        setRotation(leftleg4, -0.2617994F, 0F, 0F);
        rightleg5 = new ModelRenderer(this, 133, 9);
        rightleg5.addBox(0F, 7F, 0F, 1, 8, 2);
        rightleg5.setRotationPoint(-4F, 6F, 1F);
        rightleg5.setTextureSize(256, 32);
        rightleg5.mirror = true;
        setRotation(rightleg5, -0.5235988F, 0.5235988F, 0F);
        leftleg5 = new ModelRenderer(this, 133, 9);
        leftleg5.addBox(-1F, 7F, 0F, 1, 8, 2);
        leftleg5.setRotationPoint(5F, 6F, 1F);
        leftleg5.setTextureSize(256, 32);
        leftleg5.mirror = true;
        setRotation(leftleg5, -0.5235988F, 0.5235988F, 0F);
        leftleg6 = new ModelRenderer(this, 155, 19);
        leftleg6.addBox(-2F, 6F, -5F, 2, 11, 2);
        leftleg6.setRotationPoint(5F, 6F, 1F);
        leftleg6.setTextureSize(256, 32);
        leftleg6.mirror = true;
        setRotation(leftleg6, 0.1745329F, 0F, 0F);
        rightleg6 = new ModelRenderer(this, 155, 19);
        rightleg6.addBox(-1F, 6F, -5F, 2, 11, 2);
        rightleg6.setRotationPoint(-4F, 6F, 1F);
        rightleg6.setTextureSize(256, 32);
        rightleg6.mirror = true;
        setRotation(rightleg6, 0.1745329F, 0F, 0F);
        leftleg7 = new ModelRenderer(this, 132, 22);
        leftleg7.addBox(-4F, 16F, -7F, 2, 2, 8);
        leftleg7.setRotationPoint(5F, 6F, 1F);
        leftleg7.setTextureSize(256, 32);
        leftleg7.mirror = true;
        setRotation(leftleg7, 0F, 0F, 0F);
        rightleg7 = new ModelRenderer(this, 132, 22);
        rightleg7.addBox(-3F, 16F, -7F, 2, 2, 8);
        rightleg7.setRotationPoint(-4F, 6F, 1F);
        rightleg7.setTextureSize(256, 32);
        rightleg7.mirror = true;
        setRotation(rightleg7, 0F, 0F, 0F);
        leftleg8 = new ModelRenderer(this, 143, 8);
        leftleg8.addBox(-2F, 0F, -2F, 2, 8, 2);
        leftleg8.setRotationPoint(5F, 6F, 1F);
        leftleg8.setTextureSize(256, 32);
        leftleg8.mirror = true;
        setRotation(leftleg8, -0.2617994F, 0F, 0F);
        rightleg8 = new ModelRenderer(this, 143, 8);
        rightleg8.addBox(-1F, 0F, -2F, 2, 8, 2);
        rightleg8.setRotationPoint(-4F, 6F, 1F);
        rightleg8.setTextureSize(256, 32);
        rightleg8.mirror = true;
        setRotation(rightleg8, -0.2617994F, 0F, 0F);
        part2 = new ModelRenderer(this, 116, 13);
        part2.addBox(3F, -1F, 1F, 1, 9, 4);
        part2.setRotationPoint(0F, -5F, 0F);
        part2.setTextureSize(256, 32);
        part2.mirror = true;
        setRotation(part2, 1.745329F, 0F, 0F);
        part3 = new ModelRenderer(this, 100, 12);
        part3.addBox(-3F, -8F, -1F, 6, 9, 2);
        part3.setRotationPoint(0F, -5F, 0F);
        part3.setTextureSize(256, 32);
        part3.mirror = true;
        setRotation(part3, 0.3490659F, 0F, 0F);
        leftarm2 = new ModelRenderer(this, 236, 3);
        leftarm2.addBox(-2F, 2F, -1F, 2, 8, 2);
        leftarm2.setRotationPoint(-5F, -14F, -3F);
        leftarm2.setTextureSize(256, 32);
        leftarm2.mirror = true;
        setRotation(leftarm2, 0.1047198F, 0F, 0.1745329F);
        rightarm7 = new ModelRenderer(this, 152, 1);
        rightarm7.addBox(-1F, 19F, 3F, 4, 3, 4);
        rightarm7.setRotationPoint(5F, -14F, -3F);
        rightarm7.setTextureSize(256, 32);
        rightarm7.mirror = true;
        setRotation(rightarm7, 0F, 0F, -0.1745329F);
        leftarm4 = new ModelRenderer(this, 111, 3);
        leftarm4.addBox(-3F, -2F, -2F, 4, 4, 4);
        leftarm4.setRotationPoint(-5F, -14F, -3F);
        leftarm4.setTextureSize(256, 32);
        leftarm4.mirror = true;
        setRotation(leftarm4, 0.0227203F, 0F, 0F);
        leftarm5 = new ModelRenderer(this, 203, 24);
        leftarm5.addBox(1F, 20F, -14F, 1, 1, 6);
        leftarm5.setRotationPoint(-6F, -14F, -3F);
        leftarm5.setTextureSize(256, 32);
        leftarm5.mirror = true;
        setRotation(leftarm5, 0.1047198F, 0F, 0.1745329F);
        rightarm1 = new ModelRenderer(this, 193, 1);
        rightarm1.addBox(1F, 19F, -18F, 1, 2, 9);
        rightarm1.setRotationPoint(5F, -14F, -3F);
        rightarm1.setTextureSize(256, 32);
        rightarm1.mirror = true;
        setRotation(rightarm1, 0F, 0F, -0.1745329F);
        rightarm2 = new ModelRenderer(this, 174, 17);
        rightarm2.addBox(0F, 19F, -9F, 2, 3, 12);
        rightarm2.setRotationPoint(5F, -14F, -3F);
        rightarm2.setTextureSize(256, 32);
        rightarm2.mirror = true;
        setRotation(rightarm2, 0F, 0F, -0.1745329F);
        rightarm3 = new ModelRenderer(this, 237, 23);
        rightarm3.addBox(-1F, 17F, -2F, 4, 4, 4);
        rightarm3.setRotationPoint(5F, -14F, -3F);
        rightarm3.setTextureSize(256, 32);
        rightarm3.mirror = true;
        setRotation(rightarm3, 0F, 0F, -0.1745329F);
        rightarm4 = new ModelRenderer(this, 236, 9);
        rightarm4.addBox(0F, 10F, -1F, 2, 8, 2);
        rightarm4.setRotationPoint(5F, -14F, -3F);
        rightarm4.setTextureSize(256, 32);
        rightarm4.mirror = true;
        setRotation(rightarm4, 0F, 0F, -0.1745329F);
        rightarm5 = new ModelRenderer(this, 236, 3);
        rightarm5.addBox(0F, 2F, -1F, 2, 8, 2);
        rightarm5.setRotationPoint(5F, -14F, -3F);
        rightarm5.setTextureSize(256, 32);
        rightarm5.mirror = true;
        setRotation(rightarm5, 0F, 0F, -0.1745329F);
        rightarm6 = new ModelRenderer(this, 111, 3);
        rightarm6.addBox(-1F, -2F, -2F, 4, 4, 4);
        rightarm6.setRotationPoint(5F, -14F, -3F);
        rightarm6.setTextureSize(256, 32);
        rightarm6.mirror = true;
        setRotation(rightarm6, -0.1745329F, 0F, 0F);
        leftarm6 = new ModelRenderer(this, 212, 13);
        leftarm6.addBox(-3F, 17F, -2F, 4, 4, 4);
        leftarm6.setRotationPoint(-5F, -14F, -3F);
        leftarm6.setTextureSize(256, 32);
        leftarm6.mirror = true;
        setRotation(leftarm6, 0.1047198F, 0F, 0.1745329F);
        leftarm7 = new ModelRenderer(this, 137, 1);
        leftarm7.addBox(-2F, 18F, -5F, 2, 2, 4);
        leftarm7.setRotationPoint(-5F, -14F, -3F);
        leftarm7.setTextureSize(256, 32);
        leftarm7.mirror = true;
        setRotation(leftarm7, 0.1047198F, 0F, 0.1745329F);
        leftarm8 = new ModelRenderer(this, 219, 23);
        leftarm8.addBox(-2F, 17F, -8F, 4, 4, 3);
        leftarm8.setRotationPoint(-6F, -14F, -3F);
        leftarm8.setTextureSize(256, 32);
        leftarm8.mirror = true;
        setRotation(leftarm8, 0.1047198F, 0F, 0.1745329F);
        leftarm9 = new ModelRenderer(this, 203, 24);
        leftarm9.addBox(1F, 17F, -14F, 1, 1, 6);
        leftarm9.setRotationPoint(-6F, -14F, -3F);
        leftarm9.setTextureSize(256, 32);
        leftarm9.mirror = true;
        setRotation(leftarm9, 0.1047198F, 0F, 0.1745329F);
        leftarm10 = new ModelRenderer(this, 203, 24);
        leftarm10.addBox(-2F, 20F, -14F, 1, 1, 6);
        leftarm10.setRotationPoint(-6F, -14F, -3F);
        leftarm10.setTextureSize(256, 32);
        leftarm10.mirror = true;
        setRotation(leftarm10, 0.1047198F, 0F, 0.1745329F);
        leftarm3 = new ModelRenderer(this, 203, 24);
        leftarm3.addBox(-2F, 17F, -14F, 1, 1, 6);
        leftarm3.setRotationPoint(-6F, -14F, -3F);
        leftarm3.setTextureSize(256, 32);
        leftarm3.mirror = true;
        setRotation(leftarm3, 0.1047198F, 0F, 0.1745329F);
        part4 = new ModelRenderer(this, 62, 19);
        part4.addBox(-4F, 0F, -2F, 8, 9, 4);
        part4.setRotationPoint(0F, -5F, 0F);
        part4.setTextureSize(256, 32);
        part4.mirror = true;
        setRotation(part4, 0F, 0F, 0F);
        part5 = new ModelRenderer(this, 116, 13);
        part5.addBox(-4F, -1F, 1F, 1, 9, 4);
        part5.setRotationPoint(0F, -5F, 0F);
        part5.setTextureSize(256, 32);
        part5.mirror = true;
        setRotation(part5, 1.745329F, 0F, 0F);
        part6 = new ModelRenderer(this, 116, 13);
        part6.addBox(4F, 3F, 7F, 1, 9, 4);
        part6.setRotationPoint(0F, -5F, 0F);
        part6.setTextureSize(256, 32);
        part6.mirror = true;
        setRotation(part6, 2.181662F, 0F, 0F);
        part7 = new ModelRenderer(this, 116, 13);
        part7.addBox(-5F, 3F, 7F, 1, 9, 4);
        part7.setRotationPoint(0F, -5F, 0F);
        part7.setTextureSize(256, 32);
        part7.mirror = true;
        setRotation(part7, 2.181662F, 0F, 0F);
        part8 = new ModelRenderer(this, 116, 13);
        part8.addBox(-5F, 0F, -4F, 1, 9, 4);
        part8.setRotationPoint(0F, -5F, 0F);
        part8.setTextureSize(256, 32);
        part8.mirror = true;
        setRotation(part8, 1.308997F, 0F, 0F);
        part9 = new ModelRenderer(this, 116, 13);
        part9.addBox(4F, 0F, -4F, 1, 9, 4);
        part9.setRotationPoint(0F, -5F, 0F);
        part9.setTextureSize(256, 32);
        part9.mirror = true;
        setRotation(part9, 1.308997F, 0F, 0F);
        part11 = new ModelRenderer(this, 89, 23);
        part11.addBox(-3F, -8F, -2F, 8, 5, 4);
        part11.setRotationPoint(-1F, -9F, -1F);
        part11.setTextureSize(256, 32);
        part11.mirror = true;
        setRotation(part11, 0.3490659F, 0F, 0F);
        part12 = new ModelRenderer(this, 53, 1);
        part12.addBox(2F, -13F, -4F, 1, 3, 1);
        part12.setRotationPoint(0F, -18F, 0F);
        part12.setTextureSize(256, 32);
        part12.mirror = true;
        setRotation(part12, 0.3490659F, 0F, 0F);
        part13 = new ModelRenderer(this, 73, 0);
        part13.addBox(4F, -9F, -4F, 1, 4, 7);
        part13.setRotationPoint(0F, -18F, 0F);
        part13.setTextureSize(256, 32);
        part13.mirror = true;
        setRotation(part13, 0.7853982F, 0F, 0F);
        part14 = new ModelRenderer(this, 53, 1);
        part14.addBox(-3F, -13F, -4F, 1, 3, 1);
        part14.setRotationPoint(0F, -18F, 0F);
        part14.setTextureSize(256, 32);
        part14.mirror = true;
        setRotation(part14, 0.3490659F, 0F, 0F);
        part15 = new ModelRenderer(this, 81, 7);
        part15.addBox(2F, -14F, -10F, 1, 1, 8);
        part15.setRotationPoint(0F, -18F, 0F);
        part15.setTextureSize(256, 32);
        part15.mirror = true;
        setRotation(part15, 0.3490659F, 0F, 0F);
        part16 = new ModelRenderer(this, 81, 7);
        part16.addBox(-3F, -14F, -10F, 1, 1, 8);
        part16.setRotationPoint(0F, -18F, 0F);
        part16.setTextureSize(256, 32);
        part16.mirror = true;
        setRotation(part16, 0.3490659F, 0F, 0F);
        part17 = new ModelRenderer(this, 0, 0);
        part17.addBox(-3F, -7F, -6F, 6, 4, 4);
        part17.setRotationPoint(0F, -18F, 0F);
        part17.setTextureSize(256, 32);
        part17.mirror = true;
        setRotation(part17, 0.3490659F, 0F, 0F);
        part18 = new ModelRenderer(this, 45, 6);
        part18.addBox(4F, -5F, -3F, 1, 1, 2);
        part18.setRotationPoint(0F, -18F, 0F);
        part18.setTextureSize(256, 32);
        part18.mirror = true;
        setRotation(part18, 0.7853982F, 0F, 0F);
        part19 = new ModelRenderer(this, 25, 5);
        part19.addBox(-3F, -10F, 2F, 6, 1, 1);
        part19.setRotationPoint(0F, -18F, 0F);
        part19.setTextureSize(256, 32);
        part19.mirror = true;
        setRotation(part19, 0.7853982F, 0F, 0F);
        part20 = new ModelRenderer(this, 53, 0);
        part20.addBox(-5F, -12F, -4F, 2, 3, 7);
        part20.setRotationPoint(0F, -18F, 0F);
        part20.setTextureSize(256, 32);
        part20.mirror = true;
        setRotation(part20, 0.7853982F, 0F, 0F);
        part21 = new ModelRenderer(this, 53, 0);
        part21.addBox(3F, -12F, -4F, 2, 3, 7);
        part21.setRotationPoint(0F, -18F, 0F);
        part21.setTextureSize(256, 32);
        part21.mirror = true;
        setRotation(part21, 0.7853982F, 0F, 0F);
        part22 = new ModelRenderer(this, 73, 0);
        part22.addBox(-5F, -9F, -4F, 1, 4, 7);
        part22.setRotationPoint(0F, -18F, 0F);
        part22.setTextureSize(256, 32);
        part22.mirror = true;
        setRotation(part22, 0.7853982F, 0F, 0F);
        part23 = new ModelRenderer(this, 57, 11);
        part23.addBox(-3F, -11F, -4F, 6, 1, 7);
        part23.setRotationPoint(0F, -18F, 0F);
        part23.setTextureSize(256, 32);
        part23.mirror = true;
        setRotation(part23, 0.7853982F, 0F, 0F);
        part24 = new ModelRenderer(this, 83, 0);
        part24.addBox(-5F, -5F, -1F, 10, 1, 4);
        part24.setRotationPoint(0F, -18F, 0F);
        part24.setTextureSize(256, 32);
        part24.mirror = true;
        setRotation(part24, 0.7853982F, 0F, 0F);
        part25 = new ModelRenderer(this, 23, 0);
        part25.addBox(-5F, -5F, -6F, 10, 1, 3);
        part25.setRotationPoint(0F, -18F, 0F);
        part25.setTextureSize(256, 32);
        part25.mirror = true;
        setRotation(part25, 0.7853982F, 0F, 0F);
        part26 = new ModelRenderer(this, 45, 6);
        part26.addBox(-5F, -5F, -3F, 1, 1, 2);
        part26.setRotationPoint(0F, -18F, 0F);
        part26.setTextureSize(256, 32);
        part26.mirror = true;
        setRotation(part26, 0.7853982F, 0F, 0F);
        part27 = new ModelRenderer(this, 26, 9);
        part27.addBox(-4F, -9F, 2F, 8, 4, 1);
        part27.setRotationPoint(0F, -18F, 0F);
        part27.setTextureSize(256, 32);
        part27.mirror = true;
        setRotation(part27, 0.7853982F, 0F, 0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5);
        part1.render(f5);
        leftarm1.render(f5);
        leftleg1.render(f5);
        rightleg1.render(f5);
        rightleg2.render(f5);
        leftleg2.render(f5);
        leftleg3.render(f5);
        rightleg3.render(f5);
        rightleg4.render(f5);
        leftleg4.render(f5);
        rightleg5.render(f5);
        leftleg5.render(f5);
        leftleg6.render(f5);
        rightleg6.render(f5);
        leftleg7.render(f5);
        rightleg7.render(f5);
        leftleg8.render(f5);
        rightleg8.render(f5);
        part2.render(f5);
        part3.render(f5);
        leftarm2.render(f5);
        rightarm7.render(f5);
        leftarm4.render(f5);
        leftarm5.render(f5);
        rightarm1.render(f5);
        rightarm2.render(f5);
        rightarm3.render(f5);
        rightarm4.render(f5);
        rightarm5.render(f5);
        rightarm6.render(f5);
        leftarm6.render(f5);
        leftarm7.render(f5);
        leftarm8.render(f5);
        leftarm9.render(f5);
        leftarm10.render(f5);
        leftarm3.render(f5);
        part4.render(f5);
        part5.render(f5);
        part6.render(f5);
        part7.render(f5);
        part8.render(f5);
        part9.render(f5);
        part11.render(f5);
        part12.render(f5);
        part13.render(f5);
        part14.render(f5);
        part15.render(f5);
        part16.render(f5);
        part17.render(f5);
        part18.render(f5);
        part19.render(f5);
        part20.render(f5);
        part21.render(f5);
        part22.render(f5);
        part23.render(f5);
        part24.render(f5);
        part25.render(f5);
        part26.render(f5);
        part27.render(f5);
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
        this.leftleg2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1 + -0.5235988F;
        this.leftleg3.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1 - 0.2617994F;
        this.leftleg4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1 - 0.2617994F;
        this.leftleg5.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1 - 0.5235988F;
        this.leftleg6.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1 + 0.1745329F;
        this.leftleg7.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.leftleg8.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1 - 0.2617994F;

        this.rightleg1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        this.rightleg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1 + -0.5235988F;
        this.rightleg3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1 - 0.2617994F;
        this.rightleg4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1 - 0.2617994F;
        this.rightleg5.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1 - 0.5235988F;
        this.rightleg6.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1 + 0.1745329F;
        this.rightleg7.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        this.rightleg8.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1 - 0.2617994F;

        this.rightarm1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm5.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm6.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F - 0.1745329F;
        this.rightarm7.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;

        this.leftarm1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F + 0.1047198F;
        this.leftarm2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F + 0.1047198F;
        this.leftarm3.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F + 0.1047198F;
        this.leftarm4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F + 0.0227203F;
        this.leftarm5.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F+ 0.1047198F;
        this.leftarm6.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F + 0.1047198F;
        this.leftarm7.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F + 0.1047198F;
        this.leftarm8.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F + 0.1047198F;
        this.leftarm9.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F + 0.1047198F;
        this.leftarm10.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F + 0.1047198F;
    }

}
