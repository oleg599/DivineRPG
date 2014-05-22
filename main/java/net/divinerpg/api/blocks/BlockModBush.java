package net.divinerpg.api.blocks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import net.divinerpg.helper.blocks.IceikaBlocks;
import net.divinerpg.helper.material.EnumBlockType;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockModBush extends BlockMod implements IShearable {

    protected static Map<String, Block> bushMap = new HashMap<String, Block>();

    protected IIcon                     grown, notGrown;
    @SideOnly(Side.CLIENT)
    protected IIcon                     opaqueIcon;
    @SideOnly(Side.CLIENT)
    protected IIcon                     blockIcon;

    protected String                    stateChangeName;
    protected boolean                   isGrown;
    protected Item                      drop;

    public BlockModBush(boolean grown, String name) {
        this(grown, name, "null", null);
    }

    public BlockModBush(boolean grown, String name, Item drop) {
        this(grown, name, "null", drop);
    }

    public BlockModBush(boolean grown, String name, String stateChangeName, Item drop) {
        super(EnumBlockType.LEAVES, name);
        this.isGrown = grown;
        this.stateChangeName = stateChangeName;
        this.drop = drop;
        setHardness(0.3F);
        setTickRandomly(true);
        bushMap.put(name, this);
    }

    @Override
    public void onBlockDestroyedByPlayer(World w, int x, int y, int z, int meta) {
        if (isGrown && stateChangeName != "null") w.setBlock(x, y, z, bushMap.get(stateChangeName));
    }

    @Override
    public void updateTick(World w, int x, int y, int z, Random r) {
        if (r.nextInt(2) == 0 && w.getBlock(x, y, z) == IceikaBlocks.winterberryBush)
            w.setBlock(x, y, z, IceikaBlocks.winterberryBushRipe);
    }

    public void grow(World w, int x, int y, int z) {
        if (!isGrown && stateChangeName != "null")
            w.setBlock(x, y, z, bushMap.get(stateChangeName));
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    //This only checks graphic on start up
    @Override
    public String getTextureName() {
        if (Minecraft.getMinecraft().gameSettings.fancyGraphics)
            return textureName;
        return textureName + "_fast";
    }

    public Item getItemDropped(int par1, Random par2Random, int par3) {
        if (drop != null) return drop;
        return null;
    }

    @Override
    public boolean isShearable(ItemStack item, IBlockAccess world, int x, int y, int z) {
        return true;
    }

    @Override
    public ArrayList<ItemStack> onSheared(ItemStack item, IBlockAccess world, int x, int y, int z, int fortune) {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        ret.add(new ItemStack(this, 1, world.getBlockMetadata(x, y, z) & 3));
        return ret;
    }
}
