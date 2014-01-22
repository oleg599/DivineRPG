package net.divinerpg.twilight.items;

import java.util.List;

import net.divinerpg.Reference;
import net.divinerpg.helper.DivineRPGTabs;
import net.divinerpg.helper.items.TwilightItems;
import net.divinerpg.twilight.entity.projectile.EntityBlitzAlapachia;
import net.divinerpg.twilight.entity.projectile.EntityBlitzEden;
import net.divinerpg.twilight.entity.projectile.EntityBlitzHalite;
import net.divinerpg.twilight.entity.projectile.EntityBlitzMortum;
import net.divinerpg.twilight.entity.projectile.EntityBlitzSkythern;
import net.divinerpg.twilight.entity.projectile.EntityBlitzWildWood;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemTwilightBlitz extends Item {
	private String sound, name;
	private int damage;
	private String ammoType;
	public ItemTwilightBlitz(int damage, String ammoType)
	{
		super();
		this.maxStackSize = 1;
		sound = "";
		this.setMaxDamage(-1);
		this.setCreativeTab(DivineRPGTabs.ranged);
		this.damage = damage;
		this.ammoType = ammoType;
	}

	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
	{
		boolean var4 = var3.capabilities.isCreativeMode;

		if (!var4 && !var3.inventory.func_146028_b(TwilightItems.wildWoodDust))
		{
			return var1;
		}
		else
		{
			if(var1.getItem() == TwilightItems.wildWoodBlitz)
			{
				if(!var2.isRemote)
				{
					var2.playSoundAtEntity(var3, sound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityBlitzWildWood(var2, var3));
				}
				var3.inventory.func_146026_a(TwilightItems.wildWoodDust);
			}
		}

		if (!var4 && !var3.inventory.func_146028_b(TwilightItems.mortumDust))
		{
			return var1;
		}
		else
		{
			if(var1.getItem() == TwilightItems.haliteBlitz)
			{
				if(!var2.isRemote)
				{
					var2.playSoundAtEntity(var3, sound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityBlitzHalite(var2, var3));
				}
				var3.inventory.func_146026_a(TwilightItems.mortumDust);
			}

			if(var1.getItem() == TwilightItems.mortumBlitz)
			{
				if(!var2.isRemote)
				{
					var2.playSoundAtEntity(var3, sound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityBlitzMortum(var2, var3));
				}
				var3.inventory.func_146026_a(TwilightItems.mortumDust);
			}
		}

		if (!var4 && !var3.inventory.func_146028_b(TwilightItems.apalachiaDust))
		{
			return var1;
		}
		else
		{
			if(var1.getItem() == TwilightItems.apalachiaBlitz)
			{
				if(!var2.isRemote)
				{
					var2.playSoundAtEntity(var3, sound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityBlitzAlapachia(var2, var3));
				}
				var3.inventory.func_146026_a(TwilightItems.apalachiaDust);
			}
		}

		if (!var4 && !var3.inventory.func_146028_b(TwilightItems.skythernDust))
		{
			return var1;
		}
		else
		{
			if(var1.getItem() == TwilightItems.skythernBlitz)
			{
				if(!var2.isRemote)
				{
					var2.playSoundAtEntity(var3, sound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityBlitzSkythern(var2, var3));
				}
				var3.inventory.func_146026_a(TwilightItems.skythernDust);
			}
		}

		if (!var4 && !var3.inventory.func_146028_b(TwilightItems.edenDust))
		{
			return var1;
		}
		else
		{
			if(var1.getItem() == TwilightItems.edenBlitz)
			{
				if(!var2.isRemote)
				{
					var2.playSoundAtEntity(var3, sound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityBlitzEden(var2, var3));
				}
				var3.inventory.func_146026_a(TwilightItems.edenDust);
			}
		}
		var1.damageItem(1, var3);
		return var1;
	}

	@Override
	@SideOnly(Side.CLIENT)

	/**
	 * allows items to add custom lines of information to the mouseover description
	 */
	public void addInformation(ItemStack var1, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
	    par3List.add(damage + " Ranged Damage");
	    par3List.add("Ammo: " + ammoType);
		par3List.add("Infinite Uses");
	}
	
	public Item setTextureName(String par1Str)
    {
        this.iconString = (Reference.PREFIX + par1Str);
        return this;
    }
	
	public Item setName(String name){
	    this.name = name;
	    setTextureName(name);
	    setUnlocalizedName(name);
	    register();
	    return this;
	}
	
    public void register(){
        int numChars = 0;
        char firstLetter = name.charAt(0);
        if(Character.isLowerCase(firstLetter))
            firstLetter = Character.toUpperCase(firstLetter);
        String inGame = name.substring(1);
        for(int k = 0; k < name.length(); k++){
            char c = name.charAt(k);
            int code = (int) c;
            
            if(k != 0){
                for(int p = 65; p < 90; p++){
                    if(code == p){
                        numChars++;
                        if(numChars == 1)
                            inGame = new StringBuffer(inGame).insert(k - 1, " ").toString();
                        else
                            inGame = new StringBuffer(inGame).insert(k, " ").toString();
                    }
                }
            }
        }
        String finalName = firstLetter + inGame;
        GameRegistry.registerItem(this, name);
        LanguageRegistry.addName(this, finalName);
    }
}
