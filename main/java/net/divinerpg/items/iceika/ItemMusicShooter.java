package net.divinerpg.items.iceika;

import java.util.List;

import net.divinerpg.Sounds;
import net.divinerpg.api.items.ItemMod;
import net.divinerpg.entity.iceika.projectile.EntityMusic;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMusicShooter extends ItemMod {
	
	public ItemMusicShooter() {
		setCreativeTab(DivineRPGTabs.ranged);
		setMaxStackSize(1);
		setMaxDamage(4000);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3) {
		if(!var2.isRemote) {
				var2.spawnEntityInWorld(new EntityMusic(var2, var3));
				var1.damageItem(1, var3);
				Sounds.playSound(Sounds.carol, var2, var3);
		}
		return var1;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack var1, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("16 Ranged damage");
		par3List.add(var1.getMaxDamage() - var1.getItemDamage() + " Uses");
	}

}
