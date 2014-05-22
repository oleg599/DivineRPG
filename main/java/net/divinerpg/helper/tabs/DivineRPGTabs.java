package net.divinerpg.helper.tabs;

import net.divinerpg.helper.blocks.TwilightBlocks;
import net.divinerpg.helper.items.ItemsFood;
import net.divinerpg.helper.items.VanillaItemsArmor;
import net.divinerpg.helper.items.VanillaItemsOther;
import net.divinerpg.helper.items.VanillaItemsTools;
import net.divinerpg.helper.items.VanillaItemsWeapons;
import net.divinerpg.helper.items.VetheanItems;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DivineRPGTabs extends CreativeTabs {

    private Item                icon;
    private String              name;

    public static DivineRPGTabs blocks  = new DivineRPGTabs("Blocks", TwilightBlocks.edenOre);
    public static DivineRPGTabs ranged  = new DivineRPGTabs("Ranged", "Ranged Weapons", VanillaItemsWeapons.vileStorm);
    public static DivineRPGTabs swords  = new DivineRPGTabs("Swords", "Melee Weapons", VanillaItemsWeapons.aquaton);
    public static DivineRPGTabs tools   = new DivineRPGTabs("Tools", VanillaItemsTools.rupeeShickaxe);
    public static DivineRPGTabs items   = new DivineRPGTabs("Materials", "Raw Materials", VanillaItemsOther.rupeeIngot);
    public static DivineRPGTabs armor   = new DivineRPGTabs("Armor", VanillaItemsArmor.angelicHelmet);
    public static DivineRPGTabs spawner = new DivineRPGTabs("Spawner", VanillaItemsOther.callWatcher);
    public static DivineRPGTabs utility = new DivineRPGTabs("Utility", VanillaItemsOther.tarBucket);
    public static DivineRPGTabs food    = new DivineRPGTabs("Herbalism", ItemsFood.bacon);
    public static DivineRPGTabs vethea  = new DivineRPGTabs("Vethea", VetheanItems.karosStaff);

    public DivineRPGTabs(String lable, Item icon) {
        this(lable, lable, icon);
    }

    public DivineRPGTabs(String lable, Block icon) {
        this(lable, lable, icon);
    }

    public DivineRPGTabs(String lable, String name, Block icon) {
        this(lable, name, Item.getItemFromBlock(icon));
    }

    public DivineRPGTabs(String lable, String name, Item icon) {
        super(getNextID(), lable);
        this.icon = icon;
        LangRegistry.addTab(this);
    }

    @Override
    public Item getTabIconItem() {
        return icon;
    }

    public String getName() {
        return name;
    }
}
