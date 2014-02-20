package net.divinerpg.helper.items;

import net.divinerpg.api.items.ItemDivineArmor;
import net.divinerpg.api.items.ItemMod;
import net.divinerpg.helper.material.ArmorMaterialMod;
import net.minecraft.item.Item;

public class ArcanaItems {

	public static final int HEAD = 0, BODY = 1, LEGS = 2, BOOTS = 3;
	
	public static final Item dungeonTokens 		= new ItemMod().setName("dungeonTokens");
	public static final Item staffOfStarlight 	= new ItemMod().setName("staffOfStarlight");
	public static final Item starlight 			= new ItemMod().setName("starlight");
	public static final Item stormSword 		= new ItemMod().setName("stormSword");
	public static final Item strongArcanaPotion = new ItemMod().setName("strongArcanaPotion");
	public static final Item weakArcanaPortion	= new ItemMod().setName("weakArcanaPotion");
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

}
