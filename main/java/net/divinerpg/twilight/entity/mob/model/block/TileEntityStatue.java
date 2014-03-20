package net.divinerpg.twilight.entity.mob.model.block;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class TileEntityStatue extends TileEntity {
	
    public ResourceLocation texture;
    public ModelDivineBlock model;
    
    public TileEntityStatue() {
        
    }

    public TileEntityStatue(ResourceLocation texture, ModelDivineBlock model) {
        this.model = model;
        this.texture = texture;
    }
}