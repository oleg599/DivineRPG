package net.divinerpg.iceika.blocks;

import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class IceikaBlock extends BlockMod {

    private static SoundType gravel = Block.soundTypeGravel;

	public IceikaBlock(Material m){
		super(m);
		setCreativeTab(DivineRPGTabs.blocks);
		setStepSound(gravel);
	}
}