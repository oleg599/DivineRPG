package net.divinerpg.iceika.blocks;

import java.util.Random;

import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.helper.blocks.IceikaBlocks;
import net.divinerpg.helper.blocks.VanillaBlocks;
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

public class IceikaBlock extends BlockMod {

    private static SoundType gravel = Block.soundTypeGravel;

	public IceikaBlock(Material m){
		super(m);
		setCreativeTab(DivineRPGTabs.blocks);
		setStepSound(gravel);
	}
}