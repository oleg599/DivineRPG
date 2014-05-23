package net.divinerpg.helper.blocks;

import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.api.blocks.BlockModDoor;
import net.divinerpg.api.blocks.BlockModGlass;
import net.divinerpg.api.blocks.BlockModGrass;
import net.divinerpg.api.blocks.BlockModLadder;
import net.divinerpg.api.blocks.BlockModSpawner;
import net.divinerpg.blocks.arcana.BlockArcanaFrame;
import net.divinerpg.blocks.arcana.BlockArcanaPortal;
import net.divinerpg.helper.items.ArcanaItems;
import net.divinerpg.helper.material.EnumBlockType;
import net.minecraft.block.Block;

public class ArcanaBlocks {

    public static final Block arcanaDirt            = new BlockMod(EnumBlockType.DIRT, "arcaniteDirt");
    public static final Block arcanaGrass           = new BlockModGrass((BlockMod) arcanaDirt, "arcaniteGrass");
    public static final Block arcaniumOre           = new BlockMod("arcaniumOre");                                                                    //breakable
    public static final Block arcaniumMetal         = new BlockMod("arcaniumMetal", false);
    public static final Block arcanitetubes         = new BlockModLadder("arcaniteTubes");
    public static final Block arcaniumPower         = new BlockMod("arcaniumPower");                                                                  //breakable
    public static final Block dungenLamp            = new BlockMod("dungeonLamp", false);
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
    public static final Block dungenSpawnerPrisoner = new BlockModSpawner("dungeonSpawnerPrisoner", "mob name");
    public static final Block razorbackSpawner      = new BlockModSpawner("razorbackSpawner", "mob name");
    public static final Block deathHoundSpawner     = new BlockModSpawner("deathHoundSpawner", "mob name");
    public static final Block deathcryxSpawner      = new BlockModSpawner("deathcryxSpawner", "mob name");
    public static final Block livingStatueSpawner   = new BlockModSpawner("livingStatueSpawner", "mob name");
    public static final Block roamerSpawner         = new BlockModSpawner("roamerSpawner", "mob name");
    public static final Block ancientTile           = new BlockMod("ancientTile", false);
    public static final Block extractor             = new BlockMod("extractor", false);
    public static final Block arcanaPortal          = new BlockArcanaPortal("arcanaPortal");
    public static final Block arcanaPortalFrame     = new BlockArcanaFrame("arcanaPortalFrame", arcanaPortal);

    public static final Block oreDoor1              = new BlockModDoor(EnumBlockType.IRON, "oreDoor1", ArcanaItems.oreDoorItem1, ArcanaItems.oreKey1);
    public static final Block oreDoor2              = new BlockModDoor(EnumBlockType.IRON, "oreDoor2", ArcanaItems.oreDoorItem2, ArcanaItems.oreKey2);
    public static final Block oreDoor3              = new BlockModDoor(EnumBlockType.IRON, "oreDoor3", ArcanaItems.oreDoorItem3, ArcanaItems.oreKey3);
    public static final Block oreDoor4              = new BlockModDoor(EnumBlockType.IRON, "oreDoor4", ArcanaItems.oreDoorItem4, ArcanaItems.oreKey4);

}
