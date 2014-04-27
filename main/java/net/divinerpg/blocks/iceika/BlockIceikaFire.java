package net.divinerpg.blocks.iceika;

import net.divinerpg.blocks.twilight.BlockBlueFire;
import net.divinerpg.helper.blocks.IceikaBlocks;
import net.divinerpg.helper.blocks.TwilightBlocks;
import net.minecraft.world.World;

public class BlockIceikaFire extends BlockBlueFire {

	public void onBlockAdded(World world, int x, int y, int z) {
        if (world.provider.dimensionId > 0 || !IceikaBlocks.portal.func_150000_e(world, x, y, z)) {
            if (!World.doesBlockHaveSolidTopSurface(world, x, y - 1, z) && !this.canNeighborBurn(world, x, y, z)) {
                world.setBlockToAir(x, y, z);
            } else {
                world.scheduleBlockUpdate(x, y, z, this, this.tickRate(world) + world.rand.nextInt(10));
            }
        }
	}
}