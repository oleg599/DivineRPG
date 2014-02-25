package divinerpg.twilight.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import divinerpg.Reference;
import divinerpg.helper.blocks.TwilightBlocks;
import divinerpg.helper.items.TwilightItemsOther;
import divinerpg.helper.tabs.DivineRPGTabs;
import divinerpg.helper.utils.LangRegistry;

public class TwilightBlock extends Block
{

	public TwilightBlock(Material m)
	{
		super(m);
		setCreativeTab(DivineRPGTabs.blocks);
		setStepSound(Block.soundTypeStone);
		//setBreakSound(Block.soundTypeStone);
		
		if(isOre()){
			setHardness(9.0F);
		}else{
			setHardness(6.0F);
		}
        LangRegistry.addBlock(this);
	}

	public static Item getBlock(Block b){
		return Item.getItemFromBlock(b);
	}

	public boolean isOre(){
		if(this == TwilightBlocks.edenOre|| this == TwilightBlocks.wildWoodOre || this == TwilightBlocks.apalachiaOre ||
				this == TwilightBlocks.skythernOre || this == TwilightBlocks.mortumOre){
			return true;
		}
		return false;
	}

	/**
	 * Sets the item that will be dropped when the block is broken.
	 */
	public Item getItemDropped(int par1, Random par2, int par3) {
		return (this == TwilightBlocks.edenOre) ? TwilightItemsOther.edenFragments 
				: (this == TwilightBlocks.wildWoodOre) ? TwilightItemsOther.wildWoodFragments 
				: (this == TwilightBlocks.apalachiaOre) ? TwilightItemsOther.apalachiaFragments
				: (this == TwilightBlocks.skythernOre) ? TwilightItemsOther.skythernFragments
				: (this == TwilightBlocks.mortumOre) ? TwilightItemsOther.mortumFragments
				: getBlock(this);
	}

	public int func_149679_a(int par1, Random par2)
	{
		if (par1 > 0 && getBlock(this) != this.getItemDropped(0, par2, par1))
		{
			int j = par2.nextInt(par1 + 2) - 1;

			if (j < 0)
			{
				j = 0;
			}

			return this.quantityDropped(par2) * (j + 1);
		}
		else
		{
			return this.quantityDropped(par2);
		}
	}

	private Random rand = new Random();
	private String name;
	@Override
	public int getExpDrop(IBlockAccess block, int par5, int par7)
	{
		if (this.getItemDropped(par5, rand, par7) != getBlock(this))
		{
			int j1 = 0;

			if(this == TwilightBlocks.edenOre){
				j1 = MathHelper.getRandomIntegerInRange(rand, 0, 4);
			}
			return j1;
		}
		return 0;
	}
	
	public Block setTextureName(String name){
		return setBlockTextureName(Reference.PREFIX + name);
	}

	public Block setName(String name){
		this.name = name;
		setTextureName(name);
		setBlockName(name);
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
		return this;
	}
	
    @Override
    public Item getItem(World par1World, int par2, int par3, int par4) {
        return Item.getItemFromBlock(this);
    }
}