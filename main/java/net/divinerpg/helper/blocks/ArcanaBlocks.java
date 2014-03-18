package net.divinerpg.helper.blocks;

import net.divinerpg.api.blocks.BlockModDirt;
import net.divinerpg.api.blocks.BlockModGrass;
import net.divinerpg.arcana.blocks.ArcanaBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ArcanaBlocks {

	private static Material rock = Material.rock;
	
	public static Block arcanaGrass;
	public static final Block arcanaDirt 			= new BlockModDirt().setName("arcaniteDirt");
	public static final Block arcaniumOre 			= new ArcanaBlock(rock).setName("arcaniumOre");
	public static final Block arcaniumMetal 		= new ArcanaBlock(rock).setName("arcaniumMetal");
	public static final Block arcanitetubes 		= new ArcanaBlock(rock).setName("arcaniteTubes");
	public static final Block arcaniumPower 		= new ArcanaBlock(rock).setName("arcaniumPower");
	public static final Block heatTrap		 		= new ArcanaBlock(rock).setName("heatTrap");
	public static final Block heatTrapOn			= new ArcanaBlock(rock).setName("heatTrapOn");
	public static final Block soulStone		    	= new ArcanaBlock(rock).setName("soulStone");
	public static final Block soulSludge			= new ArcanaBlock(rock).setName("soulSludge");
	public static final Block degradedBrick			= new ArcanaBlock(rock).setName("degradedBrick");
	public static final Block darkDegradedBrick 	= new ArcanaBlock(rock).setName("darkDegradedBrick");
	public static final Block lightDegradedBrick 	= new ArcanaBlock(rock).setName("lightDegradedBrick");

	public static void init(){
		arcanaGrass = new BlockModGrass(arcanaGrass, arcanaDirt, "arcanite");
	}
}