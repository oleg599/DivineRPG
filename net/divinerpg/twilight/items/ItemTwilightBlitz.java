package net.divinerpg.twilight.items;

import java.util.List;

import net.divinerpg.Reference;
import net.divinerpg.api.items.ItemMod;
import net.divinerpg.helper.items.TwilightItems;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.divinerpg.twilight.entity.projectile.EntityBlitzAlapachia;
import net.divinerpg.twilight.entity.projectile.EntityBlitzEden;
import net.divinerpg.twilight.entity.projectile.EntityBlitzHalite;
import net.divinerpg.twilight.entity.projectile.EntityBlitzMortum;
import net.divinerpg.twilight.entity.projectile.EntityBlitzSkythern;
import net.divinerpg.twilight.entity.projectile.EntityBlitzWildWood;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemTwilightBlitz extends ItemMod {
	private String sound;
	private int damage;
	private String ammoType;
	public ItemTwilightBlitz(int damage, String ammoType)
	{
		super();
		this.maxStackSize = 1;
		sound = "";
		this.setMaxDamage(-1);
		this.setCreativeTab(DivineRPGTabs.ranged);
		this.damage = damage;
		this.ammoType = ammoType;
		LangRegistry.addItem(this);
	}

	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
	{
		boolean var4 = var3.capabilities.isCreativeMode;

		if (!var4 && !var3.inventory.hasItem(TwilightItems.wildWoodDust))
		{
			return var1;
		}
		else
		{
			if(var1.getItem() == TwilightItems.wildWoodBlitz)
			{
				if(!var2.isRemote)
				{
					var2.playSoundAtEntity(var3, sound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityBlitzWildWood(var2, var3));
				}
				var3.inventory.consumeInventoryItem(TwilightItems.wildWoodDust);
			}
		}

		if (!var4 && !var3.inventory.hasItem(TwilightItems.mortumDust))
		{
			return var1;
		}
		else
		{
			if(var1.getItem() == TwilightItems.haliteBlitz)
			{
				if(!var2.isRemote)
				{
					var2.playSoundAtEntity(var3, sound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityBlitzHalite(var2, var3));
				}
				var3.inventory.consumeInventoryItem(TwilightItems.mortumDust);
			}

			if(var1.getItem() == TwilightItems.mortumBlitz)
			{
				if(!var2.isRemote)
				{
					var2.playSoundAtEntity(var3, sound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityBlitzMortum(var2, var3));
				}
				var3.inventory.consumeInventoryItem(TwilightItems.mortumDust);
			}
		}

		if (!var4 && !var3.inventory.hasItem(TwilightItems.apalachiaDust))
		{
			return var1;
		}
		else
		{
			if(var1.getItem() == TwilightItems.apalachiaBlitz)
			{
				if(!var2.isRemote)
				{
					var2.playSoundAtEntity(var3, sound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityBlitzAlapachia(var2, var3));
				}
				var3.inventory.consumeInventoryItem(TwilightItems.apalachiaDust);
			}
		}

		if (!var4 && !var3.inventory.hasItem(TwilightItems.skythernDust))
		{
			return var1;
		}
		else
		{
			if(var1.getItem() == TwilightItems.skythernBlitz)
			{
				if(!var2.isRemote)
				{
					var2.playSoundAtEntity(var3, sound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityBlitzSkythern(var2, var3));
				}
				var3.inventory.consumeInventoryItem(TwilightItems.skythernDust);
			}
		}

		if (!var4 && !var3.inventory.hasItem(TwilightItems.edenDust))
		{
			return var1;
		}
		else
		{
			if(var1.getItem() == TwilightItems.edenBlitz)
			{
				if(!var2.isRemote)
				{
					var2.playSoundAtEntity(var3, sound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityBlitzEden(var2, var3));
				}
				var3.inventory.consumeInventoryItem(TwilightItems.edenDust);
			}
		}
		var1.damageItem(1, var3);
		return var1;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack var1, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
	    par3List.add(damage + " Ranged Damage");
	    par3List.add("Ammo: " + ammoType);
		par3List.add("Infinite Uses");
	}
}
