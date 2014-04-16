package net.divinerpg.api.blocks;

import net.divinerpg.Reference;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneLight;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockModLight extends BlockMod {
	
	public BlockModLight(Material mat) {
		super(mat);
        setLightLevel(1.0F);
        setCreativeTab(DivineRPGTabs.blocks);
        setStepSound(soundTypeGlass);
	}
}
