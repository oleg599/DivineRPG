package divinerpg.vethea.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import divinerpg.api.items.ItemModSword;
import divinerpg.helper.DivineAPI;
import divinerpg.helper.tabs.DivineRPGTabs;

public class ItemVetheanSword extends ItemModSword {
	
	ToolMaterial tool;
    public ItemVetheanSword(ToolMaterial var2){
        super(var2);
        this.setMaxDamage(-1);
        tool = var2;
        this.setCreativeTab(DivineRPGTabs.vethea);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        if (par1ItemStack.getMaxDamage() != -1) {
            par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
        } else {
            par3List.add("Infinite Uses");
        }
        if (this instanceof ItemVetheanClaw) {
            par3List.add("Can not Block");
        }
        par3List.add(DivineAPI.GREEN + "Vethean");
    }
}