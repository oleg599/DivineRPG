package net.divinerpg.helper.blocks;

import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.api.blocks.BlockModBook;
import net.divinerpg.api.blocks.BlockModBush;
import net.divinerpg.api.blocks.BlockModDoor;
import net.divinerpg.api.blocks.BlockModGlass;
import net.divinerpg.api.blocks.BlockModGrass;
import net.divinerpg.api.blocks.BlockModLeaves;
import net.divinerpg.api.blocks.BlockModLog;
import net.divinerpg.api.blocks.BlockModSpawner;
import net.divinerpg.blocks.iceika.BlockFrostedChest;
import net.divinerpg.blocks.iceika.BlockIceikaFire;
import net.divinerpg.blocks.iceika.BlockIceikaPortal;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.divinerpg.helper.items.IceikaItems;
import net.divinerpg.helper.material.EnumBlockType;
import net.minecraft.block.Block;

public class IceikaBlocks {

    public static final Block frozenDirt          = new BlockMod(EnumBlockType.DIRT, "frozenDirt").setHardness(2.5F);
    public static final Block frozenGrass         = new BlockModGrass((BlockMod) frozenDirt, "frozenGrass").setHardness(2.5F);
    public static final Block frozenStone         = new BlockMod("frozenStone").setHardness(6);
    public static final Block frozenWood          = new BlockModLog("frozenLog").setHardness(5.0F);
    public static final Block brittleLeaves       = new BlockModLeaves("brittleLeaves").setHardness(0.1F);

    //state change logic on bushes might be a tad off..let me know if it is not working as it should -boss
    public static final Block winterberryBush     = new BlockModBush(false, "winterberryBush", "ripeWinterberryBush", null).setHardness(0.2F);                  //Spawns on ground, drops winterberries
    public static final Block winterberryBushRipe = new BlockModBush(true, "ripeWinterberryBush", "winterberryBush", IceikaItems.winterberry).setHardness(0.2F);

    public static final Block icyStone            = new BlockMod("icyStone", false);                                                                            //TODO: Make destructible only by explosion
    public static final Block icyBricks           = new BlockMod("icyBricks", false);                                                                           //TODO: Make destructible only by explosion
    public static final Block frostedChest        = new BlockFrostedChest().setName("frostedChest").setHardness(2.5F);                                          //Chests in dungeons that drop snowflakes when broken.
    public static final Block rollumSpawner       = new BlockModSpawner("rollumSpawner", "Creeper").setHardness(5.0F);                                          //change mob to spawn to rollum
    public static final Block glacideSpawner      = new BlockModSpawner("glacideSpawner", "Enderman").setHardness(5.0F);                                        //change mob to spawn to glacide

    public static final Block snowBricks          = new BlockMod("snowBricks").setHardness(6);                                                                  //What the walls of workshops are made of.
    public static final Block coalstone           = new BlockMod("coalstone").setHardness(3);                                                                   //The area around the furnace in the workshops.
    public static final Block workshopCarpet      = new BlockMod(EnumBlockType.CLOTH, "workshopCarpet").setHardness(0.1f);                                      //The floor of the workshops.
    public static final Block frostedGlass        = new BlockModGlass("frostedGlass").setHardness(0.1F);                                                        //Windows for the workshops.
    public static final Block workshopBookcase    = new BlockModBook("workshopBookcase").setHardness(1.5F);                                                     //Bookcase for workshops.
    public static final Block workshopLamp        = new BlockMod(EnumBlockType.GLASS, "workshopLamp").setHardness(0.3F).setLightLevel(1);                       //Lamps for workshops.
    public static final Block steelDoorBlock      = new BlockModDoor(EnumBlockType.IRON, "steelDoorBlock", IceikaItems.steelDoor, null).setHardness(7.0F);      //Doors for workshops.
//    public static final Block coalstoneFurnace    = new BlockCoalstoneFurnace().setName("coalstoneFurnace"); TODO: 'Machine' API needs to be implemented (will take from my TechCraft)                                                   //One in each workshop. Never runs out of fuel
    public static final Block iceikaFire          = new BlockIceikaFire().setName("iceikaFire");                                                                // Used by snowglobe to light iceika portal
    public static final Block portal              = new BlockIceikaPortal("iceikaPortal", ConfigurationHelper.iceika);

}
