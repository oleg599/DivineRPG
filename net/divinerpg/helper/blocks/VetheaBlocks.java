package net.divinerpg.helper.blocks;

import net.divinerpg.api.blocks.*;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.vethea.blocks.VetheanBlock;
import net.divinerpg.vethea.blocks.VetheanDirt;
import net.divinerpg.vethea.blocks.VetheanGrass;
import net.divinerpg.vethea.blocks.VetheanLeaves;
import net.divinerpg.vethea.blocks.VetheanLog;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class VetheaBlocks {

    static Material           rock         = Material.field_151576_e;

    public static Block       dreamGrass;
    public static final Block dreamDirt       = new BlockModDirt().setName("dreamDirt").func_149647_a(DivineRPGTabs.vethea);
    public static final Block fireCrystal     = new VetheanBlock(rock).setName("fireCrystal");

    public static final Block dreamBricks     = new VetheanBlock(rock).setName("dreamBricks1");
    public static final Block dreamBricks2 	  = new VetheanBlock(rock).setName("dreamBricks2");
    public static final Block dreamWoodLeaves = new BlockModLeaves().setName("dreamWoodLeaves").func_149647_a(DivineRPGTabs.vethea);
    public static final Block dreamWoodLog    = new BlockModLog().setName("dreamWoodLog").func_149647_a(DivineRPGTabs.vethea);
    public static final Block hyreWoodLog  	  = new BlockModLog().setName("hyreWoodLog").func_149647_a(DivineRPGTabs.vethea);
    public static final Block hyreWoodLeaves  = new BlockModLeaves().setName("hyreWoodLeaves").func_149647_a(DivineRPGTabs.vethea);
    public static final Block mintWoodLog 	  = new BlockModLog().setName("mintWoodLog").func_149647_a(DivineRPGTabs.vethea);
    public static final Block mintWoodLeaves  = new BlockModLeaves().setName("mintWoodLeaves").func_149647_a(DivineRPGTabs.vethea);
    
    public static final Block dreamLampOn 	  = new VetheanBlock(rock).setName("dreamLampOn");
    public static final Block dreamLampOff 	  = new VetheanBlock(rock).setName("dreamLampOff");
    public static final Block karosBricks     = new VetheanBlock(rock).setName("karosBricks");
    public static final Block karosCannon	  = new VetheanBlock(rock).setName("karosCannon");
    public static final Block heatTileGreen   = new VetheanBlock(rock).setName("karosHeatTileGreen");
    public static final Block heatTileRed     = new VetheanBlock(rock).setName("karosHeatTileRed");
    
    public static final Block lunaStone 	  = new VetheanBlock(rock).setName("lunaStone");
    public static final Block lunaBrick       = new VetheanBlock(rock).setName("lunaBrick");
    public static final Block metalCaging     = new VetheanBlock(rock).setName("metalCaging");
    public static final Block villageLamo     = new VetheanBlock(rock).setName("villageLamp");
    public static final Block everstone       = new VetheanBlock(rock).setName("everstone");
    public static final Block whiteEverstone  = new VetheanBlock(rock).setName("whiteEverstone");
    public static final Block darkEverstone   = new VetheanBlock(rock).setName("darkEverstone");
    public static final Block greenEverstone  = new VetheanBlock(rock).setName("greenEverstone");
    public static final Block hiveWalls 	  = new VetheanBlock(rock).setName("hiveWalls");
    public static final Block hungerStone     = new VetheanBlock(rock).setName("hungerStone");
    public static final Block hungerStone2    = new VetheanBlock(rock).setName("hungerStone2");

    public static void init() {
        dreamGrass = new BlockModGrass(dreamGrass, dreamDirt, "dream").func_149647_a(DivineRPGTabs.vethea);
    }

}
