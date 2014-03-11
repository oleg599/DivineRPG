package net.divinerpg.iceika.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.divinerpg.Reference;
import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockCoalstoneFurnace extends BlockMod {

	private IIcon front;
	private IIcon other;
	@SideOnly(Side.CLIENT)
	private IIcon FurnaceIIconTop;
	@SideOnly(Side.CLIENT)
	private IIcon FurnaceIIconFront;
	
	public BlockCoalstoneFurnace() {
		super(rock);
		setCreativeTab(DivineRPGTabs.blocks);
		setHardness(3.5F);
		setStepSound(stone);
		setLightLevel(1.0F);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2)
	{
		return par1 == 1 ? this.FurnaceIIconTop : (par1 == 0 ? this.FurnaceIIconTop : (par1 != par2 ? this.blockIcon : this.FurnaceIIconFront));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IIconRegister) {
		this.blockIcon = par1IIconRegister.registerIcon(Reference.PREFIX + "coalstone");
		this.FurnaceIIconFront = par1IIconRegister.registerIcon(Reference.PREFIX + "coalstoneFurnace");
		this.FurnaceIIconTop = par1IIconRegister.registerIcon(Reference.PREFIX + "coalstone");
	}

}
