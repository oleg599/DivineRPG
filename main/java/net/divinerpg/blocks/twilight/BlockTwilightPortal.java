package net.divinerpg.blocks.twilight;

import net.divinerpg.api.blocks.BlockModPortal;
import net.divinerpg.dimension.gen.twilight.eden.TeleporterEden;
import net.divinerpg.helper.blocks.TwilightBlocks;
import net.minecraft.block.Block;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class BlockTwilightPortal extends BlockModPortal {

    public BlockTwilightPortal(String name, int dimensionID, Block blockField) {
        super(name, dimensionID, TwilightBlocks.blueFire, blockField);
    }

    @Override
    protected Teleporter getTeleporter(WorldServer worldServer) {
        return new TeleporterEden(worldServer); //TODO: TeleporterAPI should be made, then all portal block singletons would be deemed useless and could be deleted
    }

}
