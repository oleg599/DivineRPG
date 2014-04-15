package net.divinerpg.vethea.items;

import java.util.List;

import net.divinerpg.Sounds;
import net.divinerpg.api.items.ItemMod;
import net.divinerpg.client.ArcanaHelper;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.vethea.entity.projectile.EntityBouncingProjectile;
import net.divinerpg.vethea.entity.projectile.EntityEvernightProjectile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemStaff extends ItemMod {
	protected int damage;
	protected int cost;

	public ItemStaff(int dam, int cos) {
		this.maxStackSize = 1;
		this.damage = dam;
		this.cost = cos;
		this.setCreativeTab(DivineRPGTabs.vethea);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("Deals " + this.damage + " Arcana Damage");
		par3List.add("Bouncing Projectile");
		if(par1ItemStack.getUnlocalizedName().contains("evernight")){
			par3List.add("Consumes All Of Your Arcana");
		} else {
			par3List.add("Consumes " + this.cost + " Arcana");
		}
		par3List.add(DivineAPI.GREEN + "Vethean");
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1, World par2, EntityPlayer par3) {
		if (!par2.isRemote && ArcanaHelper.useBar(this.cost)) {
			par2.spawnEntityInWorld(new EntityBouncingProjectile(par2, par3, this.damage));

			if(!par2.isRemote && par1.getUnlocalizedName().contains("evernight")){
				par3.attackEntityFrom(new EntityDamageSourceIndirect("arcana", par3, par3).setMagicDamage(), 16);
				par2.spawnEntityInWorld(new EntityEvernightProjectile(par2, par3, this.damage));
			}
			par2.playSoundAtEntity(par3, Sounds.staff, 1.0F, 1.0F);
		}
		return par1;
	}
}