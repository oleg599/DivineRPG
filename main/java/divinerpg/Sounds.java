package divinerpg;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;


public class Sounds {

	public static String Prefix = Reference.PREFIX;
	
	public static String[] files = {add("crabHurt"), add("crab"), add("aridWarrior"), add("aridWarriorHurt")};
	
	public static final String Crab = "crab";
	public static final String CrabHurt = "crabHurt";
	public static final String AridWarrior = "aridWarrior";
	public static final String AridWarriorHurt = "aridWarriorHurt";
	public static final String AyeracoHurt = "", AyeracoTeleport = "", AyeracoHalfHealth = "", Ayeraco = "", AyeracoHit = "";
	
	public static String add(String sound){
		return Prefix + sound + ".ogg";
	}
	
	public static String playSound(String name, World world, Entity entityName, float volume, float pitch){
		world.playSoundAtEntity(entityName, Reference.PREFIX + name, (float)volume, (float)pitch); 
		return name;
	}
}
