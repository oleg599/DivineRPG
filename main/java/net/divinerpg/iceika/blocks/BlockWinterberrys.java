package net.divinerpg.iceika.blocks;

import net.divinerpg.Reference;
import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.helper.items.IceikaItems;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockWinterberrys extends BlockMod{

	public boolean isGrown = true;
	public IIcon grown, notGrown;
	
	public BlockWinterberrys() {
		super(Material.leaves);
		setTickRandomly(true);
	}

	@Override
	public void registerBlockIcons(IIconRegister icon) {
		grown = icon.registerIcon(Reference.PREFIX + "winterberryGrown");
		notGrown = icon.registerIcon(Reference.PREFIX + "winterberryBush");
	}

	@Override
	public void onBlockClicked(World w, int x, int y, int z, EntityPlayer p) {
		if(isGrown)
			p.inventory.addItemStackToInventory(new ItemStack(IceikaItems.winterberry, 1));
	}	
}