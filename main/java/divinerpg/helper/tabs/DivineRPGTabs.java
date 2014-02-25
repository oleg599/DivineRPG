package divinerpg.helper.tabs;

import net.minecraft.creativetab.CreativeTabs;
import divinerpg.helper.blocks.TwilightBlocks;
import divinerpg.helper.items.ItemsFood;
import divinerpg.helper.items.VanillaItemsArmor;
import divinerpg.helper.items.VanillaItemsOther;
import divinerpg.helper.items.VanillaItemsTools;
import divinerpg.helper.items.VanillaItemsWeapons;
import divinerpg.helper.items.VetheanItems;

public class DivineRPGTabs {
	public static CreativeTabs blocks = new CreativeTabs("Blocks") 
		{public Item getTabIconItem() {return Item.getItemFromBlock(TwilightBlocks.edenOre);}};
	public static CreativeTabs swords = new CreativeTabs("Swords") 
		{public Item getTabIconItem() {return VanillaItemsWeapons.aquaton;}};
	public static CreativeTabs ranged = new CreativeTabs("Ranged")
		{public Item getTabIconItem() {return VanillaItemsWeapons.vileStorm;}};
	public static CreativeTabs tools = new CreativeTabs("Tools")
		{public Item getTabIconItem() {return VanillaItemsTools.rupeeShickaxe;}};
	public static CreativeTabs items = new CreativeTabs("Materials")
		{public Item getTabIconItem() {return VanillaItemsOther.rupeeIngot;}};
	public static CreativeTabs armor = new CreativeTabs("Armor")
		{public Item getTabIconItem() {return VanillaItemsArmor.angelicHelmet;}};
	public static CreativeTabs spawner = new CreativeTabs("Spawner")
		{public Item getTabIconItem() {return VanillaItemsOther.callWatcher;}};
	public static CreativeTabs utility = new CreativeTabs("Utility")
		{public Item getTabIconItem() {return VanillaItemsOther.tarBucket;}};
	public static CreativeTabs food = new CreativeTabs("Herbalism")
		{public Item getTabIconItem() {return ItemsFood.bacon;}};
	public static CreativeTabs vethea = new CreativeTabs("Vethea")
		{public Item getTabIconItem() {return VetheanItems.karosStaff;}};
}