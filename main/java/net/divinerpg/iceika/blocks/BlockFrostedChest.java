package net.divinerpg.iceika.blocks;

import java.util.Random;

import net.divinerpg.Reference;
import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.helper.blocks.IceikaBlocks;
import net.divinerpg.helper.items.IceikaItems;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockFrostedChest extends BlockMod {
	
	@SideOnly(Side.CLIENT)
    private static IIcon frontIcon;
	@SideOnly(Side.CLIENT)
    private static IIcon topIcon; //and bottom
	@SideOnly(Side.CLIENT)
    private static IIcon sideIcon;

	public BlockFrostedChest() {
		super(Material.wood);
		setCreativeTab(DivineRPGTabs.blocks);
		setBlockBounds(0.0625F, 0.0625F, 0.0625F, 0.9375F, 0.9375F, 0.9375F);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon) {
		topIcon = icon.registerIcon(Reference.PREFIX + "frostedChest" + "_top");
		frontIcon = icon.registerIcon(Reference.PREFIX + "frostedChest" + "_front");
		sideIcon = icon.registerIcon(Reference.PREFIX + "frostedChest" + "_side");
	}
	
	//HELP :(
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata) {
		if(side == 0 || side == 1) {
			return topIcon;
		}
		else {
			return frontIcon;
		}
		
	}
	public Item getItemDropped(int par1, Random par2, int par3) {
		return IceikaItems.snowflake;
	}
	
	public static Item getBlock(Block b){
		return Item.getItemFromBlock(b);
	}
	
	public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

}
