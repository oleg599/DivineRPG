package net.divinerpg.client.render.entity;

import net.divinerpg.client.render.*;
import net.divinerpg.client.render.block.*;
import net.divinerpg.client.render.entity.vanilla.*;
import net.divinerpg.client.render.entity.vanilla.model.*;
import net.divinerpg.entity.vanilla.*;
import net.divinerpg.entity.vanilla.projectile.*;
import net.divinerpg.helper.*;
import net.divinerpg.helper.blocks.*;
import net.divinerpg.helper.items.*;
import net.minecraft.client.model.*;
import cpw.mods.fml.client.registry.*;

public class OverworldEntityRenderer {

	private static EntityResourceLocation x;
	
	public static void init(){
		RenderingRegistry.registerEntityRenderingHandler(EntityShuriken.class, new RenderIconProjectile(VanillaItemsWeapons.shuriken));
		RenderingRegistry.registerEntityRenderingHandler(EntityModSnowball.class, new RenderProjectile(x.snowball));
		RenderingRegistry.registerEntityRenderingHandler(EntityVileStorm.class, new RenderIconProjectile(VanillaItemsWeapons.vileStorm));
		RenderingRegistry.registerEntityRenderingHandler(EntityScythe.class, new RenderProjectile(x.scytheProjectile));
		RenderingRegistry.registerEntityRenderingHandler(EntityDeath.class, new RenderProjectile(x.death));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderWatcher.class, new RenderDivineMob(new ModelWatcher(), 0.0F, x.enderWatcher));
		RenderingRegistry.registerEntityRenderingHandler(EntityCrab.class, new RenderSizeable(new ModelCrab(), 0.0F, 1.0F, x.crab));
		RenderingRegistry.registerEntityRenderingHandler(EntityBabyCrab.class, new RenderSizeable(new ModelCrab(), 0.0F, 0.5F, x.crab));
		RenderingRegistry.registerEntityRenderingHandler(EntityKingCrab.class, new RenderSizeable(new ModelKingCrab(), 0.0F, 2.6F, x.kingCrab));
		RenderingRegistry.registerEntityRenderingHandler(EntityCaveCrawler.class, new RenderDivineMob(new ModelCrawler(), 0.0F, x.caveCrawler));
		RenderingRegistry.registerEntityRenderingHandler(EntityDesertCrawler.class, new RenderDivineMob(new ModelCrawler(), 0.0F, x.desertCrawler));
		RenderingRegistry.registerEntityRenderingHandler(EntityJungleDramcryx.class, new RenderDivineMob(new ModelDramcryx(), 0.0F, x.jungleDramcryx));
		RenderingRegistry.registerEntityRenderingHandler(EntityCyclops.class, new RenderSizeable(new ModelBiped(), 0.0F, 2.0F, x.cyclops));
		RenderingRegistry.registerEntityRenderingHandler(EntityCaveclops.class, new RenderSizeable(new ModelBiped(), 0.0F, 2.0F, x.caveclops));
		RenderingRegistry.registerEntityRenderingHandler(EntityAncientEntity.class, new RenderAncientEntity(new ModelAncientEntity(), 0.0F, 5.0F, x.ancient));
		RenderingRegistry.registerEntityRenderingHandler(EntityWhale.class, new RenderSizeable(new ModelWhale(), 0.0F, 5.0F, x.whale));
		RenderingRegistry.registerEntityRenderingHandler(EntityScorcher.class, new RenderSizeable(new ModelScorcher(), 0.0F, 1.8F, x.scorcher));
		RenderingRegistry.registerEntityRenderingHandler(EntityHellSpider.class, new RenderSizeable(new ModelSpider(), 0.0F, 1.2F ,x.hellSpider));
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderSpider.class, new RenderSizeable(new ModelSpider(), 0.0F, 0.5F, x.enderSpider));
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderTriplets.class, new RenderDivineMob(new ModelEnderTriplets(), 0.0F, x.enderTriplets));	
		RenderingRegistry.registerEntityRenderingHandler(EntityAridWarrior.class, new RenderDivineMob(new ModelAridWarrior(), 0.0F, x.aridWarrior));
		RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoBlue.class, new RenderDivineMob(new ModelAyeraco(), 0.0F, x.ayeraco_Blue));
		RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoGreen.class, new RenderDivineMob(new ModelAyeraco(), 0.0F, x.ayeraco_Green));
		RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoPurple.class, new RenderDivineMob(new ModelAyeraco(), 0.0F, x.ayeraco_Purple));
		RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoRed.class, new RenderDivineMob(new ModelAyeraco(), 0.0F, x.ayeraco_Red));
		RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoYellow.class, new RenderDivineMob(new ModelAyeraco(), 0.0F, x.ayeraco_Yellow));
		RenderingRegistry.registerEntityRenderingHandler(EntityCorruptedDramcryx.class, new RenderDivineMob(new ModelDramcryx(), 0.0F, x.caveDramcryx));
		RenderingRegistry.registerEntityRenderingHandler(EntityTheEye.class, new RenderDivineMob(new ModelEye(), 0.0F, x.theEye));
		RenderingRegistry.registerEntityRenderingHandler(EntityFrost.class, new RenderDivineMob(new ModelFrost(), 0.0F, x.frost));
		RenderingRegistry.registerEntityRenderingHandler(EntityIceMan.class, new RenderDivineMob(new ModelBiped(), 0.0F, x.iceMan));
		RenderingRegistry.registerEntityRenderingHandler(EntityKingOfScorchers.class, new RenderDivineMob(new ModelKingScorcher(), 0.0F, x.kingOfScorchers));
		RenderingRegistry.registerEntityRenderingHandler(EntityRainbour.class, new RenderDivineMob(new ModelRainbour(), 0.0F, x.rainbour));
		RenderingRegistry.registerEntityRenderingHandler(EntityRotatick.class, new RenderDivineMob(new ModelRotatick(), 0.0F, x.rotatick));
		RenderingRegistry.registerEntityRenderingHandler(EntityShark.class, new RenderDivineMob(new ModelShark(), 0.0F, x.shark));
		RenderingRegistry.registerEntityRenderingHandler(EntityNetherWatcher.class, new RenderDivineMob(new ModelWatcher(), 0.0F, x.netherWatcher));
		RenderingRegistry.registerEntityRenderingHandler(EntityWildFire.class, new RenderDivineMob(new ModelWildFire(), 0.0F, x.wildFire));
		RenderingRegistry.registerEntityRenderingHandler(EntityGlacon.class, new RenderDivineMob(new ModelGlacon(), 0.0F, x.glacon));
		RenderingRegistry.registerEntityRenderingHandler(EntityMiner.class, new RenderMiner());

		DivineAPI.registerItemRenderer(VanillaBlocks.KingStatue, new RenderStatueItem(VanillaBlocks.KingStatue));
		DivineAPI.registerItemRenderer(VanillaBlocks.AncientStatue, new RenderStatueItem(VanillaBlocks.AncientStatue));
		DivineAPI.registerItemRenderer(VanillaBlocks.AyeracoStatue, new RenderStatueItem(VanillaBlocks.AyeracoStatue));
		DivineAPI.registerItemRenderer(VanillaBlocks.TDemonStatue, new RenderStatueItem(VanillaBlocks.TDemonStatue));
		DivineAPI.registerItemRenderer(VanillaBlocks.VamacheronStatue, new RenderStatueItem(VanillaBlocks.VamacheronStatue));
		DivineAPI.registerItemRenderer(VanillaBlocks.DensosStatue, new RenderStatueItem(VanillaBlocks.DensosStatue));
		DivineAPI.registerItemRenderer(VanillaBlocks.DexStatue, new RenderStatueItem(VanillaBlocks.DexStatue));
		DivineAPI.registerItemRenderer(VanillaBlocks.DramixStatue, new RenderStatueItem(VanillaBlocks.DramixStatue));
		//DivineAPI.registerItemRenderer(VanillaBlocks.ParasectaStatue, new RenderStatueItem(VanillaBlocks.ParasectaStatue));
		DivineAPI.registerItemRenderer(VanillaBlocks.SoulFiendStatue, new RenderStatueItem(VanillaBlocks.SoulFiendStatue));
		DivineAPI.registerItemRenderer(VanillaBlocks.WatcherStatue, new RenderStatueItem(VanillaBlocks.WatcherStatue));
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityStatue.class, new RenderStatue());
	}
}
