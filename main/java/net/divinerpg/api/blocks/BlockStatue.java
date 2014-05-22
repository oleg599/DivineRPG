package net.divinerpg.api.blocks;

import net.divinerpg.client.render.block.ModelDivineBlock;
import net.divinerpg.client.render.block.TileEntityStatue;
import net.divinerpg.helper.material.EnumBlockType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class BlockStatue extends BlockMod {

    public ModelDivineBlock model;
    public ResourceLocation texture;
    
    public BlockStatue(String name, ModelDivineBlock model) {
        super(EnumBlockType.CLOTH, name);
        setBlockTextureName("cobblestone");
        this.texture = new ResourceLocation(textureName);
        this.model = model;
    }

    @Override
    public boolean hasTileEntity(int metadata) {
        return true;
    }
    
    @Override
    public TileEntity createTileEntity(World world, int metadata) {
        return new TileEntityStatue(texture, model);
    }
    
    @Override
    public int getRenderType() {
        return -1;
    }
    
    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return false;
    }
    
    @Override
    public void onBlockPlacedBy(World w, int x, int y, int z, EntityLivingBase entity, ItemStack item) {

    	int l = ((MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) + 1) % 4;
        int i1 = w.getBlockMetadata(x, y, z) >> 2;

        if (l == 0)
            w.setBlockMetadataWithNotify(x, y, z, 2 | i1 << 2, 2);

        if (l == 1)
            w.setBlockMetadataWithNotify(x, y, z, 3 | i1 << 2, 2);

        if (l == 2) 
            w.setBlockMetadataWithNotify(x, y, z, 0 | i1 << 2, 2);

        if (l == 3)
            w.setBlockMetadataWithNotify(x, y, z, 1 | i1 << 2, 2);
    }
}