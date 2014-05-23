package net.divinerpg.api.blocks;

import net.divinerpg.Reference;
import net.divinerpg.dimension.gen.iceika.TeleporterIceika;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.BlockPortal;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockModPortal extends BlockPortal {
    
    protected String name;
    protected int dimensionID;
    
    public BlockModPortal(String name, int dimensionID){
        super();
        this.name = name;
        this.dimensionID = dimensionID;
        setBlockName(name);
        setBlockTextureName(Reference.PREFIX + name);
        setCreativeTab(DivineRPGTabs.blocks);
        setTickRandomly(true);
        GameRegistry.registerBlock(this, name);
        LangRegistry.addBlock(this);
    }
    
    @Override
    public void registerBlockIcons(IIconRegister icon) {
        this.blockIcon = icon.registerIcon(Reference.PREFIX + name);
    }
    
    @Override
    public void onEntityCollidedWithBlock(World world, int xPos, int yPos, int zPos, Entity entity) {
        if ((entity.ridingEntity == null) && (entity.riddenByEntity == null) && ((entity instanceof EntityPlayerMP))) {

            EntityPlayerMP thePlayer = (EntityPlayerMP) entity;
            if (thePlayer.timeUntilPortal > 0) {
                thePlayer.timeUntilPortal = 10;
            }
            else if (thePlayer.dimension != dimensionID) {
                thePlayer.timeUntilPortal = 10;
                thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, dimensionID, new TeleporterIceika(thePlayer.mcServer.worldServerForDimension(dimensionID)));
            } else {
                thePlayer.timeUntilPortal = 10;
                thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0, new TeleporterIceika(thePlayer.mcServer.worldServerForDimension(0)));
            }
        }
    }

}
