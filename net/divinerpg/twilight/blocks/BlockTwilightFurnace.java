package net.divinerpg.twilight.blocks;

import java.util.Random;

import net.divinerpg.DivineRPG;
import net.divinerpg.Reference;
import net.divinerpg.client.GuiHandler;
import net.divinerpg.helper.blocks.TwilightBlocks;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTwilightFurnace extends BlockContainer {

	private final Random FurnaceRand = new Random();
	private final boolean isActive;
	private static boolean keepFurnaceInventory;
	@SideOnly(Side.CLIENT)
	private IIcon FurnaceIIconTop;
	@SideOnly(Side.CLIENT)
	private IIcon FurnaceIIconFront;
	
	private String name;
	
	public BlockTwilightFurnace(boolean active) {
		super(Material.field_151576_e);
		isActive = active;
		LangRegistry.addBlock(this);
		if(!active){
			func_149647_a(DivineRPGTabs.blocks);
		}else if(active){
			func_149647_a(null);
		}
	}
	
	@Override
	public boolean func_149727_a(World var1, int var2, int var3, int var4, EntityPlayer player, int var6, float var7, float var8, float var9) {
		if (!player.isSneaking()) {
			player.openGui(DivineRPG.instance, GuiHandler.divineTable, var1, var2, var3, var4);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public TileEntity func_149915_a(World arg0, int arg1) {
		return new TileEntityTwilightFurnace();
	}

	public Item func_149650_a(int par1, Random par2Random, int par3)
	{
		return Item.func_150898_a(TwilightBlocks.twilightFurnace);
	}

	public void func_149726_b(World par1World, int par2, int par3, int par4)
	{
		super.func_149726_b(par1World, par2, par3, par4);
		this.setDefaultDirection(par1World, par2, par3, par4);
	}

	private void setDefaultDirection(World par1World, int par2, int par3, int par4)
	{
		if (!par1World.isRemote)
		{
			Block l = par1World.func_147439_a(par2, par3, par4 - 1);
			Block i1 = par1World.func_147439_a(par2, par3, par4 + 1);
			Block j1 = par1World.func_147439_a(par2 - 1, par3, par4);
			Block k1 = par1World.func_147439_a(par2 + 1, par3, par4);
			byte b0 = 3;

			if (l.func_149730_j() && !i1.func_149730_j())
			{
				b0 = 3;
			}

			if (i1.func_149730_j() && !l.func_149730_j())
			{
				b0 = 2;
			}

			if (j1.func_149730_j() && !k1.func_149730_j())
			{
				b0 = 5;
			}

			if (k1.func_149730_j() && !j1.func_149730_j())
			{
				b0 = 4;
			}

			par1World.setBlockMetadataWithNotify(par2, par3, par4, b0, 2);
		}
	}

	@SideOnly(Side.CLIENT)
	public IIcon func_149691_a(int par1, int par2)
	{
		return par1 == 1 ? this.FurnaceIIconTop : (par1 == 0 ? this.FurnaceIIconTop : (par1 != par2 ? this.field_149761_L : this.FurnaceIIconFront));
	}

	@SideOnly(Side.CLIENT)
	public void func_149651_a(IIconRegister par1IIconRegister) {
		this.field_149761_L = par1IIconRegister.registerIcon(Reference.PREFIX + "divineRock");
		this.FurnaceIIconFront = par1IIconRegister.registerIcon(this.isActive ? Reference.PREFIX + "DivineFurnace_front_On" : Reference.PREFIX + "DivineFurnace_front_Off");
		this.FurnaceIIconTop = par1IIconRegister.registerIcon(Reference.PREFIX + "divineRock");
	}

	public static void updateFurnaceBlockState(boolean par0, World par1World, int par2, int par3, int par4)
	{
		int l = par1World.getBlockMetadata(par2, par3, par4);
		TileEntity tileentity = par1World.func_147438_o(par2, par3, par4);
		keepFurnaceInventory = true;

		if (par0)
		{
			par1World.func_147449_b(par2, par3, par4, TwilightBlocks.twilightFurnaceOn);
		}
		else
		{
			par1World.func_147449_b(par2, par3, par4, TwilightBlocks.twilightFurnace);
		}

		keepFurnaceInventory = false;
		par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);

		if (tileentity != null)
		{
			tileentity.func_145829_t();
			par1World.func_147455_a(par2, par3, par4, tileentity);
		}
	}

	public void func_149689_a(World world, int x, int y, int z, EntityLivingBase living, ItemStack item)
    {
        int l = MathHelper.floor_double((double)(living.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0)
        {
            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }

        if (l == 1)
        {
            world.setBlockMetadataWithNotify(x, y, z, 5, 2);
        }

        if (l == 2)
        {
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }

        if (l == 3)
        {
            world.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }

        if (item.hasDisplayName())
        {
            ((TileEntityTwilightFurnace)world.func_147438_o(x, y, z)).setGuiDisplayName(item.getDisplayName());
        }
    }
	
	@SideOnly(Side.CLIENT)
	@Override
	public void func_149734_b(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		if (this.isActive)
		{
			int l = par1World.getBlockMetadata(par2, par3, par4);
			float f = (float)par2 + 0.5F;
			float f1 = (float)par3 + 0.0F + par5Random.nextFloat() * 6.0F / 16.0F;
			float f2 = (float)par4 + 0.5F;
			float f3 = 0.52F;
			float f4 = par5Random.nextFloat() * 0.6F - 0.3F;

			if (l == 4)
			{
				par1World.spawnParticle("smoke", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
				par1World.spawnParticle("flame", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
			}
			else if (l == 5)
			{
				par1World.spawnParticle("smoke", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
				par1World.spawnParticle("flame", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
			}
			else if (l == 2)
			{
				par1World.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
				par1World.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
			}
			else if (l == 3)
			{
				par1World.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
				par1World.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
			}
		}
	}

	public void func_149749_a(World par1World, int par2, int par3, int par4, Block par5, int par6)
	{
		if (!keepFurnaceInventory)
		{
			TileEntityTwilightFurnace tileentityFurnace = (TileEntityTwilightFurnace)par1World.func_147438_o(par2, par3, par4);

			if (tileentityFurnace != null)
			{
				for (int j1 = 0; j1 < tileentityFurnace.getSizeInventory(); ++j1)
				{
					ItemStack itemstack = tileentityFurnace.getStackInSlot(j1);

					if (itemstack != null)
					{
						float f = this.FurnaceRand.nextFloat() * 0.8F + 0.1F;
						float f1 = this.FurnaceRand.nextFloat() * 0.8F + 0.1F;
						float f2 = this.FurnaceRand.nextFloat() * 0.8F + 0.1F;

						while (itemstack.stackSize > 0)
						{
							int k1 = this.FurnaceRand.nextInt(21) + 10;

							if (k1 > itemstack.stackSize)
							{
								k1 = itemstack.stackSize;
							}

							itemstack.stackSize -= k1;
							EntityItem entityitem = new EntityItem(par1World, (double)((float)par2 + f), (double)((float)par3 + f1), (double)((float)par4 + f2), new ItemStack(itemstack.getItem(), k1, itemstack.getItemDamage()));

							if (itemstack.hasTagCompound())
							{
								entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
							}

							float f3 = 0.05F;
							entityitem.motionX = (double)((float)this.FurnaceRand.nextGaussian() * f3);
							entityitem.motionY = (double)((float)this.FurnaceRand.nextGaussian() * f3 + 0.2F);
							entityitem.motionZ = (double)((float)this.FurnaceRand.nextGaussian() * f3);
							par1World.spawnEntityInWorld(entityitem);
						}
					}
				}

				par1World.func_147453_f(par2, par3, par4, par5);
			}
		}

		super.func_149749_a(par1World, par2, par3, par4, par5, par6);
	}

	public boolean func_149740_M()
	{
		return true;
	}

	public int getComparatorInputOverride(World par1World, int par2, int par3, int par4, int par5)
	{
		return Container.calcRedstoneFromInventory((IInventory)par1World.func_147438_o(par2, par3, par4));
	}

	@SideOnly(Side.CLIENT)
	public Item func_149694_d(World par1World, int par2, int par3, int par4) {
		return Item.func_150898_a(TwilightBlocks.twilightFurnace);
	}
    
    public Block setUnlocalizedName(String name){
        return func_149663_c(name);
    }
    
    public Block setName(String name){
        this.name = name;
        setUnlocalizedName(name);
        register();
        return this;
    }
    
    public String getName(){
        return name;
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
        System.err.println(finalName);
        GameRegistry.registerBlock(this, name);
        LanguageRegistry.addName(this, finalName);
    }

}
