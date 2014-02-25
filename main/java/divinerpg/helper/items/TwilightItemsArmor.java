package divinerpg.helper.items;

import net.minecraft.item.Item;
import divinerpg.api.items.ItemDivineArmor;
import divinerpg.helper.material.ArmorMaterialMod;

public class TwilightItemsArmor {
	
	public static final int  HEAD               = 0, BODY = 1, LEGS = 2, BOOTS = 3;
	
	public static final Item edenHelmet 		= new ItemDivineArmor(ArmorMaterialMod.Eden, HEAD, 0, 60D, true, "eden").setName("edenHelmet");
    public static final Item edenBody 			= new ItemDivineArmor(ArmorMaterialMod.Eden, BODY, 1, 60D, true, "eden").setName("edenBody");
    public static final Item edenLegs 			= new ItemDivineArmor(ArmorMaterialMod.Eden, LEGS, 2, 60D, true, "eden").setName("edenLegs");
    public static final Item edenBoots 			= new ItemDivineArmor(ArmorMaterialMod.Eden, BOOTS, 3, 60D, true, "eden").setName("edenBoots");
    
    public static final Item wildwoodHelmet 	= new ItemDivineArmor(ArmorMaterialMod.Wild, HEAD, 0, 65D, true, "wildwood").setName("wildwoodHelmet");
    public static final Item wildwoodBody 		= new ItemDivineArmor(ArmorMaterialMod.Wild, BODY, 1, 65D, true, "wildwood").setName("wildwoodBody");
    public static final Item wildwoodLegs 		= new ItemDivineArmor(ArmorMaterialMod.Wild, LEGS, 2, 65D, true, "wildwood").setName("wildwoodLegs");
    public static final Item wildwoodBoots 		= new ItemDivineArmor(ArmorMaterialMod.Wild, BOOTS, 3, 65D, true, "wildwood").setName("wildwoodBoots");
    
    public static final Item apalachiaHelmet 	= new ItemDivineArmor(ArmorMaterialMod.Apalachia, HEAD, 0, 72D, true, "apalachia").setName("apalachiaHelmet");
    public static final Item apalachiaBody 		= new ItemDivineArmor(ArmorMaterialMod.Apalachia, BODY, 1, 72D, true, "apalachia").setName("apalachiaBody");
    public static final Item apalachiaLegs 		= new ItemDivineArmor(ArmorMaterialMod.Apalachia, LEGS, 2, 72D, true, "apalachia").setName("apalachiaLegs");
    public static final Item apalachiaBoots 	= new ItemDivineArmor(ArmorMaterialMod.Apalachia, BOOTS, 3, 72D, true, "apalachia").setName("apalachiaBoots");
    
    public static final Item skythernHelmet 	= new ItemDivineArmor(ArmorMaterialMod.Skythern, HEAD, 0, 75D, true, "skythernHelmet").setName("skythernHelmet");
    public static final Item skythernBody 		= new ItemDivineArmor(ArmorMaterialMod.Skythern, BODY, 1, 75D, true, "skythernHelmet").setName("skythernBody");
    public static final Item skythernLegs 		= new ItemDivineArmor(ArmorMaterialMod.Skythern, LEGS, 2, 75D, true, "skythernHelmet").setName("skythernLegs");
    public static final Item skythernBoots 		= new ItemDivineArmor(ArmorMaterialMod.Skythern, BOOTS, 3, 75D, true, "skythernHelmet").setName("skythernBoots");
    
    public static final Item mortumHelmet 		= new ItemDivineArmor(ArmorMaterialMod.Mortum, HEAD, 0, 80D, true, "mortum").setName("mortumHelmet");
    public static final Item mortumBody 		= new ItemDivineArmor(ArmorMaterialMod.Mortum, BODY, 1, 80D, true, "mortum").setName("mortumBody");
    public static final Item mortumLegs 		= new ItemDivineArmor(ArmorMaterialMod.Mortum, LEGS, 2, 80D, true, "mortum").setName("mortumLegs");
    public static final Item mortumBoots 		= new ItemDivineArmor(ArmorMaterialMod.Mortum, BOOTS, 3, 80D, true, "mortum").setName("mortumBoots");
    
    public static final Item haliteHelmet 		= new ItemDivineArmor(ArmorMaterialMod.Halite, HEAD, 0, 83D, true, "halite").setName("haliteHelmet");
    public static final Item haliteBody 		= new ItemDivineArmor(ArmorMaterialMod.Halite, BODY, 1, 83D, true, "halite").setName("haliteBody");
    public static final Item haliteLegs 		= new ItemDivineArmor(ArmorMaterialMod.Halite, LEGS, 2, 83D, true, "halite").setName("haliteLegs");
    public static final Item haliteBoots 		= new ItemDivineArmor(ArmorMaterialMod.Halite, BOOTS, 3, 83D, true, "halite").setName("haliteBoots");
	
}
