package divinerpg.vethea.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import divinerpg.api.blocks.BlockMod;
import divinerpg.helper.tabs.DivineRPGTabs;
import divinerpg.helper.utils.LangRegistry;

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