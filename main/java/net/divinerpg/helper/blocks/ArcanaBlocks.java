package net.divinerpg.helper.blocks;

import net.divinerpg.api.blocks.BlockModDirt;
import net.divinerpg.api.blocks.BlockModGlass;
import net.divinerpg.api.blocks.BlockModGrass;
import net.divinerpg.api.blocks.BlockModLadder;
import net.divinerpg.arcana.blocks.ArcanaBlock;
import net.divinerpg.arcana.blocks.BlockOreDoor;
import net.divinerpg.helper.items.ArcanaItems;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ArcanaBlocks {

	private static Material rock = Material.rock;
	
	public static Block arcanaGrass;
	public static final Block arcanaDirt 			= new BlockModDirt().setName("arcaniteDirt");
	public static final Block arcaniumOre 			= new ArcanaBlock(rock).setName("arcaniumOre");
	public static final Block arcaniumMetal 		= new ArcanaBlock(rock).setName("arcaniumMetal");
	public static final Block arcanitetubes 		= new BlockModLadder().setName("arcaniteTubes");
	public static final Block arcaniumPower 		= new ArcanaBlock(rock).setName("arcaniumPower");
	public static final Block dungenLamp     		= new ArcanaBlock(rock).setName("dungenLamp");
	public static final Block heatTrap		 		= new ArcanaBlock(rock).setName("heatTrap");
	public static final Block heatTrapOn			= new ArcanaBlock(rock).setName("heatTrapOn");
	public static final Block soulStone		    	= new ArcanaBlock(rock).setName("soulStone");
	public static final Block soulSludge			= new ArcanaBlock(rock).setName("soulSludge");
	public static final Block degradedBrick			= new ArcanaBlock(rock).setName("degradedBrick");
	public static final Block darkDegradedBrick 	= new ArcanaBlock(rock).setName("darkDegradedBrick");
	public static final Block lightDegradedBrick 	= new ArcanaBlock(rock).setName("lightDegradedBrick");
	public static final Block stainedGlass 			= new BlockModGlass().setName("stainedGlass");
	public static final Block stainedGlass2 		= new BlockModGlass().setName("stainedGlass2");
	public static final Block stainedGlass3			= new BlockModGlass().setName("stainedGlass3");
	public static final Block stainedGlass4 		= new BlockModGlass().setName("stainedGlass4");
	public static final Block stainedGlass5 		= new BlockModGlass().setName("stainedGlass5");
	public static final Block stainedGlass6 		= new BlockModGlass().setName("stainedGlass6");
	public static final Block stainedGlass7 		= new BlockModGlass().setName("stainedGlass7");
	public static final Block stainedGlass8 		= new BlockModGlass().setName("stainedGlass8");

	public static final Block oreDoor1 				= new BlockOreDoor(Material.iron, ArcanaItems.oreDoorItem1, ArcanaItems.oreKey1).setName("oreDoor1").setCreativeTab(DivineRPGTabs.blocks);
	
	public static void init(){
		arcanaGrass = new BlockModGrass(arcanaGrass, arcanaDirt, "arcanite");
	}
}