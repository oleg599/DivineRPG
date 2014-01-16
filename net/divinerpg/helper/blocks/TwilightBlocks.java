package net.divinerpg.helper.blocks;

import net.divinerpg.*;
import net.divinerpg.helper.*;
import net.divinerpg.twilight.*;
import net.divinerpg.twilight.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.*;
import cpw.mods.fml.common.registry.*;

public class TwilightBlocks {
	static Material rock = Material.field_151576_e;
	
	public static final Block edenGrass = new BlockEdenGrass();//Dravite
	public static final Block wildWoodGrass = new BlockWildWoodGrass();//Azurite
	public static final Block apalachiaGrass = new BlockApalachiaGrass();//Uvite
	public static final Block skythernGrass = new BlockSkythernGrass();//Mythril
	public static final Block mortumGrass = new BlockMortumGrass();//Augite

	public static final Block edenDirt = new BlockModDirt().setTextureName("edenDirt").func_149663_c("edenDirt");
	public static final Block wildWoodDirt = new BlockModDirt().setTextureName("wildWoodDirt").func_149663_c("wildWoodDirt");
	public static final Block apalachiaDirt = new BlockModDirt().setTextureName("apalachiaDirt").func_149663_c("apalachiaDirt");
	public static final Block skythernDirt = new BlockModDirt().setTextureName("skythernDirt").func_149663_c("skythernDirt");
	public static final Block mortumDirt = new BlockModDirt().setTextureName("mortumDirt").func_149663_c("mortumDirt");

	public static final Block edenOre = new TwilightBlock(rock).setTextureName("edenOre").func_149663_c("edenOre");
	public static final Block wildWoodOre = new TwilightBlock(rock).setTextureName("wildWoodOre").func_149663_c("wildWoodOre");
	public static final Block apalachiaOre = new TwilightBlock(rock).setTextureName("apalachiaOre").func_149663_c("apalachiaOre");
	public static final Block skythernOre = new TwilightBlock(rock).setTextureName("skythernOre").func_149663_c("skythernOre");
	public static final Block mortumOre = new TwilightBlock(rock).setTextureName("mortumOre").func_149663_c("mortumOre");
	
	public static final Block edenBlock = new TwilightBlock(rock).setTextureName("edenBlock").func_149663_c("edenBlock");
	public static final Block wildWoodBlock = new TwilightBlock(rock).setTextureName("wildWoodBlock").func_149663_c("wildWoodBlock");
	public static final Block apalachiaBlock = new TwilightBlock(rock).setTextureName("apalachiaBlock").func_149663_c("apalachiaBlock");
	public static final Block skythernBlock = new TwilightBlock(rock).setTextureName("skythernBlock").func_149663_c("skythernBlock");
	public static final Block mortumBlock = new TwilightBlock(rock).setTextureName("mortumBlock").func_149663_c("mortumBlock");
	
	
	public static final Block twilightStone = new TwilightBlock(rock).setTextureName("twilightStone").func_149663_c("twilightStone");
	public static final Block blueFire = new BlockBlueFire().setTextureName("fire").func_149663_c("blueFire");
	public static final Block edenPortal = new BlockEdenPortal();
	
	public static void init(){
		DivineAPI.addBlock(edenGrass, "Eden Grass");
		DivineAPI.addBlock(wildWoodGrass, "Wild Wood Grass");
		DivineAPI.addBlock(apalachiaGrass, "Apalachia Grass");
		DivineAPI.addBlock(skythernGrass, "Skythern Grass");
		DivineAPI.addBlock(mortumGrass, "Mortum Grass");
		
		DivineAPI.addBlock(edenDirt, "Eden Dirt");
		DivineAPI.addBlock(wildWoodDirt, "Wild Wood Dirt");
		DivineAPI.addBlock(apalachiaDirt, "Apalachia Dirt");
		DivineAPI.addBlock(skythernDirt, "Skythern Dirt");
		DivineAPI.addBlock(mortumDirt, "Mortum Dirt");
		
		DivineAPI.addBlock(edenOre, "Eden Ore");
		DivineAPI.addBlock(wildWoodOre, "Wild Wood Ore");
		DivineAPI.addBlock(apalachiaOre, "Apalachia Ore");
		DivineAPI.addBlock(skythernOre, "Skythern Ore");
		DivineAPI.addBlock(mortumOre, "Mortum Ore");
		
		DivineAPI.addBlock(edenBlock, "Eden Block");
		DivineAPI.addBlock(wildWoodBlock, "Wild Wood Block");
		DivineAPI.addBlock(apalachiaBlock, "Apalachia Block");
		DivineAPI.addBlock(skythernBlock, "Skythern Block");
		DivineAPI.addBlock(mortumBlock, "Mortum Block");
		
		DivineAPI.addBlock(twilightStone, "Twilight Stone");
		DivineAPI.addBlock(edenPortal, "Eden Portal");
		DivineAPI.addBlock(blueFire, "Blue Fire");
	}
}
