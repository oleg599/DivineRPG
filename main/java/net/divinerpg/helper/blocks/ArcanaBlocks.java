package net.divinerpg.helper.blocks;

import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.api.blocks.BlockModGlass;
import net.divinerpg.api.blocks.BlockModGrass;
import net.divinerpg.api.blocks.BlockModLadder;
import net.divinerpg.blocks.arcana.ArcanaSpawner;
import net.divinerpg.blocks.arcana.BlockArcanaFrame;
import net.divinerpg.blocks.arcana.BlockArcanaPortal;
import net.divinerpg.blocks.arcana.BlockOreDoor;
import net.divinerpg.helper.items.ArcanaItems;
import net.divinerpg.helper.material.EnumBlockType;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ArcanaBlocks {

    private static Material   rock                  = Material.rock;

    public static final Block arcanaDirt            = new BlockMod(EnumBlockType.DIRT, "arcaniteDirt");
    public static Block       arcanaGrass           = new BlockModGrass(null, arcanaDirt, "arcanite");
    public static final Block arcaniumOre           = new BlockMod("arcaniumOre");                                                        //breakable
    public static final Block arcaniumMetal         = new BlockMod("arcaniumMetal", false);
    public static final Block arcanitetubes         = new BlockModLadder("arcaniteTubes");
    public static final Block arcaniumPower         = new BlockMod("arcaniumPower");                                                      //breakable
    public static final Block dungenLamp            = new BlockMod("dungenLamp", false);
    public static final Block heatTrap              = new BlockMod("heatTrap", false);
    public static final Block heatTrapOn            = new BlockMod("heatTrapOn", false);
    public static final Block soulStone             = new BlockMod("soulStone", false);
    public static final Block soulSludge            = new BlockMod("soulSludge", false);
    public static final Block degradedBrick         = new BlockMod("degradedBrick", false);
    public static final Block darkDegradedBrick     = new BlockMod("darkDegradedBrick", false);
    public static final Block ancientBrick          = new BlockMod("ancientBrick", false);
    public static final Block ancientStone          = new BlockMod("ancientStone", false);
    public static final Block lightDegradedBrick    = new BlockMod("lightDegradedBrick", false);
    public static final Block stainedGlass          = new BlockModGlass("stainedGlass");
    public static final Block stainedGlass2         = new BlockModGlass("stainedGlass2");
    public static final Block stainedGlass3         = new BlockModGlass("stainedGlass3");
    public static final Block stainedGlass4         = new BlockModGlass("stainedGlass4");
    public static final Block stainedGlass5         = new BlockModGlass("stainedGlass5");
    public static final Block stainedGlass6         = new BlockModGlass("stainedGlass6");
    public static final Block stainedGlass7         = new BlockModGlass("stainedGlass7");
    public static final Block stainedGlass8         = new BlockModGlass("stainedGlass8");
    public static final Block dramixAltar           = new BlockModGlass("dramixAltar");
    public static final Block parasectaAltar        = new BlockModGlass("parasectaAltar");
    public static final Block dungenSpawnerPrisoner = new ArcanaSpawner("").setName("dungenSpawnerPrisoner");
    public static final Block razorbackSpawner      = new ArcanaSpawner("").setName("razorbackSpawner");
    public static final Block deathHoundSpawner     = new ArcanaSpawner("").setName("deathHoundSpawner");
    public static final Block deathcryxSpawner      = new ArcanaSpawner("").setName("deathcryxSpawner");
    public static final Block livingStatueSpawner   = new ArcanaSpawner("").setName("livingStatueSpawner");
    public static final Block roamerSpawner         = new ArcanaSpawner("").setName("roamerSpawner");
    public static final Block ancientTile           = new BlockMod("ancientTile", false);
    public static final Block extractor             = new BlockMod("extractor", false);
    public static final Block arcanaPortal          = new BlockArcanaPortal("arcanaPortal");
    public static final Block arcanaPortalFrame     = new BlockArcanaFrame("arcanaPortalFrame", arcanaPortal);

    public static final Block oreDoor1              = new BlockOreDoor(ArcanaItems.oreDoorItem1, ArcanaItems.oreKey1).setName("oreDoor1");
    public static final Block oreDoor2              = new BlockOreDoor(ArcanaItems.oreDoorItem2, ArcanaItems.oreKey2).setName("oreDoor2");
    public static final Block oreDoor3              = new BlockOreDoor(ArcanaItems.oreDoorItem3, ArcanaItems.oreKey3).setName("oreDoor3");
    public static final Block oreDoor4              = new BlockOreDoor(ArcanaItems.oreDoorItem4, ArcanaItems.oreKey4).setName("oreDoor4");

}
