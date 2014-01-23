package net.divinerpg.helper.blocks;

import net.divinerpg.api.blocks.*;
import net.divinerpg.vethea.blocks.VetheanBlock;
import net.minecraft.block.Block;

public class VetheaBlocks {

	public static Block dreamGrass;
	public static final Block dreamDirt = new BlockModDirt().setName("dreamDirt");
	public static final Block dreamWoodLog = new BlockModLog().setName("dreamWoodLog");
	public static final Block fireCrystal = new VetheanBlock().setName("fireCrystal");
	public static final Block hyreWood = new BlockModLog().setName("hyreWoodLog");
	public static final Block dreamBricks = new VetheanBlock().setName("dreamBricks1");
	public static final Block dreamBricks2 = new VetheanBlock().setName("dreamBricks2");
	public static final Block dreamWoodLeaves = new BlockModLeaves().setName("dreamWoodLeaves");
	
	
	public static void init(){
		dreamGrass = new BlockModGrass(dreamGrass, dreamDirt, "dream");
	}
	
}
