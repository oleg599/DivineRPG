package divinerpg.helper;

import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import divinerpg.twilight.entity.projectile.EntityApalachiaArrow;
import divinerpg.twilight.entity.projectile.EntityEdenArrow;
import divinerpg.twilight.entity.projectile.EntityHaliteArrow;
import divinerpg.twilight.entity.projectile.EntityMortumArrow;
import divinerpg.twilight.entity.projectile.EntitySkythernArrow;
import divinerpg.twilight.entity.projectile.EntityWildArrow;

public class DamageSourceHelper {

    public static DamageSource edenArrowDamage(EntityEdenArrow par0EntityArrow, Entity par1Entity) {
        return (new EntityDamageSourceIndirect("edenArrow", par0EntityArrow, par1Entity)).setProjectile();
    }
    
    public static DamageSource wildArrowDamage(EntityWildArrow par0EntityArrow, Entity par1Entity) {
        return (new EntityDamageSourceIndirect("wildArrow", par0EntityArrow, par1Entity)).setProjectile();
    } 
    
    public static DamageSource apalachiaArrowDamage(EntityApalachiaArrow par0EntityArrow, Entity par1Entity) {
        return (new EntityDamageSourceIndirect("apalachiaArrow", par0EntityArrow, par1Entity)).setProjectile();
    }
    
    public static DamageSource skythernArrowDamage(EntitySkythernArrow par0EntityArrow, Entity par1Entity) {
        return (new EntityDamageSourceIndirect("skythernArrow", par0EntityArrow, par1Entity)).setProjectile();
    }
    
    public static DamageSource mortumArrowDamage(EntityMortumArrow par0EntityArrow, Entity par1Entity) {
        return (new EntityDamageSourceIndirect("mortumArrow", par0EntityArrow, par1Entity)).setProjectile();
    }
    
    public static DamageSource haliteArrowDamage(EntityHaliteArrow par0EntityArrow, Entity par1Entity) {
        return (new EntityDamageSourceIndirect("haliteArrow", par0EntityArrow, par1Entity)).setProjectile();
    }
}
