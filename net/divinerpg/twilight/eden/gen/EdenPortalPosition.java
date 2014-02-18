package net.divinerpg.twilight.eden.gen;

import net.minecraft.util.ChunkCoordinates;

public class EdenPortalPosition extends ChunkCoordinates
{
    public long i;
    final TeleporterEden tel;

    public EdenPortalPosition(TeleporterEden t, int par2, int par3, int par4, long par5)
    {
        super(par2, par3, par4);
        this.tel = t;
        this.i = par5;
    }
}