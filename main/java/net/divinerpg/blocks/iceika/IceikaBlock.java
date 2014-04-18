package net.divinerpg.blocks.iceika;

import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;

public class IceikaBlock extends BlockMod {

	public IceikaBlock(Material m, float hardness, SoundType sound){
		super(m);
		setCreativeTab(DivineRPGTabs.blocks);
		setHardness(hardness);
		setStepSound(sound);
	}
}