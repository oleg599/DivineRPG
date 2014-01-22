package net.divinerpg.vethea.items;

import java.util.List;

import net.divinerpg.DivineRPG;
import net.divinerpg.api.items.ItemMod;
import net.divinerpg.helper.DivineRPGTabs;
import net.divinerpg.helper.items.VetheanItems;
import net.divinerpg.vethea.entity.EntityVetheanCannonShot;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemVetheanCannon extends ItemMod
{
    protected int damage;

    public ItemVetheanCannon(int dam) {
        super();
        this.maxStackSize = 1;
        this.setMaxDamage(-1);
        this.damage = dam;
        this.setCreativeTab(DivineRPGTabs.vethea);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack par1, World par2, EntityPlayer par3)
    {
        if (!par2.isRemote && par3.capabilities.isCreativeMode || par3.inventory.func_146028_b(VetheanItems.acid)) {
            //par2.playSoundAtEntity(par3, Sounds.Blitz, 1.0F, 1.0F);
            par2.spawnEntityInWorld(new EntityVetheanCannonShot(par2, par3, this.damage));
        }
        return par1;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add(damage + " Ranged Damage");
        par3List.add("Ammo: Acidfire");
        par3List.add("\u00a72Vethean");
    }
}