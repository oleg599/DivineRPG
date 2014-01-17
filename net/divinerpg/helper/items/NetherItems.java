package net.divinerpg.helper.items;

import net.divinerpg.helper.items.base.ItemMod;
import net.divinerpg.helper.items.base.ItemModSword;
import net.divinerpg.helper.material.ToolMaterialMod;
import net.divinerpg.overworld.items.ItemInfernoSword;
import net.minecraft.item.Item;

public class NetherItems {
    public static int        HEAD           = 0, BODY = 1, LEGS = 2, BOOTS = 3;

    public static final Item netheriteChunk = new ItemMod().setName("netheriteChunk");
    public static final Item moltenStone    = new ItemMod().setName("moltenStone");
    public static final Item blueFireStone  = new ItemMod().setName("bluefireStone");
    public static final Item purpleBlaze    = new ItemMod().setName("purpleBlaze");
    public static final Item hellstoneIngot = new ItemMod().setName("hellstoneIngot");
    public static final Item furyFire       = new ItemMod().setName("furyFire");
    public static final Item netheriteIngot = new ItemMod().setName("netheriteIngot");
    public static final Item bloodgem       = new ItemMod().setName("bloodgem");
    public static final Item moltenShards   = new ItemMod().setName("moltenShards");

    public static final Item infernoSword   = new ItemInfernoSword(ToolMaterialMod.Inferno).setName("infernoSword");
    public static final Item bloodgemSword  = new ItemModSword(ToolMaterialMod.BloodgemTool).setName("bloodgemSword");
    public static final Item moltenSword    = new ItemModSword(ToolMaterialMod.MoltenSword).setName("moltenSword");
    public static final Item scorchingSword = new ItemModSword(ToolMaterialMod.ScorchingSword).setName("scorchingSword");
    public static final Item bluefireSword  = new ItemModSword(ToolMaterialMod.BluefireSword).setName("bluefireSword");
    
}
