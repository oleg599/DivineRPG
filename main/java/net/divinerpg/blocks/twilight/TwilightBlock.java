package net.divinerpg.blocks.twilight;

import java.util.List;
import java.util.Random;

import net.divinerpg.Reference;
import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.helper.Util;
import net.divinerpg.helper.blocks.TwilightBlocks;
import net.divinerpg.helper.items.TwilightItemsOther;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;

public class TwilightBlock extends BlockMod {

	public static int edenArmor = 1; //For Eden armor extra drops
	
	public TwilightBlock(Material m, float hardness) {
		super(m);
		setCreativeTab(DivineRPGTabs.blocks);
		setStepSound(Block.soundTypeStone);
		setHardness(hardness);
	}

	public static Item getBlock(Block b){
		return Item.getItemFromBlock(b);
	}

	public boolean isOre(){
		if(this == TwilightBlocks.edenOre || this == TwilightBlocks.wildWoodOre || this == TwilightBlocks.apalachiaOre ||
				this == TwilightBlocks.skythernOre || this == TwilightBlocks.mortumOre){
			return true;
		}
		return false;
	}

	public Item getItemDropped(int par1, Random par2, int par3) {
		return (this == TwilightBlocks.edenOre) ? TwilightItemsOther.edenFragments 
				: (this == TwilightBlocks.wildWoodOre) ? TwilightItemsOther.wildWoodFragments 
				: (this == TwilightBlocks.apalachiaOre) ? TwilightItemsOther.apalachiaFragments
				: (this == TwilightBlocks.skythernOre) ? TwilightItemsOther.skythernFragments
				: (this == TwilightBlocks.mortumOre) ? TwilightItemsOther.mortumFragments
				: getBlock(this);
	}
	
	public int quantityDropped(Random rand) {
		if (this == TwilightBlocks.edenOre || this == TwilightBlocks.wildWoodOre || this == TwilightBlocks.apalachiaOre || this == TwilightBlocks.skythernOre || this == TwilightBlocks.mortumOre) {
			return edenArmor;
		} else {
			return 1;
		}
    }

	public int func_149679_a(int par1, Random par2) {
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
	public int getExpDrop(IBlockAccess block, int par5, int par7) {
		if (this.getItemDropped(par5, rand, par7) != getBlock(this)) {
			int j1 = 0;

			if(this == TwilightBlocks.edenOre){
				j1 = MathHelper.getRandomIntegerInRange(rand, 0, 4);
			}
			return j1;
		}
		return 0;
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