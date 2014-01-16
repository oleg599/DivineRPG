package net.divinerpg.helper.blocks;

import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.common.registry.*;
import net.divinerpg.*;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.overworld.blocks.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;

public class VanillaBlocks {

	public static Reference x;
	
	static Material rock = Material.field_151576_e;
	static Material wool = Material.field_151580_n;
	
	public static final Block rupeeOre = new VanillaBlock(rock).setTextureName("rupeeOre").func_149663_c("rupeeOre").func_149711_c(3.0F);
	public static final Block arlemiteOre = new VanillaBlock(rock).setTextureName("arlemiteOre").func_149663_c("arlemiteOre").func_149711_c(3.0F);
	public static final Block realmiteOre = new VanillaBlock(rock).setTextureName("realmiteOre").func_149663_c("realmiteOre").func_149711_c(3.0F);
	public static final Block bloodGemOre = new VanillaBlock(rock).setTextureName("bloodOre").func_149663_c("bloodOre").func_149711_c(3.0F);
	public static final Block netheriteOre = new VanillaBlock(rock).setTextureName("netheriteOre").func_149663_c("netheriteOre").func_149711_c(3.0F);

	public static final Block rupeeBlock = new VanillaBlock(rock).setTextureName("rupeeBlock").func_149663_c("rupeeBlock").func_149711_c(3.0F);
	public static final Block arlemiteBlock = new VanillaBlock(rock).setTextureName("arlemiteBlock").func_149663_c("arlemiteBlock").func_149711_c(3.0F);
	public static final Block realmiteBlock = new VanillaBlock(rock).setTextureName("realmiteBlock").func_149663_c("realmiteBlock").func_149711_c(3.0F);
	public static final Block bloodgemBlock = new VanillaBlock(rock).setTextureName("bloodgemBlock").func_149663_c("bloodgemBlock").func_149711_c(3.0F);
	public static final Block netheriteBlock = new VanillaBlock(rock).setTextureName("netheriteBlock").func_149663_c("netheriteBlock").func_149711_c(3.0F);
	
	public static final Block SpiderPumpkin = new MobPumpkin().setTextureName("spiderPumpkin").func_149663_c("spiderPumpkin");
    public static final Block EnderPumpkin = new MobPumpkin().setTextureName("enderPumpkin").func_149663_c("enderPumpkin");
    public static final Block CreeperPumpkin = new MobPumpkin().setTextureName("creeperPumpkin").func_149663_c("creeperPumpkin");
    public static final Block SkeletonPumpkin = new MobPumpkin().setTextureName("skeletonPumpkin").func_149663_c("skeletonPumpkin");
    public static final Block BlazePumpkin = new MobPumpkin().setTextureName("blazePumpkin").func_149663_c("blazePumpkin");
    public static final Block ZombiePumpkin = new MobPumpkin().setTextureName("zombiePumpkin").func_149663_c("zombiePumpkin");
    public static final Block FrostPumpkin = new MobPumpkin().setTextureName("frostPumpkin").func_149663_c("frostPumpkin");
    public static final Block CyclopsPumpkin = new MobPumpkin().setTextureName("cyclopsPumpkin").func_149663_c("cyclopsPumpkin");
    public static final Block GhastPumpkin = new MobPumpkin().setTextureName("ghastPumpkin").func_149663_c("ghastPumpkin");
    public static final Block GlaconPumpkin = new MobPumpkin().setTextureName("glaconPumpkin").func_149663_c("glaconPumpkin");
    public static final Block EnderWatcherPumpkin = new MobPumpkin().setTextureName("enderWatcherPumpkin").func_149663_c("enderWatcherPumpkin");
    public static final Block JungleSpiderPumpkin = new MobPumpkin().setTextureName("jungleSpiderPumpkin").func_149663_c("jungleSpiderPumpkin");
    public static final Block HellSpiderPumpkin = new MobPumpkin().setTextureName("hellSpiderPumpkin").func_149663_c("hellSpiderPumpkin");
	
    public static final Block checker = new VanillaBlock(wool).setTextureName("checker").func_149663_c("checker").func_149711_c(0.5F);
    public static final Block rainbowWool = new VanillaBlock(wool).setTextureName("rainbowWool").func_149663_c("rainbowWool").func_149711_c(0.5F);
    public static final Block crate = new VanillaBlock(wool).setTextureName("crate").func_149663_c("crate").func_149711_c(1.0F);
    public static final Block blueStone = new VanillaBlock(wool).setTextureName("blueStone").func_149663_c("blueStone").func_149711_c(1.0F);
    public static final Block purpleStone = new VanillaBlock(wool).setTextureName("purpleStone").func_149663_c("purpleStone").func_149711_c(1.0F);

    public static final Block blueVane = new VanillaBlock(rock).setTextureName("blueVane").func_149663_c("blueVane").func_149711_c(2.0F);
    public static final Block cyanVane = new VanillaBlock(rock).setTextureName("cyanVane").func_149663_c("cyanVane").func_149711_c(2.0F);
    public static final Block purpleVane = new VanillaBlock(rock).setTextureName("purpleVane").func_149663_c("purpleVane").func_149711_c(2.0F);
    public static final Block redVane = new VanillaBlock(rock).setTextureName("redVane").func_149663_c("redVane").func_149711_c(2.0F);
    public static final Block yellowVane = new VanillaBlock(rock).setTextureName("yellowVane").func_149663_c("yellowVane").func_149711_c(2.0F);
    
    public static final Block divineRock = new VanillaBlock(rock).setTextureName("divineRock").func_149663_c("divineRock").func_149711_c(1.5F);

	public static void init(){
		DivineAPI.addBlock(rupeeOre, "Rupee Ore");
		DivineAPI.addBlock(arlemiteOre, "Arlemite Ore");
		DivineAPI.addBlock(realmiteOre, "Realmite Ore");
		DivineAPI.addBlock(bloodGemOre, "BloodGem Ore");
		DivineAPI.addBlock(netheriteOre, "Netherite Ore");
		
		DivineAPI.addBlock(rupeeBlock, "Rupee Block");
		DivineAPI.addBlock(arlemiteBlock, "Arlemite Block");
		DivineAPI.addBlock(realmiteBlock, "Realmite Block");
		DivineAPI.addBlock(bloodgemBlock, "BloodGem Block");
		DivineAPI.addBlock(netheriteBlock, "Netherite Block");
		
		DivineAPI.addBlock(SpiderPumpkin, "Spider Pumpkin");
        DivineAPI.addBlock(CreeperPumpkin, "Creeper Pumpkin");
        DivineAPI.addBlock(EnderPumpkin, "Enderman Pumpkin");
        DivineAPI.addBlock(SkeletonPumpkin, "Skeleton Pumpkin");
        DivineAPI.addBlock(BlazePumpkin, "Blaze Pumpkin");
        DivineAPI.addBlock(ZombiePumpkin, "Zombie Pumpkin");
        DivineAPI.addBlock(FrostPumpkin, "Frost Pumpkin");
        DivineAPI.addBlock(CyclopsPumpkin, "Cyclops Pumpkin");
        DivineAPI.addBlock(GhastPumpkin, "Ghast Pumpkin");
        DivineAPI.addBlock(GlaconPumpkin, "Glacon Pumpkin");
        DivineAPI.addBlock(EnderWatcherPumpkin, "EnderWatcher Pumpkin");
        DivineAPI.addBlock(JungleSpiderPumpkin, "Jungle Spider Pumpkin");
        DivineAPI.addBlock(HellSpiderPumpkin, "Hell Spider Pumpkin");
        
        DivineAPI.addBlock(checker, "Checker Block");
        DivineAPI.addBlock(rainbowWool, "Rainbow Wool");
        DivineAPI.addBlock(crate, "Crate");
        DivineAPI.addBlock(blueStone, "Blue Stone");
        DivineAPI.addBlock(purpleStone, "Purple Stone");
        DivineAPI.addBlock(blueVane, "Blue Vane");
        DivineAPI.addBlock(cyanVane, "Cyan Vane");
        DivineAPI.addBlock(purpleVane, "Purple Vane");
        DivineAPI.addBlock(redVane, "Red Vane");
        DivineAPI.addBlock(yellowVane, "Yellow Vane");
        
        DivineAPI.addBlock(divineRock, "Divine Rock");
	}
	
	

}
