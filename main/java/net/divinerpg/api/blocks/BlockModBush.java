package net.divinerpg.api.blocks;

import java.util.ArrayList;
import java.util.Random;

import net.divinerpg.Reference;
import net.divinerpg.helper.blocks.IceikaBlocks;
import net.divinerpg.helper.items.IceikaItems;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.Util;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockModBush extends BlockMod implements IShearable {

	public IIcon grown, notGrown;
	private int time = 0;
	@SideOnly(Side.CLIENT)
	public IIcon opaqueIcon;
	@SideOnly(Side.CLIENT)
	public IIcon blockIcon;
	
	public BlockModBush(boolean grown) {
		super(Material.leaves);
		setCreativeTab(DivineRPGTabs.blocks);
		setHardness(0.3F);
		setStepSound(grass);
	}
	
	@Override
	public void onBlockDestroyedByPlayer(World w, int x, int y, int z, int meta) {
		if(this == IceikaBlocks.winterberryBushRipe) {
			w.setBlock(x, y, z, IceikaBlocks.winterberryBush);
			
			while (time < 100) {
				time++;
				//delay for a second here
			}
			if (time >= 100) {
				w.setBlock(x, y, z, IceikaBlocks.winterberryBushRipe);
			}
		}
	}
	
	public Item getItemDropped(int par1, Random par2Random, int par3)
	{
		if (this == IceikaBlocks.winterberryBushRipe) {
			return IceikaItems.winterberry;
		}
		else {
			return null;
		}
	}

	public void grow(World w, int x, int y, int z){
		if(this == IceikaBlocks.winterberryBush){
			w.setBlock(x, y, z, IceikaBlocks.winterberryBushRipe);
		}
	}
	
	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}
	
	//This only checks graphic on start up
	@Override
	public String getTextureName() {
		if (Minecraft.getMinecraft().gameSettings.fancyGraphics) {
			return Reference.PREFIX + name;
		}
		else {
			return Reference.PREFIX + name + "_fast";
		}  
    }
	
	@Override
    public boolean isShearable(ItemStack item, IBlockAccess world, int x, int y, int z){
        return true;
    }

    @Override
    public ArrayList<ItemStack> onSheared(ItemStack item, IBlockAccess world, int x, int y, int z, int fortune){
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        ret.add(new ItemStack(this, 1, world.getBlockMetadata(x, y, z) & 3));
        return ret;
    }
}