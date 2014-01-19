package net.divinerpg.client.render.entity;

import net.divinerpg.client.render.*;
import net.divinerpg.overworld.entity.mobs.*;
import net.divinerpg.overworld.entity.mobs.models.*;
import net.minecraft.client.model.*;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class OverworldEntityRenderer {

	public static void init(){
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderWatcher.class, new RenderDivineMob(new ModelWatcher(), 0.0F, EntityResourceLocation.enderWatcher));
		RenderingRegistry.registerEntityRenderingHandler(EntityCrab.class, new RenderDivineMob(new ModelCrab(), 0.0F, EntityResourceLocation.crab));
		RenderingRegistry.registerEntityRenderingHandler(EntityKingCrab.class, new RenderSizeable(new ModelCrab(), 0.0F, 1.8F, EntityResourceLocation.crab));
		RenderingRegistry.registerEntityRenderingHandler(EntityCaveCrawler.class, new RenderDivineMob(new ModelCrawler(), 0.0F, EntityResourceLocation.caveCrawler));
		RenderingRegistry.registerEntityRenderingHandler(EntityDesertCrawler.class, new RenderDivineMob(new ModelCrawler(), 0.0F, EntityResourceLocation.desertCrawler));
		RenderingRegistry.registerEntityRenderingHandler(EntityJungleDramcryx.class, new RenderDivineMob(new ModelDramcryx(), 0.0F, EntityResourceLocation.jungleDramcryx));
		RenderingRegistry.registerEntityRenderingHandler(EntityCyclops.class, new RenderSizeable(new ModelBiped(), 0.0F, 2.0F, EntityResourceLocation.cyclops));
		RenderingRegistry.registerEntityRenderingHandler(EntityAncientEntity.class, new RenderSizeable(new ModelAncientEntity(), 0.0F, 5.0F, EntityResourceLocation.ancient));
		RenderingRegistry.registerEntityRenderingHandler(EntityWhale.class, new RenderSizeable(new ModelWhale(), 0.0F, 5.0F, EntityResourceLocation.whale));
		RenderingRegistry.registerEntityRenderingHandler(EntityScorcher.class, new RenderSizeable(new ModelScorcher(), 0.0F, 1.8F, EntityResourceLocation.scorcher));
		RenderingRegistry.registerEntityRenderingHandler(EntityHellSpider.class, new RenderSizeable(new ModelSpider(), 0.0F, 1.2F ,EntityResourceLocation.hellSpider));
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderSpider.class, new RenderSizeable(new ModelSpider(), 0.0F, 0.5F, EntityResourceLocation.enderSpider));
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderTriplets.class, new RenderDivineMob(new ModelEnderTriplets(), 0.0F, EntityResourceLocation.enderTriplets));	
		//RenderingRegistry.registerEntityRenderingHandler(EntityAridWarrior.class, new RenderAridWarrior(new ModelAridWarrior(), 0.0F, EntityResourceLocation.AridWarrior));
		//RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoBlue.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, EntityResourceLocation.Ayeraco_Blue));
		//RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoGreen.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, EntityResourceLocation.Ayeraco_Green));
		//RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoPurple.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, EntityResourceLocation.Ayeraco_Purple));
		//RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoRed.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, EntityResourceLocation.Ayeraco_Red));
		//RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoYellow.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, EntityResourceLocation.Ayeraco_Yellow));
		RenderingRegistry.registerEntityRenderingHandler(EntityCorruptedDramcryx.class, new RenderDivineMob(new ModelDramcryx(), 0.0F, EntityResourceLocation.caveDramcryx));
		RenderingRegistry.registerEntityRenderingHandler(EntityTheEye.class, new RenderDivineMob(new ModelEye(), 0.0F, EntityResourceLocation.theEye));
		RenderingRegistry.registerEntityRenderingHandler(EntityFrost.class, new RenderDivineMob(new ModelFrost(), 0.0F, EntityResourceLocation.frost));
		RenderingRegistry.registerEntityRenderingHandler(EntityIceMan.class, new RenderDivineMob(new ModelBiped(), 0.0F, EntityResourceLocation.iceMan));
		RenderingRegistry.registerEntityRenderingHandler(EntityKingOfScorchers.class, new RenderDivineMob(new ModelKingScorcher(), 0.0F, EntityResourceLocation.kingOfScorchers));
		RenderingRegistry.registerEntityRenderingHandler(EntityRainbour.class, new RenderDivineMob(new ModelRainbour(), 0.0F, EntityResourceLocation.rainbour));
		RenderingRegistry.registerEntityRenderingHandler(EntityRotatick.class, new RenderDivineMob(new ModelRotatick(), 0.0F, EntityResourceLocation.rotatick));
		RenderingRegistry.registerEntityRenderingHandler(EntityShark.class, new RenderDivineMob(new ModelShark(), 0.0F, EntityResourceLocation.shark));
		RenderingRegistry.registerEntityRenderingHandler(EntityNetherWatcher.class, new RenderDivineMob(new ModelWatcher(), 0.0F, EntityResourceLocation.netherWatcher));
		RenderingRegistry.registerEntityRenderingHandler(EntityWildFire.class, new RenderDivineMob(new ModelWildFire(), 0.0F, EntityResourceLocation.wildFire));
	}
}
