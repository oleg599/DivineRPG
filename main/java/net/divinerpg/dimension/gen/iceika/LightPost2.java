/*
 *** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
 */

package net.divinerpg.dimension.gen.iceika;
import java.util.Random;

import net.divinerpg.helper.blocks.IceikaBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class LightPost2 extends WorldGenerator
{
	protected Block[] GetValidSpawnBlocks() {
        return new Block[] {
                IceikaBlocks.frozenGrass
        };
    }

    public boolean LocationIsValidSpawn(World world, int i, int j, int k){
        int distanceToAir = 0;
        Block checkID = world.getBlock(i, j, k);

        while (checkID != Blocks.air){
            distanceToAir++;
            checkID = world.getBlock(i, j + distanceToAir, k);
        }

        if (distanceToAir > 3)
            return false;
        j += distanceToAir - 1;

        Block blockID = world.getBlock(i, j, k);
        Block blockIDAbove = world.getBlock(i, j+1, k);
        Block blockIDBelow = world.getBlock(i, j-1, k);
        for (Block x : GetValidSpawnBlocks()){
            if (blockIDAbove != Blocks.air)
                return false;
            if (blockID == x)
                return true;
            else if (blockID == Blocks.snow && blockIDBelow == x)
                return true;
        }
        return false;
    }


    public LightPost2() { }

    @Override
    public boolean generate(World world, Random rand, int i, int j, int k) {
        //check that each corner is one of the valid spawn blocks
        if(!LocationIsValidSpawn(world, i, j, k) || !LocationIsValidSpawn(world, i + 0, j, k) || !LocationIsValidSpawn(world, i + 0, j, k + 2) || !LocationIsValidSpawn(world, i, j, k + 2))
            return false;

        world.setBlock(i + 0, j + 0, k + 0, IceikaBlocks.coalstone);
        world.setBlock(i + 0, j + 0, k + 1, IceikaBlocks.coalstone);
        world.setBlock(i + 0, j + 0, k + 2, IceikaBlocks.coalstone);
        world.setBlock(i + 0, j + 1, k + 1, IceikaBlocks.coalstone);
        world.setBlock(i + 0, j + 2, k + 1, IceikaBlocks.coalstone);
        world.setBlock(i + 0, j + 3, k + 1, IceikaBlocks.coalstone);
        world.setBlock(i + 0, j + 4, k + 0, IceikaBlocks.coalstone);
        world.setBlock(i + 0, j + 4, k + 1, IceikaBlocks.coalstone);
        world.setBlock(i + 0, j + 4, k + 2, IceikaBlocks.coalstone);
        world.setBlock(i + 0, j + 5, k + 0, IceikaBlocks.coalstone);
        world.setBlock(i + 0, j + 5, k + 2, IceikaBlocks.coalstone);
        world.setBlock(i + 0, j + 6, k + 0, IceikaBlocks.workshopLamp);
        world.setBlock(i + 0, j + 6, k + 2, IceikaBlocks.workshopLamp);

        return true;
    }
}