package net.divinerpg.client;

import net.divinerpg.client.render.gui.GuiDivineTable;
import net.divinerpg.vanilla.blocks.contaner.ContainerDivineTable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{

	public static int guiID = 0;
	public static int divineTable = guiID++;
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == divineTable){
			return new ContainerDivineTable(player.inventory, world, x, y, z);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == divineTable){
			return new GuiDivineTable(player.inventory, world, x, y, z);
		}
		return null;
	}

}
