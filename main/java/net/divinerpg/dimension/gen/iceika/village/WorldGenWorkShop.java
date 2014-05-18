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

public class WorldGenWorkShop extends WorldGenerator{

	@Override
	public boolean generate(World w, Random r, int x, int y, int z) {
		
		WorldGenAPI.drawRectangle(14, 14, 1, w, x, y, z, IceikaBlocks.coalstone);
		WorldGenAPI.drawRectangle(14, 14, 1, w, x, y + 1, z, IceikaBlocks.coalstone);
		WorldGenAPI.drawRectangle(14, 14, 1, w, x, y + 2, z, IceikaBlocks.snowBricks);
		WorldGenAPI.drawRectangle(14, 14, 1, w, x, y + 3, z, IceikaBlocks.coalstone);
		WorldGenAPI.drawRectangle(14, 14, 1, w, x, y + 4, z, IceikaBlocks.snowBricks);
		WorldGenAPI.drawCube(12, w, x + 1, y, z + 1, Blocks.air);
		WorldGenAPI.drawRectangle(12, 12, 1, w, x + 1, y + 5, z + 1, IceikaBlocks.snowBricks);
		WorldGenAPI.drawRectangle(10, 10, 1, w, x + 2, y + 5, z + 2, Blocks.air);
		WorldGenAPI.drawRectangle(10, 10, 1, w, x + 2, y + 6, z + 2, IceikaBlocks.snowBricks);
		WorldGenAPI.drawRectangle(8, 8, 1, w, x + 3, y + 6, z + 3, Blocks.air);
		WorldGenAPI.drawRectangle(8, 8, 1, w, x + 3, y + 7, z + 3, IceikaBlocks.snowBricks);
		WorldGenAPI.drawRectangle(6, 6, 1, w, x + 4, y + 7, z + 4, Blocks.air);
		WorldGenAPI.drawRectangle(6, 6, 1, w, x + 4, y + 8, z + 4, IceikaBlocks.snowBricks);
		WorldGenAPI.drawRectangle(4, 4, 1, w, x + 5, y + 8, z + 5, Blocks.air);
		WorldGenAPI.drawRectangle(4, 4, 1, w, x + 5, y + 9, z + 5, IceikaBlocks.snowBricks);
		WorldGenAPI.drawRectangle(2, 2, 1, w, x + 6, y + 9, z + 6, Blocks.air);
		WorldGenAPI.drawRectangle(2, 2, 1, w, x + 6, y + 9, z + 6, IceikaBlocks.frostedGlass);

		doMisc(w, x, y, z, new ItemStack(IceikaItems.snowflake));
		return true;
	}

	public static void doMisc(World w, int x, int y, int z, ItemStack i){
		Random r = new Random();

		for(int x1 = 0; x1 < 12; x1++){
			for(int z1 = 0; z1 < 12; z1++){
				w.setBlock(x + x1 + 1, y, z + z1 + 1, IceikaBlocks.workshopCarpet);
			}
		}

		for(int x1 = 0; x1 < 10; x1++){
			for(int z1 = 0; z1 < 10; z1++){
				w.setBlock(x + x1 + 2, y, z + z1 + 2, IceikaBlocks.coalstone);
			}
		}

		for(int x1 = 0; x1 < 8; x1++){
			for(int z1 = 0; z1 < 8; z1++){
				w.setBlock(x + x1 + 3, y, z + z1 + 3, IceikaBlocks.workshopCarpet);
			}
		}

		for(int x1 = 0; x1 < 6; x1++){
			for(int z1 = 0; z1 < 6; z1++){
				w.setBlock(x + x1 + 4, y, z + z1 + 4, IceikaBlocks.coalstone);
				w.setBlock(x + x1 + 4, y + 4, z + z1 + 4, IceikaBlocks.brittleLeaves);
			}
		}

		for(int x1 = 0; x1 < 4; x1++){
			for(int z1 = 0; z1 < 4; z1++){
				w.setBlock(x + x1 + 5, y, z + z1 + 5, IceikaBlocks.workshopCarpet);
				w.setBlock(x + x1 + 5, y + 5, z + z1 + 5, IceikaBlocks.brittleLeaves);
			}
		}
		
		for(int x1 = 0; x1 < 2; x1++){
			for(int z1 = 0; z1 < 2; z1++){
				for(int y1 = 0; y1 < 6; y1++){
					w.setBlock(x + x1 + 6, y + y1, z + z1 + 6, IceikaBlocks.frozenWood);
					w.setBlock(x + x1 + 6, y + 6, z + z1 + 6, IceikaBlocks.brittleLeaves);
				}
			}
		}
		
		for(int x1 = 0; x1 < 2; x1++){
			for(int z1 = 0; z1 < 2; z1++){
				for(int y1 = 0; y1 < 3; y1++){
					w.setBlock(x + x1 + 1, y + y1 + 1, z + z1 + 11, IceikaBlocks.workshopBookcase);
					w.setBlock(x + x1 + 11, y + y1 + 1, z + z1 + 1, IceikaBlocks.workshopBookcase);
					w.setBlock(x + x1 + 11, y + y1 + 1, z + z1 + 11, IceikaBlocks.workshopBookcase);
					w.setBlock(x + x1 + 1, y + y1 + 1, z + z1 + 1, IceikaBlocks.workshopBookcase);
				}
			}
		}

		TileEntityFrostedChest chest = null, chest2 = null;
		for(int x1 = 0; x1 < 1; x1++){
			for(int z1 = 0; z1 < 1; z1++){
				for(int y1 = 0; y1 < 4; y1++){
					w.setBlock(x + x1 + 2, y, z + z1 + 2, IceikaBlocks.workshopLamp);
					w.setBlock(x + x1 + 11, y, z + z1 + 11, IceikaBlocks.workshopLamp);
					w.setBlock(x + x1 + 11, y, z + z1 + 2, IceikaBlocks.workshopLamp);
					w.setBlock(x + x1 + 2, y, z + z1 + 11, IceikaBlocks.workshopLamp);
					w.setBlock(x + x1 + 2, y + y1, z + z1 + 2, Blocks.air);
					w.setBlock(x + x1 + 11, y + y1, z + z1 + 11, Blocks.air);
					w.setBlock(x + x1 + 11, y + y1, z + z1 + 2, Blocks.air);
					w.setBlock(x + x1 + 2, y + y1, z + z1 + 11, Blocks.air);
					w.setBlock(x + x1 + 4, y + 4, z + z1 + 4, Blocks.air);
					w.setBlock(x + x1 + 9, y + 4, z + z1 + 9, Blocks.air);
					w.setBlock(x + x1 + 9, y + 4, z + z1 + 4, Blocks.air);
					w.setBlock(x + x1 + 4, y + 4, z + z1 + 9, Blocks.air);
					w.setBlock(x + x1 + 5, y + 5, z + z1 + 5, Blocks.air);
					w.setBlock(x + x1 + 8, y + 5, z + z1 + 8, Blocks.air);
					w.setBlock(x + x1 + 8, y + 5, z + z1 + 5, Blocks.air);
					w.setBlock(x + x1 + 5, y + 5, z + z1 + 8, Blocks.air);

					w.setBlock(x + x1 + 7, y + 1, z + z1 + 5, IceikaBlocks.frostedChest, 2, 2);
					w.setBlock(x + x1 + 8, y + 1, z + z1 + 6, IceikaBlocks.frostedChest, 5, 2);
					chest = (TileEntityFrostedChest)w.getTileEntity(x + x1 + 7, y + 1, z + z1 + 5);
					chest2 = (TileEntityFrostedChest)w.getTileEntity(x + x1 + 8, y + 1, z + z1 + 6);
					
					ItemModDoor.placeDoorBlock(w, x + x1 + 6, y + 1, z, 4, IceikaBlocks.steelDoorBlock);
					ItemModDoor.placeDoorBlock(w, x + x1 + 7, y + 1, z, 1, IceikaBlocks.steelDoorBlock);
					w.setBlock(x + x1 + 6, y + 3, z, IceikaBlocks.snowBricks);
					w.setBlock(x + x1 + 7, y + 3, z, IceikaBlocks.snowBricks);
					w.setBlock(x + x1 + 5, y + 3, z, IceikaBlocks.snowBricks);
					w.setBlock(x + x1 + 8, y + 3, z, IceikaBlocks.snowBricks);
					w.setBlock(x + x1 + 5, y + 1, z, IceikaBlocks.snowBricks);
					w.setBlock(x + x1 + 8, y + 1, z, IceikaBlocks.snowBricks);
					w.setBlock(x + x1 + 4, y + 2, z, IceikaBlocks.coalstone);
					w.setBlock(x + x1 + 9, y + 2, z, IceikaBlocks.coalstone);
				}
			}
		}

		if(chest != null && chest2 != null && !w.isRemote){
			chest.setInventorySlotContents(r.nextInt(26) + 1, i);
			chest2.setInventorySlotContents(r.nextInt(26) + 1, i);
			chest.setInventorySlotContents(r.nextInt(26) + 1, i);
			chest2.setInventorySlotContents(r.nextInt(26) + 1, i);
			chest.setInventorySlotContents(r.nextInt(26) + 1, i);
			chest2.setInventorySlotContents(r.nextInt(26) + 1, i);
		}
	}
}