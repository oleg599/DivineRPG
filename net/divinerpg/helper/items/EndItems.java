package net.divinerpg.helper.items;

import net.divinerpg.api.items.ItemMod;
import net.divinerpg.api.items.ItemModSword;
import net.divinerpg.helper.material.ToolMaterialMod;
import net.divinerpg.nether.items.ItemCallOfTheWatcher;
import net.minecraft.item.Item;

public class EndItems {
    public static int        HEAD             = 0, BODY = 1, LEGS = 2, BOOTS = 3;

    public static final Item enderShard       = new ItemMod().setName("enderShards");
    public static final Item enderStone       = new ItemMod().setName("enderStone");
    public static final Item watchingEye      = new ItemMod().setName("watchingEye");
    public static final Item callWatcher      = new ItemCallOfTheWatcher().setName("callOfTheWatcher");

    public static final Item enderSword       = new ItemModSword(ToolMaterialMod.EnderSword).setName("enderSword");
    public static final Item enderSwordBlue   = new ItemModSword(ToolMaterialMod.EnderSword).setName("enderSwordBlue");
    public static final Item enderSwordDark   = new ItemModSword(ToolMaterialMod.EnderSword).setName("enderSwordBlack");
    public static final Item enderSwordGreen  = new ItemModSword(ToolMaterialMod.EnderSword).setName("enderSwordGreen");
    public static final Item enderSwordRed    = new ItemModSword(ToolMaterialMod.EnderSword).setName("enderSwordRed");
    public static final Item enderSwordYellow = new ItemModSword(ToolMaterialMod.EnderSword).setName("enderSwordYellow");

}
