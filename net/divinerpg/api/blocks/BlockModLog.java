package net.divinerpg.api.blocks;

import java.util.Random;

import net.divinerpg.Reference;
import net.divinerpg.helper.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

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

    public BlockModLog() {
        super(Material.field_151575_d);
        func_149647_a(DivineRPGTabs.blocks);
        this.func_149672_a(field_149766_f);
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon func_149691_a(int par1, int par2) {
        return par1 == 1 ? top : (par1 == 0 ? top : side);
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
        LanguageRegistry.addName(this, finalName);
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
}
