package net.divinerpg.helper.items;

import net.divinerpg.api.items.ItemDivineArmor;
import net.divinerpg.api.items.ItemMod;
import net.divinerpg.api.items.ItemModDoor;
import net.divinerpg.arcana.items.ItemArcanaPotion;
import net.divinerpg.arcana.items.ItemStormSword;
import net.divinerpg.helper.blocks.ArcanaBlocks;
import net.divinerpg.helper.material.ArmorMaterialMod;
import net.divinerpg.helper.material.ToolMaterialMod;
import net.minecraft.item.Item;

public class ArcanaItems {

	public static final int HEAD = 0, BODY = 1, LEGS = 2, BOOTS = 3;
	
	public static final Item dungeonTokens 		= new ItemMod().setName("dungeonTokens");
	public static final Item staffOfStarlight 	= new ItemMod().setName("staffOfStarlight");
	public static final Item starlight 			= new ItemMod().setName("starlight");
	public static final Item stormSword 		= new ItemStormSword(ToolMaterialMod.stormSword).setName("stormSword");
	public static final Item strongArcanaPotion = new ItemArcanaPotion(200).setName("strongArcanaPotion");
	public static final Item weakArcanaPortion	= new ItemArcanaPotion(100).setName("weakArcanaPotion");
	public static final Item collector 			= new ItemMod().setName("collector");
	public static final Item chargedCollector 	= new ItemMod().setName("chargedCollector");
	
	public static final Item kormaHelmet 		= new ItemDivineArmor(ArmorMaterialMod.Korma, HEAD, 0, 45D, true, "korma").setName("kormaHelmet");
	public static final Item kormaBody 			= new ItemDivineArmor(ArmorMaterialMod.Korma, BODY, 1, 45D, true, "korma").setName("kormaBody");
	public static final Item kormaLegs 			= new ItemDivineArmor(ArmorMaterialMod.Korma, LEGS, 2, 45D, true, "korma").setName("kormaLegs");
	public static final Item kormaBoots			= new ItemDivineArmor(ArmorMaterialMod.Korma, BOOTS, 3, 45D, true, "korma").setName("kormaBoots");
	
	public static final Item vemosHelmet		= new ItemDivineArmor(ArmorMaterialMod.Korma, HEAD, 0, 45D, true, "vemos").setName("vemosHelmet");
	public static final Item vemosBody			= new ItemDivineArmor(ArmorMaterialMod.Korma, BODY, 1, 45D, true, "vemos").setName("vemosBody");
	public static final Item vemosLegs			= new ItemDivineArmor(ArmorMaterialMod.Korma, LEGS, 2, 45D, true, "vemos").setName("vemosLegs");
	public static final Item vemosBoots			= new ItemDivineArmor(ArmorMaterialMod.Korma, BOOTS, 3, 45D, true, "vemos").setName("vemosBoots");

	public static final Item oreDoorItem1 	    = new ItemModDoor(ArcanaBlocks.oreDoor1).setName("oreDoor1Item");
	
	public static final Item oreKey1 			= new ItemMod().setName("key1");
	public static final Item oreKey2 			= new ItemMod().setName("key2");
	public static final Item oreKey3 			= new ItemMod().setName("key3");
	public static final Item oreKey4 			= new ItemMod().setName("key4");
}