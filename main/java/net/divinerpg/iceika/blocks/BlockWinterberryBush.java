package net.divinerpg.iceika.blocks;

import java.util.Random;

import net.divinerpg.Reference;
import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.helper.blocks.IceikaBlocks;
import net.divinerpg.helper.items.IceikaItems;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockWinterberryBush extends BlockMod{

	public boolean isGrown;
	public IIcon grown, notGrown;

	public BlockWinterberryBush(boolean grown) {
		super(Material.leaves);
		this.isGrown = grown;
	}

	@Override
	public void updateTick(World w, int x, int y, int z, Random r) {
		int time = r.nextInt(100) + 8;
		if(w.getBlock(x, y, z) == IceikaBlocks.winterberryBush && time > 100){
			w.setBlock(x, y, z, IceikaBlocks.winterberryBushRipe);
		}
	}

	@Override
	public void onBlockClicked(World w, int x, int y, int z, EntityPlayer p) {
		if(isGrown){
			p.inventory.addItemStackToInventory(new ItemStack(IceikaItems.winterberry, 1));
			w.setBlock(x, y, z, IceikaBlocks.winterberryBush);
		}

	}

	public static void grow(World w, int x, int y, int z){
		if(w.getBlock(x, y, z) == IceikaBlocks.winterberryBush){
			w.setBlock(x, y, z, IceikaBlocks.winterberryBushRipe);
		}
	}
}