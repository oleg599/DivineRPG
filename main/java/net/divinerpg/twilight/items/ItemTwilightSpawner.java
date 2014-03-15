package net.divinerpg.twilight.items;

import net.divinerpg.api.items.ItemMod;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.divinerpg.helper.items.TwilightItemsOther;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.divinerpg.twilight.entity.mob.EntityDensos;
import net.divinerpg.twilight.entity.mob.EntityKarot;
import net.divinerpg.twilight.entity.mob.EntityReyvor;
import net.divinerpg.twilight.entity.mob.EntitySoulFiend;
import net.divinerpg.twilight.entity.mob.EntityTwilightDemon;
import net.divinerpg.twilight.entity.mob.EntityVamacheron;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTwilightSpawner extends ItemMod{

	static ConfigurationHelper x;

	public ItemTwilightSpawner() {
		setMaxStackSize(1);
		this.setCreativeTab(DivineRPGTabs.spawner);
	}
	
	@Override
	public boolean onItemUse(ItemStack item, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
		int var4 = 0;
		if(par3World.provider.dimensionId == x.Eden || par3World.provider.dimensionId == x.WildWoods || par3World.provider.dimensionId == x.Apalachia 
				|| par3World.provider.dimensionId == x.Skythern || par3World.provider.dimensionId == x.Mortum){
			if (!par3World.isRemote) {
				while (var4 < 1) {//1 = amount of mobs spawning
					if(item.getItem() == TwilightItemsOther.spawnKarot){
						EntityKarot var5 = new EntityKarot(par3World);
						var5.setPosition(par4, par5+1, par6);
						par3World.spawnEntityInWorld(var5);
						--item.stackSize;
						return true;
					}
					if(item.getItem() == TwilightItemsOther.spawnDensos){
						EntityDensos var5 = new EntityDensos(par3World);
						var5.setPosition(par4, par5+1, par6);
						par3World.spawnEntityInWorld(var5);
						--item.stackSize;
						return true;
					}
					if(item.getItem() == TwilightItemsOther.spawnReyvor){
						EntityReyvor var5 = new EntityReyvor(par3World);
						var5.setPosition(par4, par5+1, par6);
						par3World.spawnEntityInWorld(var5);
						--item.stackSize;
						return true;
					}
					if(item.getItem() == TwilightItemsOther.spawnSoulFiend){
						EntitySoulFiend var5 = new EntitySoulFiend(par3World);
						var5.setPosition(par4, par5+1, par6);
						par3World.spawnEntityInWorld(var5);
						--item.stackSize;
						return true;
					}
					if(item.getItem() == TwilightItemsOther.spawnTwilight){
						EntityTwilightDemon var5 = new EntityTwilightDemon(par3World);
						var5.setPosition(par4, par5+1, par6);
						par3World.spawnEntityInWorld(var5);
						--item.stackSize;
						return true;
					}
					if(item.getItem() == TwilightItemsOther.spawnVamacheron){
						EntityVamacheron var5 = new EntityVamacheron(par3World);
						var5.setPosition(par4, par5+1, par6);
						par3World.spawnEntityInWorld(var5);
						--item.stackSize;
						return true;
					}
				}
			}
		}
		return false;
	}
}
