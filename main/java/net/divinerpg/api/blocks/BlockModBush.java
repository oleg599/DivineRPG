package net.divinerpg.api.blocks;

import java.util.Random;

import net.divinerpg.helper.blocks.IceikaBlocks;
import net.divinerpg.helper.items.IceikaItems;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockModBush extends BlockMod{

	public IIcon grown, notGrown;
	private int time = 0;

	public BlockModBush(boolean grown) {
		super(Material.leaves);
		setCreativeTab(DivineRPGTabs.blocks);
	}

	@Override
	public void updateTick(World w, int x, int y, int z, Random r) {
		if(time <= 0)
			time++;
		
		if(time != 100)
			time++;
		
		if(time > 100){
			w.setBlock(x, y, z, IceikaBlocks.winterberryBush, 1, 2);
		}
	}

	@Override
	public void onBlockClicked(World w, int x, int y, int z, EntityPlayer p) {
		if(w.getBlock(x, y, z) == IceikaBlocks.winterberryBushRipe){
			p.inventory.addItemStackToInventory(new ItemStack(IceikaItems.winterberry));
			w.setBlock(x, y, z, IceikaBlocks.winterberryBush);
		}
	}

	@Override
	public void onBlockDestroyedByPlayer(World w, int x, int y, int z, int meta) {
		if(w.getBlock(x, y, z) == IceikaBlocks.winterberryBushRipe){
			w.setBlock(x, y, z, IceikaBlocks.winterberryBush, meta, 2);
		}
	}

	public Item getItemDropped(int par1, Random par2Random, int par3) {
		if (this == IceikaBlocks.winterberryBushRipe) {
			return IceikaItems.winterberry;
		} else {
			return null;
		}
	}

	public static void grow(World w, int x, int y, int z){
		if(w.getBlock(x, y, z) == IceikaBlocks.winterberryBush)
		w.setBlock(x, y, z, IceikaBlocks.winterberryBushRipe, 1, 2);
	}
}