package net.divinerpg;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;


public class Sounds {

	public static String crab = "divinerpg:crab";
	public static String crabHurt = "divinerpg:crabHurt";
	public static String aridWarrior = "divinerpg:aridWarrior";
	public static String aridWarriorHurt = "divinerpg:aridWarriorHurt";
	public static String ayeraco = "divinerpg:ayeraco";
	public static String ayeracoHurt = "divinerpg:ayeracoHurt";
	public static String crawler = "divinerpg:crawler";
	public static String crawlerHurt = "divinerpg:crawlerHurt";
	public static String cyclops = "divinerpg:cyclops";
	public static String cyclopsHurt = "divinerpg:cyclopsHurt";
	public static String dramcryx = "divinerpg:dramcryx";
	public static String dramcryxHurt = "divinerpg:dramcryxHurt";
	public static String glacide = "divinerpg:glacide";
	public static String glacideHurt = "divinerpg:glacideHurt";
	public static String kingScorcher = "divinerpg:kingScorcher";
	public static String kingScorcherHurt = "divinerpg:kingScorcherHurt";
	public static String rainbour = "divinerpg:rainbour";
	public static String rainbourHurt = "divinerpg:rainbourHurt";
	public static String rotatick = "divinerpg:rotatick";
	public static String rotatickHurt = "divinerpg:rotatickHurt";
	public static String theEye = "divinerpg:theEye";
	public static String theEyeHurt = "divinerpg:theEyeHurt";
	public static String whale = "divinerpg:whale";
	public static String whaleHurt = "divinerpg:whaleHurt";
	public static String wildFire = "divinerpg:wildFire";
	public static String wildFireHurt = "divinerpg:wildFireHurt";
	public static String growl = "divinerpg:growl";
	public static String growlHurt = "divinerpg:growlHurt";
	public static String cori = "divinerpg:cori";
	public static String coriHurt = "divinerpg:coriHurt";
	public static String bunny = "divinerpg:bunny";
	public static String bunnyHurt = "divinerpg:bunnyHurt";
	public static String nesro = "divinerpg:nesro";
	public static String nesroHurt = "divinerpg:nesroHurt";
	public static String madivel = "divinerpg:madivel";
	public static String madivelHurt = "divinerpg:madivelHurt";
	public static String densos = "divinerpg:densos";
	public static String densosHurt = "divinerpg:densosHurt";
	public static String reyvor = "divinerpg:reyvor";
	public static String reyvorHurt = "divinerpg:reyvorHurt";
	public static String verek = "divinerpg:verek";
	public static String verekHurt = "divinerpg:verekHurt";
	public static String rollum = "divinerpg:rollum";
	public static String rollumHurt = "divinerpg:rollumHurt";
	public static String hastreus = "divinerpg:hastreus";
	public static String hastreusHurt = "divinerpg:hastreusHurt";
	public static String fractite = "divinerpg:fractite";
	public static String fractiteHurt = "divinerpg:fractiteHurt";
	public static String alicanto = "divinerpg:alicanto";
	public static String alicantoHurt = "divinerpg:alicantoHurt";
	public static String jackOMan = "divinerpg:jackOMan";
	public static String frost = "divinerpg:frost";
	public static String scorcher = "divinerpg:scorcher";
	public static String roar = "divinerpg:roar";
	public static String iceman = "divinerpg:iceman";
	public static String hellSpider = "divinerpg:hellSpider";
	public static String ayeracoTeleport = "divinerpg:ayeracoTeleport";
	public static String ayeracoHalfHealth = "divinerpg:ayeracoHalfHealth";
	public static String ayeracoPillar = "divinerpg:ayeracoPillar";
	public static String ayeracoSpawn = "divinerpg:ayeracoSpawn";
	public static String hiss = "divinerpg:hiss";
	public static String archer = "divinerpg:archer";
	public static String cadillion = "divinerpg:cadillion";
	public static String coriShoot = "divinerpg:coriShoot";
	public static String croak = "divinerpg:croak";
	public static String highHit = "divinerpg:highHit";
	public static String coriIdle = "divinerpg:coriIdle";
	public static String mucky = "divinerpg:mucky";
	public static String insect = "divinerpg:insect";
	public static String demonDarkness = "divinerpg:demonDarkness";
	public static String deepLaugh = "divinerpg:deepLaugh";
	public static String heal = "divinerpg:heal";
	public static String serenade = "divinerpg:serenade";
	public static String phaser = "divinerpg:phaser";
	public static String blitz = "divinerpg:blitz";
	public static String soundOfCarols = "divinerpg:soundOfCarols";
	public static String soundOfMusic = "divinerpg:soundOfMusic";
	public static String frostclawCannon = "divinerpg:frostclawCannon";
	public static String staff = "divinerpg:staff";
	public static String starlight = "divinerpg:starlight";
	public static String sparkler = "divinerpg:sparkler";

	public static String playSound(String name, World world, Entity entity, float volume, float pitch){
		world.playSoundAtEntity(entity, name, volume, pitch); 
		return name;
	}

	public static String playSound(String name, World world, Entity entity){
		world.playSoundAtEntity(entity, name, 1.0F, 1.0F); 
		return name;
	}
}
