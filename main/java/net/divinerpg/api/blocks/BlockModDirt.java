package net.divinerpg.api.blocks;

import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockModDirt extends BlockMod {

    private static Material dirt = Material.ground;
    private static SoundType gravel = Block.soundTypeGravel;

    public BlockModDirt() {
        super(dirt);
        setCreativeTab(DivineRPGTabs.blocks);
        setStepSound(gravel);
    }
}