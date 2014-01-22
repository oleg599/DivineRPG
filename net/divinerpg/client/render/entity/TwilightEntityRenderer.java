package net.divinerpg.client.render.entity;

import net.divinerpg.api.entity.*;
import net.divinerpg.client.render.*;
import net.divinerpg.helper.items.*;
import net.divinerpg.twilight.entity.mob.*;
import net.divinerpg.twilight.entity.mob.model.*;
import net.divinerpg.twilight.entity.projectile.*;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class TwilightEntityRenderer {
	

	public static void init(){
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerEden.class, new RenderIconProjectile(TwilightItems.edenSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerWildWoods.class, new RenderIconProjectile(TwilightItems.wildWoodSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerApalachia.class, new RenderIconProjectile(TwilightItems.apalachiaSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerSkythern.class, new RenderIconProjectile(TwilightItems.skythernSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerMortum.class, new RenderIconProjectile(TwilightItems.mortumSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerHalite.class, new RenderIconProjectile(TwilightItems.haliteSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzEden.class, new RenderProjectile(EntityResourceLocation.blitzEden));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzWildWood.class, new RenderProjectile(EntityResourceLocation.blitzWild));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzAlapachia.class, new RenderProjectile(EntityResourceLocation.blitzApalachia));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzSkythern.class, new RenderProjectile(EntityResourceLocation.blitzSkythern));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzMortum.class, new RenderProjectile(EntityResourceLocation.blitzMortum));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzHalite.class, new RenderProjectile(EntityResourceLocation.blitzHalite));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserEden.class, new RenderProjectile(EntityResourceLocation.phaserEden));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserWildWood.class, new RenderProjectile(EntityResourceLocation.phaserWild));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserApalachia.class, new RenderProjectile(EntityResourceLocation.phaserApalachia));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserSkythern.class, new RenderProjectile(EntityResourceLocation.phaserSkythern));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserMortum.class, new RenderProjectile(EntityResourceLocation.phaserMortum));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserHalite.class, new RenderProjectile(EntityResourceLocation.phaserHalite));
        
        RenderingRegistry.registerEntityRenderingHandler(EntityCadillion.class, new RenderDivineMob(new ModelCadillion(), 0.0F, EntityResourceLocation.cadillion));
        RenderingRegistry.registerEntityRenderingHandler(EntityEdenTomo.class, new RenderDivineMob(new ModelTomo(), 0.0F, EntityResourceLocation.edenTomo));
        RenderingRegistry.registerEntityRenderingHandler(EntityBunny.class, new RenderDivineMob(new ModelBunny(), 0.0F, EntityResourceLocation.bunny));
        RenderingRegistry.registerEntityRenderingHandler(EntityAngryBunny.class, new RenderSizeable(new ModelAngryBunny(), 0.0F, 2.0F, EntityResourceLocation.angryBunny));
        RenderingRegistry.registerEntityRenderingHandler(EntityCori.class, new RenderDivineMob(new ModelCori(), 0.0F, EntityResourceLocation.edenCori));
        RenderingRegistry.registerEntityRenderingHandler(EntityMadivel.class, new RenderDivineMob(new ModelMadivel(), 0.0F, EntityResourceLocation.madivel));
        RenderingRegistry.registerEntityRenderingHandler(EntityNesro.class, new RenderDivineMob(new ModelNesro(), 0.0F, EntityResourceLocation.nesro));
        RenderingRegistry.registerEntityRenderingHandler(EntityWildWoodGolem.class, new RenderDivineMob(new ModelTwilightGolem(), 0.0F, EntityResourceLocation.wildWoodGolem));
        RenderingRegistry.registerEntityRenderingHandler(EntityWildWoodTomo.class, new RenderDivineMob(new ModelTomo(), 0.0F, EntityResourceLocation.wildWoodTomo));
        RenderingRegistry.registerEntityRenderingHandler(EntityVerek.class, new RenderDivineMob(new ModelSamek(), 0.0F, EntityResourceLocation.varek));
        RenderingRegistry.registerEntityRenderingHandler(EntityMoonWolf.class, new RenderDivineMob(new ModelMoonWolf(), 0.0F, EntityResourceLocation.wildWoodWolf));
        RenderingRegistry.registerEntityRenderingHandler(EntityApalachiaCadillion.class, new RenderDivineMob(new ModelCadillion(), 0.0F, EntityResourceLocation.cadillion));
        RenderingRegistry.registerEntityRenderingHandler(EntityApalachiaTomo.class, new RenderDivineMob(new ModelTomo(), 0.0F, EntityResourceLocation.apalachiaTomo));
        RenderingRegistry.registerEntityRenderingHandler(EntityApalachiaGolem.class, new RenderDivineMob(new ModelTwilightGolem(), 0.0F, EntityResourceLocation.apalachiaGolem));
        RenderingRegistry.registerEntityRenderingHandler(EntityApalachiaWarrior.class, new RenderDivineMob(new ModelEnchantedWarrior(), 0.0F, EntityResourceLocation.apalachiaWarrior));
        RenderingRegistry.registerEntityRenderingHandler(EntityApalachiaArcher.class, new RenderDivineMob(new ModelEnchantedArcher(), 0.0F, EntityResourceLocation.apalachiaArcher));
        RenderingRegistry.registerEntityRenderingHandler(EntitySkythernArcher.class, new RenderDivineMob(new ModelEnchantedArcher(), 0.0F, EntityResourceLocation.skythernArcher));
        RenderingRegistry.registerEntityRenderingHandler(EntitySamek.class, new RenderDivineMob(new ModelSamek(), 0.0F, EntityResourceLocation.samek));
        RenderingRegistry.registerEntityRenderingHandler(EntitySkythernGolem.class, new RenderDivineMob(new ModelTwilightGolem(), 0.0F, EntityResourceLocation.skythernGolem));
        RenderingRegistry.registerEntityRenderingHandler(EntityCori2.class, new RenderDivineMob(new ModelCori(), 0.0F, EntityResourceLocation.skythernGolem));
        RenderingRegistry.registerEntityRenderingHandler(EntitySkythernFiend.class, new RenderDivineMob(new ModelMytrilFiend(), 0.0F, EntityResourceLocation.skythernGolem));
        RenderingRegistry.registerEntityRenderingHandler(EntityMortumCadillion.class, new RenderDivineMob(new ModelCadillion(), 0.0F, EntityResourceLocation.mortumCadillion));
        RenderingRegistry.registerEntityRenderingHandler(EntityMortumDemon.class, new RenderDivineMob(new ModelDenseDemon(), 0.0F, EntityResourceLocation.mortumDemon));
        RenderingRegistry.registerEntityRenderingHandler(EntityBaslisk.class, new RenderDivineMob(new ModelBasalisk(), 0.0F, EntityResourceLocation.basalisk));
        RenderingRegistry.registerEntityRenderingHandler(EntitySoulStealer.class, new RenderDivineMob(new ModelSoulStealer(), 0.0F, EntityResourceLocation.soulStealer));
        RenderingRegistry.registerEntityRenderingHandler(EntityDensos.class, new RenderDivineMob(new ModelDensos(), 0.0F, EntityResourceLocation.densos));
        RenderingRegistry.registerEntityRenderingHandler(EntityReyvor.class, new RenderDivineMob(new ModelDensos(), 0.0F, EntityResourceLocation.reyvor));
        RenderingRegistry.registerEntityRenderingHandler(EntityTwilightDemon.class, new RenderSizeable(new ModelTwilightDemon(), 0.0F, 2.0F, EntityResourceLocation.twilightDemon));
        RenderingRegistry.registerEntityRenderingHandler(EntitySoulFiend.class, new RenderSizeable(new ModelSoulFiend(), 0.0F, 1.0F, EntityResourceLocation.soulFiend));
        RenderingRegistry.registerEntityRenderingHandler(EntityVamacheron.class, new RenderSizeable(new ModelVamacheron(), 0.0F, 3.0F, EntityResourceLocation.vamacheron));
        RenderingRegistry.registerEntityRenderingHandler(EntityKarot.class, new RenderSizeable(new ModelKarot(), 0.0F, 5.0F, EntityResourceLocation.karot));
	}	
}