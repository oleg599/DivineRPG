package net.divinerpg.helper;

import net.divinerpg.DivineRPG;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class DivineAPI {
	
	static int mobID = 90, projectileID = 350;

	
	public static void addRecipe(ItemStack i, Object ... o) {
		GameRegistry.addRecipe(i, o);
	}
	
	public static void addShapelessRecipe(ItemStack i, Object ... o) {
		GameRegistry.addShapelessRecipe(i, o);
	}
	
	public static void addSmelting(ItemStack input, ItemStack output, float XP) {
		GameRegistry.addSmelting(input, output, XP);
	}
	
	public static void registerDivineRPGMob(Class entityClass, String entityName) {
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, entityID);
		LanguageRegistry.instance().addStringLocalization("entity." + entityName + ".name", entityName);
		int ID = getUniqueID(); 
		EntityList.IDtoClassMapping.put(ID, entityClass);
		EntityList.entityEggs.put(ID, new EntityEggInfo(ID, 0x000000, 0xFFFFFF));
	}
	
	public static void registerProjectile(Class entityClass, String entityName) {
		int ID = getProjectileID(); 
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, ID);
		EntityRegistry.registerModEntity(entityClass, entityName, ID, DivineRPG.instance, 250, 5, true);
		LanguageRegistry.instance().addStringLocalization("entity." + entityName + ".name", entityName);
	}

	private static int getUniqueID() {
		return mobID++;
	}
	
	private static int getProjectileID() {
		return projectileID++;
	}
}