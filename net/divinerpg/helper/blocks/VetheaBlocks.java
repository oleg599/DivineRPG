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
    public static final Block dreamDirt    = new BlockModDirt().setName("dreamDirt").func_149647_a(DivineRPGTabs.vethea);
    public static final Block dreamWoodLog = new BlockModLog().setName("dreamWoodLog").func_149647_a(DivineRPGTabs.vethea);
    public static final Block fireCrystal  = new VetheanBlock(rock).setName("fireCrystal");
    public static final Block hyreWoodLog  = new BlockModLog().setName("hyreWoodLog").func_149647_a(DivineRPGTabs.vethea);

    //public static final Block dreamBricks     = new VetheanBlock(rock).setName("dreamBricks_1");
    //public static final Block dreamBricks2 	  = new VetheanBlock(rock).setName("dreamBricks_2");
    //public static final Block dreamWoodLeaves = new BlockModLeaves().setName("dreamWoodLeaves").func_149647_a(DivineRPGTabs.vethea);
    //public static final Block hyreWoodLeaves  = new BlockModLeaves().setName("hyreWoodLeaves").func_149647_a(DivineRPGTabs.vethea);

    public static void init() {
        dreamGrass = new BlockModGrass(dreamGrass, dreamDirt, "dream").func_149647_a(DivineRPGTabs.vethea);
    }

}
