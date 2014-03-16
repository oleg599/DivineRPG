package net.divinerpg.vanilla.blocks;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import net.divinerpg.Reference;
import net.divinerpg.api.blocks.BlockModFence;
import net.divinerpg.helper.blocks.VanillaBlocks;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockLightFence extends BlockModFence {
	private final boolean powered;

	public BlockLightFence(boolean par1, String par2) {
		super(Reference.PREFIX + par2);
		this.powered = par1;
		setCreativeTab(DivineRPGTabs.blocks);
		setStepSound(Block.soundTypeGlass);
		LangRegistry.addBlock(this);
		if (par1) {
			this.setLightLevel(1.0F);
		}
	}

	public Block setTextureName(String name) {
		return setBlockTextureName(Reference.PREFIX + name);
	}

	public Block setName(String name) {
		if(powered) {
			setTextureName(name + "On");
			setBlockName(name + "On");
			GameRegistry.registerBlock(this, name + "On");
		} else {
			setTextureName(name);
			setBlockName(name);
			GameRegistry.registerBlock(this, name);
		}
		return this;
	}

	public void onBlockAdded(World par1, int par2, int par3, int par4) {
		if (!par1.isRemote) {
			if (this.powered && !par1.isBlockIndirectlyGettingPowered(par2, par3, par4)) {
				par1.scheduleBlockUpdate(par2, par3, par4, this, 4);
			}
			else if (!this.powered && par1.isBlockIndirectlyGettingPowered(par2, par3, par4)) {
				if(par1.getBlock(par2, par3, par4) == VanillaBlocks.lightFenceBlue){
					par1.setBlock(par2, par3, par4, VanillaBlocks.lightFenceBlueOn);
				}
				if(par1.getBlock(par2, par3, par4) == VanillaBlocks.lightFenceGreen){
					par1.setBlock(par2, par3, par4, VanillaBlocks.lightFenceGreenOn);
				}
				if(par1.getBlock(par2, par3, par4) == VanillaBlocks.lightFenceRed){
					par1.setBlock(par2, par3, par4, VanillaBlocks.lightFenceRedOn);
				}
			}
		}
	}

	public void onNeighborBlockChange(World par1, int par2, int par3, int par4, Block par5) {
		if (!par1.isRemote) {
			if (this.powered && !par1.isBlockIndirectlyGettingPowered(par2, par3, par4)) {
				par1.scheduleBlockUpdate(par2, par3, par4, this, 4);
			}
			else if (!this.powered && par1.isBlockIndirectlyGettingPowered(par2, par3, par4)) {
				if(par1.getBlock(par2, par3, par4) == VanillaBlocks.lightFenceBlue){
					par1.setBlock(par2, par3, par4, VanillaBlocks.lightFenceBlueOn);
				}
				if(par1.getBlock(par2, par3, par4) == VanillaBlocks.lightFenceGreen){
					par1.setBlock(par2, par3, par4, VanillaBlocks.lightFenceGreenOn);
				}
				if(par1.getBlock(par2, par3, par4) == VanillaBlocks.lightFenceRed){
					par1.setBlock(par2, par3, par4, VanillaBlocks.lightFenceRedOn);
				}
			}
		}
	}

	public void updateTick(World par1, int par2, int par3, int par4, Random par5) {
		if (!par1.isRemote && this.powered && !par1.isBlockIndirectlyGettingPowered(par2, par3, par4)) {

			if(par1.getBlock(par2, par3, par4) == VanillaBlocks.lightFenceBlueOn){
				par1.setBlock(par2, par3, par4, VanillaBlocks.lightFenceBlue);
			}
			if(par1.getBlock(par2, par3, par4) == VanillaBlocks.lightFenceGreenOn){
				par1.setBlock(par2, par3, par4, VanillaBlocks.lightFenceGreen);
			}
			if(par1.getBlock(par2, par3, par4) == VanillaBlocks.lightFenceRedOn){
				par1.setBlock(par2, par3, par4, VanillaBlocks.lightFenceRed);
			}
		}
	}

	public Item getItem(World w, int i, int j, int k) {
		return Item.getItemFromBlock(this);
	}
}
