package net.divinerpg.items.vanilla;

import net.divinerpg.api.items.ItemMod;
import net.divinerpg.entity.vanilla.EntityKingOfScorchers;
import net.divinerpg.entity.vanilla.EntityNetherWatcher;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.items.VanillaItemsOther;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemVanillaSpawner extends ItemMod{

	public ItemVanillaSpawner() {
		setMaxStackSize(1);
		setCreativeTab(DivineRPGTabs.spawner);
	}

	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer player, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
		int var4 = 0;
		if(!par3World.isRemote){
			if(par3World.provider.dimensionId == -1){
				while(var4 < 1) {
					
					if(par1ItemStack.getItem() == VanillaItemsOther.callWatcher){
						EntityNetherWatcher var5 = new EntityNetherWatcher(par3World);
						var5.setPosition(par4, par5 +1, par6);
						par3World.spawnEntityInWorld(var5);
						par1ItemStack.stackSize--;
						var4++;
					} 
					
					if(par1ItemStack.getItem() == VanillaItemsOther.infernalFlame){
						EntityKingOfScorchers var5 = new EntityKingOfScorchers(par3World);
						var5.setPosition(par4, par5 + 1, par6);
						par3World.spawnEntityInWorld(var5);
						par1ItemStack.stackSize--;
						var4++;
					}
				}
			}
			if(par3World.provider.dimensionId != -1){
				DivineAPI.addChatMessage("This item can only be used in the Nether!");
			}
		}
		return true;
	}
}