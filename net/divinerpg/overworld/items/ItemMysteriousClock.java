package net.divinerpg.overworld.items;

import net.divinerpg.Reference;
import net.divinerpg.helper.DivineRPGTabs;
import net.divinerpg.overworld.entity.mobs.EntityAncientEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemMysteriousClock extends Item
{
	private World worldObj;

	public ItemMysteriousClock()
	{
		super();
		setMaxStackSize(1);
		setCreativeTab(DivineRPGTabs.spawner);
		setTextureName("myseriousClock");
		setUnlocalizedName("myseriousClock");
	}

	/**
	 * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
	 * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
	 */
	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer player, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
		int var4 = 0;
		if(!par3World.isRemote){
			if(player.capabilities.isCreativeMode){
				while(var4 < 1)//1 gets the amount of mobs to spawn at once
				{
					EntityAncientEntity var5 = new EntityAncientEntity(par3World);
					var5.setPosition(par4, par5 +1, par6);
					par3World.spawnEntityInWorld(var5);
					var4++;
				}
			}else{
				while(var4 < 1) {
					EntityAncientEntity var5 = new EntityAncientEntity(par3World);
					var5.setPosition(par4, par5 + 1, par6);
					par3World.spawnEntityInWorld(var5);
					var4++;
					par1ItemStack.stackSize--;
				}
			}
		}
		return true;
	}
	public Item setTextureName(String par1Str)
    {
        this.iconString = (Reference.prefix + par1Str);
        return this;
    }
}