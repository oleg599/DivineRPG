package net.divinerpg.vethea.blocks;

import java.util.Random;

import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.helper.DivineRPGTabs;
import net.divinerpg.helper.blocks.VanillaBlocks;
import net.divinerpg.helper.items.VanillaItems;
import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

public class VetheanBlock extends BlockMod {
        
	private static SoundType stone = Block.field_149769_e;
	private static SoundType grass = Block.field_149779_h;
	private static SoundType cloth = Block.field_149775_l;
	private static SoundType wood = Block.field_149766_f;

	public VetheanBlock()
	{
		super(rock);
		setCreativeTab(DivineRPGTabs.blocks);
		setSoundType(stone);
	}
	
	public static Item getBlock(Block b){
		return Item.func_150898_a(b);
	}
	public Block setCreativeTab(CreativeTabs name) {
        return func_149647_a(name);
    }
	public Block setSoundType(Block.SoundType name) {
    	return func_149672_a(name);
    }
	
	public Item func_149650_a(int par1, Random par2, int par3) {
		return getBlock(this);
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
	
    public Block setHardness(float p_149711_1_)
    {
        this.field_149782_v = p_149711_1_;

        if (this.field_149781_w < p_149711_1_ * 5.0F)
        {
            this.field_149781_w = p_149711_1_ * 5.0F;
        }

        return this;
    }
    
}