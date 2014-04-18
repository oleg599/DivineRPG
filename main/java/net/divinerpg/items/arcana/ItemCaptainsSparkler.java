package net.divinerpg.items.arcana;

import java.util.List;

import net.divinerpg.Sounds;
import net.divinerpg.api.items.ItemMod;
import net.divinerpg.client.ArcanaHelper;
import net.divinerpg.entity.arcana.projectile.EntitySparkler;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCaptainsSparkler extends ItemMod {

	private int weaponDamage;

	public ItemCaptainsSparkler() {
		this.maxStackSize = 1;
		this.setMaxDamage(-1);
		this.setCreativeTab(DivineRPGTabs.ranged);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3) {
		if (!var2.isRemote && ArcanaHelper.useBar(15)) {
			Sounds.playSound(Sounds.sparkler, var2, var3);
			var2.spawnEntityInWorld(new EntitySparkler(var2, var3));
		}
		return var1;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("7 Arcana");
		par3List.add("26 Ranged Damage");
		par3List.add(DivineAPI.GREEN + "Infinite Uses");
	}
}