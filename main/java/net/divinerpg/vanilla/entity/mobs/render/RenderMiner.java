package net.divinerpg.vanilla.entity.mobs.render;

import net.divinerpg.client.render.EntityResourceLocation;
import net.divinerpg.vanilla.entity.mobs.EntityMiner;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderMiner extends RenderBiped {
	
	public RenderMiner() {
		super(new ModelZombie(), 0.5F);
	}

	protected ResourceLocation getEntityTexture() {
		return EntityResourceLocation.miner;
	}
	
	public void renderMob(EntityMiner var1, double var2, double var4, double var6, float var8, float var9) {
		super.doRender(var1, var2, var4, var6, var8, var9);
	}

	public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9) {
		this.renderMob((EntityMiner)var1, var2, var4, var6, var8, var9);
	}

	protected ResourceLocation getEntityTexture(EntityLiving par1EntityLiving) {
		return this.getEntityTexture();
	}

	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return this.getEntityTexture();
	}
}