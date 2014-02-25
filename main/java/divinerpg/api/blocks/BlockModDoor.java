package divinerpg.api.blocks;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;


public class BlockModDoor extends BlockDoor {

	public BlockModDoor(Material mat) {
		super(mat);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
            int i1 = this.func_150012_g(p_149727_1_, p_149727_2_, p_149727_3_, p_149727_4_);
            int j1 = i1 & 7;
            j1 ^= 4;

            if ((i1 & 8) == 0)
            {
                p_149727_1_.setBlockMetadataWithNotify(p_149727_2_, p_149727_3_, p_149727_4_, j1, 2);
                p_149727_1_.markBlockRangeForRenderUpdate(p_149727_2_, p_149727_3_, p_149727_4_, p_149727_2_, p_149727_3_, p_149727_4_);
            }
            else
            {
                p_149727_1_.setBlockMetadataWithNotify(p_149727_2_, p_149727_3_ - 1, p_149727_4_, j1, 2);
                p_149727_1_.markBlockRangeForRenderUpdate(p_149727_2_, p_149727_3_ - 1, p_149727_4_, p_149727_2_, p_149727_3_, p_149727_4_);
            }

            p_149727_1_.playAuxSFXAtEntity(p_149727_5_, 1003, p_149727_2_, p_149727_3_, p_149727_4_, 0);
            return true;
        }
}
