package net.divinerpg.twilight.blocks;

import java.util.Random;

import net.divinerpg.Reference;
import net.divinerpg.helper.DivineRPGTabs;
import net.divinerpg.helper.blocks.TwilightBlocks;
import net.divinerpg.helper.blocks.VanillaBlocks;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.divinerpg.twilight.eden.gen.TeleporterEden;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockEdenPortal extends BlockBreakable
{

    private String name;

    public BlockEdenPortal()
    {
        super(Reference.PREFIX + "edenPortal", Material.field_151567_E, false);
        this.func_149675_a(true);
        func_149647_a(DivineRPGTabs.blocks);
        setName("edenPortal");
        //this.setHardness(-1.0F);
        //this.setStepSound(soundGlassFootstep);
        //this.setLightValue(0.75F);
    }

    /**
     * Ticks the block if it's been scheduled
     */
    @Override
    public void func_149674_a(World world, int par2, int par3, int par4, Random par5Random)
    {
        super.func_149674_a(world, par2, par3, par4, par5Random);
        if (world.provider.isSurfaceWorld())
        {
            int l;
            for (l = par3; !World.func_147466_a(world, par2, l, par4) && l > 0; --l)
            {
                ;
            }
            if (l > 0 && !world.func_147439_a(par2, l + 1, par4).func_149721_r())
            {
                Entity entity = ItemMonsterPlacer.spawnCreature(world, 57, par2 + 0.5D, l + 1.1D, par4 + 0.5D);
                if (entity != null)
                {
                    entity.timeUntilPortal = entity.getPortalCooldown();
                }
            }
        }
    }
    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    @Override
    public AxisAlignedBB func_149668_a(World par1World, int par2, int par3, int par4)
    {
        return null;
    }
    /**
     * Updates the blocks bounds based on its current state. Args: world, x, y, z
     */
    @Override
    public void func_149719_a(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        float f;
        float f1;
        if (par1IBlockAccess.func_147439_a(par2 - 1, par3, par4) != this && par1IBlockAccess.func_147439_a(par2 + 1, par3, par4) != this)
        {
            f = 0.125F;
            f1 = 0.5F;
            this.func_149676_a(0.5F - f, 0.0F, 0.5F - f1, 0.5F + f, 1.0F, 0.5F + f1);
        }
        else
        {
            f = 0.5F;
            f1 = 0.125F;
            this.func_149676_a(0.5F - f, 0.0F, 0.5F - f1, 0.5F + f, 1.0F, 0.5F + f1);
        }
    }
    /**
     * Is this block (a) opaque and (B) a full 1m cube? This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    @Override
    public boolean func_149686_d()
    {
        return false;
    }

    /**
     * Checks to see if this location is valid to create a portal and will return True if it does. Args: world, x, y, z
     */
    public boolean tryToCreatePortal(World par1World, int par2, int par3, int par4) {
        byte b0 = 0;
        byte b1 = 0;
        if (par1World.func_147439_a(par2 - 1, par3, par4) == VanillaBlocks.divineRock || par1World.func_147439_a(par2 + 1, par3, par4) == VanillaBlocks.divineRock)
        {
            b0 = 1;
        }
        if (par1World.func_147439_a(par2, par3, par4 - 1) == VanillaBlocks.divineRock || par1World.func_147439_a(par2, par3, par4 + 1) == VanillaBlocks.divineRock)
        {
            b1 = 1;
        }
        if (b0 == b1)
            return false;
        else
        {
            if (par1World.func_147439_a(par2 - b0, par3, par4 - b1) == null)
            {
                par2 -= b0;
                par4 -= b1;
            }
            int l;
            int i1;
            for (l = -1; l <= 2; ++l)
            {
                for (i1 = -1; i1 <= 3; ++i1)
                {
                    boolean flag = l == -1 || l == 2 || i1 == -1 || i1 == 3;
                    if (l != -1 && l != 2 || i1 != -1 && i1 != 3)
                    {
                        Block j1 = par1World.func_147439_a(par2 + b0 * l, par3 + i1, par4 + b1 * l);
                        if (flag)
                        {
                            if (j1 != VanillaBlocks.divineRock)
                                return false;
                        }
                        else if (j1 != null && j1 != TwilightBlocks.blueFire)
                            return false;
                    }
                }
            }
            for (l = 0; l < 2; ++l)
            {
                for (i1 = 0; i1 < 3; ++i1)
                {
                    par1World.func_147449_b(par2 + b0 * l, par3 + i1, par4 + b1 * l, TwilightBlocks.edenPortal);
                }
            }
            return true;
        }
    }
    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    @Override
    public void func_149695_a(World par1World, int par2, int par3, int par4, Block par5)
    {
        byte b0 = 0;
        byte b1 = 1;
        if (par1World.func_147439_a(par2 - 1, par3, par4) == this || par1World.func_147439_a(par2 + 1, par3, par4) == this)
        {
            b0 = 1;
            b1 = 0;
        }
        int i1;
        for (i1 = par3; par1World.func_147439_a(par2, i1 - 1, par4) == this; --i1)
        {
            ;
        }
        if (par1World.func_147439_a(par2, i1 - 1, par4) != VanillaBlocks.divineRock)
        {
            par1World.func_147449_b(par2, par3, par4, Blocks.air);
        }
        else
        {
            int j1;
            for (j1 = 1; j1 < 4 && par1World.func_147439_a(par2, i1 + j1, par4) == this; ++j1)
            {
                ;
            }
            if (j1 == 3 && par1World.func_147439_a(par2, i1 + j1, par4) == VanillaBlocks.divineRock)
            {
                boolean flag = par1World.func_147439_a(par2 - 1, par3, par4) == this || par1World.func_147439_a(par2 + 1, par3, par4) == this;
                boolean flag1 = par1World.func_147439_a(par2, par3, par4 - 1) == this || par1World.func_147439_a(par2, par3, par4 + 1) == this;
                if (flag && flag1)
                {
                	par1World.func_147449_b(par2, par3, par4, Blocks.air);
                }
                else
                {
                    if ((par1World.func_147439_a(par2 + b0, par3, par4 + b1) != VanillaBlocks.divineRock || par1World.func_147439_a(par2 - b0, par3, par4 - b1) != this) && (par1World.func_147439_a(par2 - b0, par3, par4 - b1) != VanillaBlocks.divineRock || par1World.func_147439_a(par2 + b0, par3, par4 + b1) != this))
                    {
                    	par1World.func_147449_b(par2, par3, par4, Blocks.air);
                    }
                }
            }
            else
            {
            	par1World.func_147449_b(par2, par3, par4, Blocks.air);
            }
        }
    }
    @Override
    @SideOnly(Side.CLIENT)
    /**
     * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
     * coordinates. Args: blockAccess, x, y, z, side
     */
    public boolean func_149646_a(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        if (par1IBlockAccess.func_147439_a(par2, par3, par4) == this)
            return false;
        else
        {
            boolean flag = par1IBlockAccess.func_147439_a(par2 - 1, par3, par4) == this && par1IBlockAccess.func_147439_a(par2 - 2, par3, par4) != this;
            boolean flag1 = par1IBlockAccess.func_147439_a(par2 + 1, par3, par4) == this && par1IBlockAccess.func_147439_a(par2 + 2, par3, par4) != this;
            boolean flag2 = par1IBlockAccess.func_147439_a(par2, par3, par4 - 1) == this && par1IBlockAccess.func_147439_a(par2, par3, par4 - 2) != this;
            boolean flag3 = par1IBlockAccess.func_147439_a(par2, par3, par4 + 1) == this && par1IBlockAccess.func_147439_a(par2, par3, par4 + 2) != this;
            boolean flag4 = flag || flag1;
            boolean flag5 = flag2 || flag3;
            return flag4 && par5 == 4 ? true : (flag4 && par5 == 5 ? true : (flag5 && par5 == 2 ? true : flag5 && par5 == 3));
        }
    }

    @Override
    public int func_149745_a(Random p_149745_1_)
    {
        return 0;
    }
    
    /**
     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
     */
    @Override
    public void func_149670_a(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
        if ((par5Entity.ridingEntity == null) && (par5Entity.riddenByEntity == null) && ((par5Entity instanceof EntityPlayerMP)))
        {
            EntityPlayerMP thePlayer = (EntityPlayerMP)par5Entity;
            if (thePlayer.timeUntilPortal > 0)
            {
                thePlayer.timeUntilPortal = 10;
            }
            else if (thePlayer.dimension != ConfigurationHelper.Eden)
            {
                thePlayer.timeUntilPortal = 10;
                thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, ConfigurationHelper.Eden);
            }
            else {
                thePlayer.timeUntilPortal = 10;
                thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0);
            }
        }
    }
    @Override
    @SideOnly(Side.CLIENT)
    public int func_149701_w()
    {
        return 1;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    public void func_149734_b(World var1, int var2, int var3, int var4, Random var5)
    {
        for (int var6 = 0; var6 < 4; ++var6)
        {
            double var7 = var2 + var5.nextFloat();
            double var9 = var3 + var5.nextFloat();
            double var11 = var4 + var5.nextFloat();
            double var13 = 0.0D;
            double var15 = 0.0D;
            double var17 = 0.0D;
            int var19 = var5.nextInt(2) * 2 - 1;
            var13 = (var5.nextFloat() - 0.5D) * 0.5D;
            var15 = (var5.nextFloat() - 0.5D) * 0.5D;
            var17 = (var5.nextFloat() - 0.5D) * 0.5D;

            if (var1.func_147439_a(var2 - 1, var3, var4) != this && var1.func_147439_a(var2 + 1, var3, var4) != this)
            {
                var7 = var2 + 0.5D + 0.25D * var19;
                var13 = var5.nextFloat() * 2.0F * var19;
            }
            else
            {
                var11 = var4 + 0.5D + 0.25D * var19;
                var17 = var5.nextFloat() * 2.0F * var19;
            }

            //EntityEdenPortalFX var20 = new EntityEdenPortalFX(var1, var7, var9, var11, var13, var15, var17);
            //FMLClientHandler.instance().getClient().effectRenderer.addEffect(var20);
        }
    }

    @Override
    public Item func_149650_a(int par1, Random par2Random, int par3) {
        return Item.func_150898_a(TwilightBlocks.edenPortal);
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
        return setUnlocalizedName(name);
    }
    
    public String getName(){
        return name;
    }
    
    public String getTextureName(){
        return Reference.PREFIX + name;
    }
}