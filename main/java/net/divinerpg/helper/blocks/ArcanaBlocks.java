package net.divinerpg.helper.blocks;

import net.divinerpg.api.blocks.BlockModDirt;
import net.divinerpg.api.blocks.BlockModGlass;
import net.divinerpg.api.blocks.BlockModGrass;
import net.divinerpg.api.blocks.BlockModLadder;
import net.divinerpg.blocks.arcana.ArcanaBlock;
import net.divinerpg.blocks.arcana.ArcanaSpawner;
import net.divinerpg.blocks.arcana.BlockArcanaFrame;
import net.divinerpg.blocks.arcana.BlockArcanaPortal;
import net.divinerpg.blocks.arcana.BlockOreDoor;
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
	public static final Block ancientBrick		 	= new ArcanaBlock(rock).setName("ancientBrick");
	public static final Block ancientStone		 	= new ArcanaBlock(rock).setName("ancientStone");
	public static final Block lightDegradedBrick 	= new ArcanaBlock(rock).setName("lightDegradedBrick");
	public static final Block stainedGlass 			= new BlockModGlass().setName("stainedGlass");
	public static final Block stainedGlass2 		= new BlockModGlass().setName("stainedGlass2");
	public static final Block stainedGlass3			= new BlockModGlass().setName("stainedGlass3");
	public static final Block stainedGlass4 		= new BlockModGlass().setName("stainedGlass4");
	public static final Block stainedGlass5 		= new BlockModGlass().setName("stainedGlass5");
	public static final Block stainedGlass6 		= new BlockModGlass().setName("stainedGlass6");
	public static final Block stainedGlass7 		= new BlockModGlass().setName("stainedGlass7");
	public static final Block stainedGlass8 		= new BlockModGlass().setName("stainedGlass8");
	public static final Block dramixAltar	 		= new BlockModGlass().setName("dramixAltar");
	public static final Block parasectaAltar 		= new BlockModGlass().setName("parasectaAltar");
	public static final Block dungenSpawnerPrisoner = new ArcanaSpawner("").setName("dungenSpawnerPrisoner");
	public static final Block razorbackSpawner      = new ArcanaSpawner("").setName("razorbackSpawner");
	public static final Block deathHoundSpawner 	= new ArcanaSpawner("").setName("deathHoundSpawner");
	public static final Block deathcryxSpawner      = new ArcanaSpawner("").setName("deathcryxSpawner");
	public static final Block livingStatueSpawner 	= new ArcanaSpawner("").setName("livingStatueSpawner");
	public static final Block roamerSpawner			= new ArcanaSpawner("").setName("roamerSpawner");
	public static final Block ancientTile 			= new ArcanaBlock(rock).setName("ancientTile");
	public static final Block extractor 			= new ArcanaBlock(rock).setName("extractor");
	public static final Block arcanaPortalFrame     = new BlockArcanaFrame().setName("arcanaPortalFrame");
	public static final Block arcanaPortal     		= new BlockArcanaPortal().setName("arcanaPortal");

	public static final Block oreDoor1 				= new BlockOreDoor(ArcanaItems.oreDoorItem1, ArcanaItems.oreKey1).setName("oreDoor1");
	public static final Block oreDoor2		 		= new BlockOreDoor(ArcanaItems.oreDoorItem2, ArcanaItems.oreKey2).setName("oreDoor2");
	public static final Block oreDoor3		 		= new BlockOreDoor(ArcanaItems.oreDoorItem3, ArcanaItems.oreKey3).setName("oreDoor3");
	public static final Block oreDoor4		 		= new BlockOreDoor(ArcanaItems.oreDoorItem4, ArcanaItems.oreKey4).setName("oreDoor4");
	
	public static void init(){
		arcanaGrass = new BlockModGrass(arcanaGrass, arcanaDirt, "arcanite");
	}
}