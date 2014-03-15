package net.divinerpg.vanilla.items;

import java.util.List;

import net.divinerpg.api.items.ItemMod;
import net.divinerpg.helper.items.TwilightItemsWeapons;
import net.divinerpg.helper.items.VanillaItemsWeapons;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.twilight.entity.projectile.EntitySlicerApalachia;
import net.divinerpg.twilight.entity.projectile.EntitySlicerEden;
import net.divinerpg.twilight.entity.projectile.EntitySlicerHalite;
import net.divinerpg.twilight.entity.projectile.EntitySlicerMortum;
import net.divinerpg.twilight.entity.projectile.EntitySlicerSkythern;
import net.divinerpg.twilight.entity.projectile.EntitySlicerWildWoods;
import net.divinerpg.vanilla.entity.projectiles.EntityShuriken;
import net.divinerpg.vanilla.entity.projectiles.EntityVileStorm;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemThrowable extends ItemMod {

	private int damage;

	public ItemThrowable(int damage) {
		this.damage = damage;
		setCreativeTab(DivineRPGTabs.ranged);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3) {
		if (!var3.capabilities.isCreativeMode) 
			--var1.stackSize;
		
		if(!var2.isRemote){
			var2.playSoundAtEntity(var3, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

			if(var1.getItem() == VanillaItemsWeapons.shuriken){
				var2.spawnEntityInWorld(new EntityShuriken(var2, var3));
			}

			if(var1.getItem() == VanillaItemsWeapons.vileStorm){
				var2.spawnEntityInWorld(new EntityVileStorm(var2, var3));
			}

			if(var1.getItem() == TwilightItemsWeapons.edenSlicer){
				var2.spawnEntityInWorld(new EntitySlicerEden(var2, var3));
			}

			if(var1.getItem() == TwilightItemsWeapons.wildWoodSlicer){
				var2.spawnEntityInWorld(new EntitySlicerWildWoods(var2, var3));
			}

			if(var1.getItem() == TwilightItemsWeapons.apalachiaSlicer){
				var2.spawnEntityInWorld(new EntitySlicerApalachia(var2, var3));
			}

			if(var1.getItem() == TwilightItemsWeapons.skythernSlicer){
				var2.spawnEntityInWorld(new EntitySlicerSkythern(var2, var3));
			}

			if(var1.getItem() == TwilightItemsWeapons.mortumSlicer){
				var2.spawnEntityInWorld(new EntitySlicerMortum(var2, var3));
			}

			if(var1.getItem() == TwilightItemsWeapons.haliteSlicer){
				var2.spawnEntityInWorld(new EntitySlicerHalite(var2, var3));
			}
		}
		return var1;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack var1, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add(damage + " Ranged Damage");
		if(var1.getItem() == VanillaItemsWeapons.vileStorm) {
			par3List.add("Poison Damage");
		}
	}
}
