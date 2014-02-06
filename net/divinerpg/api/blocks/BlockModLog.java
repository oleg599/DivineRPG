package net.divinerpg.api.blocks;

import java.util.Random;

import net.divinerpg.Reference;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockModLog extends BlockRotatedPillar{
	
	IIcon top;
	IIcon side;
	String name;
    protected IIcon[] sideChange;
    protected IIcon[] topChange;
    
	private static SoundType woodSound = Block.soundTypeWood;
    private static Material wood = Material.wood;

    public BlockModLog() {
        super(wood);BlockLog
        setHardness(3.0F);
        setCreativeTab(DivineRPGTabs.blocks);
        setSoundType(woodSound);
        LangRegistry.addBlock(this);
    }
    
    public Block setCreativeTab(CreativeTabs name) {
        return func_149647_a(name);
    }
	public Block setSoundType(Block.SoundType name) {
    	return func_149672_a(name);
    }

    @SideOnly(Side.CLIENT)
    public void func_149651_a(IIconRegister icon) {
        side = icon.registerIcon(getTextureName() + "_side");
        top = icon.registerIcon(getTextureName() + "_top");
    }
    
    @Override
    public Item func_149650_a(int par1, Random par2Random, int par3) {
        return Item.func_150898_a(this);
    }
    
    @Override
    public boolean isWood(IBlockAccess world, int x, int y, int z) {
    	return true;
    }
    
    @Override
    public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z) {
    	return true;
    }
    
    public Block setTextureName(String name){
        return func_149658_d(Reference.PREFIX + name);
    }
    
    public Block setUnlocalizedName(String name){
        return func_149663_c(name);
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
        String finalName = firstLetter + inGame;
        System.err.println(finalName);
        GameRegistry.registerBlock(this, name);
    }

    public int func_149745_a(Random par1)
    {
        return 1;
    }

	@Override
	@SideOnly(Side.CLIENT)
	protected IIcon func_150163_b(int var1) {
		return this.sideChange[var1 % this.sideChange.length];
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    protected IIcon func_150161_d(int var1)
    {
        return this.topChange[var1 % this.topChange.length];
    }
	
    public int func_149660_a(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9)
    {
        int var10 = par9 & 3;
        byte var11 = 0;

        switch (par5)
        {
            case 0:
            case 1:
                var11 = 0;
                break;
            case 2:
            case 3:
                var11 = 8;
                break;
            case 4:
            case 5:
                var11 = 4;
        }

        return var10 | var11;
    }
    
    public IIcon getSideIcon(int par1, int par2)
    {
        int var3 = par2 & 12;
        return var3 == 0 && (par1 == 1 || par1 == 0) ? this.top : (var3 == 4 && (par1 == 5 || par1 == 4) ? this.top  : (var3 == 8 && (par1 == 2 || par1 == 3) ? top  : this.side ));
    }

	@Override
	protected IIcon getSideIcon(int var1) {
		// TODO Auto-generated method stub
		return null;
	}
}
