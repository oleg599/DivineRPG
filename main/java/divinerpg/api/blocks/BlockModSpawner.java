package divinerpg.api.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import divinerpg.Reference;
import divinerpg.helper.tabs.DivineRPGTabs;

public class BlockModSpawner extends BlockContainer {

	public String mobName, name;
	private boolean isV;

	public BlockModSpawner(String mobName, boolean isVethean) {
		super(Material.rock);
		this.mobName = mobName;
		this.setBlockName(mobName);
		this.setCreativeTab(DivineRPGTabs.spawner);
		isV = isVethean;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int var1) {
		TileEntityMobSpawner spawner = new TileEntityMobSpawner();
		spawner.func_145881_a().setEntityName(mobName);
		return spawner;
	}

	@Override
	public int quantityDropped(Random par1Random) {
		return 0;
	}

	@Override
	public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7) {
		super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);
		int var8 = 15 + par1World.rand.nextInt(15) + par1World.rand.nextInt(15);
		this.dropXpOnBlockBreak(par1World, par2, par3, par4, var8);
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public Item getItem(World par1World, int par2, int par3, int par4) {
		return Item.getItemFromBlock(this);
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

	public String getTextureName(){
		return Reference.PREFIX + name;
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
		GameRegistry.registerBlock(this, name);
	}
}