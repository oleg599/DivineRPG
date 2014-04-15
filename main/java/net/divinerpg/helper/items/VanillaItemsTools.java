package net.divinerpg.helper.items;

import net.divinerpg.api.items.ItemModAxe;
import net.divinerpg.api.items.ItemModHoe;
import net.divinerpg.api.items.ItemModPickaxe;
import net.divinerpg.api.items.ItemModShovel;
import net.divinerpg.api.items.ItemShickaxe;
import net.divinerpg.helper.material.ToolMaterialMod;
import net.minecraft.item.Item;

public class VanillaItemsTools {

	public static final Item rupeeShickaxe      = new ItemShickaxe(ToolMaterialMod.RupeeShick).setName("rupeeShickaxe");
    public static final Item rupeePickaxe       = new ItemModPickaxe(ToolMaterialMod.RupeePick).setName("rupeePickaxe");
    public static final Item rupeeAxe           = new ItemModAxe(ToolMaterialMod.RupeeAxe).setName("rupeeAxe");
    public static final Item rupeeShovel        = new ItemModShovel(ToolMaterialMod.RupeeSpade).setName("rupeeShovel");
    public static final Item rupeeHoe           = new ItemModHoe(ToolMaterialMod.RupeePick).setName("rupeeHoe");

    public static final Item arlemiteShickaxe   = new ItemShickaxe(ToolMaterialMod.ArlemiteShick).setName("arlemiteShickaxe");
    public static final Item arlemitePickaxe    = new ItemModPickaxe(ToolMaterialMod.ArlemitePick).setName("arlemitePickaxe");
    public static final Item arlemiteAxe        = new ItemModAxe(ToolMaterialMod.ArlemiteAxe).setName("arlemiteAxe");
    public static final Item arlemiteShovel     = new ItemModShovel(ToolMaterialMod.ArlemiteSpade).setName("arlemiteShovel");
    public static final Item arlemiteHoe        = new ItemModHoe(ToolMaterialMod.ArlemitePick).setName("arlemiteHoe");

    public static final Item realmitePickaxe    = new ItemModPickaxe(ToolMaterialMod.RealmitePick).setName("realmitePickaxe");
    public static final Item realmiteAxe        = new ItemModAxe(ToolMaterialMod.RealmiteAxe).setName("realmiteAxe");
    public static final Item realmiteShovel     = new ItemModShovel(ToolMaterialMod.RealmiteSpade).setName("realmiteShovel");
    public static final Item realmiteHoe        = new ItemModHoe(ToolMaterialMod.RealmitePick).setName("realmiteHoe");

    public static final Item bedrockPickaxe     = new ItemModPickaxe(ToolMaterialMod.BedrockPick).setName("bedrockPickaxe");
    public static final Item bedrockAxe         = new ItemModAxe(ToolMaterialMod.BedrockAxe).setName("bedrockAxe");
    public static final Item bedrockShovel      = new ItemModShovel(ToolMaterialMod.BedrockSpade).setName("bedrockShovel");

    public static final Item corruptedPickaxe   = new ItemModPickaxe(ToolMaterialMod.CorruptedPick).setName("corruptedPickaxe");
    public static final Item corruptedAxe       = new ItemModAxe(ToolMaterialMod.CorruptedAxe).setName("corruptedAxe");
    public static final Item corruptedShovel    = new ItemModShovel(ToolMaterialMod.CorruptedSpade).setName("corruptedShovel");
    
    public static final Item divineShickaxe     = new ItemShickaxe(ToolMaterialMod.DivineShick).setName("divineShickaxe");
    public static final Item divinePickaxe      = new ItemModPickaxe(ToolMaterialMod.DivinePick).setName("divinePickaxe");
    public static final Item divineAxe          = new ItemModAxe(ToolMaterialMod.DivineAxe).setName("divineAxe");
    public static final Item divineShovel       = new ItemModShovel(ToolMaterialMod.DivineSpade).setName("divineShovel");
    
}
