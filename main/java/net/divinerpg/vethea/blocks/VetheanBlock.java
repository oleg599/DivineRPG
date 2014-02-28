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
		LangRegistry.addBlock(this);
		setCreativeTab(DivineRPGTabs.vethea);
		setSoundType(rock);
	}

	public Block setSoundType(Block.SoundType name) {
    	return setStepSound(name);
    }
}