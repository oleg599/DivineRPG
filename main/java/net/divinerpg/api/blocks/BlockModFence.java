package net.divinerpg.api.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class BlockModFence extends BlockFence{


	public BlockModFence(String textureName) {
		super(textureName, Material.wood);
	}	
	
    public boolean canConnectFenceTo(IBlockAccess par1, int par2, int par3, int par4) {
        Block block = par1.getBlock(par2, par3, par4);

        /*if (block != this ? block.getMaterial().isOpaque() && block.renderAsNormalBlock() ? block.getMaterial() != Material.gourd : false : true) {
        	return true;
        }*/
		return block instanceof BlockFence || block instanceof BlockFenceGate;
    }
}
