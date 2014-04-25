package net.divinerpg.entity.iceika.projectile;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityCarols extends EntityThrowable {

	public EntityCarols(World var1) {
        super(var1);
    }

    public EntityCarols(World var1, EntityLivingBase var2) {
        super(var1, var2);
    }

    public EntityCarols(World var1, double var2, double var4, double var6) {
        super(var1, var2, var4, var6);
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
