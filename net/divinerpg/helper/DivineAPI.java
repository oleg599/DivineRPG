package net.divinerpg.helper;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import net.divinerpg.DivineRPG;
import net.divinerpg.helper.recipes.CraftingDivineTableManager;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class DivineAPI {

	static int mobID = 121, projectileID = 230;
	
	private static Object reflectionFactory = null;
    private static Method newConstructorAccessor = null;
    private static Method newInstance = null;
    private static Method newFieldAccessor = null;
    private static Method fieldAccessorSet = null;
	private static boolean isSetup = false;

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
	
	public static ArmorMaterial addArmorMaterial(String name, int durability, int[] oldArmor, int enchantability) {
		int duraNew = (int) Math.round(durability/13.75);
        return EnumHelper.addEnum(ArmorMaterial.class, name, duraNew, oldArmor, enchantability);
    }
	
	public static ChatComponentTranslation addChatMessage(EnumChatFormatting color, String str, Object... args)
	{
		ChatComponentTranslation ret = new ChatComponentTranslation(str, args);
		ret.getChatStyle().setColor(color);
		return ret;
	}
	
	public static ChatComponentTranslation addChatMessage(String str, Object... args)
	{
		ChatComponentTranslation ret = new ChatComponentTranslation(str, args);
		return ret;
	}

	public static String BLACK = "\u00a70", DARK_BLUE = "\u00a71", DARK_GREEN = "\u00a72", DARK_AQUA = "\u00a73", DARK_RED = "\u00a74";
	public static String DARK_PURPLE = "\u00a75", GOLD = "\u00a76", GRAY = "\u00a77", DARK_GRAY = "\u00a78", BLUE = "\u00a79";
	public static String GREEN = "\u00a7a", AQUA = "\u00a7b", RED = "\u00a7c", LIGHT_PURPLE = "\u00a7d", YELLOW = "\u00a7e";
	public static String WHITE = "\u00a7f";

}