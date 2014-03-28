package net.divinerpg.vanilla.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
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
import net.divinerpg.vanilla.entity.projectiles.EntityScythe;
import net.divinerpg.vanilla.entity.projectiles.EntityShuriken;
import net.divinerpg.vanilla.entity.projectiles.EntityVileStorm;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemScythe extends ItemMod {
	
	public ItemScythe() {
		setCreativeTab(DivineRPGTabs.ranged);
		setMaxStackSize(1);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3) {
		if(!var2.isRemote){
			var2.playSoundAtEntity(var3, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
			
			var2.spawnEntityInWorld(new EntityScythe(var2, var3));
		}
		return var1;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack var1, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add((int)EntityScythe.damage + " Ranged damage");
		par3List.add("Infinite ammo and durability");
	}
}
