package net.divinerpg.iceika.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockCoalstoneFurnace extends BlockMod {

	private IIcon front;
	private IIcon other;
	
	public BlockCoalstoneFurnace() {
		super(rock);
		setCreativeTab(DivineRPGTabs.blocks);
		setHardness(3.5F);
		setStepSound(stone);
		setLightLevel(1.0F);
	}
	
	/*@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon) {
        front = icon.registerIcon(getTextureName());
        other = icon.registerIcon("coalstone");
    }*/
	
	//TODO: Render all sides except the front to be the coalstone texture

}
