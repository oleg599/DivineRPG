package net.divinerpg.vanilla.entity.projectiles;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityVileStorm extends EntityThrowable
{
	EntityLivingBase base;
	
    public EntityVileStorm(World var1)
    {
        super(var1);
    }

    public EntityVileStorm(World var1, EntityLivingBase var3)
    {
        super(var1, var3);
        base = var3;
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition var1)
    {
        if (var1.entityHit != null)
        {
            byte var2 = 4;

            if (var1.entityHit instanceof EntityBlaze)
            {
                var2 = 4;
            }

            if (var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), var2))
            {
                boolean var3 = true;
                //base.addPotionEffect(new PotionEffect(Potion.poison.id, 40, 3));
            }
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
}
