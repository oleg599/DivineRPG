package net.divinerpg.helper;

import net.divinerpg.helper.recipes.IS;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class DivineAPI {
	
	static int mobID = 80;

	public static void addItem(Item item, String name){
		GameRegistry.registerItem(item, name);
		LanguageRegistry.addName(item, name);
	}	
	
	public static void addBlock(Block block, String name){
		GameRegistry.registerBlock(block, name);
		LanguageRegistry.addName(block, name);
	}
	
	public static void addRecipe(ItemStack i, Object ... o){
		GameRegistry.addRecipe(i, o);
	}
	
	public static void addShapelessRecipe(ItemStack i, Object ... o){
		GameRegistry.addShapelessRecipe(i, o);
	}
	
	public static void addSmelting(ItemStack input, ItemStack output, float XP){
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

	private static int getUniqueID() {
		return mobID++;
	}
}
