package divinerpg.vethea.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import divinerpg.helper.items.VetheanItems;
import divinerpg.vethea.entity.projectile.EntityAmthirmisDisk;
import divinerpg.vethea.entity.projectile.EntityArksianeDisk;
import divinerpg.vethea.entity.projectile.EntityCermileDisk;
import divinerpg.vethea.entity.projectile.EntityDarvenDisk;
import divinerpg.vethea.entity.projectile.EntityHeliosisDisk;
import divinerpg.vethea.entity.projectile.EntityKarosDisk;
import divinerpg.vethea.entity.projectile.EntityPardimalDisk;
import divinerpg.vethea.entity.projectile.EntityQuadroticDisk;
import divinerpg.vethea.entity.projectile.EntityTeakerDisk;

public class ItemDisk extends ItemVetheanDisk{

	int dam;
	
	public ItemDisk(int par1) {
		super(par1);
		dam = par1;
	}

	public void shoot(ItemStack var1, World var2, EntityPlayer var3){
		if(var1.getItem() == VetheanItems.teakerDisk){
			var2.spawnEntityInWorld(new EntityTeakerDisk(var2, var3, dam, this));
		}
		if(var1.getItem() == VetheanItems.amthrimisDisk){
			var2.spawnEntityInWorld(new EntityAmthirmisDisk(var2, var3, dam, this));
		}
		if(var1.getItem() == VetheanItems.darvenDisk){
			var2.spawnEntityInWorld(new EntityDarvenDisk(var2, var3, dam, this));
		}
		if(var1.getItem() == VetheanItems.cermileDisk){
			var2.spawnEntityInWorld(new EntityCermileDisk(var2, var3, dam, this));
		}
		if(var1.getItem() == VetheanItems.pardimalDisk){
			var2.spawnEntityInWorld(new EntityPardimalDisk(var2, var3, dam, this));
		}
		if(var1.getItem() == VetheanItems.quadroticDisk){
			var2.spawnEntityInWorld(new EntityQuadroticDisk(var2, var3, dam, this));
		}
		if(var1.getItem() == VetheanItems.karosDisk){
			var2.spawnEntityInWorld(new EntityKarosDisk(var2, var3, dam, this));
		}
		if(var1.getItem() == VetheanItems.heliosisDisk){
			var2.spawnEntityInWorld(new EntityHeliosisDisk(var2, var3, dam, this));
		}
		if(var1.getItem() == VetheanItems.arksianeDisk){
			var2.spawnEntityInWorld(new EntityArksianeDisk(var2, var3, dam, this));
		}
	}
}