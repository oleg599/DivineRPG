package net.divinerpg.dimension.gen.iceika.village;

import java.util.Random;

import net.divinerpg.api.items.ItemModDoor;
import net.divinerpg.blocks.iceika.tile_entity.TileEntityFrostedChest;
import net.divinerpg.helper.blocks.IceikaBlocks;
import net.divinerpg.helper.items.IceikaItems;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenWorkShop extends WorldGenerator{

	@Override
	public boolean generate(World w, Random r, int x, int y, int z) {
		
		doCoalstone(w, x, y, z);
		doCoalstone(w, x, y + 1, z);
		doAir(w, x, y + 1, z);
		doBricks(w, x, y + 2, z);
		doAir(w, x, y + 2, z);
		doCoalstone(w, x, y + 3, z);
		doAir(w, x, y + 3, z);
		doBricks(w, x, y + 4, z);
		doAir(w, x, y + 4, z);

		doRoof(w, x, y + 5, z);
		doMisc(w, x, y, z, new ItemStack(IceikaItems.snowflake));
		
		return true;
	}

	public static void doAir(World w, int x, int y, int z){
		for(int x1 = 0; x1 < 12; x1++){
			for(int z1 = 0; z1 < 12; z1++){
				w.setBlock(x + x1 + 1, y, z + z1 + 1, Blocks.air);
			}
		}
	}

	public static void doCoalstone(World w, int x, int y, int z){
		for(int x1 = 0; x1 < 14; x1++){
			for(int z1 = 0; z1 < 14; z1++){
				w.setBlock(x + x1, y, z + z1, IceikaBlocks.coalstone);
			}
		}
	}

	public static void doBricks(World w, int x, int y, int z){
		for(int x1 = 0; x1 < 14; x1++){
			for(int z1 = 0; z1 < 14; z1++){
				w.setBlock(x + x1, y, z + z1, IceikaBlocks.snowBricks);
			}
		}
	}

	public static void doRoof(World w, int x, int y, int z){
		for(int x1 = 0; x1 < 12; x1++){
			for(int z1 = 0; z1 < 12; z1++){
				w.setBlock(x + x1 + 1, y, z + z1 + 1, IceikaBlocks.snowBricks);
			}
		}

		for(int x1 = 0; x1 < 10; x1++){
			for(int z1 = 0; z1 < 10; z1++){
				w.setBlock(x + x1 + 2, y + 1, z + z1 + 2, IceikaBlocks.snowBricks);
				w.setBlock(x + x1 + 2, y, z + z1 + 2, Blocks.air);
			}
		}

		for(int x1 = 0; x1 < 8; x1++){
			for(int z1 = 0; z1 < 8; z1++){
				w.setBlock(x + x1 + 3, y + 2, z + z1 + 3, IceikaBlocks.snowBricks);
				w.setBlock(x + x1 + 3, y + 1, z + z1 + 3, Blocks.air);
			}
		}

		for(int x1 = 0; x1 < 6; x1++){
			for(int z1 = 0; z1 < 6; z1++){
				w.setBlock(x + x1 + 4, y + 3, z + z1 + 4, IceikaBlocks.snowBricks);
				w.setBlock(x + x1 + 4, y + 2, z + z1 + 4, Blocks.air);
			}
		}

		for(int x1 = 0; x1 < 4; x1++){
			for(int z1 = 0; z1 < 4; z1++){
				w.setBlock(x + x1 + 5, y + 4, z + z1 + 5, IceikaBlocks.snowBricks);
				w.setBlock(x + x1 + 5, y + 3, z + z1 + 5, Blocks.air);
			}
		}

		for(int x1 = 0; x1 < 2; x1++){
			for(int z1 = 0; z1 < 2; z1++){
				w.setBlock(x + x1 + 6, y + 4, z + z1 + 6, IceikaBlocks.frostedGlass);
			}
		}
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

		if(chest != null && chest2 != null){
			chest.setInventorySlotContents(r.nextInt(26) + 1, i);
			chest2.setInventorySlotContents(r.nextInt(26) + 1, i);
			chest.setInventorySlotContents(r.nextInt(26) + 1, i);
			chest2.setInventorySlotContents(r.nextInt(26) + 1, i);
			chest.setInventorySlotContents(r.nextInt(26) + 1, i);
			chest2.setInventorySlotContents(r.nextInt(26) + 1, i);
		}
	}
}