package net.divinerpg.nether.items;

import net.divinerpg.overworld.entity.mobs.EntityAncientEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCallOfTheWatcher extends Item
{
	private World worldObj;

	public ItemCallOfTheWatcher()
	{
		super();
		this.maxStackSize = 1;
	}
	/**
	 * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
	 * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
	 */
	//Un-comment after adding EntityTheWatcher
	/*@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer player, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
		int var4 = 0;
		if(!par3World.isRemote){
			if(player.capabilities.isCreativeMode){
				while(var4 < 1)//1 gets the amount of mobs to spawn at once
				{
					EntityTheWatcher var5 = new EntityTheWatcher(par3World);
					var5.setPosition(par4, par5 +1, par6);
					par3World.spawnEntityInWorld(var5);
					var4++;
				}
			}else{
				while(var4 < 1) {
					EntityTheWatcher var5 = new EntityTheWatcher(par3World);
					var5.setPosition(par4, par5 + 1, par6);
					par3World.spawnEntityInWorld(var5);
					var4++;
					par1ItemStack.stackSize--;
				}
			}
		}
		return true;
	}*/
}
