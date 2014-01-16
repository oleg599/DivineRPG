package net.divinerpg.twilight.eden.gen;

import net.minecraft.util.ChunkCoordinates;

public class EdenPortalPosition extends ChunkCoordinates
{
    public long field_85087_d;
    final TeleporterEden field_85088_e;

    public EdenPortalPosition(TeleporterEden t, int par2, int par3, int par4, long par5)
    {
        super(par2, par3, par4);
        this.field_85088_e = t;
        this.field_85087_d = par5;
    }
}