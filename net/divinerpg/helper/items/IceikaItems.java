package net.divinerpg.helper.items;

import net.divinerpg.api.items.ItemDivineArmor;
import net.divinerpg.api.items.ItemMod;
import net.divinerpg.api.items.ItemModFood;
import net.divinerpg.helper.material.ArmorMaterialMod;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.item.Item;

public class IceikaItems {
	
	public static int        HEAD               = 0, BODY = 1, LEGS = 2, BOOTS = 3;
	
	/*public static final Item snowFlake = new ItemMod().setName("snowFlake");
	public static final Item icicleBane = new ItemMod().setName("icicleBane").setCreativeTab(DivineRPGTabs.swords);
	public static final Item soundOfCarols = new ItemMod().setName("soundOfCarols");
	public static final Item icineSword = new ItemMod().setName("icineSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item enderice = new ItemMod().setName("enderice").setCreativeTab(DivineRPGTabs.swords);
	public static final Item snowSlash = new ItemMod().setName("snowslash").setCreativeTab(DivineRPGTabs.swords);
	public static final Item serenadeOfIce = new ItemMod().setName("serenadeOfIce");
	public static final Item glacierSword = new ItemMod().setName("glacierSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item frostKingSword = new ItemMod().setName("frostkingSword").setCreativeTab(DivineRPGTabs.swords);
	public static final Item frozenMaul = new ItemMod().setName("frozenMaul").setCreativeTab(DivineRPGTabs.swords);
	public static final Item frossivence = new ItemMod().setName("frossivence").setCreativeTab(DivineRPGTabs.swords);
	//TODO Add the corresponding items files to the right items
	public static final Item frostClawCannon = new ItemMod().setName("frostclawCannon").setCreativeTab(DivineRPGTabs.ranged);
	public static final Item fractiteCannon = new ItemMod().setName("fractiteCannon").setCreativeTab(DivineRPGTabs.ranged);
	public static final Item snowFlakeShuriken = new ItemMod().setName("snowFlakeShuriken").setCreativeTab(DivineRPGTabs.ranged);
	public static final Item eggNog = new ItemMod().setName("eggNog");
	public static final Item pepperMints = new ItemModFood(1, 0.3F, false).setName("peppermints");
	public static final Item chocolateLog = new ItemModFood(4, 1.0F, false).setName("chocolateLog");
	public static final Item snowCones = new ItemModFood(2, 0.3F, false).setName("snowCones");
	public static final Item fruitCake = new ItemModFood(16, 2.0F, false).setName("fruitCake");
	
	//public static final Item icicleBow = new ItemIceBow().setName("icicleBow");
	//public static final Item snowStormBow = new ItemSnowStormBow().setName("snowStormBow");*/
	
	public static final Item santaHead = new ItemDivineArmor(ArmorMaterialMod.Santa, HEAD, 0, false, "idklol").setName("santaHelmet");
	public static final Item santaBody = new ItemDivineArmor(ArmorMaterialMod.Santa, BODY, 1, false, "idklol").setName("santaBody");
	public static final Item santaLegs = new ItemDivineArmor(ArmorMaterialMod.Santa, LEGS, 2, false, "idklol").setName("santaLegs");
	public static final Item santaBoots = new ItemDivineArmor(ArmorMaterialMod.Santa, BOOTS, 3, false, "idklol").setName("santaBoots");
 
}