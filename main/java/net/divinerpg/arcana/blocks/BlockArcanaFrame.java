package net.divinerpg.arcana.blocks;

import java.util.List;
import java.util.Random;

import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.helper.blocks.ArcanaBlocks;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockArcanaFrame extends BlockMod {
    public BlockArcanaFrame() {
        super(Material.rock);
        setCreativeTab(DivineRPGTabs.blocks);
        setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube() {
        return false;
    }

    /**
     * if the specified block is in the given AABB, add its collision bounding box to the given list
     */
    public void addCollidingBlockToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity) {
        super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
        this.setBlockBoundsForItemRender();
    }

    /**
     * checks if an ender eye has been inserted into the frame block. parameters: metadata
     */
    public static boolean isEnderEyeInserted(int par0) {
        return (par0 & 4) != 0;
    }

    @Override
    public Item getItemDropped(int i, Random r, int j) {
    	return Item.getItemFromBlock(this);
    }

    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving) {
        int var6 = ((MathHelper.floor_double(par5EntityLiving.rotationYaw * 4.0F / 360.0F + 0.5D) & 3) + 2) % 4;
        par1World.setBlockMetadataWithNotify(par2, par3, par4, var6, 3);
    }

    @Override
    public void onBlockAdded(World var1, int var2, int var3, int var4) {
        if (var1.getBlock(var2, var3, var4) == this && var1.getBlock(var2, var3, var4 + 1) == this
                && var1.getBlock(var2, var3, var4 + 2) == this && var1.getBlock(var2 + 1, var3, var4 + 3) == this
                && var1.getBlock(var2 + 2, var3, var4 + 3) == this && var1.getBlock(var2 + 3, var3, var4 + 3) == this
                && var1.getBlock(var2 + 4, var3, var4) == this && var1.getBlock(var2 + 4, var3, var4 + 1) == this
                && var1.getBlock(var2 + 4, var3, var4 + 2) == this
                && var1.getBlock(var2 + 1, var3, var4 - 1) == this && var1.getBlock(var2 + 2, var3, var4 - 1) == this
                && var1.getBlock(var2 + 3, var3, var4 - 1) == this) {
        	
            var1.setBlock(var2 + 1, var3, var4, ArcanaBlocks.arcanaPortal);
            var1.setBlock(var2 + 2, var3, var4, ArcanaBlocks.arcanaPortal);
            var1.setBlock(var2 + 3, var3, var4, ArcanaBlocks.arcanaPortal);
            var1.setBlock(var2 + 1, var3, var4 + 1, ArcanaBlocks.arcanaPortal);
            var1.setBlock(var2 + 2, var3, var4 + 1, ArcanaBlocks.arcanaPortal);
            var1.setBlock(var2 + 3, var3, var4 + 1, ArcanaBlocks.arcanaPortal);
            var1.setBlock(var2 + 1, var3, var4 + 2, ArcanaBlocks.arcanaPortal);
            var1.setBlock(var2 + 2, var3, var4 + 2, ArcanaBlocks.arcanaPortal);
            var1.setBlock(var2 + 3, var3, var4 + 2, ArcanaBlocks.arcanaPortal);
        }
    }
}
