package net.divinerpg.helper.items;

import net.divinerpg.api.items.ItemMod;
import net.divinerpg.api.items.ItemModSword;
import net.divinerpg.helper.material.ToolMaterialMod;
import net.divinerpg.vanilla.items.ItemInfernoSword;
import net.divinerpg.vanilla.items.ItemScythe;
import net.divinerpg.vanilla.items.ItemSerenadeOfHealth;
import net.divinerpg.vanilla.items.ItemThrowable;
import net.minecraft.item.Item;

public class VanillaItemsWeapons {

	public static final Item slimeSword         = new ItemModSword(ToolMaterialMod.Slime).setName("slimeSword");
    public static final Item oceanKnife         = new ItemModSword(ToolMaterialMod.OceanKnife).setName("oceanKnife");
    public static final Item aquaticMaul        = new ItemModSword(ToolMaterialMod.AquaMaul).setName("aquaMaul");
    public static final Item arlemiteSword      = new ItemModSword(ToolMaterialMod.Arlemite).setName("arlemiteSword");
    public static final Item bedrockSword       = new ItemModSword(ToolMaterialMod.Bedrock).setName("bedrockSword");
    public static final Item realmiteSword      = new ItemModSword(ToolMaterialMod.Realmite).setName("realmiteSword");
    public static final Item rupeeSword         = new ItemModSword(ToolMaterialMod.Rupee).setName("rupeeSword");
    public static final Item sandslash          = new ItemModSword(ToolMaterialMod.Sandslash).setName("sandslash");
    public static final Item divineSword        = new ItemModSword(ToolMaterialMod.Divine).setName("divineSword");
    public static final Item blueDivineSword    = new ItemModSword(ToolMaterialMod.Divine).setName("blueDivineSword");
    public static final Item yellowDivineSword  = new ItemModSword(ToolMaterialMod.Divine).setName("yellowDivineSword");
    public static final Item pinkDivineSword    = new ItemModSword(ToolMaterialMod.Divine).setName("pinkDivineSword");
    public static final Item purpleDivineSword  = new ItemModSword(ToolMaterialMod.Divine).setName("purpleDivineSword");
    public static final Item redDivineSword     = new ItemModSword(ToolMaterialMod.Divine).setName("redDivineSword");
    public static final Item greenDivineSword   = new ItemModSword(ToolMaterialMod.Divine).setName("greenDivineSword");
    public static final Item bedrockMaul        = new ItemModSword(ToolMaterialMod.Bedrock).setName("bedrockMaul");
    public static final Item jungleKnife        = new ItemModSword(ToolMaterialMod.OceanKnife).setName("jungleKnife");
    public static final Item cyclopsSword       = new ItemModSword(ToolMaterialMod.Cyclops).setName("cyclopianSword");
    public static final Item donatorSword       = new ItemModSword(ToolMaterialMod.Donator).setName("donatorSword");
    public static final Item aquaticTrident     = new ItemModSword(ToolMaterialMod.AquaTrident).setName("aquaticTrident");
    public static final Item aquaticDagger      = new ItemModSword(ToolMaterialMod.AquaDagger).setName("aquaticDagger");
    public static final Item aquaton            = new ItemModSword(ToolMaterialMod.Aquaton).setName("aquaton");
    public static final Item sharkSword         = new ItemModSword(ToolMaterialMod.Shark).setName("sharkSword");
    public static final Item deathBringer       = new ItemModSword(ToolMaterialMod.DeathBringer).setName("deathBringer");
    public static final Item crabclawMaul       = new ItemModSword(ToolMaterialMod.CrabclawMaul).setName("crabclawMaul");
    public static final Item poisonSaber        = new ItemModSword(ToolMaterialMod.PoisonSaber).setName("poisonSaber");
    public static final Item furyMaul           = new ItemModSword(ToolMaterialMod.FuryMaul).setName("furyMaul");
    public static final Item corruptedMaul      = new ItemModSword(ToolMaterialMod.CorruptedMaul).setName("corruptedMaul");
    public static final Item frostSword         = new ItemModSword(ToolMaterialMod.Frost).setName("frostSword");
    public static final Item infernoSword       = new ItemInfernoSword(ToolMaterialMod.Inferno).setName("infernoSword");
    public static final Item bloodgemSword      = new ItemModSword(ToolMaterialMod.BloodgemTool).setName("bloodgemSword");
    public static final Item moltenSword        = new ItemModSword(ToolMaterialMod.Molten).setName("moltenSword");
    public static final Item scorchingSword     = new ItemModSword(ToolMaterialMod.Scorching).setName("scorchingSword");
    public static final Item bluefireSword      = new ItemModSword(ToolMaterialMod.Bluefire).setName("bluefireSword");
    public static final Item enderSword         = new ItemModSword(ToolMaterialMod.Ender).setName("enderSword");
    public static final Item enderSwordBlue     = new ItemModSword(ToolMaterialMod.Ender).setName("enderSwordBlue");
    public static final Item enderSwordDark     = new ItemModSword(ToolMaterialMod.Ender).setName("enderSwordBlack");
    public static final Item enderSwordGreen    = new ItemModSword(ToolMaterialMod.Ender).setName("enderSwordGreen");
    public static final Item enderSwordRed      = new ItemModSword(ToolMaterialMod.Ender).setName("enderSwordRed");
    public static final Item enderSwordYellow   = new ItemModSword(ToolMaterialMod.Ender).setName("enderSwordYellow");
    public static final Item longsword   		= new ItemModSword(ToolMaterialMod.Longsword).setName("longsword").setFull3D();
    
    public static final Item shuriken       	= new ItemThrowable(4).setName("shuriken");
    public static final Item vileStorm       	= new ItemThrowable(4).setName("vileStorm");
    public static final Item scythe		       	= new ItemScythe().setName("scythe");
    public static final Item scytheProjectile 	= new ItemMod().setName("scytheProjectile").setCreativeTab(null);
    
    public static final Item serenadeOfHealth 	= new ItemSerenadeOfHealth().setName("serenadeOfHealth");
    
}
