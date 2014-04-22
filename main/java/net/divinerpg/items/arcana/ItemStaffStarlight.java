package net.divinerpg.items.arcana;

import java.util.List;

import net.divinerpg.Sounds;
import net.divinerpg.api.items.ItemMod;
import net.divinerpg.client.ArcanaHelper;
import net.divinerpg.entity.arcana.projectile.EntityStar;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.items.ArcanaItems;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemStaffStarlight  extends ItemMod {

	public ItemStaffStarlight() {
		this.maxStackSize = 1;
		setCreativeTab(DivineRPGTabs.ranged);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		float var4 = par3EntityPlayer.rotationPitch;
		float var5 = par3EntityPlayer.rotationYaw;
		double var6 = par3EntityPlayer.posX;
		double var8 = par3EntityPlayer.posY + 1.62D - (double)par3EntityPlayer.yOffset;
		double var10 = par3EntityPlayer.posZ;
		Vec3 var12 = par2World.getWorldVec3Pool().getVecFromPool(var6, var8, var10);
		float var13 = MathHelper.cos(-var5 * 0.01745329F - (float)Math.PI);
		float var14 = MathHelper.sin(-var5 * 0.01745329F - (float)Math.PI);
		float var15 = -MathHelper.cos(-var4 * 0.01745329F);
		float var16 = MathHelper.sin(-var4 * 0.01745329F);
		float var17 = var14 * var15;
		float var18 = var13 * var15;
		double var19 = 30.0D;
		Vec3 var21 = var12.addVector((double)var17 * var19, (double)var16 * var19, (double)var18 * var19);
		MovingObjectPosition var22 = par2World.rayTraceBlocks(var12, var21);

		if (var22 == null) {
			return par1ItemStack;
		} else {
			if (var22.typeOfHit == MovingObjectType.BLOCK) {
				int var23 = var22.blockX;
				int var24 = var22.blockY;
				int var25 = var22.blockZ;
				int var26 = var22.sideHit;

				if (var26 == 0) 
					--var24;           

				if (var26 == 1) 
					++var24;            

				if (var26 == 2) 
					--var25;            

				if (var26 == 3) 
					++var25;             

				if (var26 == 4) 
					--var23;             

				if (var26 == 5) 
					++var23;      

				if(par1ItemStack.getItem() == ArcanaItems.staffStarlight){
					if(!par2World.isRemote && ArcanaHelper.useBar(25)) {
						for(int i = 0; i < 8; i++)
							par2World.spawnEntityInWorld(new EntityStar(par2World, (double)var23 + 0.5D, (double)var24 + 25D, (double)var25 + 0.5D));
						Sounds.playSound(Sounds.starlight, par2World, par3EntityPlayer, 1.0F, 0.5F);
					}
				} else {
					if(!par2World.isRemote && ArcanaHelper.useBar(5)) {
						par2World.spawnEntityInWorld(new EntityStar(par2World, (double)var23 + 0.5D, (double)var24 + 25D, (double)var25 + 0.5D));
						Sounds.playSound(Sounds.starlight, par2World, par3EntityPlayer);
					}
				}
				par3EntityPlayer.getLook(1);
			}
		}
		return par1ItemStack;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		int damage;
		int arcana;
		boolean stars;
		if(par1ItemStack.getItem() == ArcanaItems.staffStarlight){
			arcana = 25;
			stars = true;
		} else {
			arcana = 5;
			stars = false;
		}
		par3List.add(arcana + " Arcana");
		par3List.add(stars ? "Drops several stars from the sky" : "Drops a star from the sky");
		par3List.add("40 Ranged Damage");
		par3List.add(DivineAPI.GREEN + "Infinite Uses");
	}
}
