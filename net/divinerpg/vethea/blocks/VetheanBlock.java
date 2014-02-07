package net.divinerpg.vethea.blocks;

import java.util.Random;

import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.helper.blocks.IceikaBlocks;
import net.divinerpg.helper.blocks.VanillaBlocks;
import net.divinerpg.helper.blocks.VetheaBlocks;
import net.divinerpg.helper.items.VanillaItems;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

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