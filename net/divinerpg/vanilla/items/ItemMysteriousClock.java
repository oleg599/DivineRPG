package net.divinerpg.vanilla.items;

import net.divinerpg.Reference;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.divinerpg.vanilla.entity.mobs.EntityAncientEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemMysteriousClock extends Item
{
	private World worldObj;
    private String name;

	public ItemMysteriousClock()
	{
		super();
		setMaxStackSize(1);
		setCreativeTab(DivineRPGTabs.spawner);
		setName("myseriousClock");
		LangRegistry.addItem(this);
	}

	/**
	 * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
	 * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
	 */
	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer player, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
		int var4 = 0;
		if(!par3World.isRemote){
			if(player.capabilities.isCreativeMode){
				while(var4 < 1)//1 gets the amount of mobs to spawn at once
				{
					EntityAncientEntity var5 = new EntityAncientEntity(par3World);
					var5.setPosition(par4, par5 +1, par6);
					par3World.spawnEntityInWorld(var5);
					var4++;
				}
			}else{
				while(var4 < 1) {
					EntityAncientEntity var5 = new EntityAncientEntity(par3World);
					var5.setPosition(par4, par5 + 1, par6);
					par3World.spawnEntityInWorld(var5);
					var4++;
					par1ItemStack.stackSize--;
				}
			}
		}
		return true;
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