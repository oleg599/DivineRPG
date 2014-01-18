package net.divinerpg.twilight.items;

import java.util.List;

import net.divinerpg.Reference;
import net.divinerpg.helper.items.TwilightItems;
import net.divinerpg.twilight.entity.projectile.EntityPhaserApalachia;
import net.divinerpg.twilight.entity.projectile.EntityPhaserEden;
import net.divinerpg.twilight.entity.projectile.EntityPhaserHalite;
import net.divinerpg.twilight.entity.projectile.EntityPhaserMortum;
import net.divinerpg.twilight.entity.projectile.EntityPhaserSkythern;
import net.divinerpg.twilight.entity.projectile.EntityPhaserWildWood;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemTwilightPhaser extends Item
{
	private int damage;
	private int firetick;
	private int firemax;
	private String firesound;
	private String reloadsound;
	String name;

	public ItemTwilightPhaser(int var2, int var3)
	{
		super();
		this.damage = var2;
        this.firemax = var3;
        this.firetick = this.firemax;
        //this.firesound = this.firesound;
        //this.reloadsound = this.firesound;
        this.firesound = "";
        this.reloadsound = "";
        this.setMaxStackSize(1);
        this.setMaxDamage(3000);
	}

	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	@Override
	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
	{
		if(!var2.isRemote)
		{
			if (this.firetick == this.firemax && this.firemax != 0)
			{
				if(var1.getItem() == TwilightItems.skythernPhaser)
				{
					var2.playSoundAtEntity(var3, this.firesound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityPhaserSkythern(var2, var3));
					var1.damageItem(1, var3);
				}

				if(var1.getItem() == TwilightItems.halitePhaser)
				{
					var2.playSoundAtEntity(var3, this.firesound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityPhaserHalite(var2, var3));
					var1.damageItem(1, var3);
				}

				if(var1.getItem() == TwilightItems.wildWoodPhaser)
				{
					var2.playSoundAtEntity(var3, this.firesound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityPhaserWildWood(var2, var3));
					var1.damageItem(1, var3);
				}

				if(var1.getItem() == TwilightItems.edenPhaser)
				{
					var2.playSoundAtEntity(var3, this.firesound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityPhaserEden(var2, var3));
					var1.damageItem(1, var3);
				}

				if(var1.getItem() == TwilightItems.mortumPhaser)
				{
					var2.playSoundAtEntity(var3, this.firesound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityPhaserMortum(var2, var3));
					var1.damageItem(1, var3);
				}

				if(var1.getItem() == TwilightItems.apalachiaPhaser)
				{
					var2.playSoundAtEntity(var3, this.firesound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityPhaserApalachia(var2, var3));
					var1.damageItem(1, var3);
				}
                this.firetick = 0;
			}
			else
			{
				++this.firetick;
			}

			if (this.firemax == 0)
			{
				if(var1.getItem() == TwilightItems.skythernPhaser)
				{
					var2.playSoundAtEntity(var3, this.firesound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityPhaserSkythern(var2, var3));
					var1.damageItem(1, var3);
				}

				if(var1.getItem() == TwilightItems.halitePhaser)
				{
					var2.playSoundAtEntity(var3, this.firesound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityPhaserHalite(var2, var3));
					var1.damageItem(1, var3);
				}

				if(var1.getItem() == TwilightItems.wildWoodPhaser)
				{
					var2.playSoundAtEntity(var3, this.firesound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityPhaserWildWood(var2, var3));
					var1.damageItem(1, var3);
				}

				if(var1.getItem() == TwilightItems.edenPhaser)
				{
					var2.playSoundAtEntity(var3, this.firesound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityPhaserEden(var2, var3));
					var1.damageItem(1, var3);
				}

				if(var1.getItem() == TwilightItems.mortumPhaser)
				{
					var2.playSoundAtEntity(var3, this.firesound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityPhaserMortum(var2, var3));
					var1.damageItem(1, var3);
				}

				if(var1.getItem() == TwilightItems.apalachiaPhaser)
				{
					var2.playSoundAtEntity(var3, this.firesound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityPhaserApalachia(var2, var3));
					var1.damageItem(1, var3);
				}
			}

		}
		return var1;
	}

	/**
	 * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
	 */
	@Override
	public void onPlayerStoppedUsing(ItemStack var1, World var2, EntityPlayer var3, int var4)
	{
		this.firetick = this.firemax;
	}

	@Override
	@SideOnly(Side.CLIENT)

	/**
	 * Returns True is the item is renderer in full 3D when hold.
	 */
	public boolean isFull3D()
	{
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack item, EntityPlayer player, List list, boolean par4)
	{
		if(item.getItem() == TwilightItems.halitePhaser)
		{
			list.add("51 Ranged Damage");
			list.add(item.getMaxDamage() - item.getItemDamage() + " Uses");
		}

		if(item.getItem() == TwilightItems.wildWoodPhaser)
		{
			list.add("30 Ranged Damage");
			list.add(item.getMaxDamage() - item.getItemDamage() + " Uses");
		}

		if(item.getItem() == TwilightItems.skythernPhaser)
		{
			list.add("41 Ranged Damage");
			list.add(item.getMaxDamage() - item.getItemDamage() + " Uses");
		}

		if(item.getItem() == TwilightItems.edenPhaser)
		{
			list.add("24 Ranged Damage");
			list.add(item.getMaxDamage() - item.getItemDamage() + " Uses");
		}

		if(item.getItem() == TwilightItems.mortumPhaser)
		{
			list.add("46 Ranged Damage");
			list.add(item.getMaxDamage() - item.getItemDamage() + " Uses");
		}

		if(item.getItem() == TwilightItems.apalachiaPhaser)
		{
			list.add("35 Ranged Damage");
			list.add(item.getMaxDamage() - item.getItemDamage() + " Uses");
		}
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
