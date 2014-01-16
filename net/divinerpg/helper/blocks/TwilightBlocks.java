package net.divinerpg.helper.blocks;

import net.divinerpg.Reference;
import net.divinerpg.helper.tab.DivineRPGTabs;
import net.divinerpg.twilight.BlockModDirt;
import net.divinerpg.twilight.TwilightBlock;
import net.divinerpg.twilight.eden.blocks.BlockEdenGrass;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class TwilightBlocks {

	public static Reference x;
	static Material rock = Material.field_151576_e;
	
	public static final Block edenGrass = new BlockEdenGrass();
	public static final Block edenDirt = new BlockModDirt().func_149658_d(x.prefix + "edendirt").func_149663_c("edenDirt");
	public static final Block edenOre = new TwilightBlock(rock).func_149658_d(x.prefix + "edenore").func_149663_c("EdenOre");
	
	public static void init(){
		addBlock(edenGrass, "Eden Grass");
		addBlock(edenDirt, "Eden Dirt");
		addBlock(edenOre, "Eden Ore");
	}
	
	public static void addBlock(Block block, String name){
		GameRegistry.registerBlock(block, name);
		LanguageRegistry.addName(block, name);
	}
	
}
