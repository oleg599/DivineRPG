package net.divinerpg.client.render.entity.vethea;

import net.divinerpg.client.render.RenderDivineMob;
import net.divinerpg.entity.vethea.EntityHoverStinger;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderHoverStinger extends RenderDivineMob
{
    private float scale;

    public RenderHoverStinger(ModelBase var1, float var2, ResourceLocation loc)
    {
        super(var1, var2, loc);
        this.scale = 0.35F;
    }

    public void renderHoverStinger(EntityHoverStinger var1, double var2, double var4, double var6, float var8, float var9)
    {
        super.doRender(var1, var2, var4, var6, var8, var9);
    }

    @Override
    public void doRender(EntityLiving var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderHoverStinger((EntityHoverStinger)var1, var2, var4, var6, var8, var9);
    }

    protected void preRenderScale(EntityHoverStinger var1, float var2)
    {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }

    protected void preRenderCallback(EntityLivingBase var1, float var2)
    {
        this.preRenderScale((EntityHoverStinger)var1, var2);
    }

    @Override
    public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderHoverStinger((EntityHoverStinger)var1, var2, var4, var6, var8, var9);
    }
}