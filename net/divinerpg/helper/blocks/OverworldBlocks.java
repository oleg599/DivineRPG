package net.divinerpg.helper.blocks;

import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.common.registry.*;
import net.divinerpg.*;
import net.divinerpg.overworld.blocks.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;

public class OverworldBlocks {

	public static Reference x;
	
	static Material rock = Material.field_151576_e;
	static Material wool = Material.field_151580_n;
	
	public static final Block rupeeOre = new OverworldBlock(rock).setTextureName("rupeeore").func_149663_c("RupeeOre").func_149711_c(3.0F);
	public static final Block arlemiteOre = new OverworldBlock(rock).setTextureName("arlemiteore").func_149663_c("ArlemiteOre").func_149711_c(3.0F);
	public static final Block realmiteOre = new OverworldBlock(rock).setTextureName("realmiteore").func_149663_c("RealmiteOre").func_149711_c(3.0F);
	public static final Block bloodGemOre = new OverworldBlock(rock).setTextureName("bloodore").func_149663_c("BloodOre").func_149711_c(3.0F);
	public static final Block netheriteOre = new OverworldBlock(rock).setTextureName("netheriteore").func_149663_c("NetheriteOre").func_149711_c(3.0F);

	public static final Block rupeeBlock = new OverworldBlock(rock).setTextureName("rupeeblock").func_149663_c("RupeeBlock").func_149711_c(3.0F);
	public static final Block arlemiteBlock = new OverworldBlock(rock).setTextureName("arlemiteblock").func_149663_c("ArlemiteBlock").func_149711_c(3.0F);
	public static final Block realmiteBlock = new OverworldBlock(rock).setTextureName("realmiteblock").func_149663_c("RealmiteBlock").func_149711_c(3.0F);
	public static final Block bloodGemBlock = new OverworldBlock(rock).setTextureName("bloodblock").func_149663_c("BloodBlock").func_149711_c(3.0F);
	public static final Block netheriteBlock = new OverworldBlock(rock).setTextureName("netheriteblock").func_149663_c("NetheriteBlock").func_149711_c(3.0F);
	
	public static final Block SpiderPumpkin = new MobPumpkin().func_149658_d(Reference.prefix + "spider").func_149663_c("SpiderPumpkin");
    public static final Block EnderPumpkin = new MobPumpkin().func_149658_d(Reference.prefix + "ender").func_149663_c("EnderPumpkin");
    public static final Block CreeperPumpkin = new MobPumpkin().func_149658_d(Reference.prefix + "creeper").func_149663_c("CreeperPumpkin");
    public static final Block SkeletonPumpkin = new MobPumpkin().func_149658_d(Reference.prefix + "skeleton").func_149663_c("SkeletonPumpkin");
    public static final Block BlazePumpkin = new MobPumpkin().func_149658_d(Reference.prefix + "blaze").func_149663_c("BlazePumpkin");
    public static final Block ZombiePumpkin = new MobPumpkin().func_149658_d(Reference.prefix + "zombie").func_149663_c("ZombiePumpkin");
    public static final Block FrostPumpkin = new MobPumpkin().func_149658_d(Reference.prefix + "iceman").func_149663_c("FrostPumpkin");
    public static final Block CyclopsPumpkin = new MobPumpkin().func_149658_d("cyclops").func_149663_c("CyclopsPumpkin");
    public static final Block GhastPumpkin = new MobPumpkin().func_149658_d("ghast").func_149663_c("GhastPumpkin");
    public static final Block GlaconPumpkin = new MobPumpkin().func_149658_d("frost").func_149663_c("GlaconPumpkin");
    public static final Block EnderWatcherPumpkin = new MobPumpkin().func_149658_d("enderwatcher").func_149663_c("EnderWatcherPumpkin");
    public static final Block JungleSpiderPumpkin = new MobPumpkin().func_149658_d("junglespider").func_149663_c("JungleSpiderPumpkin");
    public static final Block HellSpiderPumpkin = new MobPumpkin().func_149658_d("hellspider").func_149663_c("HellSpiderPumpkin");
	
    public static final Block checker = new OverworldBlock(wool).setTextureName("checker").func_149663_c("checker").func_149711_c(0.5F);
    public static final Block rainbowWool = new OverworldBlock(wool).setTextureName("rainbowwool").func_149663_c("rainbowwool").func_149711_c(0.5F);
    public static final Block crate = new OverworldBlock(wool).setTextureName("crate").func_149663_c("crate").func_149711_c(1.0F);
    public static final Block blueStone = new OverworldBlock(wool).setTextureName("bluestone").func_149663_c("bluestone").func_149711_c(1.0F);
    public static final Block purpleStone = new OverworldBlock(wool).setTextureName("purplestone").func_149663_c("purplestone").func_149711_c(1.0F);

    public static final Block blueVane = new OverworldBlock(rock).setTextureName("bluevane").func_149663_c("bluevane").func_149711_c(2.0F);
    public static final Block cyanVane = new OverworldBlock(rock).setTextureName("cyanvane").func_149663_c("cyanvane").func_149711_c(2.0F);
    public static final Block purpleVane = new OverworldBlock(rock).setTextureName("purplevane").func_149663_c("purplevane").func_149711_c(2.0F);
    public static final Block redVane = new OverworldBlock(rock).setTextureName("redvane").func_149663_c("redvane").func_149711_c(2.0F);
    public static final Block yellowVane = new OverworldBlock(rock).setTextureName("yellowvane").func_149663_c("yellowvane").func_149711_c(2.0F);

	public static void init(){
		addBlock(rupeeOre, "Rupee Ore");
		addBlock(arlemiteOre, "Arlemite Ore");
		addBlock(realmiteOre, "Realmite Ore");
		addBlock(bloodGemOre, "BloodGem Ore");
		addBlock(netheriteOre, "Netherite Ore");
		
		addBlock(rupeeBlock, "Rupee Block");
		addBlock(arlemiteBlock, "Arlemite Block");
		addBlock(realmiteBlock, "Realmite Block");
		addBlock(bloodGemBlock, "BloodGem Block");
		addBlock(netheriteBlock, "Netherite Block");
		
        addBlock(SpiderPumpkin, "Spider Pumpkin");
        addBlock(CreeperPumpkin, "Creeper Pumpkin");
        addBlock(EnderPumpkin, "Enderman Pumpkin");
        addBlock(SkeletonPumpkin, "Skeleton Pumpkin");
        addBlock(BlazePumpkin, "Blaze Pumpkin");
        addBlock(ZombiePumpkin, "Zombie Pumpkin");
        addBlock(FrostPumpkin, "Frost Pumpkin");
        addBlock(CyclopsPumpkin, "Cyclops Pumpkin");
        addBlock(GhastPumpkin, "Ghast Pumpkin");
        addBlock(GlaconPumpkin, "Glacon Pumpkin");
        addBlock(EnderWatcherPumpkin, "EnderWatcher Pumpkin");
        addBlock(JungleSpiderPumpkin, "Jungle Spider Pumpkin");
        addBlock(HellSpiderPumpkin, "Hell Spider Pumpkin");
        
        addBlock(checker, "Checker Block");
        addBlock(rainbowWool, "Rainbow Wool");
        addBlock(crate, "Crate");
        addBlock(blueStone, "Blue Stone");
        addBlock(purpleStone, "Purple Stone");
        addBlock(blueVane, "Blue Vane");
        addBlock(cyanVane, "Cyan Vane");
        addBlock(purpleVane, "Purple Vane");
        addBlock(redVane, "Red Vane");
        addBlock(yellowVane, "Yellow Vane");
	}
	
	public static void addBlock(Block block, String name){
		GameRegistry.registerBlock(block, name);
		LanguageRegistry.addName(block, name);
	}
}
