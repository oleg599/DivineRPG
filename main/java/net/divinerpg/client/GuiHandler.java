package net.divinerpg.client;

import net.divinerpg.blocks.iceika.ContainerCoalstoneFurnace;
import net.divinerpg.blocks.iceika.TileEntityCoalstoneFurnace;
import net.divinerpg.blocks.twilight.ContainerTwilightFurnace;
import net.divinerpg.blocks.twilight.TileEntityTwilightFurnace;
import net.divinerpg.blocks.vanilla.container.ContainerDivineTable;
import net.divinerpg.blocks.vethea.container.ContainerInfusionTable;
import net.divinerpg.blocks.vethea.container.tile_entity.TileEntityInfusionTable;
import net.divinerpg.client.render.gui.GuiCoalstoneFurnace;
import net.divinerpg.client.render.gui.GuiDivineTable;
import net.divinerpg.client.render.gui.GuiInfusionTable;
import net.divinerpg.client.render.gui.GuiTwilightFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{

	public static int guiID = 0;
	public static int divineTable = guiID++, twilightFurnace = guiID++, infusionTable = guiID++, hunger = guiID++, coalstone = guiID++, tinker = guiID++, merchent = guiID++;
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(ID == divineTable)
			return new ContainerDivineTable(player.inventory, world, x, y, z);
		
		if(ID == twilightFurnace)
			return new ContainerTwilightFurnace(player.inventory, (TileEntityTwilightFurnace)entity);
		
		if(ID == infusionTable)
			return new ContainerInfusionTable(player.inventory, (TileEntityInfusionTable)entity);
		
		if(ID == coalstone)
			return new ContainerCoalstoneFurnace(player.inventory, (TileEntityCoalstoneFurnace)entity);
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(ID == divineTable)
			return new GuiDivineTable(player.inventory, world, x, y, z);
		
		if(ID == twilightFurnace)
			return new GuiTwilightFurnace(player.inventory, (TileEntityTwilightFurnace)entity);
		
		if(ID == infusionTable)
			return new GuiInfusionTable(new ContainerInfusionTable(player.inventory, (TileEntityInfusionTable)entity));
		
		if(ID == coalstone)
			return new GuiCoalstoneFurnace(player.inventory, (TileEntityCoalstoneFurnace)entity);
		
		return null;
	}

}
