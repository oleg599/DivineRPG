package net.divinerpg.overworld.blocks;

import java.util.Random;

import net.divinerpg.DivineRPG;
import net.divinerpg.helper.blocks.OverworldBlocks;
import net.divinerpg.helper.items.OverworldItems;
import net.divinerpg.helper.tab.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class OverworldBlock extends Block
{

	public OverworldBlock(Material m)
	{
		super(m);
		this.func_149647_a(DivineRPGTabs.blocks);
		func_149672_a(Block.field_149780_i);
		if(this == OverworldBlocks.purpleStone || this == OverworldBlocks.purpleStone){
			func_149715_a(1.0F);
		}
	}
	
	public static Item getBlock(Block b){
		return Item.func_150898_a(b);
	}

	public Item func_149650_a(int par1, Random par2, int par3) {
		
		if(this == OverworldBlocks.rupeeOre){
			return getBlock(OverworldBlocks.rupeeOre);
		}
		if(this == OverworldBlocks.arlemiteOre){
			return getBlock(OverworldBlocks.arlemiteOre);
		}
		if(this == OverworldBlocks.realmiteOre){
			return getBlock(OverworldBlocks.realmiteOre);
		}
		if(this == OverworldBlocks.bloodGemOre){
			return OverworldItems.bloodGem;
		}
		if(this == OverworldBlocks.netheriteOre){
			return getBlock(OverworldBlocks.netheriteOre);
		}
		if(this == OverworldBlocks.rupeeBlock){
			return getBlock(OverworldBlocks.rupeeBlock);
		}
		if(this == OverworldBlocks.arlemiteBlock){
			return getBlock(OverworldBlocks.arlemiteBlock);
		}
		if(this == OverworldBlocks.realmiteBlock){
			return getBlock(OverworldBlocks.realmiteBlock);
		}
		if(this == OverworldBlocks.bloodGemBlock){
			return getBlock(OverworldBlocks.bloodGemBlock);
		}
		if(this == OverworldBlocks.netheriteBlock){
			return getBlock(OverworldBlocks.netheriteBlock);
		}
		if(this == OverworldBlocks.checker){
			return getBlock(OverworldBlocks.checker);
		}
		if(this == OverworldBlocks.rainbowWool){
			return getBlock(OverworldBlocks.rainbowWool);
		}
		if(this == OverworldBlocks.crate){
			return getBlock(OverworldBlocks.crate);
		}
		if(this == OverworldBlocks.blueStone){
			return getBlock(OverworldBlocks.blueStone);
		}
		if(this == OverworldBlocks.purpleStone){
			return getBlock(OverworldBlocks.purpleStone);
		}
		if(this == OverworldBlocks.blueVane){
			return getBlock(OverworldBlocks.blueVane);
		}
		if(this == OverworldBlocks.cyanVane){
			return getBlock(OverworldBlocks.cyanVane);
		}
		if(this == OverworldBlocks.purpleVane){
			return getBlock(OverworldBlocks.purpleVane);
		}
		if(this == OverworldBlocks.redVane){
			return getBlock(OverworldBlocks.redVane);
		}
		if(this == OverworldBlocks.yellowVane){
			return getBlock(OverworldBlocks.yellowVane);
		}
		return null;
	}

	public int func_149679_a(int par1, Random par2)
	{
		if (par1 > 0 && getBlock(this) != this.func_149650_a(0, par2, par1))
		{
			int j = par2.nextInt(par1 + 2) - 1;

			if (j < 0)
			{
				j = 0;
			}

			return this.func_149745_a(par2) * (j + 1);
		}
		else
		{
			return this.func_149745_a(par2);
		}
	}

	private Random rand = new Random();
	@Override
	public int getExpDrop(IBlockAccess block, int par5, int par7)
	{
		if (this.func_149650_a(par5, rand, par7) != getBlock(this))
		{
			int j1 = 0;

			if(this == OverworldBlocks.bloodGemOre){
				j1 = MathHelper.getRandomIntegerInRange(rand, 0, 4);
			}
			if(this == OverworldBlocks.netheriteOre){
				j1 = MathHelper.getRandomIntegerInRange(rand, 0, 4);
			}
			return j1;
		}
		return 0;
	}
}