package net.divinerpg.helper.blocks;

import net.divinerpg.*;
import net.divinerpg.helper.*;
import net.divinerpg.twilight.*;
import net.divinerpg.twilight.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.*;
import cpw.mods.fml.common.registry.*;

public class TwilightBlocks {

	public static Reference x;
	static Material rock = Material.field_151576_e;
	
	public static final Block edenGrass = new BlockEdenGrass();//Dravite
	public static final Block wildWoodGrass = new BlockWildWoodGrass();//Azurite
	public static final Block apalachiaGrass = new BlockApalachiaGrass();//Uvite
	public static final Block skythernGrass = new BlockSkythernGrass();//Mythril
	public static final Block mortumGrass = new BlockMortumGrass();//Augite

	public static final Block edenDirt = new BlockModDirt().func_149658_d(x.prefix + "edendirt").func_149663_c("edenDirt");
	public static final Block wildWoodDirt = new BlockModDirt().func_149658_d(x.prefix + "wildwooddirt").func_149663_c("wildWoodDirt");
	public static final Block apalachiaDirt = new BlockModDirt().func_149658_d(x.prefix + "apalachiadirt").func_149663_c("apalachiaDirt");
	public static final Block skythernDirt = new BlockModDirt().func_149658_d(x.prefix + "skytherndirt").func_149663_c("skythernDirt");
	public static final Block mortumDirt = new BlockModDirt().func_149658_d(x.prefix + "mortumdirt").func_149663_c("mortumDirt");

	public static final Block edenOre = new TwilightBlock(rock).func_149658_d(x.prefix + "edenore").func_149663_c("EdenOre");
	public static final Block wildWoodOre = new TwilightBlock(rock).func_149658_d(x.prefix + "wildwoodore").func_149663_c("wildWoodOre");
	public static final Block apalachiaOre = new TwilightBlock(rock).func_149658_d(x.prefix + "apalachiaore").func_149663_c("apalachiaOre");
	public static final Block skythernOre = new TwilightBlock(rock).func_149658_d(x.prefix + "skythernore").func_149663_c("skythernOre");
	public static final Block mortumOre = new TwilightBlock(rock).func_149658_d(x.prefix + "mortumore").func_149663_c("mortumOre");
	
	public static final Block edenBlock = new TwilightBlock(rock).func_149658_d(x.prefix + "edenblock").func_149663_c("EdenBlock");
	public static final Block wildWoodBlock = new TwilightBlock(rock).func_149658_d(x.prefix + "wildwoodblock").func_149663_c("wildWoodBlock");
	public static final Block apalachiaBlock = new TwilightBlock(rock).func_149658_d(x.prefix + "apalachiablock").func_149663_c("apalachiaBlock");
	public static final Block skythernBlock = new TwilightBlock(rock).func_149658_d(x.prefix + "skythernblock").func_149663_c("skythernBlock");
	public static final Block mortumBlock = new TwilightBlock(rock).func_149658_d(x.prefix + "mortumblock").func_149663_c("mortumBlock");
	
	
	public static final Block twilightStone = new TwilightBlock(rock).func_149658_d(x.prefix + "twilightstone").func_149663_c("TwilightStone");
	public static final Block blueFire = new BlockBlueFire().func_149658_d("fire").func_149663_c("BlueFire");
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
