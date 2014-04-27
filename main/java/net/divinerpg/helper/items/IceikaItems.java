package net.divinerpg.helper.items;

import net.divinerpg.api.items.ItemDivineArmor;
import net.divinerpg.api.items.ItemMod;
import net.divinerpg.api.items.ItemModDoor;
import net.divinerpg.api.items.ItemModFood;
import net.divinerpg.api.items.ItemModSword;
import net.divinerpg.helper.blocks.IceikaBlocks;
import net.divinerpg.helper.material.ArmorMaterialMod;
import net.divinerpg.helper.material.ToolMaterialMod;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.items.iceika.ItemMusicShooter;
import net.divinerpg.items.iceika.ItemSnowGlobe;
import net.minecraft.item.Item;

public class IceikaItems {
	
	public static int        HEAD               = 0, BODY = 1, LEGS = 2, BOOTS = 3;
	
	public static final Item snowflake 		   = new ItemMod().setName("snowflake");
	
	public static final Item icicleBane 	   = new ItemModSword(ToolMaterialMod.IcicleBane).setName("icicleBane");
	public static final Item icineSword	 	   = new ItemModSword(ToolMaterialMod.Icine).setName("icineSword");
	public static final Item enderice 		   = new ItemModSword(ToolMaterialMod.Enderice).setName("enderice");
	public static final Item snowSlash 		   = new ItemModSword(ToolMaterialMod.Snowslash).setName("snowslash");
	public static final Item glacierSword 	   = new ItemModSword(ToolMaterialMod.Glacier).setName("glacierSword");
	public static final Item frostkingSword    = new ItemModSword(ToolMaterialMod.Frostking).setName("frostkingSword");
	public static final Item frozenMaul 	   = new ItemModSword(ToolMaterialMod.FrozenMaul).setName("frozenMaul");
	//TODO Add the corresponding items files to the right items
	//Not a real sword
	public static final Item frossivence 	   = new ItemMod().setName("frossivence").setCreativeTab(DivineRPGTabs.swords);
	
	public static final Item soundOfCarols     = new ItemMusicShooter().setName("soundofCarols").setCreativeTab(DivineRPGTabs.ranged);
	public static final Item frostclawCannon   = new ItemMod().setName("frostclawCannon").setCreativeTab(DivineRPGTabs.ranged);
	public static final Item fractiteCannon    = new ItemMod().setName("fractiteCannon").setCreativeTab(DivineRPGTabs.ranged);
	public static final Item snowflakeShuriken = new ItemMod().setName("snowflakeShuriken").setCreativeTab(DivineRPGTabs.ranged);
	public static final Item serenadeOfIce 	   = new ItemMod().setName("serenadeofIce");
	
	public static final Item eggNog 		   = new ItemMod().setName("eggNog");
	public static final Item peppermints 	   = new ItemModFood(1, 0.3F, false).setName("peppermints");
	public static final Item chocolateLog	   = new ItemModFood(4, 1.0F, false).setName("chocolateLog");
	public static final Item snowCones 		   = new ItemModFood(2, 0.3F, false).setName("snowCones");
	public static final Item fruitCake 		   = new ItemModFood(16, 2.0F, false).setName("fruitCake");
	public static final Item winterberry	   = new ItemModFood(4, 1.0F, false).setName("winterberry"); 
	
	//public static final Item icicleBow = new ItemIceBow().setName("icicleBow");
	//public static final Item snowStormBow = new ItemSnowStormBow().setName("snowStormBow");
	
	public static final Item santaHead		   = new ItemDivineArmor(ArmorMaterialMod.Santa, HEAD, 0, 0.0D, true, "santa").setName("santaHelmet");
	public static final Item santaBody 		   = new ItemDivineArmor(ArmorMaterialMod.Santa, BODY, 1, 0.0D, true, "santa").setName("santaBody");
	public static final Item santaLegs 		   = new ItemDivineArmor(ArmorMaterialMod.Santa, LEGS, 2, 0.0D, true, "santa").setName("santaLegs");
	public static final Item santaBoots 	   = new ItemDivineArmor(ArmorMaterialMod.Santa, BOOTS, 3, 0.0D, true, "santa").setName("santaBoots");
	
	public static final Item iceShards         = new ItemMod().setName("iceShards");
	public static final Item iceStone          = new ItemMod().setName("iceStone");
	
	public static final Item steelDoor	       = new ItemModDoor(IceikaBlocks.steelDoorBlock).setName("frozenDoor");
	public static final Item snowGlobe		   = new ItemSnowGlobe().setName("snowGlobe");
 
}