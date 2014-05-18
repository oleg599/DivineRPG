package net.divinerpg.dimension.gen.iceika.village;

import java.util.Random;

import net.divinerpg.api.items.ItemModDoor;
import net.divinerpg.api.worldgen.WorldGenAPI;
import net.divinerpg.blocks.iceika.tile_entity.TileEntityFrostedChest;
import net.divinerpg.helper.blocks.IceikaBlocks;
import net.divinerpg.helper.items.IceikaItems;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenLibrary extends WorldGenerator{

	@Override
	public boolean generate(World w, Random r, int x, int y, int z) {
		WorldGenAPI.drawRectangle(19, 11, 1, w, x, y, z, IceikaBlocks.coalstone);
		WorldGenAPI.drawRectangle(1, 7, 3, w, x + 1, y + 1, z + 2, IceikaBlocks.coalstone);
		WorldGenAPI.drawRectangle(1, 5, 2, w, x + 1, y + 1, z + 3, IceikaBlocks.snowBricks);
		WorldGenAPI.drawRectangle(1, 3, 2, w, x + 1, y + 1, z + 4, IceikaBlocks.coalstone);
		WorldGenAPI.drawRectangle(16, 9, 5, w, x + 2, y + 1, z + 1, IceikaBlocks.coalstone);
		WorldGenAPI.drawRectangle(12, 7, 1, w, x + 2, y + 4, z + 2, IceikaBlocks.snowBricks);
		WorldGenAPI.drawRectangle(14, 7, 1, w, x + 4, y + 6, z + 2, IceikaBlocks.snowBricks);
		WorldGenAPI.drawRectangle(14, 5, 1, w, x + 4, y + 7, z + 3, IceikaBlocks.snowBricks);
		WorldGenAPI.drawRectangle(3, 9, 5, w, x + 2, y + 4, z + 1, Blocks.air);
		WorldGenAPI.drawRectangle(15, 7, 2, w, x + 2, y + 1, z + 2, Blocks.air);
		WorldGenAPI.drawRectangle(11, 7, 5, w, x + 6, y + 1, z + 2, Blocks.air);
		WorldGenAPI.drawRectangle(11, 5, 1, w, x + 6, y + 6, z + 3, Blocks.air);
		WorldGenAPI.drawRectangle(15, 7, 1, w, x + 2, y, z + 2, IceikaBlocks.workshopCarpet);
		WorldGenAPI.drawRectangle(10, 3, 1, w, x + 6, y, z + 4, IceikaBlocks.coalstone);
		WorldGenAPI.drawRectangle(8, 1, 2, w, x + 7, y + 1, z + 5, IceikaBlocks.workshopBookcase);
		WorldGenAPI.drawRectangle(1, 7, 1, w, x + 5, y + 3, z + 2, Blocks.air);
		WorldGenAPI.drawRectangle(11, 1, 3, w, x + 6, y + 1, z + 2, IceikaBlocks.workshopBookcase);
		WorldGenAPI.drawRectangle(11, 1, 3, w, x + 6, y + 1, z + 8, IceikaBlocks.workshopBookcase);
		WorldGenAPI.drawRectangle(14, 1, 2, w, x + 3, y + 1, z + 1, IceikaBlocks.snowBricks);
		WorldGenAPI.drawRectangle(14, 1, 2, w, x + 3, y + 1, z + 9, IceikaBlocks.snowBricks);
		WorldGenAPI.drawRectangle(11, 1, 2, w, x + 6, y + 3, z + 1, IceikaBlocks.snowBricks);
		WorldGenAPI.drawRectangle(11, 1, 2, w, x + 6, y + 3, z + 9, IceikaBlocks.snowBricks);
		WorldGenAPI.drawRectangle(3, 7, 1, w, x + 2, y + 3, z + 2, IceikaBlocks.snowBricks);
		doMisc(w, x, y, z, new ItemStack(IceikaItems.snowflake));
		return true;
	}

	public static void doMisc(World w, int x, int y, int z, ItemStack i){
		Random r = new Random();
		w.setBlock(x + 1, y + 1, z + 4, Blocks.air);
		w.setBlock(x + 1, y + 2, z + 4, Blocks.air);
		w.setBlock(x + 1, y + 1, z + 6, Blocks.air);
		w.setBlock(x + 1, y + 2, z + 6, Blocks.air);
		w.setBlock(x + 6, y + 3, z + 2, IceikaBlocks.workshopLamp);
		w.setBlock(x + 6, y + 3, z + 8, IceikaBlocks.workshopLamp);
		w.setBlock(x + 16, y + 3, z + 2, IceikaBlocks.workshopLamp);
		w.setBlock(x + 16, y + 3, z + 8, IceikaBlocks.workshopLamp);
		WorldGenAPI.drawRectangle(1, 7, 1, w, x + 5, y + 5, z + 2, IceikaBlocks.frostedGlass);
		WorldGenAPI.drawRectangle(1, 5, 1, w, x + 5, y + 6, z + 3, IceikaBlocks.frostedGlass);
		WorldGenAPI.drawRectangle(1, 7, 1, w, x + 17, y + 5, z + 2, IceikaBlocks.frostedGlass); 
		WorldGenAPI.drawRectangle(1, 5, 1, w, x + 17, y + 6, z + 3, IceikaBlocks.frostedGlass);
		ItemModDoor.placeDoorBlock(w, x + 1, y + 1, z + 4, 0, IceikaBlocks.steelDoorBlock);
		ItemModDoor.placeDoorBlock(w, x + 1, y + 1, z + 6, 7, IceikaBlocks.steelDoorBlock);
		w.setBlock(x, y, z, IceikaBlocks.frozenGrass);
		w.setBlock(x, y, z + 10, IceikaBlocks.frozenGrass);
		w.setBlock(x + 15, y + 1, z + 5, IceikaBlocks.frostedChest, 5, 2);
		TileEntityFrostedChest chest = null;
		chest = (TileEntityFrostedChest)w.getTileEntity(x + 15, y + 1, z + 5);
		if(chest != null && !w.isRemote){
			for(int j = 0; j < r.nextInt(2) + 1; j++)
				chest.setInventorySlotContents(r.nextInt(26) + 1, i);
		}
	}
}