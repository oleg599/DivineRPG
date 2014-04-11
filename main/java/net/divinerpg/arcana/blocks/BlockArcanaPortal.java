package net.divinerpg.arcana.blocks;

import java.util.List;
import java.util.Random;

import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.arcana.gen.TeleporterArcana;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockArcanaPortal extends BlockMod {
    private int firetick;
    private int firemax = 200;

    public BlockArcanaPortal() {
        super(Material.portal);
        setLightLevel(1.0F);
        setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
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
    public void addCollidingBlockToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity) {}

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    @Override
    public int quantityDropped(Random par1Random) {
        return 0;
    }

    /**
     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
     */
    @Override
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity) {
        if ((par5Entity.ridingEntity == null) && (par5Entity.riddenByEntity == null) && ((par5Entity instanceof EntityPlayerMP)))
        {
            EntityPlayerMP thePlayer = (EntityPlayerMP)par5Entity;
            if (thePlayer.timeUntilPortal > 0)
                thePlayer.timeUntilPortal = 10;
            
            else if (thePlayer.dimension != ConfigurationHelper.Arcana) {
                thePlayer.timeUntilPortal = 10;
                thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, ConfigurationHelper.Arcana, new TeleporterArcana(thePlayer.mcServer.worldServerForDimension(ConfigurationHelper.Arcana)));
            }
            else {
                thePlayer.timeUntilPortal = 10;
                thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0, new TeleporterArcana(thePlayer.mcServer.worldServerForDimension(0)));
            }
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random){

        double var6 = par2 + par5Random.nextFloat();
        double var8 = par3 + 0.8F;
        double var10 = par4 + par5Random.nextFloat();
        par1World.spawnParticle("smoke", var6, var8, var10, 0, 0, 0);
    }

    @Override
    public Item getItem(World w, int x, int y, int z) {
    	return Item.getItemFromBlock(this);
    }
}
