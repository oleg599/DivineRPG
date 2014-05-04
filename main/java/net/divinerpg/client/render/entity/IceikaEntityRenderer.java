package net.divinerpg.client.render.entity;

import net.divinerpg.blocks.iceika.tile_entity.TileEntityFrostedChest;
import net.divinerpg.client.render.EntityResourceLocation;
import net.divinerpg.client.render.RenderProjectile;
import net.divinerpg.client.render.block.ItemRendererFrostedChest;
import net.divinerpg.client.render.block.RenderTileEntityFrostedChest;
import net.divinerpg.entity.iceika.projectile.EntityMusic;
import net.divinerpg.helper.blocks.IceikaBlocks;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class IceikaEntityRenderer {

	private static EntityResourceLocation x;
	
	public static void init(){
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMusic.class, new RenderProjectile(x.music));
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFrostedChest.class, new RenderTileEntityFrostedChest());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(IceikaBlocks.frostedChest), new ItemRendererFrostedChest());
		
	}
}