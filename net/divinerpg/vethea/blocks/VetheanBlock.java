package net.divinerpg.vethea.blocks;

import java.util.Random;

import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.helper.blocks.IceikaBlocks;
import net.divinerpg.helper.blocks.VanillaBlocks;
import net.divinerpg.helper.blocks.VetheaBlocks;
import net.divinerpg.helper.items.VanillaItems;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

public class VetheanBlock extends BlockMod {

    private static SoundType rock = Block.field_149780_i;

	public VetheanBlock(Material m)
	{
		super(m);
		setCreativeTab(DivineRPGTabs.vethea);
		setSoundType(rock);
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