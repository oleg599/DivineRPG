package divinerpg;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;


public class Sounds {

	public static String Prefix = Reference.PREFIX;
	
	public static String[] files = {addSound("crabHurt"), addSound("crab")};
	
	public static final String Crab = "crab";
	public static final String CrabHurt = "CrabHurt";
	public static final String AyeracoHurt = "", AyeracoTeleport = "", AyeracoHalfHealth = "", Ayeraco = "", AyeracoHit = "";
	
	public static String addSound(String sound){
		return Prefix + sound + ".ogg";
	}
	
	public static void playSound(String name, World world, Entity entityName, float volume, float pitch){
        world.playSoundAtEntity(entityName, Reference.PREFIX + name, (float)volume, (float)pitch);
	}
}
