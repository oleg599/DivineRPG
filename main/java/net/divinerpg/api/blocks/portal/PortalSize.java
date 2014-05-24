package net.divinerpg.api.blocks.portal;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.Direction;
import net.minecraft.world.World;


public class PortalSize {
    //TODO: Variable and method names are based on glances of how the math works. Still better than Brock's func_ or field_, but may not be accurate still
    public final World         world;
    public final int           side1;
    public final int           side1_1;
    public final int           side1_0;
    public int                 value = 0;
    public ChunkCoordinates    chunkCoords;
    public int                 directionOrSideMaybe;
    public int                 rotationOrMaybeNumSides;
//    private static final String __OBFID        = "CL_00000285";
    protected Block portal1;
    protected Block fire;
    protected Block blockField;

    public PortalSize(World world, int x, int y, int z, int side1, Block portal1, Block fire, Block block1) {
        this.world = world;
        this.side1 = side1;
        this.side1_0 = BlockModPortal.sides[side1][0];
        this.side1_1 = BlockModPortal.sides[side1][1];
        this.portal1 = portal1;
        this.fire = fire;
        this.blockField = block1;

        int tempY = y;
        while (y > tempY - 21 && y > 0 && isOnBlock(world.getBlock(x, y, z)))
            y--;

        int offset = this.getValueBasedOnBlock(x, y, z, this.side1_0) - 1;

        if (offset >= 0) {
            this.chunkCoords = new ChunkCoordinates(x + offset * Direction.offsetX[this.side1_0], y, z + offset * Direction.offsetZ[this.side1_0]);
            this.rotationOrMaybeNumSides = this.getValueBasedOnBlock(this.chunkCoords.posX, this.chunkCoords.posY, this.chunkCoords.posZ, this.side1_1);

            if (this.rotationOrMaybeNumSides < 2 || this.rotationOrMaybeNumSides > 21) {
                this.chunkCoords = null;
                this.rotationOrMaybeNumSides = 0;
            }
        }

        if (this.chunkCoords != null)
            this.directionOrSideMaybe = this.getDirectionMaybe();
    }

    protected int getValueBasedOnBlock(int x, int y, int z, int side) {
        int xx = Direction.offsetX[side];
        int zz = Direction.offsetZ[side];
        int yy = 0;
        Block block;

        while (yy < 22) {
            block = this.world.getBlock(x + xx * yy, y, z + zz * yy);
            if (!this.isOnBlock(block)) {
                yy++;
                break;
            }
            Block block1 = this.world.getBlock(x + xx * yy, y - 1, z + zz * yy);
            if (block1 != blockField) {
                yy++;
                break;
            }
            yy++;
        }

        block = this.world.getBlock(x + xx * yy, y, z + zz * yy);
        return block == blockField ? yy : 0;
    }

    //direction?
    protected int getDirectionMaybe() {
        int coord1;
        int coord2;
        int coord3;
        int coord4;
        yUseLabelYo:

        for (this.directionOrSideMaybe = 0; this.directionOrSideMaybe < 21; ++this.directionOrSideMaybe) {
            coord1 = this.chunkCoords.posY + this.directionOrSideMaybe;

            for (coord2 = 0; coord2 < this.rotationOrMaybeNumSides; ++coord2) {
                coord3 = this.chunkCoords.posX + coord2 * Direction.offsetX[BlockModPortal.sides[this.side1][1]];
                coord4 = this.chunkCoords.posZ + coord2 * Direction.offsetZ[BlockModPortal.sides[this.side1][1]];
                Block block = this.world.getBlock(coord3, coord1, coord4);

                if (!this.isOnBlock(block))
                    break yUseLabelYo;

                if (block == portal1)
                    this.value++;

                if (coord2 == 0) {
                    block = this.world.getBlock(coord3 + Direction.offsetX[BlockModPortal.sides[this.side1][0]], coord1, coord4
                            + Direction.offsetZ[BlockModPortal.sides[this.side1][0]]);

                    if (block != blockField)
                        break yUseLabelYo;
                } else if (coord2 == this.rotationOrMaybeNumSides - 1) {
                    block = this.world.getBlock(coord3 + Direction.offsetX[BlockModPortal.sides[this.side1][1]], coord1, coord4
                            + Direction.offsetZ[BlockModPortal.sides[this.side1][1]]);

                    if (block != blockField)
                        break yUseLabelYo;
                }
            }
        }

        for (coord1 = 0; coord1 < this.rotationOrMaybeNumSides; ++coord1) {
            coord2 = this.chunkCoords.posX + coord1 * Direction.offsetX[BlockModPortal.sides[this.side1][1]];
            coord3 = this.chunkCoords.posY + this.directionOrSideMaybe;
            coord4 = this.chunkCoords.posZ + coord1 * Direction.offsetZ[BlockModPortal.sides[this.side1][1]];

            if (this.world.getBlock(coord2, coord3, coord4) != blockField) {
                this.directionOrSideMaybe = 0;
                break;
            }
        }

        if (this.directionOrSideMaybe <= 21 && this.directionOrSideMaybe >= 3)
            return this.directionOrSideMaybe;
        this.chunkCoords = null;
        this.rotationOrMaybeNumSides = 0;
        this.directionOrSideMaybe = 0;
        return 0;
    }

    protected boolean isOnBlock(Block block) {
        return block.getMaterial() == Material.air || block == fire || block == portal1;
    }

    public boolean isInChunk() {
        return this.chunkCoords != null && this.rotationOrMaybeNumSides >= 2 && this.rotationOrMaybeNumSides <= 21 && this.directionOrSideMaybe >= 3 && this.directionOrSideMaybe <= 21;
    }

    public void setPortalSizeMaybe() {
        for (int i = 0; i < this.rotationOrMaybeNumSides; ++i) {
            int xx = this.chunkCoords.posX + Direction.offsetX[this.side1_1] * i;
            int zz = this.chunkCoords.posZ + Direction.offsetZ[this.side1_1] * i;

            for (int w = 0; w < this.directionOrSideMaybe; ++w) {
                int yy = this.chunkCoords.posY + w;
                this.world.setBlock(xx, yy, zz, portal1, this.side1, 2);
            }
        }
    }

}
