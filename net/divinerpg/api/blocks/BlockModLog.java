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
        super(wood);
        setHardness(3.0F);
        setCreativeTab(DivineRPGTabs.blocks);
        setStepSound(woodSound);
        LangRegistry.addBlock(this);
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon) {
        side = icon.registerIcon(getTextureName() + "_side");
        top = icon.registerIcon(getTextureName() + "_top");
    }

    @Override
    public boolean isWood(IBlockAccess world, int x, int y, int z) {
    	return true;
    }
    
    @Override
    public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z) {
    	return true;
    }
    
    public Block setName(String name){
        this.name = name;
        setBlockTextureName(Reference.PREFIX + name);
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
        String finalName = firstLetter + inGame;
        GameRegistry.registerBlock(this, name);
    }

    public int func_149745_a(Random par1)
    {
        return 1;
    }

	@SideOnly(Side.CLIENT)
	protected IIcon getTopIcon(int var1) {
		return this.sideChange[var1 % this.sideChange.length];
	}
	
	@SideOnly(Side.CLIENT)
    protected IIcon getSideIcon(int var1)
    {
        return this.topChange[var1 % this.topChange.length];
    }
	
    public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9)
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
    
    public IIcon getIcon(int par1, int par2)
    {
        int var3 = par2 & 12;
        return var3 == 0 && (par1 == 1 || par1 == 0) ? this.top : (var3 == 4 && (par1 == 5 || par1 == 4) ? this.top  : (var3 == 8 && (par1 == 2 || par1 == 3) ? top  : this.side ));
    }
}