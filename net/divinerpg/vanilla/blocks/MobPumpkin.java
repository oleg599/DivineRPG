package net.divinerpg.vanilla.blocks;

import net.divinerpg.DivineRPG;
import net.divinerpg.Reference;
import net.divinerpg.client.GuiHandler;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MobPumpkin extends BlockDirectional
{

	private String name;
	@SideOnly(Side.CLIENT)
	private IIcon top;
	@SideOnly(Side.CLIENT)
	private IIcon front;
    private static SoundType wood = Block.field_149766_f;
    private static Material pumpkin = Material.field_151572_C;

	public MobPumpkin() {
		super(pumpkin);
		suckTit(true);
		func_149711_c(1.0F);
		setCreativeTab(DivineRPGTabs.blocks);
		setSoundType(wood);
        LangRegistry.addBlock(this);
	}
	
	public Block setCreativeTab(CreativeTabs name) {
        return func_149647_a(name);
    }
	public Block setSoundType(Block.SoundType name) {
    	return func_149672_a(name);
    }
	/**
	 * Checks if the block can tick. False by default.
	 * @param please
	 * @return
	 */
	public Block suckTit(boolean hard)
    {
		return func_149675_a(hard);
    }

	@SideOnly(Side.CLIENT)
	public IIcon func_149691_a(int par1, int par2)
	{
		return par1 == 1 ? this.top : (par1 == 0 ? this.top : (par2 == 2 && par1 == 2 ? this.front : (par2 == 3 && par1 == 5 ? this.front : (par2 == 0 && par1 == 3 ? this.front : (par2 == 1 && par1 == 4 ? this.front : this.field_149761_L)))));
	}

	public boolean func_149742_c(World world, int par1, int par2, int par3)
	{
		return  world.func_147439_a(par1, par2, par3).isReplaceable(world, par1, par2, par3) && World.func_147466_a(world, par1, par2 - 1, par3);
	}

	public void func_149689_a(World world, int x, int y, int z, EntityLivingBase player, ItemStack item)
	{
		int l = MathHelper.floor_double((double)(player.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
		world.setBlockMetadataWithNotify(x, y, z, l, 2);
	}
	
	@Override
	public boolean func_149727_a(World var1, int var2, int var3, int var4, EntityPlayer player, int var6, float var7, float var8, float var9) {
		if (!player.isSneaking()) {
			//TODO Get certain mob sounds to play on right click
			return true;
		} else {
			return false;
		}
	}

	@SideOnly(Side.CLIENT)
	public void func_149651_a(IIconRegister icon) {
		this.front = icon.registerIcon(this.func_149641_N() + "_front");
		this.top = icon.registerIcon(this.func_149641_N() + "_top");
		this.field_149761_L = icon.registerIcon(this.func_149641_N() + "_side");
	}

	public Block setTextureName(String name){
		return func_149658_d(Reference.PREFIX + name);
	}

	public Block setUnlocalizedName(String name){
		return func_149663_c(name);
	}

	public Block setName(String name){
		this.name = name;
		setTextureName(name);
		setUnlocalizedName(name);
		register();
		return this;
	}

	public String getName(){
		return name;
	}

	public Block register(){
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
		GameRegistry.registerBlock(this, name);
		LanguageRegistry.addName(this, finalName);
		return this;
	}
}