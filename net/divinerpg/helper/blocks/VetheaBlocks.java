package net.divinerpg.helper.blocks;

import net.divinerpg.DivineRPG;
import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.api.blocks.BlockModDirt;
import net.divinerpg.api.blocks.BlockModDoor;
import net.divinerpg.api.blocks.BlockModGlass;
import net.divinerpg.api.blocks.BlockModGrass;
import net.divinerpg.api.blocks.BlockModLamp;
import net.divinerpg.api.blocks.BlockModLeaves;
import net.divinerpg.api.blocks.BlockModLog;
import net.divinerpg.api.blocks.BlockVetheaPlant;
import net.divinerpg.api.blocks.BlockModSpawner;
import net.divinerpg.api.blocks.BlockModVine;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.twilight.blocks.BlockBlueFire;
import net.divinerpg.vethea.blocks.BlockAcid;
import net.divinerpg.vethea.blocks.BlockKarosHeatTile;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class VetheaBlocks {

    public static final Block             dreamGrass;

    public static final Block             dreamwreckerSpawner    = new BlockModSpawner("Dreamwrecker", true).setName("dremWreckerSpawner");
    public static final Block             vermenousSpawner       = new BlockModSpawner("Vermenous", true).setName("vermenousSpawner");
    public static final Block             twinsSpawner           = new BlockModSpawner("Twins", true).setName("twinsSpawner");
    public static final Block             biphronSpawner         = new BlockModSpawner("Biphron", true).setName("biphronSpawner");
    public static final Block             gorgosionSpawner       = new BlockModSpawner("Gorgosion", true).setName("gorgosionSpawner");

    public static final Block             wreckAltar             = new BlockMod(Material.rock).setName("wreckAltar").setCreativeTab(DivineRPGTabs.spawner);
    public static final Block             quadroticAltar         = new BlockMod(Material.rock).setName("quadroticAltar").setCreativeTab(DivineRPGTabs.spawner);
    public static final Block             karosAltar             = new BlockMod(Material.rock).setName("karosAltar").setCreativeTab(DivineRPGTabs.spawner);
    public static final Block             raglokAltar            = new BlockMod(Material.rock).setName("raglokAltar").setCreativeTab(DivineRPGTabs.spawner);
    public static final Block             lunicAltar             = new BlockMod(Material.rock).setName("lunicAltar").setCreativeTab(DivineRPGTabs.spawner);

  //public static final BlockVetheaPortal vetheaPortal           = (BlockVetheaPortal)new BlockVetheaPortal().setName("vetheaPortal").setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             dreamStone             = new BlockMod(Material.rock).setName("dreamStone").setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             dreamDirt              = new BlockModDirt().setName("dreamDirt").setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             fireCrystal            = new BlockMod(Material.rock).setName("fireCrystal").setLightLevel(0.7F).setStepSound(Block.soundTypeGlass).setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);

    public static final Block             dreamWoodLog           = new BlockModLog().setName("dreamWoodLog").setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             dreamwoodLeaves        = new BlockModLeaves().setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             dreamBricks            = new BlockMod(Material.rock).setName("dreamBricks").setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             lunaStone              = new BlockMod(Material.rock).setName("lunaStone").setBlockUnbreakable().setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             lunaBricks             = new BlockMod(Material.rock).setName("lunaBrick").setBlockUnbreakable().setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             metalCaging            = new BlockMod(Material.rock).setName("metalCaging").setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             dreamLampOn            = new BlockModLamp(true).setName("dreamLampOn").setBlockUnbreakable().setHardness(1F).setStepSound(Block.soundTypeGlass).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             dreamLamp              = new BlockModLamp(false).setName("dreamLampOff").setBlockUnbreakable().setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             weedwoodVine           = new BlockModVine().setName("WeedWoodVine").setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             blossomingWeedwoodVine = new BlockModVine().setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             cryptWall              = new BlockMod(Material.rock).setName("ChamberWall1").setBlockUnbreakable().setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             smoothGlass            = new BlockModGlass().setName("SmoothGlass").setStepSound(Block.soundTypeGlass).setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             villageLamp            = new BlockMod(Material.glass).setName("VillageLamp").setLightLevel(1.0F).setStepSound(Block.soundTypeGlass).setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             cellLamp               = new BlockMod(Material.glass).setName("CellLamp").setLightLevel(1.0F).setStepSound(Block.soundTypeGlass).setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             barredDoor             = new BlockModDoor(Material.iron).setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             firelight              = new BlockMod(Material.glass).setName("FireLight").setLightLevel(1.0F).setStepSound(Block.soundTypeGlass).setHardness(1F).setResistance(1.0F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             hyrewood               = new BlockModLog().setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             mintwoodLeaves         = new BlockModLeaves().setName("mintwoodLeaves").setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             firewall               = new BlockMod(Material.rock).setName("FireWall").setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             karosHeatTileGreen     = new BlockKarosHeatTile(false).setName("KarosHeatTileGreen").setBlockUnbreakable().setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             karosHeatTileRed       = new BlockKarosHeatTile(true).setName("KarosHeatTileRed").setBlockUnbreakable().setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             firewood               = new BlockModLog().setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             bacterialAcid          = new BlockBacterialAcid().setName("VetheaPortal").setUnlocalizedName("bacterialAcid").setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             blockAcid              = new BlockAcid().setName("VetheaPortal").setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             everstone              = new BlockMod(Material.rock).setName("GreenEverstone").setBlockUnbreakable().setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             lunicAcid              = new BlockLunicAcid(141).setName("VetheaPortal").setUnlocalizedName("lunicAcid").setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             firewoodLeaves         = new BlockModLeaves().setName("firewoodLeaves").setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             hyrewoodLeaves         = new BlockModLeaves().setName("hyrewoodLeaves").setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             gemtopGreen            = new BlockVetheaPlant(1).setName("GreenGemTop").setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             gemtopPurple           = new BlockVetheaPlant(2).setName("PurpleGemTop").setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             yellowDulah            = new BlockVetheaPlant(3).setName("YellowDulah").setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             greenDulah             = new BlockVetheaPlant(4).setName("GreenDulah").setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             mintwood               = new BlockModLog().setName("mintwood").setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             lightFirewoodLeaves    = new BlockModLeaves().setName("lightFirewoodLeaves").setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             cracklespike           = new BlockVetheaPlant(5).setName("CrackleSpike").setStepSound(Block.soundTypeGrass).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             fernite                = new BlockVetheaPlant(6).setName("Fernite").setStepSound(Block.soundTypeGrass).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             bulatobe               = new BlockVetheaPlant(7).setName("Bulbatobe").setStepSound(Block.soundTypeGrass).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             shineGrass             = new BlockVetheaPlant(8).setName("ShineGrass").setLightLevel(0.4F).setStepSound(Block.soundTypeGrass).setCreativeTab(DivineRPGTabs.vethea);
  //public static final Block             shimmer                = new BlockShimmer().setLightLevel(0.4F).setUnlocalizedName("shimmer").setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             hiveWall               = new BlockMod(Material.glass).setName("HiveWalls").setLightLevel(0.533F).setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
  //public static final Block             dreamglow              = new BlockShimmer().setLightLevel(0.4F).setUnlocalizedName("dreamglow").setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             hyrewoodVine           = new BlockModVine().setName("hyrewoodVine").setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             dreambricks2           = new BlockMod(Material.rock).setName("DreamBricks2").setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             chamberWall            = new BlockMod(Material.rock).setName("ChamberWall1").setBlockUnbreakable().setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             chamberWall1           = new BlockMod(Material.rock).setName("ChamberWall2").setBlockUnbreakable().setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             chamberWall2           = new BlockMod(Material.rock).setName("ChamberWall3").setBlockUnbreakable().setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             whiteEverstone         = new BlockMod(Material.rock).setName("WhiteEverstone").setBlockUnbreakable().setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             darkEverstone          = new BlockMod(Material.rock).setName("DarkEverstone").setBlockUnbreakable().setCreativeTab(DivineRPGTabs.vethea);
  //public static final Block             infusionTable          = new BlockInfusionTable().setName("infusionTable").setBlockUnbreakable().setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             hungerstone1           = new BlockMod(Material.rock).setName("HungerStone1").setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             hungerstone2           = new BlockMod(Material.rock).setName("HungerStone2").setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             cryptFloor             = new BlockMod(Material.rock).setName("CryptFloor").setBlockUnbreakable().setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             hallWall               = new BlockMod(Material.rock).setName("ChamberWall1").setBlockUnbreakable().setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             karosBricks            = new BlockMod(Material.rock).setName("KarosBrick").setBlockUnbreakable().setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             karosBricks2           = new BlockMod(Material.rock).setName("KarosBrick").setBlockUnbreakable().setCreativeTab(DivineRPGTabs.vethea);
    public static final BlockHelioticBeam helioticBeam           = (BlockHelioticBeam) new BlockHelioticBeam().setUnlocalizedName("helioticBeam").setHardness(1F).setCreativeTab(DivineRPGTabs.vethea);
    public static final BlockKarosCannon  karosCannon            = (BlockKarosCannon) new BlockKarosCannon(Material.rock).setBlockUnbreakable().setCreativeTab(DivineRPGTabs.vethea);
    public static final Block             purpleFire             = new BlockBlueFire();                                                                                                                                 //Just for now

    public static void init() {
        dreamGrass = new BlockModGrass(dreamGrass, dreamDirt, "dream").setCreativeTab(DivineRPGTabs.vethea);
    }
}