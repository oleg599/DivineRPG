package net.divinerpg.helper.blocks;

import net.divinerpg.api.blocks.BlockModBook;
import net.divinerpg.api.blocks.BlockModBush;
import net.divinerpg.api.blocks.BlockModChest;
import net.divinerpg.api.blocks.BlockModDirt;
import net.divinerpg.api.blocks.BlockModDoor;
import net.divinerpg.api.blocks.BlockModGlass;
import net.divinerpg.api.blocks.BlockModGrass;
import net.divinerpg.api.blocks.BlockModLeaves;
import net.divinerpg.api.blocks.BlockModLight;
import net.divinerpg.api.blocks.BlockModLog;
import net.divinerpg.api.blocks.BlockModSpawner;
import net.divinerpg.blocks.iceika.BlockCoalstoneFurnace;
import net.divinerpg.blocks.iceika.BlockFrostedChest;
import net.divinerpg.blocks.iceika.BlockIceikaFire;
import net.divinerpg.blocks.iceika.BlockIceikaPortal;
import net.divinerpg.blocks.iceika.IceikaBlock;
import net.divinerpg.helper.items.IceikaItems;
import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;

public class IceikaBlocks {
	
    public static Material rock                 = Material.rock;
    public static Material grass     			= Material.grass;
    public static Material snow       		    = Material.snow;//Thats a no no
    public static Material glass		        = Material.glass;
    public static Material wool			        = Material.cloth;
    
    private static SoundType stone = Block.soundTypeStone;
	private static SoundType dirt = Block.soundTypeGravel;
	private static SoundType cloth = Block.soundTypeCloth;
	private static SoundType wood = Block.soundTypeWood;

    public static		Block frozenGrass;
    
	public static final Block frozenDirt          = new BlockModDirt().setName("frozenDirt").setHardness(2.5F);
	public static final Block frozenStone         = new IceikaBlock(rock, 6.0F, stone).setName("frozenStone");
	public static final Block frozenWood          = new BlockModLog().setName("frozenLog").setHardness(5.0F);
	public static final Block brittleLeaves       = new BlockModLeaves().setName("brittleLeaves").setHardness(0.1F);
	public static final Block winterberryBush     = new BlockModBush(false).setName("winterberryBush").setHardness(0.2F);//Spawns on ground, drops winterberries
	public static final Block winterberryBushRipe = new BlockModBush(true).setName("ripeWinterberryBush").setHardness(0.2F);

	public static final Block icyStone       	  = new IceikaBlock(rock, 0.1F, stone).setName("icyStone").setBlockUnbreakable(); //TODO: Make destructible only by explosion
	public static final Block icyBricks       	  = new IceikaBlock(rock, 0.1F, stone).setName("icyBricks").setBlockUnbreakable(); //TODO: Make destructible only by explosion
	public static final Block frostedChest	      = new BlockFrostedChest().setName("frostedChest").setHardness(2.5F); //Chests in dungeons that drop snowflakes when broken.
	public static final Block rollumSpawner 	  = new BlockModSpawner("Creeper", false).setName("rollumSpawner").setHardness(5.0F);//change mob to spawn to rollum
	public static final Block glacideSpawner 	  = new BlockModSpawner("Enderman", false).setName("glacideSpawner").setHardness(5.0F);//change mob to spawn to glacide

	public static final Block snowBricks          = new IceikaBlock(rock, 6.0F, stone).setName("snowBricks"); //What the walls of workshops are made of.
	public static final Block coalstone           = new IceikaBlock(rock, 3.0F, stone).setName("coalstone"); //The area around the furnace in the workshops.
	public static final Block workshopCarpet      = new IceikaBlock(wool, 0.1F, cloth).setName("workshopCarpet"); //The floor of the workshops.
	public static final Block frostedGlass        = new BlockModGlass().setName("frostedGlass").setHardness(0.1F); //Windows for the workshops.
	public static final Block workshopBookcase    = new BlockModBook().setName("workshopBookcase").setHardness(1.5F); //Bookcase for workshops.
	public static final Block workshopLamp        = new BlockModLight(glass).setName("workshopLamp").setHardness(0.3F); //Lamps for workshops.
	public static final Block steelDoorBlock      = new BlockModDoor(Material.iron, IceikaItems.steelDoor, true).setName("steelDoorBlock").setHardness(7.0F); //Doors for workshops.
	public static final Block coalstoneFurnace    = new BlockCoalstoneFurnace().setName("coalstoneFurnace"); //One in each workshop. Never runs out of fuel
	public static final BlockIceikaPortal portal  = (BlockIceikaPortal)new BlockIceikaPortal().setName("iceikaPortal");
	public static final Block iceikaFire		  = new BlockIceikaFire().setName("iceikaFire");// Used by snowglobe to light iceika portal

	public static void init() {
		frozenGrass = new BlockModGrass(frozenGrass, frozenDirt, "frozen").setHardness(2.5F);
	}
}
