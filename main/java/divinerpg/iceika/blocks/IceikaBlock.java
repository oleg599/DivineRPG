package divinerpg.iceika.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import divinerpg.api.blocks.BlockMod;
import divinerpg.helper.tabs.DivineRPGTabs;

public class IceikaBlock extends BlockMod {

    private static SoundType gravel = Block.soundTypeGravel;

	public IceikaBlock(Material m){
		super(m);
		setCreativeTab(DivineRPGTabs.blocks);
		setStepSound(gravel);
	}
}