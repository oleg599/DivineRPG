package net.divinerpg.entity.iceika.projectile;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.divinerpg.entity.twilight.effects.EntitySkythernPortalFX;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityMusic extends EntityThrowable {

	public EntityMusic(World var1) {
        super(var1);
    }

    public EntityMusic(World var1, EntityLivingBase var2) {
        super(var1, var2);
    }

    public EntityMusic(World var1, double var2, double var4, double var6) {
        super(var1, var2, var4, var6);
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void onUpdate()  {
        super.onUpdate();
        this.worldObj.spawnParticle("note", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
            //EntitySkythernPortalFX var20 = new EntitySkythernPortalFX(this.worldObj, this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D); //Change to music notes
            //FMLClientHandler.instance().getClient().effectRenderer.addEffect(var20);
    }

    @Override
    protected void onImpact(MovingObjectPosition var1) {
        if (var1.entityHit != null) {
            var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 16.0F);
        }

        if (!this.worldObj.isRemote) {
            this.setDead();
        }
    }
}
