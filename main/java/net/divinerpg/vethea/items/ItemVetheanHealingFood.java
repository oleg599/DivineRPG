package net.divinerpg.vethea.items;

import java.util.List;

import net.divinerpg.helper.DivineAPI;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemVetheanHealingFood extends ItemVetheanFood
{

    private int healthGain;

    public ItemVetheanHealingFood(int par2, float par3, boolean par4, int par5) {
        super(par2, par3);
        this.healthGain = par5;
        this.setAlwaysEdible();
    }

    @Override
    public int getMaxItemUseDuration(ItemStack var1)
    {
        return 16;
    }

    @Override
    public void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer player) {
    	if (player.getHealth() < player.getMaxHealth())
        {
    		player.heal(healthGain);
        }
    }

    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("Replenishes " + this.healthGain + " Health");
        par3List.add(saturation + " Saturation");
        par3List.add("Pet Food: False");
        par3List.add(DivineAPI.GREEN + "Vethean");
    }
}
