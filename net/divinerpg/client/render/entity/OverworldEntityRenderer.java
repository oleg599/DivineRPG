package net.divinerpg.client.render.entity;

import net.divinerpg.client.render.*;
import net.divinerpg.overworld.entity.mobs.*;
import net.divinerpg.overworld.entity.mobs.models.*;
import net.minecraft.client.model.*;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class OverworldEntityRenderer {
	static EntityResourceLocation x;

	public static void init(){
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderWatcher.class, new RenderDivineMob(new ModelWatcher(), 0.0F, x.EnderWatcher));
		RenderingRegistry.registerEntityRenderingHandler(EntityCrab.class, new RenderDivineMob(new ModelCrab(), 0.0F, x.Crab));
		RenderingRegistry.registerEntityRenderingHandler(EntityKingCrab.class, new RenderSizeable(new ModelCrab(), 0.0F, 1.8F, x.Crab));
		RenderingRegistry.registerEntityRenderingHandler(EntityCaveCrawler.class, new RenderDivineMob(new ModelCrawler(), 0.0F, x.CaveCrawler));
		RenderingRegistry.registerEntityRenderingHandler(EntityDesertCrawler.class, new RenderDivineMob(new ModelCrawler(), 0.0F, x.DesertCrawler));
		RenderingRegistry.registerEntityRenderingHandler(EntityJungleDramcryx.class, new RenderDivineMob(new ModelDramcryx(), 0.0F, x.JungleDramcryx));
		RenderingRegistry.registerEntityRenderingHandler(EntityCyclops.class, new RenderSizeable(new ModelBiped(), 0.0F, 2.0F, x.Cyclops));
		RenderingRegistry.registerEntityRenderingHandler(EntityAncientEntity.class, new RenderSizeable(new ModelAncientEntity(), 0.0F, 5.0F, x.Ancient));
		RenderingRegistry.registerEntityRenderingHandler(EntityWhale.class, new RenderSizeable(new ModelWhale(), 0.0F, 5.0F, x.Whale));
		RenderingRegistry.registerEntityRenderingHandler(EntityScorcher.class, new RenderSizeable(new ModelScorcher(), 0.0F, 1.8F, x.Scorcher));
		RenderingRegistry.registerEntityRenderingHandler(EntityHellSpider.class, new RenderSizeable(new ModelSpider(), 0.0F, 1.2F ,x.HellSpider));
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderSpider.class, new RenderSizeable(new ModelSpider(), 0.0F, 0.5F, x.EnderSpider));
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderTriplets.class, new RenderDivineMob(new ModelEnderTriplets(), 0.0F, x.EnderTriplets));	
		//RenderingRegistry.registerEntityRenderingHandler(EntityAridWarrior.class, new RenderAridWarrior(new ModelAridWarrior(), 0.0F, x.AridWarrior));
		//RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoBlue.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, x.Ayeraco_Blue));
		//RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoGreen.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, x.Ayeraco_Green));
		//RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoPurple.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, x.Ayeraco_Purple));
		//RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoRed.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, x.Ayeraco_Red));
		//RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoYellow.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, x.Ayeraco_Yellow));
		//RenderingRegistry.registerEntityRenderingHandler(EntityCaveDramcryx.class, new RenderDivineMob(new ModelDramcryx(), 0.0F, x.CaveDramcryx));
		//RenderingRegistry.registerEntityRenderingHandler(EntityTheEye.class, new RenderDivineMob(new ModelEye(), 0.0F, x.TheEye));
		//RenderingRegistry.registerEntityRenderingHandler(EntityFrost.class, new RenderDivineMob(new ModelFrost(), 0.0F, x.Frost));
		//RenderingRegistry.registerEntityRenderingHandler(EntityIceMan.class, new RenderDivineMob(new ModelBiped(), 0.0F, x.IceMan));
		//RenderingRegistry.registerEntityRenderingHandler(EntityKingOfScorchers.class, new RenderKingOfScorchers(new ModelKingOfScorchers(), 0.0F, x.KingOfScorchers));
		//RenderingRegistry.registerEntityRenderingHandler(EntityRainbour.class, new RenderDivineMob(new ModelRainbour(), 0.0F, x.Rainbour));
		//RenderingRegistry.registerEntityRenderingHandler(EntityRotatick.class, new RenderDivineMob(new ModelRotatick(), 0.0F, x.Rotatick));
		//RenderingRegistry.registerEntityRenderingHandler(EntityShark.class, new RenderDivineMob(new ModelShark(), 0.0F, x.Shark));
		//RenderingRegistry.registerEntityRenderingHandler(EntityTheWatcher.class, new RenderWatcher(new ModelWatcher(), 0.0F, x.NetherWatcher));
		//RenderingRegistry.registerEntityRenderingHandler(EntityWildFire.class, new RenderWildFire(new ModelWildFire(), 0.0F, x.WildFire));
	}
}
