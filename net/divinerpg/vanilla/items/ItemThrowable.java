package net.divinerpg.vanilla.items;

import java.util.List;

import net.divinerpg.Reference;
import net.divinerpg.api.items.ItemMod;
import net.divinerpg.helper.DivineRPGTabs;
import net.divinerpg.helper.items.TwilightItems;
import net.divinerpg.helper.items.VanillaItems;
import net.divinerpg.twilight.entity.projectile.*;
import net.divinerpg.vanilla.entity.projectiles.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemThrowable extends ItemMod {

	private String name;
	private int    damage;

	public ItemThrowable(int damage) {
		super();
		this.damage = damage;
		setCreativeTab(DivineRPGTabs.ranged);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
	{
		if (!var3.capabilities.isCreativeMode)
		{
			--var1.stackSize;
		}
		var2.playSoundAtEntity(var3, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

		if(var1.getItem() == VanillaItems.shuriken){
			var2.spawnEntityInWorld(new EntityShuriken(var2, var3));
		}
		
		if(var1.getItem() == VanillaItems.vileStorm){
			var2.spawnEntityInWorld(new EntityVileStorm(var2, var3));
		}
		
		if(var1.getItem() == TwilightItems.edenSlicer){
			var2.spawnEntityInWorld(new EntitySlicerEden(var2, var3));
		}
		
		if(var1.getItem() == TwilightItems.wildWoodSlicer){
			var2.spawnEntityInWorld(new EntitySlicerWildWoods(var2, var3));
		}
		
		if(var1.getItem() == TwilightItems.apalachiaSlicer){
			var2.spawnEntityInWorld(new EntitySlicerApalachia(var2, var3));
		}
		
		if(var1.getItem() == TwilightItems.skythernSlicer){
			var2.spawnEntityInWorld(new EntitySlicerSkythern(var2, var3));
		}
		
		if(var1.getItem() == TwilightItems.mortumSlicer){
			var2.spawnEntityInWorld(new EntitySlicerMortum(var2, var3));
		}
		
		if(var1.getItem() == TwilightItems.haliteSlicer){
			var2.spawnEntityInWorld(new EntitySlicerHalite(var2, var3));
		}
		return var1;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack var1, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		par3List.add(damage + " Ranged Damage");
		if(var1.getItem() == VanillaItems.vileStorm){
			par3List.add("Poison Damage");
		}
	}
}
