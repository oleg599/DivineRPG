package net.divinerpg.twilight.items;

import java.util.List;

import net.divinerpg.Reference;
import net.divinerpg.helper.items.TwilightItems;
import net.divinerpg.twilight.entity.projectile.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemTwilightSlicer extends Item {
	
	String name;
	public ItemTwilightSlicer() {
		super();
	}

	@Override
	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
	{
		if (!var3.capabilities.isCreativeMode)
		{
			--var1.stackSize;
		}

		var2.playSoundAtEntity(var3, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

		if(var1.getItem() == TwilightItems.wildWoodSlicer) {
			var2.spawnEntityInWorld(new EntitySlicerWildWood(var2, var3));
		}

		if(var1.getItem() == TwilightItems.haliteSlicer) {
			var2.spawnEntityInWorld(new EntitySlicerHalite(var2, var3));
		}

		if(var1.getItem() == TwilightItems.skythernSlicer) {
			var2.spawnEntityInWorld(new EntitySlicerSkythern(var2, var3));
		}

		if(var1.getItem() == TwilightItems.edenSlicer) {
			var2.spawnEntityInWorld(new EntitySlicerEden(var2, var3));
		}

		if(var1.getItem() == TwilightItems.mortumSlicer) {
			var2.spawnEntityInWorld(new EntitySlicerMortum(var2, var3));
		}

		if(var1.getItem() == TwilightItems.apalachiaSlicer) {
			var2.spawnEntityInWorld(new EntitySlicerAlapachia(var2, var3));
		}

		return var1;
	}

	@Override
	@SideOnly(Side.CLIENT)

	/**
	 * allows items to add custom lines of information to the mouseover description
	 */
	public void addInformation(ItemStack var1, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		if(var1.getItem() == TwilightItems.wildWoodSlicer)
		{
			par3List.add("18 Ranged Damage");
		}
		if(var1.getItem() == TwilightItems.haliteSlicer)
		{
			par3List.add("42 Ranged Damage");
		}
		if(var1.getItem() == TwilightItems.skythernSlicer)
		{
			par3List.add("28 Ranged Damage");
		}
		if(var1.getItem() == TwilightItems.edenSlicer)
		{
			par3List.add("12 Ranged Damage");
		}
		if(var1.getItem() == TwilightItems.mortumSlicer)
		{
			par3List.add("36 Ranged Damage");
		}
		if(var1.getItem() == TwilightItems.apalachiaSlicer)
		{
			par3List.add("22 Ranged Damage");
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
