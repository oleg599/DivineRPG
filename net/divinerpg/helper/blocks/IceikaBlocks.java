package net.divinerpg.helper.blocks;

import net.divinerpg.api.blocks.BlockModBook;
import net.divinerpg.api.blocks.BlockModDirt;
import net.divinerpg.api.blocks.BlockModGlass;
import net.divinerpg.api.blocks.BlockModGrass;
import net.divinerpg.api.blocks.BlockModLeaves;
import net.divinerpg.api.blocks.BlockModLog;
import net.divinerpg.iceika.blocks.IceikaBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;

public class IceikaBlocks {
	
    static Material rock                = Material.rock;
    static Material grass     			= Material.grass;
    static Material snow       		    = Material.snow;
    static Material glass		        = Material.glass;

    public static		Block frozenGrass;
    
	public static final Block frozenDirt          = new BlockModDirt().setName("frozenDirt").setHardness(2.5F);
	public static final Block frozenStone         = new IceikaBlock(rock).setName("frozenStone").setHardness(5.0F);
	public static final Block frozenWood          = new BlockModLog().setName("frozenLog").setHardness(5.0F);
	public static final Block brittleLeaves       = new BlockModLeaves().setName("brittleLeaves").setHardness(0.1F);

	public static final Block icyStone       	  = new IceikaBlock(rock).setName("icyStone").setHardness(6.0F); //TODO: Make destructible only by explosion
	public static final Block icyBricks       	  = new IceikaBlock(rock).setName("icyBricks").setHardness(6.0F); //TODO: Make destructible only by explosion
	public static final Block frostedChest	      = new IceikaBlock(Material.wood).setName("frostedChest").setHardness(2.5F); //Chests in dungeons that drop snowflakes when broken.
	public static final Block frozenDungonSpawner = new IceikaBlock(Material.wood).setName("frostedChest").setHardness(2.5F); //Lamps for workshops.
	
	public static final Block snowBricks          = new IceikaBlock(snow).setName("snowBricks").setHardness(1.5F); //What the walls of workshops are made of.
	public static final Block coalstone           = new IceikaBlock(rock).setName("coalstone").setHardness(2.0F); //The area around the furnace in the workshops.
	public static final Block workshopCarpet      = new IceikaBlock(grass).setName("workshopCarpet").setHardness(0.1F); //The floor of the workshops.
	public static final Block frostedGlass        = new BlockModGlass(glass).setName("frostedGlass").setHardness(0.1F); //Windows for the workshops. //It has the normal glass texture for some reason
	public static final Block workshopBookcase    = new BlockModBook().setName("workshopBookcase").setHardness(1.5F); //Bookcase for workshops.
	public static final Block workshopLamp        = new IceikaBlock(glass).setName("workshopLamp").setHardness(0.3F); //Lamps for workshops.
	public static final Block steelDoor           = new IceikaBlock(glass).setName("workshopLamp").setHardness(0.3F); //Doors for workshops.
	public static final Block coalstoneFurnace    = new IceikaBlock(rock).setName("coalstoneFurnace").setHardness(3.5F); //Lamps for workshops.
	

	public static void init() {
		frozenGrass = new BlockModGrass(frozenGrass, frozenDirt, "frozen").setHardness(2.5F);
	}
}
