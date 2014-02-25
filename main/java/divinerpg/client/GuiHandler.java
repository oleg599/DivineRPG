package divinerpg.client;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import divinerpg.client.render.gui.GuiDivineTable;
import divinerpg.client.render.gui.GuiTwilightFurnace;
import divinerpg.twilight.blocks.ContainerTwilightFurnace;
import divinerpg.twilight.blocks.TileEntityTwilightFurnace;
import divinerpg.vanilla.blocks.contaner.ContainerDivineTable;

public class GuiHandler implements IGuiHandler{

	public static int guiID = 0;
	public static int divineTable = guiID++, twilightFurnace = guiID++;
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(ID == divineTable){
			return new ContainerDivineTable(player.inventory, world, x, y, z);
		}
		if(ID == twilightFurnace){
			return new ContainerTwilightFurnace(player.inventory, (TileEntityTwilightFurnace)entity);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(ID == divineTable){
			return new GuiDivineTable(player.inventory, world, x, y, z);
		}
		if(ID == twilightFurnace){
			return new GuiTwilightFurnace(player.inventory, (TileEntityTwilightFurnace)entity);
		}
		return null;
	}

}
