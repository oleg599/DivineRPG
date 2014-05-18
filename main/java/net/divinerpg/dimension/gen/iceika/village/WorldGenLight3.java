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

public class WorldGenLight3 extends WorldGenerator{

	@Override
	public boolean generate(World w, Random r, int x, int y, int z) {
		WorldGenAPI.drawRectangle(3, 1, 1, w, x + 1, y + 1, z, IceikaBlocks.coalstone);
		WorldGenAPI.drawRectangle(1, 3, 1, w, x + 2, y + 1, z - 1, IceikaBlocks.coalstone);
		WorldGenAPI.drawRectangle(1, 1, 5, w, x + 2, y, z, IceikaBlocks.coalstone);
		WorldGenAPI.drawRectangle(1, 3, 1, w, x + 2, y + 3, z - 1, IceikaBlocks.coalstone);
		WorldGenAPI.drawRectangle(1, 1, 1, w, x + 2, y + 5, z, IceikaBlocks.workshopLamp);
		return true;
	}
}