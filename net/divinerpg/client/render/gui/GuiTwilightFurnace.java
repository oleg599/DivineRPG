package net.divinerpg.client.render.gui;

import net.divinerpg.client.render.GuiResourceLocation;
import net.divinerpg.twilight.blocks.ContainerTwilightFurnace;
import net.divinerpg.twilight.blocks.TileEntityTwilightFurnace;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiTwilightFurnace extends GuiContainer
{
    private TileEntityTwilightFurnace furnaceInventory;

    public GuiTwilightFurnace(InventoryPlayer par1InventoryPlayer, TileEntityTwilightFurnace par2TileEntityFurnace)
    {
        super(new ContainerTwilightFurnace(par1InventoryPlayer, par2TileEntityFurnace));
        this.furnaceInventory = par2TileEntityFurnace;
    }
    
    protected void func_146979_b(int arg1, int arg2) {
        String s = "Divine Furnace";
        this.field_146289_q.drawString(s, 10, 6, 4210752);
        this.field_146289_q.drawString("Inventory", 8, this.field_147000_g - 96 + 2, 4210752);
    }

    protected void func_146976_a(float par1, int par2, int par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.field_146297_k.getTextureManager().bindTexture(GuiResourceLocation.twilightFurnace);
        int k = (this.field_146294_l - this.field_146999_f) / 2;
        int l = (this.field_146295_m - this.field_147000_g) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.field_146999_f, this.field_147000_g);
        int i1;

        if (this.furnaceInventory.isBurning())
        {
            i1 = this.furnaceInventory.getBurnTimeRemainingScaled(12);
            this.drawTexturedModalRect(k + 140, l + 60 + 12 - i1, 176, 12 - i1, 14, i1 + 2);
        }

        i1 = this.furnaceInventory.getCookProgressScaled(24);
        this.drawTexturedModalRect(k + 96, l + 34, 176, 14, i1 + 1, 16);
    }
}
