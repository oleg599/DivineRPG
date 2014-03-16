package net.divinerpg.client;

import net.divinerpg.client.render.gui.GuiDivineTable;
import net.divinerpg.client.render.gui.GuiInfusionTable;
import net.divinerpg.client.render.gui.GuiTwilightFurnace;
import net.divinerpg.twilight.blocks.ContainerTwilightFurnace;
import net.divinerpg.twilight.blocks.TileEntityTwilightFurnace;
import net.divinerpg.vanilla.blocks.contaner.ContainerDivineTable;
import net.divinerpg.vethea.blocks.container.ContainerInfusionTable;
import net.divinerpg.vethea.blocks.tileentity.TileEntityInfusionTable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{

	public static int guiID = 0;
	public static int divineTable = guiID++, twilightFurnace = guiID++, infusionTable = guiID++, hunger = guiID++;
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(ID == divineTable)
			return new ContainerDivineTable(player.inventory, world, x, y, z);
		
		if(ID == twilightFurnace)
			return new ContainerTwilightFurnace(player.inventory, (TileEntityTwilightFurnace)entity);
		
		if(ID == infusionTable)
			return new ContainerInfusionTable(player.inventory, (TileEntityInfusionTable)entity);
		
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
		
		return null;
	}

}
