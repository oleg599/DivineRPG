package net.divinerpg.helper.blocks;

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
    static Material           rock                = Material.field_151576_e;
    static Material           grass               = Material.field_151576_e;
    static Material           snow /*Maybe*/      = Material.field_151574_g;
    static Material           glass /*Maybe*/     = Material.field_151574_g;


    public static		Block frozenGrass;
    
	public static final Block frozenDirt        = new BlockModDirt().setName("frozenDirt").func_149711_c(2.5F);
	public static final Block frozenStone       = new IceikaBlock(rock).setName("frozenStone").func_149711_c(5.0F);
	public static final Block frozenWood        = new BlockModLog().setName("frozenLog").func_149711_c(5.0F);
	public static final Block brittleLeaves     = new BlockModLeaves().setName("brittleLeaves").func_149711_c(0.1F);

	public static final Block icyStone       	= new IceikaBlock(rock).setName("icyStone").func_149711_c(6.0F); //TODO: Make destructible Only by explosion
	public static final Block icyBricks       	= new IceikaBlock(rock).setName("icyBricks").func_149711_c(6.0F); //TODO: Make destructible Only by explosion
	
	public static final Block snowBricks       	= new IceikaBlock(snow).setName("snowBricks").func_149711_c(1.5F); //What the walls of workshops are made of.
	public static final Block coalstone       	= new IceikaBlock(rock).setName("coalstone").func_149711_c(2.0F); //The area around the furnace in the workshops.
	public static final Block workshopCarpet    = new IceikaBlock(grass).setName("workshopCarpet").func_149711_c(0.1F); //The floor of the workshops.
	public static final Block frostedGlass      = new BlockModGlass(grass, false).setName("frostedGlass").func_149711_c(0.1F); //Windows for the workshops.

	public static void init() {
		frozenGrass = new BlockModGrass(frozenGrass, frozenDirt, "frozen");
	}
}
