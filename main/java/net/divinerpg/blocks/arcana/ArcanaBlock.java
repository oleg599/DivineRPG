package net.divinerpg.blocks.arcana;

import java.util.Random;

import net.divinerpg.Reference;
import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.helper.blocks.ArcanaBlocks;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;

public class ArcanaBlock extends BlockMod {

	public ArcanaBlock(Material m/*, float hardness, SoundType sound*/) {
		super(m);
		setCreativeTab(DivineRPGTabs.blocks);
		//setStepSound(sound);
		if(isBreakable())
			this.setBlockUnbreakable();
		//setHardness(hardness);
	}

	private boolean isBreakable(){
		return !(this == ArcanaBlocks.arcaniumOre) || !(this == ArcanaBlocks.arcaniumPower);
	}

	public Item getBlock(Block b){
		return Item.getItemFromBlock(b);
	}

	public Item getItemDropped(int par1, Random par2, int par3) {
		return getBlock(this);
	}

	public Block setTextureName(String name){
		return setBlockTextureName(Reference.PREFIX + name);
	}

	public Block setName(String name){
		setTextureName(name);
		setBlockName(name);
		GameRegistry.registerBlock(this, name);
		return this;
	}

	@Override
	public Item getItem(World par1World, int par2, int par3, int par4) {
		return Item.getItemFromBlock(this);
	}
}