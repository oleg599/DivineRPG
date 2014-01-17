package net.divinerpg.helper.blocks;

import net.divinerpg.twilight.BlockModDirt;
import net.divinerpg.twilight.TwilightBlock;
import net.divinerpg.twilight.blocks.BlockBlueFire;
import net.divinerpg.twilight.blocks.BlockEdenPortal;
import net.divinerpg.twilight.blocks.BlockModGrass;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TwilightBlocks {
    static Material           rock           = Material.field_151576_e;

    public static Block edenGrass;//Dravite
    public static Block wildWoodGrass;//Azurite
    public static Block apalachiaGrass;//Uvite
    public static Block skythernGrass;//Mythril
    public static Block mortumGrass;//Augite

    public static final Block edenDirt       = new BlockModDirt().setName("edenDirt");
    public static final Block wildWoodDirt   = new BlockModDirt().setName("wildWoodDirt");
    public static final Block apalachiaDirt  = new BlockModDirt().setName("apalachiaDirt");
    public static final Block skythernDirt   = new BlockModDirt().setName("skythernDirt");
    public static final Block mortumDirt     = new BlockModDirt().setName("mortumDirt");

    public static final Block edenOre        = new TwilightBlock(rock).setName("edenOre");
    public static final Block wildWoodOre    = new TwilightBlock(rock).setName("wildWoodOre");
    public static final Block apalachiaOre   = new TwilightBlock(rock).setName("apalachiaOre");
    public static final Block skythernOre    = new TwilightBlock(rock).setName("skythernOre");
    public static final Block mortumOre      = new TwilightBlock(rock).setName("mortumOre");

    public static final Block edenBlock      = new TwilightBlock(rock).setName("edenBlock");
    public static final Block wildWoodBlock  = new TwilightBlock(rock).setName("wildWoodBlock");
    public static final Block apalachiaBlock = new TwilightBlock(rock).setName("apalachiaBlock");
    public static final Block skythernBlock  = new TwilightBlock(rock).setName("skythernBlock");
    public static final Block mortumBlock    = new TwilightBlock(rock).setName("mortumBlock");

    public static final Block twilightStone  = new TwilightBlock(rock).setName("twilightStone");
    public static final Block blueFire       = new BlockBlueFire().setName("blueFire");
    public static final Block edenPortal     = new BlockEdenPortal();

	public static void init(){
        edenGrass = new BlockModGrass(edenGrass, edenDirt, "eden");
        wildWoodGrass = new BlockModGrass(wildWoodGrass, wildWoodDirt, "wildwood");
        apalachiaGrass = new BlockModGrass(apalachiaGrass, apalachiaDirt, "apalachia");
        skythernGrass = new BlockModGrass(skythernGrass, skythernDirt, "skythern");
        mortumGrass = new BlockModGrass(mortumGrass, mortumDirt, "mortum");
//		DivineAPI.addBlock(edenGrass, "Eden Grass");
//		DivineAPI.addBlock(wildWoodGrass, "Wild Wood Grass");
//		DivineAPI.addBlock(apalachiaGrass, "Apalachia Grass");
//		DivineAPI.addBlock(skythernGrass, "Skythern Grass");
//		DivineAPI.addBlock(mortumGrass, "Mortum Grass");
//		
//		DivineAPI.addBlock(edenDirt, "Eden Dirt");
//		DivineAPI.addBlock(wildWoodDirt, "Wild Wood Dirt");
//		DivineAPI.addBlock(apalachiaDirt, "Apalachia Dirt");
//		DivineAPI.addBlock(skythernDirt, "Skythern Dirt");
//		DivineAPI.addBlock(mortumDirt, "Mortum Dirt");
//		
//		DivineAPI.addBlock(edenOre, "Eden Ore");
//		DivineAPI.addBlock(wildWoodOre, "Wild Wood Ore");
//		DivineAPI.addBlock(apalachiaOre, "Apalachia Ore");
//		DivineAPI.addBlock(skythernOre, "Skythern Ore");
//		DivineAPI.addBlock(mortumOre, "Mortum Ore");
//		
//		DivineAPI.addBlock(edenBlock, "Eden Block");
//		DivineAPI.addBlock(wildWoodBlock, "Wild Wood Block");
//		DivineAPI.addBlock(apalachiaBlock, "Apalachia Block");
//		DivineAPI.addBlock(skythernBlock, "Skythern Block");
//		DivineAPI.addBlock(mortumBlock, "Mortum Block");
//		
//		DivineAPI.addBlock(twilightStone, "Twilight Stone");
//		DivineAPI.addBlock(edenPortal, "Eden Portal");
//		DivineAPI.addBlock(blueFire, "Blue Fire");
	}
}
