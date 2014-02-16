package net.divinerpg.helper.items;

import net.divinerpg.api.items.ItemDivineArmor;
import net.divinerpg.api.items.ItemMod;
import net.divinerpg.api.items.ItemModAxe;
import net.divinerpg.api.items.ItemModBow;
import net.divinerpg.api.items.ItemModPickaxe;
import net.divinerpg.api.items.ItemModShovel;
import net.divinerpg.api.items.ItemModSword;
import net.divinerpg.api.items.ItemShickaxe;
import net.divinerpg.helper.material.ArmorMaterialMod;
import net.divinerpg.helper.material.ToolMaterialMod;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.twilight.items.ItemTwilightBlitz;
import net.divinerpg.twilight.items.ItemTwilightClock;
import net.divinerpg.twilight.items.ItemTwilightPhaser;
import net.divinerpg.twilight.items.ItemTwilightSpawner;
import net.divinerpg.vanilla.items.ItemThrowable;
import net.minecraft.item.Item;

public class TwilightItems {
	
	public static final int  HEAD               = 0, BODY = 1, LEGS = 2, BOOTS = 3;
	
    public static final Item edenSoul           = new ItemMod().setName("edenSoul");
    public static final Item wildWoodSoul       = new ItemMod().setName("wildWoodSoul");
    public static final Item apalachiaSoul      = new ItemMod().setName("apalachiaSoul");
    public static final Item skythernSoul       = new ItemMod().setName("skythernSoul");
    public static final Item mortumSoul         = new ItemMod().setName("mortumSoul");

    public static final Item edenFragments      = new ItemMod().setName("edenFragments");
    public static final Item wildWoodFragments  = new ItemMod().setName("wildWoodFragments");
    public static final Item apalachiaFragments = new ItemMod().setName("apalachiaFragments");
    public static final Item skythernFragments  = new ItemMod().setName("skythernFragments");
    public static final Item mortumFragments    = new ItemMod().setName("mortumFragments");

    public static final Item edenGem            = new ItemMod().setName("edenGem");
    public static final Item wildWoodGem        = new ItemMod().setName("wildWoodGem");
    public static final Item apalachiaGem       = new ItemMod().setName("apalachiaGem");
    public static final Item skythernGem        = new ItemMod().setName("skythernGem");
    public static final Item mortumGem          = new ItemMod().setName("mortumGem");

    public static final Item edenChunk          = new ItemMod().setName("edenChunk");
    public static final Item wildWoodChunk      = new ItemMod().setName("wildWoodChunk");
    public static final Item apalachiaChunk     = new ItemMod().setName("apalachiaChunk");
    public static final Item skythernChunk      = new ItemMod().setName("skythernChunk");
    public static final Item mortumChunk        = new ItemMod().setName("mortumChunk");

    public static final Item edenDust           = new ItemMod().setName("edenDust");
    public static final Item wildWoodDust       = new ItemMod().setName("wildWoodDust");
    public static final Item apalachiaDust      = new ItemMod().setName("apalachiaDust");
    public static final Item skythernDust       = new ItemMod().setName("skythernDust");
    public static final Item mortumDust         = new ItemMod().setName("mortumDust");

    public static final Item edenBlade          = new ItemModSword(ToolMaterialMod.edenSword).setName("edenBlade");
    public static final Item wildWoodBlade      = new ItemModSword(ToolMaterialMod.wildWoodSword).setName("wildWoodBlade");
    public static final Item apalachiaBlade     = new ItemModSword(ToolMaterialMod.apalachiaSword).setName("apalachiaBlade");
    public static final Item skythernBlade      = new ItemModSword(ToolMaterialMod.skythernSword).setName("skythernBlade");
    public static final Item mortumBlade        = new ItemModSword(ToolMaterialMod.mortumSword).setName("mortumBlade");
    public static final Item haliteBlade        = new ItemModSword(ToolMaterialMod.halite).setName("haliteBlade");

    public static final Item edenShickaxe       = new ItemShickaxe(ToolMaterialMod.edenTools).setName("edenShickaxe");
    public static final Item wildWoodShickaxe   = new ItemShickaxe(ToolMaterialMod.wildWoodTools).setName("wildWoodShickaxe");
    public static final Item apalachiaShickaxe  = new ItemShickaxe(ToolMaterialMod.apalachiaTools).setName("apalachiaShickaxe");
    public static final Item skythernShickaxe   = new ItemShickaxe(ToolMaterialMod.skythernTools).setName("skythernShickaxe");
    public static final Item mortumShickaxe     = new ItemShickaxe(ToolMaterialMod.mortumTools).setName("mortumShickaxe");

    public static final Item edenPickaxe        = new ItemModPickaxe(ToolMaterialMod.edenTools).setName("edenPickaxe");
    public static final Item wildWoodPickaxe    = new ItemModPickaxe(ToolMaterialMod.wildWoodTools).setName("wildWoodPickaxe");
    public static final Item apalachiaPickaxe   = new ItemModPickaxe(ToolMaterialMod.apalachiaTools).setName("apalachiaPickaxe");
    public static final Item skythernPickaxe    = new ItemModPickaxe(ToolMaterialMod.skythernTools).setName("skythernPickaxe");
    public static final Item mortumPickaxe      = new ItemModPickaxe(ToolMaterialMod.mortumTools).setName("mortumPickaxe");

    public static final Item edenAxe            = new ItemModAxe(ToolMaterialMod.edenSword).setName("edenAxe");
    public static final Item wildWoodAxe        = new ItemModAxe(ToolMaterialMod.wildWoodTools).setName("wildWoodAxe");
    public static final Item apalachiaAxe       = new ItemModAxe(ToolMaterialMod.apalachiaTools).setName("apalachiaAxe");
    public static final Item skythernAxe        = new ItemModAxe(ToolMaterialMod.skythernTools).setName("skythernAxe");
    public static final Item mortumAxe          = new ItemModAxe(ToolMaterialMod.mortumTools).setName("mortumAxe");

    public static final Item edenShovel         = new ItemModShovel(ToolMaterialMod.edenTools).setName("edenShovel");
    public static final Item wildWoodShovel     = new ItemModShovel(ToolMaterialMod.wildWoodTools).setName("wildWoodShovel");
    public static final Item apalachiaShovel    = new ItemModShovel(ToolMaterialMod.apalachiaTools).setName("apalachiaShovel");
    public static final Item skythernShovel     = new ItemModShovel(ToolMaterialMod.skythernTools).setName("skythernShovel");
    public static final Item mortumShovel       = new ItemModShovel(ToolMaterialMod.mortumTools).setName("mortumShovel");

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

    public static final Item twilightClock 		= new ItemTwilightClock().setName("twilightClock");
    
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
    public static final Item edenSparkles	    = new ItemMod().setName("edenSparkles");

    public static final Item spawnerBase 		= new ItemMod().setName("spawnerBase");
    public static final Item spawnDensos 		= new ItemTwilightSpawner().setName("spawnDensos");
    public static final Item spawnKarot 		= new ItemTwilightSpawner().setName("spawnKarot");
    public static final Item spawnReyvor 		= new ItemTwilightSpawner().setName("spawnReyvor");
    public static final Item spawnSoulFiend		= new ItemTwilightSpawner().setName("spawnSoulFiend");
    public static final Item spawnTwilight 		= new ItemTwilightSpawner().setName("spawnTwilightDemon");
    public static final Item spawnVamacheron	= new ItemTwilightSpawner().setName("spawnVamacheron");
    
    public static final Item edenHelmet 		= new ItemDivineArmor(ArmorMaterialMod.Eden, HEAD, 0, 15D, true, "eden").setName("edenHelmet");
    public static final Item edenBody 			= new ItemDivineArmor(ArmorMaterialMod.Eden, BODY, 1, 15D, true, "eden").setName("edenBody");
    public static final Item edenLegs 			= new ItemDivineArmor(ArmorMaterialMod.Eden, LEGS, 2, 15D, true, "eden").setName("edenLegs");
    public static final Item edenBoots 			= new ItemDivineArmor(ArmorMaterialMod.Eden, BOOTS, 3, 15D, true, "eden").setName("edenBoots");
    
    public static final Item wildHelmet 		= new ItemDivineArmor(ArmorMaterialMod.Wild, HEAD, 0, 16.25D, true, "idklol").setName("wildWoodsHelmet");
    public static final Item wildBody 			= new ItemDivineArmor(ArmorMaterialMod.Wild, BODY, 1, 16.25D, true, "idklol").setName("wildWoodsBody");
    public static final Item wildLegs 			= new ItemDivineArmor(ArmorMaterialMod.Wild, LEGS, 2, 16.25D, true, "idklol").setName("wildWoodsLegs");
    public static final Item wildBoots 			= new ItemDivineArmor(ArmorMaterialMod.Wild, BOOTS, 3, 16.25D, true, "idklol").setName("wildWoodsBoots");
    
    public static final Item apalachiaHelmet 	= new ItemDivineArmor(ArmorMaterialMod.Apalachia, HEAD, 0, 18D, true, "apalachia").setName("apalachiaHelmet");
    public static final Item apalachiaBody 		= new ItemDivineArmor(ArmorMaterialMod.Apalachia, BODY, 1, 18D, true, "apalachia").setName("apalachiaBody");
    public static final Item apalachiaLegs 		= new ItemDivineArmor(ArmorMaterialMod.Apalachia, LEGS, 2, 18D, true, "apalachia").setName("apalachiaLegs");
    public static final Item apalachiaBoots 	= new ItemDivineArmor(ArmorMaterialMod.Apalachia, BOOTS, 3, 18D, true, "apalachia").setName("apalachiaBoots");
    
    public static final Item skythernHelmet 	= new ItemDivineArmor(ArmorMaterialMod.Skythern, HEAD, 0, 18.75D, true, "skythernHelmet").setName("skythernHelmet");
    public static final Item skythernBody 		= new ItemDivineArmor(ArmorMaterialMod.Skythern, BODY, 1, 18.75D, true, "skythernHelmet").setName("skythernBody");
    public static final Item skythernLegs 		= new ItemDivineArmor(ArmorMaterialMod.Skythern, LEGS, 2, 18.75D, true, "skythernHelmet").setName("skythernLegs");
    public static final Item skythernBoots 		= new ItemDivineArmor(ArmorMaterialMod.Skythern, BOOTS, 3, 18.75D, true, "skythernHelmet").setName("skythernBoots");
    
    public static final Item mortumHelmet 		= new ItemDivineArmor(ArmorMaterialMod.Mortum, HEAD, 0, 20D, true, "mortum").setName("mortumHelmet");
    public static final Item mortumBody 		= new ItemDivineArmor(ArmorMaterialMod.Mortum, BODY, 1, 20D, true, "mortum").setName("mortumBody");
    public static final Item mortumLegs 		= new ItemDivineArmor(ArmorMaterialMod.Mortum, LEGS, 2, 20D, true, "mortum").setName("mortumLegs");
    public static final Item mortumBoots 		= new ItemDivineArmor(ArmorMaterialMod.Mortum, BOOTS, 3, 20D, true, "mortum").setName("mortumBoots");
    
    public static final Item haliteHelmet 		= new ItemDivineArmor(ArmorMaterialMod.Halite, HEAD, 0, 20.75D, true, "halite").setName("haliteHelmet");
    public static final Item haliteBody 		= new ItemDivineArmor(ArmorMaterialMod.Halite, BODY, 1, 20.75D, true, "halite").setName("haliteBody");
    public static final Item haliteLegs 		= new ItemDivineArmor(ArmorMaterialMod.Halite, LEGS, 2, 20.75D, true, "halite").setName("haliteLegs");
    public static final Item haliteBoots 		= new ItemDivineArmor(ArmorMaterialMod.Halite, BOOTS, 3, 20.75D, true, "halite").setName("haliteBoots");
}