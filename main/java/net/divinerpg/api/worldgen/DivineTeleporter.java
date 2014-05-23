package net.divinerpg.api.worldgen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.util.LongHashMap;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class DivineTeleporter extends Teleporter {
    
    protected final WorldServer worldServerInstance;
    protected final Random random;
    protected final LongHashMap destinationCoordinateCache = new LongHashMap();
    protected final List destinationCoordinateKeys = new ArrayList();
    protected int dimensionID;
    
    public DivineTeleporter(WorldServer worldServer, int dimensionID) {
        super(worldServer);
        this.worldServerInstance = worldServer;
        this.dimensionID = dimensionID;
        this.random = new Random(worldServer.getSeed());
    }
    

}
