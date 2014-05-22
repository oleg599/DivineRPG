package net.divinerpg.blocks.arcana;

import net.divinerpg.api.blocks.BlockModDoor;
import net.divinerpg.helper.material.EnumBlockType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockOreDoor extends BlockModDoor{


    public BlockOreDoor(String name, Item pick, Item key) {
        super(EnumBlockType.IRON, name, pick, key);
    }

	@Override
	public boolean onBlockActivated(World w, int x, int y, int z, EntityPlayer p, int side, float hitX, float hitY, float hitZ) {
		if(p.getHeldItem() != null && p.getHeldItem().getItem() == key){
			p.getHeldItem().stackSize--;
			int i1 = this.reallyBrock_ThisIsJustGettingSillyNow_StopFingCopyingCode(w, x, y, z);
            int j1 = i1 & 7;
            j1 ^= 4;

            if ((i1 & 8) == 0) {
                w.setBlockMetadataWithNotify(x, y, z, j1, 2);
                w.markBlockRangeForRenderUpdate(x, y, z, x, y, z);
            } else {
                w.setBlockMetadataWithNotify(x, y - 1, z, j1, 2);
                w.markBlockRangeForRenderUpdate(x, y - 1, z, x, y, z);
            }

            w.playAuxSFXAtEntity(p, 1003, x, y, z, 0);
            return true;
		} else {
			return false;
		}
	}
}