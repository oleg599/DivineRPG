package net.divinerpg.api.blocks;

import java.util.Random;

import net.divinerpg.helper.blocks.IceikaBlocks;
import net.divinerpg.helper.items.IceikaItems;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
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
	public void onBlockDestroyedByPlayer(World w, int x, int y, int z, int meta) {
		if(this == IceikaBlocks.winterberryBushRipe) {
			w.setBlock(x, y, z, IceikaBlocks.winterberryBush);
			
			while (time < 100) {
				time++;
				//delay for a second here
			}
			if (time >= 100) {
				w.setBlock(x, y, z, IceikaBlocks.winterberryBushRipe);
			}
		}
	}
	
	public Item getItemDropped(int par1, Random par2Random, int par3)
	{
		if (this == IceikaBlocks.winterberryBushRipe) {
			return IceikaItems.winterberry;
		}
		else {
			return null;
		}
	}

	public void grow(World w, int x, int y, int z){
		if(this == IceikaBlocks.winterberryBush){
			w.setBlock(x, y, z, IceikaBlocks.winterberryBushRipe);
		}
	}
}