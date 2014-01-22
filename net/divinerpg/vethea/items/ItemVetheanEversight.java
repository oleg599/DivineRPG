package net.divinerpg.vethea.items;

import net.divinerpg.helper.items.VetheanItems;
import net.divinerpg.vethea.entity.projectile.EntityEversightProjectile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemVetheanEversight extends ItemVetheanCannon
{
    public ItemVetheanEversight(int par1) {
        super(par1);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack par1, World par2, EntityPlayer par3)
    {
        if (!par2.isRemote && (par3.capabilities.isCreativeMode || par3.inventory.func_146028_b(VetheanItems.acid)))
        {
            //par2.playSoundAtEntity(par3, Sounds.Blitz, 1.0F, 1.0F);
            par2.spawnEntityInWorld(new EntityEversightProjectile(par2, par3, this.damage));
        }

        return par1;
    }
}
