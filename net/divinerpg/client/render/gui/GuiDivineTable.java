package net.divinerpg.client.render.gui;

import org.lwjgl.opengl.GL11;

import net.divinerpg.client.render.GuiResourceLocation;
import net.divinerpg.vanilla.blocks.contaner.ContainerDivineTable;
import net.minecraft.client.gui.inventory.GuiBeacon;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiCrafting;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class GuiDivineTable extends GuiContainer {

	public GuiDivineTable(InventoryPlayer par1InventoryPlayer, World par2World, int par3, int par4, int par5) {
		super(new ContainerDivineTable(par1InventoryPlayer, par2World, par3, par4, par5));
	}

	protected void drawGuiContainerForegroundLayer(int par1, int par2) {
		this.field_146289_q.drawString("Divine Crafting Table", 40 + 5, - 10 - 10, 4210752);
		this.field_146289_q.drawString(StatCollector.translateToLocal("container.inventory"), 50 + 14, this.field_147000_g - 96 - 10 - 19, 4210752);
	}
	
	@Override
	protected void func_146976_a(float var1, int var2, int var3) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.field_146297_k.getTextureManager().bindTexture(GuiResourceLocation.divineTable);
		this.field_146999_f = 176;
		this.field_147000_g = 231;
		int k = (this.field_146294_l - this.field_146999_f) / 2;
		int l = (this.field_146295_m - this.field_147000_g) / 2;
		this.drawTexturedModalRect(k, l, 0, 0, this.field_146999_f, this.field_147000_g);
	}
}