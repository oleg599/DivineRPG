package divinerpg.vanilla.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import divinerpg.Reference;
import divinerpg.helper.tabs.DivineRPGTabs;
import divinerpg.helper.utils.LangRegistry;

public class MobPumpkin extends BlockDirectional
{

	private String name;
	@SideOnly(Side.CLIENT)
	private IIcon top;
	@SideOnly(Side.CLIENT)
	private IIcon front;
	private static SoundType wood = Block.soundTypeWood;
	private static Material pumpkin = Material.gourd;

	public MobPumpkin() {
		super(pumpkin);
		setTickRandomly(true);
		setHardness(1.0F);
		setCreativeTab(DivineRPGTabs.blocks);
		setSoundType(wood);
		LangRegistry.addBlock(this);
	}

	public Block setSoundType(Block.SoundType name) {
		return setStepSound(name);
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2) {
		return par1 == 1 ? this.top : (par1 == 0 ? this.top : (par2 == 2 && par1 == 2 ? this.front : (par2 == 3 && par1 == 5 ? this.front : (par2 == 0 && par1 == 3 ? this.front : (par2 == 1 && par1 == 4 ? this.front : this.blockIcon)))));
	}

	@Override
	public boolean canPlaceBlockAt(World world, int par1, int par2, int par3) {
		return  world.getBlock(par1, par2, par3).isReplaceable(world, par1, par2, par3) && World.doesBlockHaveSolidTopSurface(world, par1, par2 - 1, par3);
	}

	public void func_149689_a(World world, int x, int y, int z, EntityLivingBase player, ItemStack item)
	{
		int l = MathHelper.floor_double((double)(player.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
		world.setBlockMetadataWithNotify(x, y, z, l, 2);
	}

	@Override
	public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer player, int var6, float var7, float var8, float var9) {
		if (!player.isSneaking()) {
			//TODO Get certain mob sounds to play on right click
			return true;
		} else {
			return false;
		}
	}

	public Block setName(String name){
		this.name = name;
		setBlockName(name);
		setTextureName(name);
		register();
		return this;
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon) {
		this.front = icon.registerIcon(this.getTextureName() + "_front");
		this.top = icon.registerIcon(this.getTextureName() + "_top");
		this.blockIcon = icon.registerIcon(this.getTextureName() + "_side");
	}

	public Block setTextureName(String name){
		return setBlockTextureName(Reference.PREFIX + name);
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
		return this;
	}
}