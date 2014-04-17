package net.divinerpg.helper.blocks;

import net.divinerpg.api.blocks.BlockModDirt;
import net.divinerpg.api.blocks.BlockModDoor;
import net.divinerpg.api.blocks.BlockModGlass;
import net.divinerpg.api.blocks.BlockModGrass;
import net.divinerpg.api.blocks.BlockModLeaves;
import net.divinerpg.api.blocks.BlockModLight;
import net.divinerpg.api.blocks.BlockModLog;
import net.divinerpg.api.blocks.BlockModSpawner;
import net.divinerpg.api.blocks.BlockModVine;
import net.divinerpg.blocks.vethea.BlockAcid;
import net.divinerpg.blocks.vethea.BlockHelioticBeam;
import net.divinerpg.blocks.vethea.BlockInfusionTable;
import net.divinerpg.blocks.vethea.BlockKarosCannon;
import net.divinerpg.blocks.vethea.BlockKarosHeatTile;
import net.divinerpg.blocks.vethea.BlockVetheaPlant;
import net.divinerpg.blocks.vethea.VetheanBlock;
import net.divinerpg.helper.items.VetheanItems;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class VetheaBlocks {

	public static Block             	  dreamGrass;

	public static final Block             dreamwreckerSpawner    = new BlockModSpawner("Dreamwrecker", true).setName("dremWreckerSpawner");
	public static final Block             vermenousSpawner       = new BlockModSpawner("Vermenous", true).setName("vermenousSpawner");
	public static final Block             twinsSpawner           = new BlockModSpawner("Twins", true).setName("twinsSpawner");
	public static final Block             biphronSpawner         = new BlockModSpawner("Biphron", true).setName("biphronSpawner");
	public static final Block             gorgosionSpawner       = new BlockModSpawner("Gorgosion", true).setName("gorgosionSpawner");

	public static final Block             wreckAltar             = new VetheanBlock(Material.rock).setName("wreckAltar").setCreativeTab(DivineRPGTabs.spawner);
	public static final Block             quadroticAltar         = new VetheanBlock(Material.rock).setName("quadroticAltar").setCreativeTab(DivineRPGTabs.spawner);
	public static final Block             karosAltar             = new VetheanBlock(Material.rock).setName("karosAltar").setCreativeTab(DivineRPGTabs.spawner);
	public static final Block             raglokAltar            = new VetheanBlock(Material.rock).setName("raglokAltar").setCreativeTab(DivineRPGTabs.spawner);
	public static final Block             lunicAltar             = new VetheanBlock(Material.rock).setName("lunicAltar").setCreativeTab(DivineRPGTabs.spawner);

	//public static final BlockVetheaPortal vetheaPortal           = (BlockVetheaPortal)new BlockVetheaPortal().setName("vetheaPortal");
	public static final Block             dreamStone             = new VetheanBlock(Material.rock).setName("dreamStone");
	public static final Block             dreamDirt              = new BlockModDirt().setName("dreamDirt").setCreativeTab(DivineRPGTabs.vethea);
	public static final Block             fireCrystal            = new VetheanBlock(Material.rock).setName("fireCrystal").setLightLevel(0.7F).setStepSound(Block.soundTypeGlass);

	public static final Block             dreamWoodLog           = new BlockModLog().setName("dreamWoodLog").setCreativeTab(DivineRPGTabs.vethea);
	public static final Block             dreamWoodLeaves        = new BlockModLeaves().setName("dreamWoodLeaves").setCreativeTab(DivineRPGTabs.vethea);
	public static final Block             dreamBricks1           = new VetheanBlock(Material.rock).setName("dreamBricks1");
	public static final Block             dreamBricks2           = new VetheanBlock(Material.rock).setName("dreamBricks2");
	public static final Block             lunaStone              = new VetheanBlock(Material.rock).setName("lunaStone").setBlockUnbreakable();
	public static final Block             lunaBricks             = new VetheanBlock(Material.rock).setName("lunaBrick").setBlockUnbreakable();
	public static final Block             metalCaging            = new VetheanBlock(Material.rock).setName("metalCaging");
	public static final Block             dreamLampOn            = new BlockModLight(Material.glass).setName("dreamLampOn").setBlockUnbreakable().setCreativeTab(DivineRPGTabs.vethea);
	public static final Block             dreamLamp              = new VetheanBlock(Material.glass).setName("dreamLampOff").setBlockUnbreakable();
	public static final Block             weedwoodVine           = new BlockModVine().setName("weedWoodVine").setCreativeTab(DivineRPGTabs.vethea);
	public static final Block             blossomingWeedwoodVine = new BlockModVine().setName("blossemedWeedWoodVine").setCreativeTab(DivineRPGTabs.vethea);
	public static final Block             cryptWall              = new VetheanBlock(Material.rock).setName("cryptWall").setBlockUnbreakable();
	public static final Block             smoothGlass            = new BlockModGlass().setName("smoothGlass").setCreativeTab(DivineRPGTabs.vethea);
	public static final Block             villageLamp            = new VetheanBlock(Material.glass).setName("villageLamp").setLightLevel(1.0F).setStepSound(Block.soundTypeGlass);
	public static final Block             cellLamp               = new VetheanBlock(Material.glass).setName("cellLamp").setLightLevel(1.0F).setStepSound(Block.soundTypeGlass);
	public static final Block             barredDoor             = new BlockModDoor(Material.iron, VetheanItems.barredDoorItem, true).setName("barredDoorBlock");
	public static final Block             firelight              = new VetheanBlock(Material.glass).setName("firelight").setLightLevel(1.0F).setStepSound(Block.soundTypeGlass).setResistance(1.0F);
	public static final Block             hyrewood               = new BlockModLog().setName("hyreWoodLog").setCreativeTab(DivineRPGTabs.vethea);
	public static final Block             mintwoodLeaves         = new BlockModLeaves().setName("mintwoodLeaves").setCreativeTab(DivineRPGTabs.vethea);
	public static final Block             firewall               = new VetheanBlock(Material.rock).setName("fireWall");
	public static final Block             karosHeatTileGreen     = new BlockKarosHeatTile(false).setName("karosHeatTileGreen").setBlockUnbreakable();
	public static final Block             karosHeatTileRed       = new BlockKarosHeatTile(true).setName("karosHeatTileRed").setBlockUnbreakable();
	public static final Block             firewood               = new BlockModLog().setName("fireWoodLog").setCreativeTab(DivineRPGTabs.vethea);
	public static final Block             bacterialAcid          = new BlockAcid().setName("bacterialAcid");
	public static final Block             blockAcid              = new BlockAcid().setName("acidBlock");
	public static final Block             everstone              = new VetheanBlock(Material.rock).setName("greenEverstone").setBlockUnbreakable();
	public static final Block             lunicAcid              = new BlockAcid().setName("lunicAcid");
	public static final Block             firewoodLeaves         = new BlockModLeaves().setName("fireWoodLeaves").setCreativeTab(DivineRPGTabs.vethea);
	public static final Block             hyrewoodLeaves         = new BlockModLeaves().setName("hyreWoodLeaves").setCreativeTab(DivineRPGTabs.vethea);
	public static final Block             gemtopGreen            = new BlockVetheaPlant().setName("greenGemTop");
	public static final Block             purpleDulah            = new BlockVetheaPlant().setName("purpleDulah");
	public static final Block             yellowDulah            = new BlockVetheaPlant().setName("yellowDulah");
	public static final Block             greenDulah             = new BlockVetheaPlant().setName("greenDulah");
	public static final Block             mintwood               = new BlockModLog().setName("mintWoodLog").setCreativeTab(DivineRPGTabs.vethea);
	public static final Block             cracklespike           = new BlockVetheaPlant().setName("crackleSpike");
	public static final Block             fernite                = new BlockVetheaPlant().setName("fernite");
	public static final Block             bulatobe               = new BlockVetheaPlant().setName("bulbatobe");
	public static final Block             shineGrass             = new BlockVetheaPlant().setName("shineGrass").setLightLevel(0.4F);
	//public static final Block             shimmer                = new BlockShimmer().setLightLevel(0.4F).setUnlocalizedName("shimmer").setStepSound(Block.soundGrassFootstep);
	public static final Block             hiveWall               = new VetheanBlock(Material.glass).setName("hiveWalls").setLightLevel(0.533F);
	//public static final Block             dreamglow              = new BlockShimmer().setLightLevel(0.4F).setUnlocalizedName("dreamglow").setStepSound(Block.soundGrassFootstep);
	public static final Block             hyrewoodVine           = new BlockModVine().setName("hyreWoodVine");
	public static final Block             chamberWall            = new VetheanBlock(Material.rock).setName("chamberWall1").setBlockUnbreakable();
	public static final Block             chamberWall1           = new VetheanBlock(Material.rock).setName("chamberWall2").setBlockUnbreakable();
	public static final Block             chamberWall2           = new VetheanBlock(Material.rock).setName("chamberWall3").setBlockUnbreakable();
	public static final Block             whiteEverstone         = new VetheanBlock(Material.rock).setName("whiteEverstone").setBlockUnbreakable();
	public static final Block             darkEverstone          = new VetheanBlock(Material.rock).setName("darkEverstone").setBlockUnbreakable();
	public static final Block             infusionTable          = new BlockInfusionTable().setName("infusionTable").setBlockUnbreakable();
	public static final Block             hungerstone1           = new VetheanBlock(Material.rock).setName("hungerStone1");
	public static final Block             hungerstone2           = new VetheanBlock(Material.rock).setName("hungerStone2");
	public static final Block             cryptFloor             = new VetheanBlock(Material.rock).setName("cryptFloor").setBlockUnbreakable();
	public static final Block             hallWall               = new VetheanBlock(Material.rock).setName("hallWall").setBlockUnbreakable();
	public static final BlockHelioticBeam helioticBeam           = (BlockHelioticBeam)new BlockHelioticBeam().setName("helioticBeam");
	public static final BlockKarosCannon  karosCannon            = (BlockKarosCannon)new BlockKarosCannon(Material.rock).setName("karosCannon");

	public static void init() {
		dreamGrass = new BlockModGrass(dreamGrass, dreamDirt, "dream").setCreativeTab(DivineRPGTabs.vethea);
	}
}