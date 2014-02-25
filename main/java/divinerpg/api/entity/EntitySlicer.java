/*   Copyright 2014 BossLetsPlays(Matthew Rogers)
*
*   Licensed under the Apache License, Version 2.0 (the "License");
*   you may not use this file except in compliance with the License.
*   You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
*   Unless required by applicable law or agreed to in writing, software
*   distributed under the License is distributed on an "AS IS" BASIS,
*   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*   See the License for the specific language governing permissions and
*   limitations under the License.
*/
package divinerpg.api.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;


/**
 * <strong>Project:</strong> DivineRPG <br>
 *
 * <strong>Class:</strong> EntitySlicer
 *
 * @author <a href = "http://youtube.com/BossLetsPlays"> BossLetsPlays</a>
 *
 */
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
    

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    @Override
    protected void onImpact(MovingObjectPosition var1)
    {
        if (var1.entityHit != null)
        {
            byte var2 = 42;

            if (var1.entityHit instanceof EntityBlaze)
            {
                var2 = 42;
            }

            var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), var2);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
    
    

}
