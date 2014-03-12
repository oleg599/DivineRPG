package net.divinerpg.api.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntitySlicer extends EntityThrowable {

    public EntitySlicer(World par1World) {
        super(par1World);
    }
    
    public EntitySlicer(World par1World, EntityLivingBase par2Entity){
        super(par1World, par2Entity);
    }
    
    public EntitySlicer(World par1World, double par2, double par3, double par4){
        super(par1World, par2, par3, par4);
    }

    @Override
    protected void onImpact(MovingObjectPosition var1) {
        if (var1.entityHit != null) {
            byte var2 = 42;
            var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), var2);
        }

        if (!this.worldObj.isRemote) {
            this.setDead();
        }
    }
}