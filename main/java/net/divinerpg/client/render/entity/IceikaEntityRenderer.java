package net.divinerpg.client.render.entity;

import net.divinerpg.blocks.iceika.tile_entity.TileEntityFrostedChest;
import net.divinerpg.client.render.EntityResourceLocation;
import net.divinerpg.client.render.RenderDivineMob;
import net.divinerpg.client.render.RenderProjectile;
import net.divinerpg.client.render.RenderSizeable;
import net.divinerpg.client.render.block.ItemRendererFrostedChest;
import net.divinerpg.client.render.block.RenderTileEntityFrostedChest;
import net.divinerpg.client.render.entity.iceika.model.ModelAlicanto;
import net.divinerpg.client.render.entity.iceika.model.ModelFractite;
import net.divinerpg.client.render.entity.iceika.model.ModelGlacide;
import net.divinerpg.client.render.entity.iceika.model.ModelHastreus;
import net.divinerpg.client.render.entity.iceika.model.ModelRollum;
import net.divinerpg.client.render.entity.iceika.model.ModelWorkshop;
import net.divinerpg.entity.iceika.EntityAlicanto;
import net.divinerpg.entity.iceika.EntityFractite;
import net.divinerpg.entity.iceika.EntityFrostArcher;
import net.divinerpg.entity.iceika.EntityGlacide;
import net.divinerpg.entity.iceika.EntityHastreus;
import net.divinerpg.entity.iceika.EntityRollum;
import net.divinerpg.entity.iceika.EntityWorkshopMerchant;
import net.divinerpg.entity.iceika.EntityWorkshopTickerer;
import net.divinerpg.entity.iceika.projectile.EntityCarol;
import net.divinerpg.entity.iceika.projectile.EntityFrostclaw;
import net.divinerpg.entity.iceika.projectile.EntityMusic;
import net.divinerpg.helper.blocks.IceikaBlocks;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class IceikaEntityRenderer {

	private static EntityResourceLocation x;
	
	public static void init(){
		
		RenderingRegistry.registerEntityRenderingHandler(EntityCarol.class, new RenderProjectile(x.music));
		RenderingRegistry.registerEntityRenderingHandler(EntityMusic.class, new RenderProjectile(x.music));
		RenderingRegistry.registerEntityRenderingHandler(EntityFrostclaw.class, new RenderProjectile(x.frostclaw));
		
        RenderingRegistry.registerEntityRenderingHandler(EntityAlicanto.class, new RenderDivineMob(new ModelAlicanto(), 0.0F, x.ALICANTO));
        RenderingRegistry.registerEntityRenderingHandler(EntityFractite.class, new RenderSizeable(new ModelFractite(), 2.0F, 2.0F, x.FRACTITE));
        RenderingRegistry.registerEntityRenderingHandler(EntityGlacide.class, new RenderSizeable(new ModelGlacide(), 0.0F, 1.0F, x.GLACON));
        RenderingRegistry.registerEntityRenderingHandler(EntityHastreus.class, new RenderDivineMob(new ModelHastreus(), 0.0F, x.HASTERUS));
        RenderingRegistry.registerEntityRenderingHandler(EntityFrostArcher.class, new RenderDivineMob(new ModelBiped(), 0.0F, x.FROZEN_ARCHER));
        RenderingRegistry.registerEntityRenderingHandler(EntityRollum.class, new RenderDivineMob(new ModelRollum(), 0.0F, x.ROLLUM));
        RenderingRegistry.registerEntityRenderingHandler(EntityWorkshopTickerer.class, new RenderDivineMob(new ModelWorkshop(), 0.0F, x.WORKSHOP_TINKER));
        RenderingRegistry.registerEntityRenderingHandler(EntityWorkshopMerchant.class, new RenderDivineMob(new ModelWorkshop(), 0.0F, x.WORKSHOP_MERCHANT));
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFrostedChest.class, new RenderTileEntityFrostedChest());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(IceikaBlocks.frostedChest), new ItemRendererFrostedChest());
		
	}
}