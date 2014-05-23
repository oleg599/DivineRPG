package net.divinerpg.helper.blocks;

import net.divinerpg.api.blocks.BlockModDirt;
import net.divinerpg.api.blocks.BlockModGrass;
import net.divinerpg.api.blocks.BlockModLeaves;
import net.divinerpg.api.blocks.BlockModLog;
import net.divinerpg.api.blocks.BlockModVine;
import net.divinerpg.blocks.twilight.BlockBlueFire;
import net.divinerpg.blocks.twilight.BlockTwilightPortal;
import net.divinerpg.blocks.twilight.BlockTwilightFurnace;
import net.divinerpg.blocks.twilight.BlockWildwoodPortal;
import net.divinerpg.blocks.twilight.TwilightBlock;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TwilightBlocks {

    static Material           rock              = Material.rock;

    public static Block       edenGrass;                                                                                                //Dravite
    public static Block       wildWoodGrass;                                                                                            //Azurite
    public static Block       apalachiaGrass;                                                                                           //Uvite
    public static Block       skythernGrass;                                                                                            //Mythril
    public static Block       mortumGrass;                                                                                              //Augite

    public static final Block edenDirt          = new BlockModDirt().setName("edenDirt");
    public static final Block wildWoodDirt      = new BlockModDirt().setName("wildWoodDirt");
    public static final Block apalachiaDirt     = new BlockModDirt().setName("apalachiaDirt");
    public static final Block skythernDirt      = new BlockModDirt().setName("skythernDirt");
    public static final Block mortumDirt        = new BlockModDirt().setName("mortumDirt");

    public static final Block edenOre           = new TwilightBlock(rock, 9.0F).setName("edenOre");
    public static final Block wildWoodOre       = new TwilightBlock(rock, 9.0F).setName("wildWoodOre");
    public static final Block apalachiaOre      = new TwilightBlock(rock, 9.0F).setName("apalachiaOre");
    public static final Block skythernOre       = new TwilightBlock(rock, 9.0F).setName("skythernOre");
    public static final Block mortumOre         = new TwilightBlock(rock, 9.0F).setName("mortumOre");

    public static final Block edenBlock         = new TwilightBlock(rock, 9.0F).setName("edenBlock");
    public static final Block wildWoodBlock     = new TwilightBlock(rock, 9.0F).setName("wildWoodBlock");
    public static final Block apalachiaBlock    = new TwilightBlock(rock, 9.0F).setName("apalachiaBlock");
    public static final Block skythernBlock     = new TwilightBlock(rock, 9.0F).setName("skythernBlock");
    public static final Block mortumBlock       = new TwilightBlock(rock, 9.0F).setName("mortumBlock");

    public static final Block edenLeaves        = new BlockModLeaves().setName("edenLeaves");
    public static final Block wildWoodLeaves    = new BlockModLeaves().setName("wildWoodLeaves");
    public static final Block apalachiaLeaves   = new BlockModLeaves().setName("apalachiaLeaves");
    public static final Block skythernLeaves    = new BlockModLeaves().setName("skythernLeaves");
    public static final Block mortumLeaves      = new BlockModLeaves().setName("mortumLeaves");

    public static final Block edenLogs          = new BlockModLog().setName("edenLog");
    public static final Block wildWoodLogs      = new BlockModLog().setName("wildWoodLog");
    public static final Block apalachiaLogs     = new BlockModLog().setName("apalachiaLog");
    public static final Block skythernLogs      = new BlockModLog().setName("skythernLog");
    public static final Block mortumLogs        = new BlockModLog().setName("mortumLog");

    public static final Block twilightStone     = new TwilightBlock(rock, 6.0F).setName("twilightStone");
    public static final Block wildWoodsVine     = new BlockModVine().setName("wildWoodsVine");
    public static final Block blueFire          = new BlockBlueFire().setName("blueFire");
    public static final Block edenPortal        = new BlockTwilightPortal("edenPortal", ConfigurationHelper.eden, VanillaBlocks.divineRock);
    public static final Block wildWoodPortal    = new BlockTwilightPortal("wildwoodPortal", ConfigurationHelper.wildWoods, edenBlock);
    public static final Block apalachiaPortal   = new TwilightBlock(rock, 0.0F).setName("apalachiaPortal");
    public static final Block skythernPortal    = new TwilightBlock(rock, 0.0F).setName("skythernPortal");
    public static final Block mortumPortal      = new TwilightBlock(rock, 0.0F).setName("mortumPortal");
    public static final Block twilightFurnace   = new BlockTwilightFurnace(false).setName("twilightFurnace");
    public static final Block twilightFurnaceOn = new BlockTwilightFurnace(true).setName("twilightFurnaceOn");

    public static void init() {
        edenGrass = new BlockModGrass(edenGrass, edenDirt, "eden");
        wildWoodGrass = new BlockModGrass(wildWoodGrass, wildWoodDirt, "wildwood");
        apalachiaGrass = new BlockModGrass(apalachiaGrass, apalachiaDirt, "apalachia");
        skythernGrass = new BlockModGrass(skythernGrass, skythernDirt, "skythern");
        mortumGrass = new BlockModGrass(mortumGrass, mortumDirt, "mortum");
    }
}
