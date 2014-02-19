package net.divinerpg.twilight.gen.wildwoods;

import net.minecraft.util.ChunkCoordinates;

public class WildWoodsPortalPosition extends ChunkCoordinates
{
    public long i;
    final TeleporterWildWoods tel;

    public WildWoodsPortalPosition(TeleporterWildWoods t, int par2, int par3, int par4, long par5)
    {
        super(par2, par3, par4);
        this.tel = t;
        this.i = par5;
    }
}