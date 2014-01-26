package net.divinerpg.api.items;

import java.util.List;
import java.util.Set;

import net.divinerpg.Reference;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.UseHoeEvent;

import com.google.common.collect.Sets;

import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemShickaxe extends ItemTool
{
	//private static final Set<Block> blocksEffectiveAgainst = Sets.newHashSet(new Block[] {Blocks.cactus, Blocks.stained_hardened_clay, Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin, Blocks.cobblestone, Blocks.double_stone_slab, Blocks.stone_slab, Blocks.stone, Blocks.sandstone, Blocks.mossy_cobblestone, Blocks.iron_ore, Blocks.iron_block, Blocks.coal_ore, Blocks.gold_block, Blocks.gold_ore, Blocks.diamond_ore, Blocks.diamond_block, Blocks.ice, Blocks.netherrack, Blocks.lapis_ore, Blocks.lapis_block, Blocks.redstone_ore, Blocks.lit_redstone_ore, Blocks.rail, Blocks.detector_rail, Blocks.golden_rail, Blocks.activator_rail, Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium});
	private static final Set<Blocks> blocksEffectiveAgainst = Sets.newHashSet(new Blocks[256]);

	protected ToolMaterial theToolMaterial;

	private String name;

	public ItemShickaxe(ToolMaterial par2EnumToolMaterial)
	{
		super(0, par2EnumToolMaterial, blocksEffectiveAgainst);
		this.theToolMaterial = par2EnumToolMaterial;
		setCreativeTab(DivineRPGTabs.tools);
	}

	@Override
	public boolean canHarvestBlock(Block par1Block, ItemStack itemStack)
	{
		if(par1Block != Blocks.bedrock)
			return true;
		else
			return false;
	}

	public boolean func_150897_b(Block block)
	{
		return block == Blocks.obsidian ? this.toolMaterial.getHarvestLevel() == 3 : (block != Blocks.diamond_block && block != Blocks.diamond_ore ? (block != Blocks.emerald_ore && block != Blocks.emerald_block ? (block != Blocks.gold_block && block != Blocks.gold_ore ? (block != Blocks.iron_block && block != Blocks.iron_ore ? (block != Blocks.lapis_block && block != Blocks.lapis_ore ? (block != Blocks.redstone_ore && block != Blocks.lit_redstone_ore ? (block.func_149688_o() == Material.field_151576_e ? true : (block.func_149688_o() == Material.field_151573_f ? true : block.func_149688_o() == Material.field_151574_g)) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 2);
	}

	public float func_150893_a(ItemStack item, Block block) {
		return 	block.func_149688_o() != Material.field_151566_D && block.func_149688_o() != Material.field_151567_E && block.func_149688_o() != Material.field_151568_F && block.func_149688_o() != Material.field_151569_G && block.func_149688_o() != Material.field_151570_A && block.func_149688_o() != Material.field_151571_B && block.func_149688_o() != Material.field_151572_C 
				&& block.func_149688_o() != Material.field_151573_f && block.func_149688_o() != Material.field_151574_g && block.func_149688_o() != Material.field_151575_d && block.func_149688_o() != Material.field_151576_e && block.func_149688_o() != Material.field_151577_b && block.func_149688_o() != Material.field_151578_c
				&& block.func_149688_o() != Material.field_151579_a && block.func_149688_o() != Material.field_151580_n && block.func_149688_o() != Material.field_151581_o && block.func_149688_o() != Material.field_151582_l && block.func_149688_o() != Material.field_151583_m && block.func_149688_o() != Material.field_151584_j && block.func_149688_o() != Material.field_151585_k && block.func_149688_o() != Material.field_151585_k
				&& block.func_149688_o() != Material.field_151586_h && block.func_149688_o() != Material.field_151587_i && block.func_149688_o() != Material.field_151588_w && block.func_149688_o() != Material.field_151589_v && block.func_149688_o() != Material.field_151590_u && block.func_149688_o() != Material.field_151591_t && block.func_149688_o() != Material.field_151592_s && block.func_149688_o() != Material.field_151593_r 
				&& block.func_149688_o() != Material.field_151594_q && block.func_149688_o() != Material.field_151595_p && block.func_149688_o() != Material.field_151596_z && block.func_149688_o() != Material.field_151597_y && block.func_149688_o() != Material.field_151598_x && block.func_149688_o() != Material.field_151598_x ? super.func_150893_a(item, block) : this.efficiencyOnProperMaterial;
	}

	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
		if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack)) {
			return false;
		} else {
			UseHoeEvent event = new UseHoeEvent(par2EntityPlayer, par1ItemStack, par3World, par4, par5, par6);
			if (MinecraftForge.EVENT_BUS.post(event))
			{
				return false;
			}

			if (event.getResult() == Result.ALLOW)
			{
				par1ItemStack.damageItem(1, par2EntityPlayer);
				return true;
			}

			Block block = par3World.func_147439_a(par4, par5, par6);

			if (par7 != 0 && par3World.func_147439_a(par4, par5 + 1, par6).isAir(par3World, par4, par5 + 1, par6) && (block == Blocks.grass || block == Blocks.dirt))
			{
				Block block1 = Blocks.farmland;
				par3World.playSoundEffect((double)((float)par4 + 0.5F), (double)((float)par5 + 0.5F), (double)((float)par6 + 0.5F), block1.field_149762_H.func_150498_e(), (block1.field_149762_H.func_150497_c() + 1.0F) / 2.0F, block1.field_149762_H.func_150494_d() * 0.8F);

				if (par3World.isRemote)
				{
					return true;
				}
				else
				{
					par3World.func_147449_b(par4, par5, par6, block1);
					par1ItemStack.damageItem(1, par2EntityPlayer);
					return true;
				}
			}
			else
			{
				return false;
			}
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add(DivineAPI.BLUE + "Efficiency: " + this.theToolMaterial.getEfficiencyOnProperMaterial());
		if (par1ItemStack.getMaxDamage() != -1) {
			par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
		} else {
			par3List.add(DivineAPI.GREEN + "Infinite Uses");
		}
	}
	public Item setTextureName(String par1Str)
	{
		this.iconString = (Reference.PREFIX + par1Str);
		return this;
	}

	public Item setName(String name){
		this.name = name;
		setTextureName(name);
		setUnlocalizedName(name);
		register();
		return this;
	}

	public void register(){
		int numChars = 0;
		char firstLetter = name.charAt(0);
		if(Character.isLowerCase(firstLetter))
			firstLetter = Character.toUpperCase(firstLetter);
		String inGame = name.substring(1);
		for(int k = 0; k < name.length(); k++){
			char c = name.charAt(k);
			int code = (int) c;

			if(k != 0){
				for(int p = 65; p < 90; p++){
					if(code == p){
						numChars++;
						if(numChars == 1)
							inGame = new StringBuffer(inGame).insert(k - 1, " ").toString();
						else
							inGame = new StringBuffer(inGame).insert(k, " ").toString();
					}
				}
			}
		}
		String finalName = firstLetter + inGame;
		GameRegistry.registerItem(this, name);
		LanguageRegistry.addName(this, finalName);
	}
}
