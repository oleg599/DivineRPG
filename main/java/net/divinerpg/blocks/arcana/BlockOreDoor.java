package net.divinerpg.blocks.arcana;

import net.divinerpg.api.blocks.BlockModDoor;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockOreDoor extends BlockModDoor{

	private Item key;
	
	public BlockOreDoor(Material mat, Item pick, Item key, boolean canOpen) {
		super(mat, pick, canOpen);
		this.key = key;
	}
	
	@Override
	public boolean onBlockActivated(World w, int x, int y, int z, EntityPlayer p, int side, float hitX, float hitY, float hitZ) {
		if(p.getHeldItem() == null || p.getHeldItem().getItem() != key){
			return false;
		} else {
			p.getHeldItem().stackSize--;
			return super.onBlockActivated(w, x, y, z, p, side, hitX, hitY, hitZ);
		}
	}
}