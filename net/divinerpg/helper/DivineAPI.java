package net.divinerpg.helper;

import net.divinerpg.DivineRPG;
import net.divinerpg.helper.recipes.CraftingDivineTableManager;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class DivineAPI {

	static int mobID = 121, projectileID = 350;


	public static void addRecipe(ItemStack i, Object ... o) {
		GameRegistry.addRecipe(i, o);
	}
	
	public static void addBigRecipe(ItemStack i, Object ... o) {
		CraftingDivineTableManager.getInstance().addRecipe(i, o);
	}

	public static void addShapelessRecipe(ItemStack i, Object ... o) {
		GameRegistry.addShapelessRecipe(i, o);
	}
	
	public static void addBigShapelessRecipe(ItemStack i, Object ... o) {
		CraftingDivineTableManager.getInstance().addShapelessRecipe(i, o);
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

	public static ChatComponentTranslation addChatMessage(EnumChatFormatting color, String str, Object... args)
	{
		ChatComponentTranslation ret = new ChatComponentTranslation(str, args);
		ret.func_150256_b().func_150238_a(color);
		return ret;
	}
	
	public String BLACK = "\u00a70", DARK_BLUE = "\u00a71", DARK_GREEN = "\u00a72", DARK_AQUA = "\u00a73", DARK_RED = "\u00a74";
	public String DARK_PURPLE = "\u00a75", GOLD = "\u00a76", GRAY = "\u00a77", DARK_GRAY = "\u00a78";
}