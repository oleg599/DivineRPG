package net.divinerpg.blocks.iceika;

import net.divinerpg.api.blocks.BlockModPortal;
import net.divinerpg.dimension.gen.iceika.TeleporterIceika;
import net.divinerpg.helper.blocks.IceikaBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class BlockIceikaPortal extends BlockModPortal {

    public BlockIceikaPortal(String name, int dimensionID) {
        super(name, dimensionID, IceikaBlocks.iceikaFire, Blocks.snow);
    }

    @Override
    protected Teleporter getTeleporter(WorldServer worldServer) {
        return new TeleporterIceika(worldServer);
    }

}
