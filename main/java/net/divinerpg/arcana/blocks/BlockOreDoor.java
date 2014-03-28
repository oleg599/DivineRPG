package net.divinerpg.arcana.blocks;

import net.divinerpg.api.blocks.BlockModDoor;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockOreDoor extends BlockModDoor{

	private Item key;
	
	public BlockOreDoor(Material mat, Item pick, Item key) {
		super(mat, pick, false);
		this.key = key;
	}
	
	@Override
	public boolean onBlockActivated(World w, int x, int y, int z, EntityPlayer p, int side, float hitX, float hitY, float hitZ) {
		if(p.getHeldItem() == null || p.getHeldItem().getItem() != key){
			return false;
		} else if(p.getHeldItem().getItem() == key){
			p.getHeldItem().stackSize--;
			return true;
		}
		return super.onBlockActivated(w, x, y, z, p, side, hitX, hitY, hitZ);
	}
}