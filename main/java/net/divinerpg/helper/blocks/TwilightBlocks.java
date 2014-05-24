package net.divinerpg.helper.blocks;

import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.api.blocks.BlockModGrass;
import net.divinerpg.api.blocks.BlockModLeaves;
import net.divinerpg.api.blocks.BlockModLog;
import net.divinerpg.api.blocks.BlockModVine;
import net.divinerpg.api.blocks.portal.BlockModPortal;
import net.divinerpg.blocks.twilight.BlockBlueFire;
import net.divinerpg.blocks.twilight.BlockTwilightFurnace;
import net.divinerpg.blocks.twilight.TwilightBlock;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.divinerpg.helper.material.EnumBlockType;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TwilightBlocks {

    static Material           rock              = Material.rock;

    public static final Block edenDirt          = new BlockMod(EnumBlockType.DIRT, "edenDirt");
    public static final Block wildWoodDirt      = new BlockMod(EnumBlockType.DIRT, "wildWoodDirt");
    public static final Block apalachiaDirt     = new BlockMod(EnumBlockType.DIRT, "apalachiaDirt");
    public static final Block skythernDirt      = new BlockMod(EnumBlockType.DIRT, "skythernDirt");
    public static final Block mortumDirt        = new BlockMod(EnumBlockType.DIRT, "mortumDirt");
    public static final Block edenGrass         = new BlockModGrass((BlockMod) edenDirt, "edenGrass");
    public static final Block wildWoodGrass     = new BlockModGrass((BlockMod) wildWoodDirt, "wildWoodGrass");
    public static final Block apalachiaGrass    = new BlockModGrass((BlockMod) apalachiaDirt, "apalachiaGrass");
    public static final Block skythernGrass     = new BlockModGrass((BlockMod) skythernDirt, "skythernGrass");
    public static final Block mortumGrass       = new BlockModGrass((BlockMod) mortumDirt, "mortumGrass");

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

    public static final Block edenLeaves        = new BlockModLeaves("edenLeaves");
    public static final Block wildWoodLeaves    = new BlockModLeaves("wildWoodLeaves");
    public static final Block apalachiaLeaves   = new BlockModLeaves("apalachiaLeaves");
    public static final Block skythernLeaves    = new BlockModLeaves("skythernLeaves");
    public static final Block mortumLeaves      = new BlockModLeaves("mortumLeaves");

    public static final Block edenLogs          = new BlockModLog("edenLog");
    public static final Block wildWoodLogs      = new BlockModLog("wildWoodLog");
    public static final Block apalachiaLogs     = new BlockModLog("apalachiaLog");
    public static final Block skythernLogs      = new BlockModLog("skythernLog");
    public static final Block mortumLogs        = new BlockModLog("mortumLog");

    public static final Block twilightStone     = new TwilightBlock(rock, 6.0F).setName("twilightStone");
    public static final Block wildWoodsVine     = new BlockModVine("wildWoodsVine");
    public static final Block blueFire          = new BlockBlueFire().setName("blueFire");
    public static final Block edenPortal        = new BlockModPortal("edenPortal", ConfigurationHelper.eden, blueFire, VanillaBlocks.divineRock);
    public static final Block wildWoodPortal    = new BlockModPortal("wildwoodPortal", ConfigurationHelper.wildWoods, blueFire, edenBlock);
    public static final Block apalachiaPortal   = new TwilightBlock(rock, 0.0F).setName("apalachiaPortal");
    public static final Block skythernPortal    = new TwilightBlock(rock, 0.0F).setName("skythernPortal");
    public static final Block mortumPortal      = new TwilightBlock(rock, 0.0F).setName("mortumPortal");
    public static final Block twilightFurnace   = new BlockTwilightFurnace(false).setName("twilightFurnace");
    public static final Block twilightFurnaceOn = new BlockTwilightFurnace(true).setName("twilightFurnaceOn");

}
