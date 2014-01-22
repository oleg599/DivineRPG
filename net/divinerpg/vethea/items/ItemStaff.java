package net.divinerpg.vethea.items;

import java.util.List;

import net.divinerpg.DivineRPG;
import net.divinerpg.Sounds;
import net.divinerpg.api.items.ItemMod;
import net.divinerpg.helper.DivineRPGTabs;
import net.divinerpg.vethea.entity.EntityBouncingProjectile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemStaff extends ItemMod
{
    protected int damage;
    protected int cost;

    public ItemStaff(int dam, int cos)
    {
        super();
        this.maxStackSize = 1;
        this.damage = dam;
        this.cost = cos;
        this.setCreativeTab(DivineRPGTabs.vethea);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("Deals " + this.damage + " Arcana Damage");
        par3List.add("Bouncing Projectile");
        par3List.add("Consumes " + this.cost + " Arcana");
        par3List.add("\u00a72Vethean");
    }

    @Override
    public ItemStack onItemRightClick(ItemStack par1, World par2, EntityPlayer par3)
    {
        if (!par2.isRemote /*&& ArcanaHelper.useBar(par3, this.cost)*/) {
            //par2.playSoundAtEntity(par3, Sounds.Staff, 1.0F, 1.0F);
            par2.spawnEntityInWorld(new EntityBouncingProjectile(par2, par3, this.damage));
        }
        return par1;
    }
}