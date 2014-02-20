package net.divinerpg.vanilla.blocks;

import java.util.Random;

import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.helper.blocks.VanillaBlocks;
import net.divinerpg.helper.items.VanillaItemsOther;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

public class VanillaBlock extends BlockMod {
        
	private static SoundType stone = Block.soundTypeStone;
	private static SoundType grass = Block.soundTypeGravel;
	private static SoundType cloth = Block.soundTypeCloth;
	private static SoundType wood = Block.soundTypeWood;

	public VanillaBlock(Material m) {
		super(m);
		setCreativeTab(DivineRPGTabs.blocks);
		setStepSound(stone);
		if(this == VanillaBlocks.purpleStone || this == VanillaBlocks.blueStone){
			setLightLevel(1.0F);
			setStepSound(grass);
		}
		if(this == VanillaBlocks.checker || this == VanillaBlocks.rainbowWool){
			setStepSound(cloth);
		}
		if(this == VanillaBlocks.crate){
			setStepSound(wood);
		}
	}
	
	public static Item getBlock(Block b){
		return Item.getItemFromBlock(b);
	}
	
	public Item getItemDropped(int par1, Random par2, int par3) {
		return (this == VanillaBlocks.bloodgemOre) ? VanillaItemsOther.bloodgem : getBlock(this);
	}

	public int func_149679_a(int par1, Random par2)
	{
		if (par1 > 0 && getBlock(this) != this.getItemDropped(0, par2, par1))
		{
			int j = par2.nextInt(par1 + 2) - 1;

			if (j < 0)
			{
				j = 0;
			}

			return this.quantityDropped(par2) * (j + 1);
		}
		else
		{
			return this.quantityDropped(par2);
		}
	}

	private Random rand = new Random();
	@Override
	public int getExpDrop(IBlockAccess block, int par5, int par7)
	{
		if (this.getItemDropped(par5, rand, par7) != getBlock(this))
		{
			int j1 = 0;

			if(this == VanillaBlocks.bloodgemOre){
				j1 = MathHelper.getRandomIntegerInRange(rand, 0, 4);
			}
			return j1;
		}
		return 0;
	}
}