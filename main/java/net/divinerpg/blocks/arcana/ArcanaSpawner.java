package net.divinerpg.blocks.arcana;

import cpw.mods.fml.common.registry.GameRegistry;
import net.divinerpg.api.blocks.BlockModSpawner;
import net.minecraft.block.Block;

public class ArcanaSpawner extends BlockModSpawner{

	public ArcanaSpawner(String mobName) {
		super(mobName, false);
	}

	@Override
	public Block setName(String name) {
		setTextureName("arcanaSpawner");
		GameRegistry.registerBlock(this, name);
		setBlockName(name);
		return this;
	}
}