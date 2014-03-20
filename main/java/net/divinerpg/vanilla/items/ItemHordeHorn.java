package net.divinerpg.vanilla.items;

import net.divinerpg.Sounds;
import net.divinerpg.api.items.ItemMod;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.vanilla.entity.mobs.EntityAyeracoBlue;
import net.divinerpg.vanilla.entity.mobs.EntityAyeracoGreen;
import net.divinerpg.vanilla.entity.mobs.EntityAyeracoPurple;
import net.divinerpg.vanilla.entity.mobs.EntityAyeracoRed;
import net.divinerpg.vanilla.entity.mobs.EntityAyeracoYellow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.Facing;
import net.minecraft.world.World;

public class ItemHordeHorn extends ItemMod {
	private int spawnTick;

    public ItemHordeHorn() {
        this.maxStackSize = 1;
        this.spawnTick = 600;
        this.setCreativeTab(DivineRPGTabs.spawner);
    }

    public boolean onItemUse(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
        if (var3.isRemote) {
            return true;
        } else {
            var4 += Facing.offsetsXForSide[var7];
            var5 += Facing.offsetsYForSide[var7];
            var6 += Facing.offsetsZForSide[var7];
            
            if (var3.provider.dimensionId == 1) {
    			if (this.spawnTick == 600) {
    				var3.playSoundAtEntity(var2, Sounds.ayeracoSpawn, 20.0F, 1.0F);
    				var2.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.GREEN, "The Green Ayeraco had been called upon!"));
    			}
    			else if (this.spawnTick == 430) {
    				var2.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.BLUE, "The Blue Ayeraco has been called upon!"));
    			}
    			else if (this.spawnTick == 280) {
    				var2.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.RED, "The Red Ayeraco has been called upon!"));
    			}
    			else if (this.spawnTick == 210) {
    				var2.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.YELLOW, "The Yellow Ayeraco has been called upon!"));
    			}
    			else if (this.spawnTick == 145) {
    				var2.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.DARK_PURPLE, "The Purple Ayeraco has been called upon!"));
    			}
    			else if (this.spawnTick == 0) {
    				if (this.spawnCreature(var3, var2, var4, var5, var6)) {
    					var2.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.AQUA, "The Ayeraco Horde has arrived!"));
    					var2.inventory.consumeInventoryItem(this);
    		            return true;
    				}
    			}
    			this.spawnTick -= 5;
    		} else {
    	        var2.addChatMessage(DivineAPI.addChatMessage(EnumChatFormatting.AQUA, "The Ayeraco Horde can only be spawned in the End"));
    		}
            return false;
        }
    }
	
    public boolean spawnCreature(World par1, EntityPlayer par2, double par3, double par4, double par5) {
    	EntityAyeracoBlue var1 = new EntityAyeracoBlue(par1);
    	EntityAyeracoGreen var2 = new EntityAyeracoGreen(par1);
    	EntityAyeracoRed var3 = new EntityAyeracoRed(par1);
    	EntityAyeracoYellow var4 = new EntityAyeracoYellow(par1);
    	EntityAyeracoPurple var5 = new EntityAyeracoPurple(par1);

    	var1.setLocationAndAngles(par3 + 15, par4 + 4, par5, par1.rand.nextFloat() * 360.0F, 0.0F);
    	var2.setLocationAndAngles(par3 + 8, par4 + 4, par5 + 8, par1.rand.nextFloat() * 360.0F, 0.0F);
    	var3.setLocationAndAngles(par3 + 5, par4 + 4, par5 - 12, par1.rand.nextFloat() * 360.0F, 0.0F);
    	var4.setLocationAndAngles(par3 - 5, par4 + 4, par5 - 12, par1.rand.nextFloat() * 360.0F, 0.0F);
    	var5.setLocationAndAngles(par3 - 8, par4 + 4, par5 + 8, par1.rand.nextFloat() * 360.0F, 0.0F);
    	
    	/*par1.setBlock((int)(par3 + 15), (int)(par4),(int)(par5), OverworldBlockHelper.ayeracoBeamBlue);
    	par1.setBlock((int)(par3 + 8), (int)(par4),(int)(par5 + 8), OverworldBlockHelper.ayeracoBeamGreen);
    	par1.setBlock((int)(par3 + 5), (int)(par4),(int)(par5 - 12), OverworldBlockHelper.ayeracoBeamRed);
    	par1.setBlock((int)(par3 - 5), (int)(par4),(int)(par5 - 12), OverworldBlockHelper.ayeracoBeamYellow);
    	par1.setBlock((int)(par3 - 8), (int)(par4),(int)(par5 + 8), OverworldBlockHelper.ayeracoBeamPurple);*/
    	
    	var1.initOthers(var2, var3, var4, var5);
    	var2.initOthers(var1, var3, var4, var5);
    	var3.initOthers(var1, var2, var4, var5);
    	var4.initOthers(var1, var2, var3, var5);
    	var5.initOthers(var1, var2, var3, var4);
    	
    	/*var1.setBeamLocation((int)(par3 + 15), (int)(par4),(int)(par5));
    	var2.setBeamLocation((int)(par3 + 8), (int)(par4),(int)(par5 + 8));
    	var3.setBeamLocation((int)(par3 + 5), (int)(par4),(int)(par5 - 12));
    	var4.setBeamLocation((int)(par3 - 5), (int)(par4),(int)(par5 - 12));
    	var5.setBeamLocation((int)(par3 - 8), (int)(par4),(int)(par5 + 8));*/

    	par1.spawnEntityInWorld(var1);
    	par1.spawnEntityInWorld(var2);
    	par1.spawnEntityInWorld(var3);
    	par1.spawnEntityInWorld(var4);
    	par1.spawnEntityInWorld(var5);
        return true;
    }
}