package net.divinerpg.blocks.vethea;

import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class VetheanBlock extends BlockMod {

    private static SoundType rock = Block.soundTypeStone;

	public VetheanBlock(Material m/*, float hardness, SoundType sound*/) {
		super(m);
		setCreativeTab(DivineRPGTabs.vethea);
		//setSoundType(sound);
		//setHardness(hardness);
	}

	public Block setSoundType(Block.SoundType name) {
    	return setStepSound(name);
    }
}