package net.divinerpg.helper.items;

import net.divinerpg.api.items.ItemModAxe;
import net.divinerpg.api.items.ItemModPickaxe;
import net.divinerpg.api.items.ItemModShovel;
import net.divinerpg.api.items.ItemShickaxe;
import net.divinerpg.helper.material.ToolMaterialMod;
import net.minecraft.item.Item;

public class TwilightItemsTools {
	
	public static final Item edenShickaxe       = new ItemShickaxe(ToolMaterialMod.EdenShick).setName("edenShickaxe");
    public static final Item wildWoodShickaxe   = new ItemShickaxe(ToolMaterialMod.WildwoodShick).setName("wildWoodShickaxe");
    public static final Item apalachiaShickaxe  = new ItemShickaxe(ToolMaterialMod.ApalachiaShick).setName("apalachiaShickaxe");
    public static final Item skythernShickaxe   = new ItemShickaxe(ToolMaterialMod.SkythernShick).setName("skythernShickaxe");
    public static final Item mortumShickaxe     = new ItemShickaxe(ToolMaterialMod.MortumShick).setName("mortumShickaxe");

    public static final Item edenPickaxe        = new ItemModPickaxe(ToolMaterialMod.EdenPick).setName("edenPickaxe");
    public static final Item wildWoodPickaxe    = new ItemModPickaxe(ToolMaterialMod.WildwoodPick).setName("wildWoodPickaxe");
    public static final Item apalachiaPickaxe   = new ItemModPickaxe(ToolMaterialMod.ApalachiaPick).setName("apalachiaPickaxe");
    public static final Item skythernPickaxe    = new ItemModPickaxe(ToolMaterialMod.SkythernPick).setName("skythernPickaxe");
    public static final Item mortumPickaxe      = new ItemModPickaxe(ToolMaterialMod.MortumPick).setName("mortumPickaxe");

    public static final Item edenAxe            = new ItemModAxe(ToolMaterialMod.EdenAxe).setName("edenAxe");
    public static final Item wildWoodAxe        = new ItemModAxe(ToolMaterialMod.WildwoodAxe).setName("wildWoodAxe");
    public static final Item apalachiaAxe       = new ItemModAxe(ToolMaterialMod.ApalachiaAxe).setName("apalachiaAxe");
    public static final Item skythernAxe        = new ItemModAxe(ToolMaterialMod.SkythernAxe).setName("skythernAxe");
    public static final Item mortumAxe          = new ItemModAxe(ToolMaterialMod.MortumAxe).setName("mortumAxe");

    public static final Item edenShovel         = new ItemModShovel(ToolMaterialMod.EdenSpade).setName("edenShovel");
    public static final Item wildWoodShovel     = new ItemModShovel(ToolMaterialMod.WildwoodSpade).setName("wildWoodShovel");
    public static final Item apalachiaShovel    = new ItemModShovel(ToolMaterialMod.ApalachiaSpade).setName("apalachiaShovel");
    public static final Item skythernShovel     = new ItemModShovel(ToolMaterialMod.SkythernSpade).setName("skythernShovel");
    public static final Item mortumShovel       = new ItemModShovel(ToolMaterialMod.MortumSpade).setName("mortumShovel");

}
