package net.divinerpg.vanilla.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.divinerpg.Reference;
import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockAcceleron extends BlockMod{

	private IIcon top;
	private IIcon side;
	
	public BlockAcceleron() {
		super(Material.rock);
		LangRegistry.addBlock(this);
		setCreativeTab(DivineRPGTabs.blocks);
		slipperiness = 4.0F;
	}
	
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon) {
        side = icon.registerIcon(Reference.PREFIX + "acceleron" + "_side");
        top = icon.registerIcon(Reference.PREFIX + "acceleron" + "_top");
    }
	
    @Override
    public IIcon getIcon(int par1, int par2) {
        int var3 = par2 & 12;
        return var3 == 0 && (par1 == 1 || par1 == 0) ? this.top : (var3 == 4 && (par1 == 5 || par1 == 4) ? this.top  : (var3 == 8 && (par1 == 2 || par1 == 3) ? top  : this.side ));
    }
}