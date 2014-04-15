package net.divinerpg.api.items;

import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ItemModDoor extends ItemMod {
	
	private Block door;

	public ItemModDoor(Block block) {
		this.door = block;
		setCreativeTab(DivineRPGTabs.blocks);
	}

	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
		if (par7 != 1) {
			return false;
		} else {
			++par5;
			Block block;

			block = door;

			if (par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack) && par2EntityPlayer.canPlayerEdit(par4, par5 + 1, par6, par7, par1ItemStack)) {
				if (!block.canPlaceBlockAt(par3World, par4, par5, par6)) {
					return false;
				} else {
					int i1 = MathHelper.floor_double((double)((par2EntityPlayer.rotationYaw + 180.0F) * 4.0F / 360.0F) - 0.5D) & 3;
					placeDoorBlock(par3World, par4, par5, par6, i1, block);
					--par1ItemStack.stackSize;
					return true;
				}
			} else {
				return false;
			}
		}
	}

	public static void placeDoorBlock(World w, int i, int j, int k, int rotation, Block door) {
		byte b0 = 0;
		byte b1 = 0;

		if (rotation == 0) {
			b1 = 1;
		}

		if (rotation == 1) {
			b0 = -1;
		}

		if (rotation == 2) {
			b1 = -1;
		}

		if (rotation == 3) {
			b0 = 1;
		}

		int i1 = (w.getBlock(i - b0, j, k - b1).isNormalCube() ? 1 : 0) + (w.getBlock(i - b0, j + 1, k - b1).isNormalCube() ? 1 : 0);
		int j1 = (w.getBlock(i + b0, j, k + b1).isNormalCube() ? 1 : 0) + (w.getBlock(i + b0, j + 1, k + b1).isNormalCube() ? 1 : 0);
		boolean flag = w.getBlock(i - b0, j, k - b1) == door || w.getBlock(i - b0, j + 1, k - b1) == door;
		boolean flag1 = w.getBlock(i + b0, j, k + b1) == door || w.getBlock(i + b0, j + 1, k + b1) == door;
		boolean flag2 = false;

		if (flag && !flag1) {
			flag2 = true;
		}
		else if (j1 > i1) {
			flag2 = true;
		}

		w.setBlock(i, j, k, door, rotation, 2);
		w.setBlock(i, j + 1, k, door, 8 | (flag2 ? 1 : 0), 2);
		w.notifyBlocksOfNeighborChange(i, j, k, door);
		w.notifyBlocksOfNeighborChange(i, j + 1, k, door);
	}
}