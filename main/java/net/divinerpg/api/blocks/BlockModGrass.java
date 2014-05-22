package net.divinerpg.api.blocks;

import java.util.Random;

import net.divinerpg.Reference;
import net.divinerpg.helper.Util;
import net.divinerpg.helper.material.EnumBlockType;
import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockModGrass extends BlockMod implements IGrowable {

    protected IIcon top;
    protected IIcon bottom;
    protected IIcon side;
    protected Block grass;
    protected Block dirt;

    public BlockModGrass(Block Grass, Block Dirt, String name) {
        super(EnumBlockType.GRASS, name + "Grass");
        this.textureName = Reference.PREFIX + name;
        setBlockTextureName(textureName);
        setTickRandomly(true);
        grass = Grass;
        dirt = Dirt;
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int intSide, int meta) {
        return intSide == 1 ? top : (intSide == 0 ? bottom : side);
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon) {
        side = icon.registerIcon(textureName + "Grass_side");
        top = icon.registerIcon(textureName + "Grass_top");
        bottom = icon.registerIcon(textureName + "Dirt");
    }

    @Override
    public void updateTick(World world, int x, int y, int z, Random random) {
        if (!world.isRemote) {
            if (world.getBlockLightValue(x, y + 1, z) < 4 && world.getBlockLightOpacity(x, y + 1, z) > 2) world.setBlock(x, y, z, dirt);
            else if (world.getBlockLightValue(x, y + 1, z) >= 9) {
                for (int l = 0; l < 4; ++l) {
                    int i1 = x + random.nextInt(3) - 1;
                    int j1 = y + random.nextInt(5) - 3;
                    int k1 = z + random.nextInt(3) - 1;

//                    if (world.getBlock(i1, j1, k1) == dirt && world.getBlockLightValue(i1, j1 + 1, k1) >= 4 
//                            && world.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
//                        world.setBlock(i1, j1, k1, grass);
                }
            }
        }
    }

    @Override
    public Item getItemDropped(int par1, Random par2Random, int par3) {
        return Util.toItem(dirt);
    }

    @Override
    public boolean canSustainPlant(IBlockAccess world, int x, int y, int z, ForgeDirection direction, IPlantable plantable) {
        return true;
    }

    public boolean func_149851_a(World world, int x, int y, int z, boolean flag) {
        return true;
    }

    public boolean func_149852_a(World world, Random rand, int x, int y, int z) {
        return true;
    }

    @Override
    public void func_149853_b(World world, Random rand, int x, int y, int z) {}
}
