package net.divinerpg.vethea.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.divinerpg.api.items.ItemMod;
import net.divinerpg.helper.DivineRPGTabs;
import net.divinerpg.helper.items.VanillaItems;
import net.divinerpg.helper.items.VetheanItems;
import net.divinerpg.vanilla.entity.projectiles.EntityShuriken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemDisk extends ItemMod{

	int dam;
	
	public ItemDisk(int damage) {
		dam = damage;
		this.setCreativeTab(DivineRPGTabs.vethea);
	}
	

	@Override
	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3){
        if (!var3.capabilities.isCreativeMode)
        {
            --var1.stackSize;
        }
		var2.playSoundAtEntity(var3, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

		if(var1.getItem() == VetheanItems.teakerDisk){
			var2.spawnEntityInWorld(new EntityShuriken(var2, var3));
		}
		return var1;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack var1, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add(dam + " Ranged Damage");
		par3List.add("Returns to sender");
		par3List.add("\u00a72Vethean");
	}
}
