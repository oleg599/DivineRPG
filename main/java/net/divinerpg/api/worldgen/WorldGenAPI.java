package net.divinerpg.api.worldgen;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class WorldGenAPI {

	public static void drawCube(int size,  World w, int x, int y, int z, Block b){
		for(int x1 = 0; x1 < size; x1++){
			for(int z1 = 0; z1 < size; z1++){
				for(int y1 = 0; y1 < size; y1++){
					w.setBlock(x + x1, y + y1 + 1, z + z1, b);
				}
			}
		}
	}
	
	public static void drawHollowCube(int size, World w, int x, int y, int z, Block b){
		for(int x1 = 0; x1 < size; x1++){
			for(int z1 = 0; z1 < size; z1++){
				for(int y1 = 0; y1 < size; y1++){
					w.setBlock(x + x1, y + y1 + 1, z + z1, b);
				}
			}
		}
		
		for(int x1 = 0; x1 < size - 2; x1++){
			for(int z1 = 0; z1 < size - 2; z1++){
				for(int y1 = 0; y1 < size - 2; y1++){
					w.setBlock(x + x1 + 1, y + y1 + 2, z + z1 + 1, Blocks.air);
				}
			}
		}
	}

	public static void drawRectangle(int east, int south, int height, World w, int x, int y, int z, Block b){
		for(int x1 = 0; x1 < east; x1++){
			for(int z1 = 0; z1 < south; z1++){
				for(int y1 = 0; y1 < height; y1++){
					w.setBlock(x + x1, y + y1, z + z1, b);
				}
			}
		}
	}
	
	public static void drawHollowRectangle(int east, int south, int height, World w, int x, int y, int z, Block b){
		/*for(int x1 = 0; x1 < east; x1++){
			for(int z1 = 0; z1 < south; z1++){
				for(int y1 = 0; y1 < height; y1++){
					w.setBlock(x + x1, y + y1, z + z1, b);
				}
			}
		}
		
		for(int x1 = 0; x1 < east; x1++){
			for(int z1 = 0; z1 < south; z1++){
				for(int y1 = 0; y1 < height - 2; y1++){
					w.setBlock(x + x1 + 1, y + y1 + 1, z + z1 + 1, Blocks.air);
				}
			}
		}*/
	}

	public static void drawCone(int width, int length, int height, World w, int x, int y, int z, Block b){
		for(int x1 = 0; x1 < width; x1++){
			for(int z1 = 0; z1 < length; z1++){
				for(int y1 = 0; y1 < height; y1++){
					w.setBlock(x + x1, y + y1, z + z1, b);//WIP (Not working as of yet)
				}
			}
		}
	}
}