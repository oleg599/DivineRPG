package net.divinerpg.iceika.blocks;

import java.util.Random;

import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.helper.DivineRPGTabs;
import net.divinerpg.helper.blocks.IceikaBlocks;
import net.divinerpg.helper.blocks.VanillaBlocks;
import net.divinerpg.helper.items.VanillaItems;
import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

public class IceikaBlock extends BlockMod {

    private static SoundType gravel = Block.field_149767_g;

	public IceikaBlock(Material m)
	{
		super(m);
		setCreativeTab(DivineRPGTabs.blocks);
		setSoundType(gravel);
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