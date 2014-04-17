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
	public static String deepLaugh = "divinerpg:deepLaugh";
	public static String heal = "divinerpg:heal";
	public static String phaser = "divinerpg:phaser";
	public static String blitz = "divinerpg:blitz";
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
