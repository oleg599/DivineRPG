package net.divinerpg.client.render;

import net.divinerpg.Reference;
import net.minecraft.util.ResourceLocation;


public class EntityResourceLocation {

    public static final String     PREFIX            = Reference.PREFIX + "textures/mobs/";
    public static final String     PREFIX_PROJECTILE = Reference.PREFIX + "textures/projectiles/";
    public static final String 	   modelPrefix 		 = Reference.PREFIX + "textures/model/";

    public static ResourceLocation enderWatcher      = addMob("enderWatcher.png");
    public static ResourceLocation crab              = addMob("crab.png");
    public static ResourceLocation caveCrawler       = addMob("caveCrawler.png");
    public static ResourceLocation desertCrawler     = addMob("desertCrawler.png");
    public static ResourceLocation jungleDramcryx    = addMob("jungleDramcryx.png");
    public static ResourceLocation cyclops           = addMob("cyclops.png");
    public static ResourceLocation caveclops         = addMob("caveclops.png");
    public static ResourceLocation ancient           = addMob("ancientEntity.png");
    public static ResourceLocation scorcher          = addMob("scorcher.png");
    public static ResourceLocation hellSpider        = addMob("hellSpider.png");
    public static ResourceLocation whale             = addMob("whale.png");
    public static ResourceLocation enderSpider       = addMob("enderSpider.png");
    public static ResourceLocation enderTriplets     = addMob("enderTriplets.png");
    public static ResourceLocation miner 			 = addMob("miner.png");
    public static ResourceLocation aridWarrior       = addMob("aridWarrior.png");
    public static ResourceLocation ayeraco_Blue      = addMob("ayeracoBlue.png");
    public static ResourceLocation ayeraco_Green     = addMob("ayeracoGreen.png");
    public static ResourceLocation ayeraco_Purple    = addMob("ayeracoPurple.png");
    public static ResourceLocation ayeraco_Red       = addMob("ayeracoRed.png");
    public static ResourceLocation ayeraco_Yellow    = addMob("ayeracoYellow.png");
    public static ResourceLocation caveDramcryx      = addMob("caveDramcryx.png");
    public static ResourceLocation theEye            = addMob("theEye.png");
    public static ResourceLocation frost             = addMob("frost.png");
    public static ResourceLocation iceMan            = addMob("iceMan.png");
    public static ResourceLocation kingOfScorchers   = addMob("kingOfScorchers.png");
    public static ResourceLocation rainbour          = addMob("rainbour.png");
    public static ResourceLocation rotatick          = addMob("rotatick.png");
    public static ResourceLocation shark             = addMob("shark.png");
    public static ResourceLocation netherWatcher     = addMob("watcher.png");
    public static ResourceLocation wildFire          = addMob("wildFire.png");

    public static ResourceLocation phaserHalite      = addProjectile("halitePhaserProjectile.png");
    public static ResourceLocation phaserWild        = addProjectile("wildPhaserProjectile.png");
    public static ResourceLocation phaserSkythern    = addProjectile("skythernPhaserProjectile.png");
    public static ResourceLocation phaserEden        = addProjectile("edenPhaserProjectile.png");
    public static ResourceLocation phaserMortum      = addProjectile("mortumPhaserProjectile.png");
    public static ResourceLocation phaserApalachia   = addProjectile("apalachiaPhaserProjectile.png");

    public static ResourceLocation blitzHalite       = addProjectile("haliteBlitzProjectile.png");
    public static ResourceLocation blitzWild         = addProjectile("wildBlitzProjectile.png");
    public static ResourceLocation blitzSkythern     = addProjectile("skythernBlitzProjectile.png");
    public static ResourceLocation blitzEden         = addProjectile("edenBlitzProjectile.png");
    public static ResourceLocation blitzMortum       = addProjectile("mortumBlitzProjectile.png");
    public static ResourceLocation blitzApalachia    = addProjectile("apalachiaBlitzProjectile.png");

    public static ResourceLocation staffProjectile 	 = addProjectile("bouncingProjectile.png");
    public static ResourceLocation evernight 	 	 = addProjectile("evernight.png");
    public static ResourceLocation cannon 			 = addProjectile("cannon.png");
    public static ResourceLocation eversightCannon 	 = addProjectile("cannon.png");
    public static ResourceLocation eversight 	 	 = addProjectile("eversight.png");

    public static ResourceLocation edenArrow 	 	 = addProjectile("edenArrow.png");
    public static ResourceLocation wildArrow 	 	 = addProjectile("wildArrow.png");
    public static ResourceLocation apalachiaArrow 	 = addProjectile("apalachiaArrow.png");
    public static ResourceLocation skythernArrow 	 = addProjectile("skythernArrow.png");
    public static ResourceLocation mortumArrow 	 	 = addProjectile("mortumArrow.png");
    public static ResourceLocation haliteArrow 	 	 = addProjectile("haliteArrow.png");
    
    public static ResourceLocation scytheProjectile  = addProjectile("scytheProjectile.png");
    
    public static ResourceLocation angryBunny		 = addMob("angryBunny.png");
    public static ResourceLocation angryBunnyTamed 	 = addMob("angryBunnyTamed.png");
    public static ResourceLocation densos			 = addMob("densos.png");
    public static ResourceLocation karot			 = addMob("karot.png");
    public static ResourceLocation reyvor			 = addMob("reyvor.png");
    public static ResourceLocation bunny			 = addMob("bunny.png");
    public static ResourceLocation bunnyTamed		 = addMob("bunnyTamed.png");
    public static ResourceLocation soulFiend		 = addMob("soulFiend.png");
    public static ResourceLocation twilightDemon	 = addMob("twilightDemon.png");
    public static ResourceLocation vamacheron		 = addMob("vamacheron.png");
    public static ResourceLocation edenTomo			 = addMob("edenTomo.png");
    public static ResourceLocation cadillion		 = addMob("cadillion.png");
    public static ResourceLocation edenCori			 = addMob("edenCori.png");
    public static ResourceLocation nesro			 = addMob("nesro.png");
    public static ResourceLocation madivel			 = addMob("madivel.png");
    public static ResourceLocation wildWoodGolem	 = addMob("wildWoodGolem.png");
    public static ResourceLocation wildWoodTomo		 = addMob("wildWoodTomo.png");
    public static ResourceLocation varek			 = addMob("varek.png");
    public static ResourceLocation wildWoodWolf		 = addMob("wildWoodWolf.png");
    public static ResourceLocation apalachiaCadillion = addMob("apalachiaCadillion.png");
    public static ResourceLocation apalachiaTomo	 = addMob("apalachiaGomo.png");
    public static ResourceLocation apalachiaGolem	 = addMob("apalachiaGolem.png");
    public static ResourceLocation apalachiaWarrior	 = addMob("apalachiaWarrior.png");
    public static ResourceLocation apalachiaArcher	 = addMob("apalachiaArcher.png");
    public static ResourceLocation skythernArcher	 = addMob("skythernArcher.png");
    public static ResourceLocation samek			 = addMob("samek.png");
    public static ResourceLocation skythernGolem	 = addMob("skythernGolem.png");
    public static ResourceLocation skythernCori		 = addMob("skythernCori.png");
    public static ResourceLocation skythernFiend 	 = addMob("skythernFiend.png");
    public static ResourceLocation mortumCadillion	 = addMob("mortumCadillion.png");
    public static ResourceLocation mortumDemon		 = addMob("mortumDemon.png");
    public static ResourceLocation basalisk			 = addMob("basalisk.png");
    public static ResourceLocation soulStealer		 = addMob("soulStealer.png");
    public static ResourceLocation glacon			 = addMob("glacon.png");
    
    public static ResourceLocation VERMENOUS 		 = addMob("vermenous.png");
    public static ResourceLocation ENT 				 = addMob("ent.png");
    public static ResourceLocation CYMESOID 		 = addMob("cymesoid.png");
    public static ResourceLocation DREAMWRECKER 	 = addMob("dreamwrecker.png");
    public static ResourceLocation SHADAHIER 		 = addMob("shadahier.png");
    public static ResourceLocation ACID_HAG 		 = addMob("acidHag.png");
    public static ResourceLocation KAZROTIC 		 = addMob("kazrotic.png");
    public static ResourceLocation HELIO 			 = addMob("helio.png");
    public static ResourceLocation GORGOSION 		 = addMob("gorgosion.png");
    public static ResourceLocation HOVER_STINGER 	 = addMob("hoverStinger.png");
    public static ResourceLocation ZONE 			 = addMob("zone.png");
    public static ResourceLocation ZORAGON 			 = addMob("zoragon.png");
    public static ResourceLocation DISSIMENT 		 = addMob("dissiment.png");
    public static ResourceLocation VHRAAK 			 = addMob("vhraak.png");
    public static ResourceLocation LADY_LUNA_MELEE 	 = addMob("ladyLunaMelee.png");
    public static ResourceLocation BOHEMITE 	     = addMob("boheimite.png");
    public static ResourceLocation WRECK 			 = addMob("wreck.png");
    public static ResourceLocation HIVE_QUEEN 		 = addMob("hiveQueen.png");
    public static ResourceLocation HIVE_SOLDIER 	 = addMob("hiveSoldier.png");
    public static ResourceLocation BIPHRON 			 = addMob("biphron.png");
    public static ResourceLocation TWINS 			 = addMob("twins.png");
    public static ResourceLocation QUADRO 			 = addMob("quadro.png");
    public static ResourceLocation GALROID 			 = addMob("galroid.png");
    public static ResourceLocation HERBOMANCER 		 = addMob("herbomancer.png");
    public static ResourceLocation KAROS 		     = addMob("karos.png");
    public static ResourceLocation LHEIVA 		     = addMob("lheiva.png");
    public static ResourceLocation LORGA 			 = addMob("lorga.png");
    public static ResourceLocation LORGA_FLIGHT 	 = addMob("lorgaFlight.png");
    public static ResourceLocation MANDRAGORA 		 = addMob("mandragora.png");
    public static ResourceLocation RAGLOK 			 = addMob("raglokGogdure.png");
    public static ResourceLocation TOCAXIN 			 = addMob("tocaxin.png");
    public static ResourceLocation HUNGER_HUNGRY 	 = addMob("hungerHungry.png");
    public static ResourceLocation ENDIKU 		     = addMob( "endiku.png");
    public static ResourceLocation TEMPLE_GUARDIAN 	 = addMob("templeGuardian.png");
    public static ResourceLocation MYSTERIOUS_MAN_LAYER_1 = addMob("mysteriousManLayer1.png");
    public static ResourceLocation MYSTERIOUS_MAN_LAYER_2 = addMob("mysteriousManLayer2.png");
    public static ResourceLocation MYSTERIOUS_MAN_LAYER_3 = addMob("mysteriousManLayer3.png");
    public static ResourceLocation CRYPT_KEEPER = TEMPLE_GUARDIAN;
    public static ResourceLocation DUO 				 = addMob("duo.png");
    public static ResourceLocation EHU 				 = addMob("ehu.png");
    public static ResourceLocation HUSK 			 = addMob("husk.png");
    public static ResourceLocation VERMSILLION 		 = addMob("vermsillion.png");
    public static ResourceLocation STONE_GOLEM 		 = addMob("stoneGolem.png");
    
    public static ResourceLocation KING_STATUE 		 = addModel("statueKos.png");
    public static ResourceLocation ANCIENT_STATUE 	 = addModel("statueAnchient.png");
    public static ResourceLocation AYERACO_STATUE	 = addModel("statueAyeraco.png");
    public static ResourceLocation DENSOS_STATUE	 = addModel("statueDensos.png");
    public static ResourceLocation DEX_STATUE		 = addModel("statueDex.png");
    public static ResourceLocation DRAMIX_STATUE	 = addModel("statueDramix.png");
    public static ResourceLocation PARASECTA_STATUE	 = addModel("statueParasecta.png");
    public static ResourceLocation SOUL_STATUE		 = addModel("statueSF.png");
    public static ResourceLocation TWILIGHT_STATUE	 = addModel("statueTwilightDemon.png");
    public static ResourceLocation VAMACHERON_STATUE = addModel("statueVamacheron.png");
    public static ResourceLocation WATCHER_STATUE	 = addModel("statueWatcher.png");
    
    private static ResourceLocation addMob(String tex){
    	return new ResourceLocation(PREFIX + tex);
    }
    
    private static ResourceLocation addProjectile(String tex){
    	return new ResourceLocation(PREFIX_PROJECTILE + tex);
    }
    
    private static ResourceLocation addModel(String tex){
    	return new ResourceLocation(modelPrefix + tex);
    }
}
