package net.divinerpg.twilight.blocks;

import java.util.Random;

import net.divinerpg.Reference;
import net.divinerpg.helper.DivineRPGTabs;
import net.divinerpg.helper.blocks.VanillaBlocks;
import net.divinerpg.helper.blocks.TwilightBlocks;
import net.divinerpg.helper.items.TwilightItems;
import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class TwilightBlock extends Block
{
	
	public TwilightBlock(Material m)
	{
		super(m);
		setCreativeTab(DivineRPGTabs.blocks);
		setSoundType(Block.field_149780_i);
	}
	
	public static Item getBlock(Block b){
		return Item.func_150898_a(b);
	}
	
	public Block setCreativeTab(CreativeTabs name) {
        return func_149647_a(name);
    }
	public Block setSoundType(Block.SoundType name) {
    	return func_149672_a(name);
    }

	public Item func_149650_a(int par1, Random par2, int par3) {
		return (this == TwilightBlocks.edenOre) ? TwilightItems.edenFragments 
				: (this == TwilightBlocks.wildWoodOre) ? TwilightItems.wildWoodFragments 
				: (this == TwilightBlocks.apalachiaOre) ? TwilightItems.apalachiaFragments
				: (this == TwilightBlocks.skythernOre) ? TwilightItems.skythernFragments
				: (this == TwilightBlocks.mortumOre) ? TwilightItems.mortumFragments
				: getBlock(this);
	}

	public int func_149679_a(int par1, Random par2)
	{
		if (par1 > 0 && getBlock(this) != this.func_149650_a(0, par2, par1))
		{
			int j = par2.nextInt(par1 + 2) - 1;

			if (j < 0)
			{
				j = 0;
			}

			return this.func_149745_a(par2) * (j + 1);
		}
		else
		{
			return this.func_149745_a(par2);
		}
	}

	private Random rand = new Random();
    private String name;
	@Override
	public int getExpDrop(IBlockAccess block, int par5, int par7)
	{
		if (this.func_149650_a(par5, rand, par7) != getBlock(this))
		{
			int j1 = 0;

			if(this == TwilightBlocks.edenOre){
				j1 = MathHelper.getRandomIntegerInRange(rand, 0, 4);
			}
			return j1;
		}
		return 0;
	}
	
    public Block setUnlocalizedName(String name){
        return func_149663_c(name);
    }
    
    public Block setTextureName(String name){
        return func_149658_d(Reference.PREFIX + name);
    }
    
    public Block setName(String name){
        this.name = name;
        setTextureName(name);
        setUnlocalizedName(name);
        register();
        return this;
    }
    
    public String getName(){
        return name;
    }
    public Block register(){
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
        GameRegistry.registerBlock(this, name);
        LanguageRegistry.addName(this, finalName);
        return this;
    }
}