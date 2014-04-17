package net.divinerpg.items.arcana;

import net.divinerpg.api.items.ItemModSword;
import net.divinerpg.client.ArcanaHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemStormSword extends ItemModSword {
	
	public ItemStormSword(ToolMaterial t) {
		super(t);
	}
	
	@Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
    	if (ArcanaHelper.useBar(20)) {
    		this.createLightning(par2World, par3EntityPlayer);
    	}	    	
        return super.onItemRightClick(par1ItemStack, par2World, par3EntityPlayer);
    }

	@Override
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
    	if (ArcanaHelper.useBar(20)) {
        	this.createLightning(player.worldObj, player);
    	}
        return false;
    }
	
	public void createLightning(World par2World, EntityPlayer par3EntityPlayer) {
		for(int i = 2; i < 5; i += 2) {
			double var4 = 0;
			while(var4 < 2 * Math.PI) {
				int var1 = (int) Math.round(Math.sin(var4)*i);
				int var3 = (int) Math.round(Math.cos(var4)*i);
				par2World.spawnEntityInWorld(new EntityLightningBolt(par2World, par3EntityPlayer.posX + var1, par3EntityPlayer.posY, par3EntityPlayer.posZ + var3));
				var4 += Math.PI / 8.0D;
			}
		}
	}
}