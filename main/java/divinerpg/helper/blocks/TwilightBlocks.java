package divinerpg.helper.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import divinerpg.api.blocks.BlockModDirt;
import divinerpg.api.blocks.BlockModGrass;
import divinerpg.api.blocks.BlockModLeaves;
import divinerpg.api.blocks.BlockModLog;
import divinerpg.api.blocks.BlockModVine;
import divinerpg.twilight.blocks.BlockBlueFire;
import divinerpg.twilight.blocks.BlockEdenPortal;
import divinerpg.twilight.blocks.BlockTwilightFurnace;
import divinerpg.twilight.blocks.BlockWildwoodPortal;
import divinerpg.twilight.blocks.TwilightBlock;

public class TwilightBlocks {
	
    static Material           rock            = Material.rock;

    public static Block       edenGrass;                                                           //Dravite
    public static Block       wildWoodGrass;                                                       //Azurite
    public static Block       apalachiaGrass;                                                      //Uvite
    public static Block       skythernGrass;                                                       //Mythril
    public static Block       mortumGrass;                                                         //Augite

    public static final Block edenDirt        		= new BlockModDirt().setName("edenDirt");
    public static final Block wildWoodDirt    		= new BlockModDirt().setName("wildWoodDirt");
    public static final Block apalachiaDirt   		= new BlockModDirt().setName("apalachiaDirt");
    public static final Block skythernDirt    		= new BlockModDirt().setName("skythernDirt");
    public static final Block mortumDirt      		= new BlockModDirt().setName("mortumDirt");

    public static final Block edenOre         		= new TwilightBlock(rock).setName("edenOre");
    public static final Block wildWoodOre     		= new TwilightBlock(rock).setName("wildWoodOre");
    public static final Block apalachiaOre    		= new TwilightBlock(rock).setName("apalachiaOre");
    public static final Block skythernOre     		= new TwilightBlock(rock).setName("skythernOre");
    public static final Block mortumOre       		= new TwilightBlock(rock).setName("mortumOre");

    public static final Block edenBlock       		= new TwilightBlock(rock).setName("edenBlock");
    public static final Block wildWoodBlock   		= new TwilightBlock(rock).setName("wildWoodBlock");
    public static final Block apalachiaBlock  		= new TwilightBlock(rock).setName("apalachiaBlock");
    public static final Block skythernBlock   		= new TwilightBlock(rock).setName("skythernBlock");
    public static final Block mortumBlock     		= new TwilightBlock(rock).setName("mortumBlock");

    public static final Block edenLeaves      		= new BlockModLeaves().setName("edenLeaves");
    public static final Block wildWoodLeaves  		= new BlockModLeaves().setName("wildWoodLeaves");
    public static final Block apalachiaLeaves 		= new BlockModLeaves().setName("apalachiaLeaves");
    public static final Block skythernLeaves  		= new BlockModLeaves().setName("skythernLeaves");
    public static final Block mortumLeaves    		= new BlockModLeaves().setName("mortumLeaves");

    public static final Block edenLogs        		= new BlockModLog().setName("edenLog");
    public static final Block wildWoodLogs    		= new BlockModLog().setName("wildWoodLog");
    public static final Block apalachiaLogs   		= new BlockModLog().setName("apalachiaLog");
    public static final Block skythernLogs    		= new BlockModLog().setName("skythernLog");
    public static final Block mortumLogs      		= new BlockModLog().setName("mortumLog");

    public static final Block twilightStone   			 = new TwilightBlock(rock).setName("twilightStone");
    public static final Block wildWoodsVine   			 = new BlockModVine().setName("wildWoodsVine");
    public static final Block blueFire        			 = new BlockBlueFire().setName("blueFire");
    public static final BlockEdenPortal edenPortal  	 = (BlockEdenPortal)new BlockEdenPortal().setName("edenPortal");
    public static final BlockWildwoodPortal wildWoodPortal= (BlockWildwoodPortal)new BlockWildwoodPortal().setName("wildwoodPortal");
    public static final Block apalachiaPortal  			 = new TwilightBlock(rock).setName("apalachiaPortal");
    public static final Block skythernPortal   			 = new TwilightBlock(rock).setName("skythernPortal");
    public static final Block mortumPortal     			 = new TwilightBlock(rock).setName("mortumPortal");
    public static final Block twilightFurnace 			 = new BlockTwilightFurnace(false).setName("twilightFurnace");
    public static final Block twilightFurnaceOn 		 = new BlockTwilightFurnace(true).setName("twilightFurnaceOn");
    
    public static void init() {
        edenGrass = new BlockModGrass(edenGrass, edenDirt, "eden");
        wildWoodGrass = new BlockModGrass(wildWoodGrass, wildWoodDirt, "wildwood");
        apalachiaGrass = new BlockModGrass(apalachiaGrass, apalachiaDirt, "apalachia");
        skythernGrass = new BlockModGrass(skythernGrass, skythernDirt, "skythern");
        mortumGrass = new BlockModGrass(mortumGrass, mortumDirt, "mortum");
    }
}