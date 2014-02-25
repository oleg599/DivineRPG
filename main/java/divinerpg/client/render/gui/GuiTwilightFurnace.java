package divinerpg.client.render.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import divinerpg.client.render.GuiResourceLocation;
import divinerpg.twilight.blocks.ContainerTwilightFurnace;
import divinerpg.twilight.blocks.TileEntityTwilightFurnace;

@SideOnly(Side.CLIENT)
public class GuiTwilightFurnace extends GuiContainer {
	
    private TileEntityTwilightFurnace furnaceInventory;

    public GuiTwilightFurnace(InventoryPlayer par1InventoryPlayer, TileEntityTwilightFurnace par2TileEntityFurnace) {
        super(new ContainerTwilightFurnace(par1InventoryPlayer, par2TileEntityFurnace));
        this.furnaceInventory = par2TileEntityFurnace;
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(int arg1, int arg2) {
        String s = "Divine Furnace";
        this.fontRendererObj.drawString(s, 10, 6, 4210752);
        this.fontRendererObj.drawString("Inventory", 8, this.ySize - 96 + 2, 4210752);
    }

    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(GuiResourceLocation.twilightFurnace);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        int i1;

        if (this.furnaceInventory.isBurning()) {
            i1 = this.furnaceInventory.getBurnTimeRemainingScaled(12);
            this.drawTexturedModalRect(k + 57, l + 33 + 16 - i1, 176, 12 - i1, 14, i1 + 2);
        }

        i1 = this.furnaceInventory.getCookProgressScaled(24);
        this.drawTexturedModalRect(k + 80, l + 34, 176, 14, i1 + 1, 16);
    }
}
