package net.divinerpg.vethea.blocks;

import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class VetheanBlock extends BlockMod {

    private static SoundType rock = Block.soundTypeStone;

	public VetheanBlock(Material m) {
		super(m);
		setCreativeTab(DivineRPGTabs.vethea);
		setSoundType(rock);
		setHardness(1F);
	}

	public Block setSoundType(Block.SoundType name) {
    	return setStepSound(name);
    }
}