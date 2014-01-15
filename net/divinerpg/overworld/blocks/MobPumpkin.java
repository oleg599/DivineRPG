package net.divinerpg.overworld.blocks;

import net.divinerpg.Reference;
import net.divinerpg.helper.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MobPumpkin extends BlockDirectional
{
    @SideOnly(Side.CLIENT)
    private IIcon top;
    @SideOnly(Side.CLIENT)
    private IIcon front;

    public MobPumpkin() {
        super(Material.field_151572_C);
        this.func_149675_a(true);
        func_149711_c(1.0F);
        this.func_149647_a(DivineRPGTabs.blocks);
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

    @SideOnly(Side.CLIENT)
    public void func_149651_a(IIconRegister icon) {
        this.front = icon.registerIcon(this.func_149641_N() + "_front");
        this.top = icon.registerIcon(this.func_149641_N() + "_top");
        this.field_149761_L = icon.registerIcon(this.func_149641_N() + "_side");
    }
    
    public Block setTextureName(String name){
        return func_149658_d(Reference.prefix + name);
    }
    
    public Block setUnlocalizedName(String name){
    	return func_149663_c(name);
    }
    
    
}