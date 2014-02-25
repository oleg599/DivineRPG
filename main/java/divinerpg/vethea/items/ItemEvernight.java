package divinerpg.vethea.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import divinerpg.helper.DivineAPI;
import divinerpg.vethea.entity.projectile.EntityEvernightProjectile;

public class ItemEvernight extends ItemStaff
{

    public ItemEvernight(int par2, int par3) {
        super(par2, par2);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("Deals " + this.damage + " Arcana Damage");
        par3List.add("Bouncing Projectile");
        par3List.add("Consumes All Of Your Arcana");
        par3List.add(DivineAPI.GREEN + "Vethean");
    }

    @Override
    public ItemStack onItemRightClick(ItemStack par1, World par2, EntityPlayer par3)
    {
        if (!par2.isRemote /*&& ArcanaHelper.useBar(par3, this.cost)*/)
        {
            par3.attackEntityFrom(new EntityDamageSourceIndirect("arcana", par3, par3).setMagicDamage(), 16);
            //par2.playSoundAtEntity(par3, Sounds.Staff, 1.0F, 1.0F);
            par2.spawnEntityInWorld(new EntityEvernightProjectile(par2, par3, this.damage));
        }
        return par1;
    }
}