package net.divinerpg.api.blocks;

import net.divinerpg.Reference;
import net.divinerpg.helper.blocks.VetheaBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraftforge.common.IPlantable;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockVetheaPlant extends BlockFlower implements IPlantable
{
	private int wut;
	private String name;
	
    public BlockVetheaPlant(int idfk)
    {
        super(idfk);
        this.setTickRandomly(true);
        float var4 = 0.2F;
        this.setBlockBounds(0.5F - var4, 0.0F, 0.5F - var4, 0.5F + var4, var4 * 3.0F, 0.5F + var4);
        wut = idfk;
    }
    
    protected boolean whatGrass(Block par1)
    {
        return par1 == VetheaBlocks.dreamGrass || par1 == VetheaBlocks.dreamDirt;
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
}