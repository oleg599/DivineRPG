package net.divinerpg;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;


public class Sounds {

	public static final String Crab = "crab", CrabHurt = "crabHurt", AridWarrior = "aridWarrior", AridWarriorHurt = "aridWarriorHurt";
	public static final String AyeracoHurt = "ayeracoHit", AyeracoTeleport = "ayeracoTeleport", AyeracoHalfHealth = "ayeracoHalfHealth", Ayeraco = "ayeraco";
	public static final String AyeracoPiller = "ayeracoPillar", AyeracoSpawn = "ayeracoSpawn", Cyclops = "cyclops", cyclopsHit = "cyclopsHit";
	public static final String Crawler = "crawler", CrawlerHurt = "crawlerHurt", Dramcryx = "dramcryx", DramcryxHurt = "dramcryxHurt";
	public static final String Glacide = "glacide", GlacideHurt = "glacideHit", HellSpider = "hellSpider", Iceman = "iceman";
	public static final String KingScorcher = "kingScorcher", KingScorcherHurt = "kingScorcherHit", Roar = "roar", Rainbour = "rainbour", RainbourHurt = "rainboirHit";
	public static final String Rotatick = "rotatick", RotatickHurt = "rotatickHit", Scorcher = "scorcher", TheEye = "theEye", TheEyeHurt = "theEyeHurt";
	public static final String Whale = "whale", WhaleHurt = "whaleHurt", WildFire = "wildFire", WildFireHurt = "wildFireHit";
	

	public static String playSound(String name, World world, Entity entity, float volume, float pitch){
		world.playSoundAtEntity(entity, Reference.PREFIX + name, (float)volume, (float)pitch); 
		return name;
	}

	public static String playSound(String name, World world, Entity entity){
		world.playSoundAtEntity(entity, Reference.PREFIX + name, 1, 1); 
		return name;
	}
}
