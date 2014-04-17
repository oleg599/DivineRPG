package net.divinerpg.helper.items;

import net.divinerpg.api.items.ItemMod;
import net.divinerpg.api.items.ItemModBow;
import net.divinerpg.api.items.ItemModSword;
import net.divinerpg.helper.material.ToolMaterialMod;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.items.twilight.ItemTwilightBlitz;
import net.divinerpg.items.twilight.ItemTwilightPhaser;
import net.divinerpg.items.vanilla.ItemThrowable;
import net.minecraft.item.Item;

public class TwilightItemsWeapons {
	
	public static final Item edenBlade          = new ItemModSword(ToolMaterialMod.Eden).setName("edenBlade");
    public static final Item wildWoodBlade      = new ItemModSword(ToolMaterialMod.Wildwood).setName("wildWoodBlade");
    public static final Item apalachiaBlade     = new ItemModSword(ToolMaterialMod.Apalachia).setName("apalachiaBlade");
    public static final Item skythernBlade      = new ItemModSword(ToolMaterialMod.Skythern).setName("skythernBlade");
    public static final Item mortumBlade        = new ItemModSword(ToolMaterialMod.Mortum).setName("mortumBlade");
    public static final Item haliteBlade        = new ItemModSword(ToolMaterialMod.Halite).setName("haliteBlade");
    
    public static final Item edenSlicer         = new ItemThrowable(12).setName("edenSlicer");
    public static final Item wildWoodSlicer     = new ItemThrowable(18).setName("wildWoodSlicer");
    public static final Item apalachiaSlicer    = new ItemThrowable(22).setName("apalachiaSlicer");
    public static final Item skythernSlicer     = new ItemThrowable(28).setName("skythernSlicer");
    public static final Item mortumSlicer       = new ItemThrowable(36).setName("mortumSlicer");
    public static final Item haliteSlicer       = new ItemThrowable(42).setName("haliteSlicer");

    public static final Item edenBlitz          = new ItemTwilightBlitz(14, "Eden Dust").setName("edenBlitz");
    public static final Item wildWoodBlitz      = new ItemTwilightBlitz(19, "WildWood Dust").setName("wildWoodBlitz");
    public static final Item apalachiaBlitz     = new ItemTwilightBlitz(22, "Apalachia Dust").setName("apalachiaBlitz");
    public static final Item skythernBlitz      = new ItemTwilightBlitz(27, "Skythern Dust").setName("skythernBlitz");
    public static final Item mortumBlitz        = new ItemTwilightBlitz(31, "Mortum Dust").setName("mortumBlitz");
    public static final Item haliteBlitz        = new ItemTwilightBlitz(33, "Mortum Dust").setName("haliteBlitz");

    public static final Item edenPhaser         = new ItemTwilightPhaser(24, 0).setName("edenPhaser");
    public static final Item wildWoodPhaser     = new ItemTwilightPhaser(31, 0).setName("wildWoodPhaser");
    public static final Item apalachiaPhaser    = new ItemTwilightPhaser(35, 0).setName("apalachiaPhaser");
    public static final Item skythernPhaser     = new ItemTwilightPhaser(41, 0).setName("skythernPhaser");
    public static final Item mortumPhaser       = new ItemTwilightPhaser(46, 0).setName("mortumPhaser");
    public static final Item halitePhaser       = new ItemTwilightPhaser(51, 0).setName("halitePhaser");
    
    public static final Item edenArrow          = new ItemMod().setName("edenArrow").setCreativeTab(DivineRPGTabs.ranged);
    public static final Item wildWoodArrow      = new ItemMod().setName("wildWoodArrow").setCreativeTab(DivineRPGTabs.ranged);
    public static final Item apalachiaArrow     = new ItemMod().setName("apalachiaArrow").setCreativeTab(DivineRPGTabs.ranged);
    public static final Item skythernArrow      = new ItemMod().setName("skythernArrow").setCreativeTab(DivineRPGTabs.ranged);
    public static final Item mortumArrow        = new ItemMod().setName("mortumArrow").setCreativeTab(DivineRPGTabs.ranged);
    public static final Item haliteArrow        = new ItemMod().setName("haliteArrow").setCreativeTab(DivineRPGTabs.ranged);

    public static final Item edenBow            = new ItemModBow(-1, 31, edenArrow).setName("edenBow");
    public static final Item wildWoodBow        = new ItemModBow(-1, 31, wildWoodArrow).setName("wildWoodBow");
    public static final Item apalachiaBow       = new ItemModBow(-1, 41, apalachiaArrow).setName("apalachiaBow");
    public static final Item skythernBow        = new ItemModBow(-1, 41, skythernArrow).setName("skythernBow");
    public static final Item mortumBow          = new ItemModBow(-1, 61, mortumArrow).setName("mortumBow");
    public static final Item haliteBow          = new ItemModBow(-1, 61, haliteArrow).setName("haliteBow");
    
    public static final Item corruptedBullet    = new ItemMod().setName("corruptedBullet");
    
}
