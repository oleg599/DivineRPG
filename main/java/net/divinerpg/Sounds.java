package net.divinerpg;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;


public class Sounds {

	public static final String crab = "divinerpg:crab";
	public static final String crabHurt = "divinerpg:crabHurt";
	public static final String aridWarrior = "divinerpg:aridWarrior";
	public static final String aridWarriorHurt = "divinerpg:aridWarriorHurt";
	public static final String ayeraco = "divinerpg:ayeraco";
	public static final String ayeracoHurt = "divinerpg:ayeracoHurt";
	public static final String crawler = "divinerpg:crawler";
	public static final String crawlerHurt = "divinerpg:crawlerHurt";
	public static final String cyclops = "divinerpg:cyclops";
	public static final String cyclopsHurt = "divinerpg:cyclopsHurt";
	public static final String dramcryx = "divinerpg:dramcryx";
	public static final String dramcryxHurt = "divinerpg:dramcryxHurt";
	public static final String glacide = "divinerpg:glacide";
	public static final String glacideHurt = "divinerpg:glacideHurt";
	public static final String kingScorcher = "divinerpg:kingScorcher";
	public static final String kingScorcherHurt = "divinerpg:kingScorcherHurt";
	public static final String rainbour = "divinerpg:rainbour";
	public static final String rainbourHurt = "divinerpg:rainbourHurt";
	public static final String rotatick = "divinerpg:rotatick";
	public static final String rotatickHurt = "divinerpg:rotatickHurt";
	public static final String theEye = "divinerpg:theEye";
	public static final String theEyeHurt = "divinerpg:theEyeHurt";
	public static final String whale = "divinerpg:whale";
	public static final String whaleHurt = "divinerpg:whaleHurt";
	public static final String wildFire = "divinerpg:wildFire";
	public static final String wildFireHurt = "divinerpg:wildFireHurt";
	public static final String ayeracoHalfHealth = "divinerpg:ayeracoHalfHealth";
	public static final String ayeracoPillar = "divinerpg:ayeracoPillar";
	public static final String ayeracoSpawn = "divinerpg:ayeracoSpawn";
	public static final String ayeracoTeleport = "divinerpg:ayeracoTeleport";
	public static final String hellSpider = "divinerpg:hellSpider";
	public static final String iceman = "divinerpg:iceman";
	public static final String roar = "divinerpg:roar";
	public static final String scorcher = "divinerpg:scorcher";
	public static final String frost = "divinerpg:frost";
	public static final String phaser = "divinerpg:phaser";
	public static final String staff = "divinerpg:staff";
	public static final String blitz = "divinerpg:blitz";
	public static final String jackOMan = "divinerpg:jackOMan";


	public static String playSound(String name, World world, Entity entity, float volume, float pitch){
		world.playSoundAtEntity(entity, name, (float)volume, (float)pitch); 
		return name;
	}

	public static String playSound(String name, World world, Entity entity){
		world.playSoundAtEntity(entity, name, 1, 1); 
		return name;
	}
}
