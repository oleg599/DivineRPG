package net.divinerpg.entity.iceika;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

import net.divinerpg.DivineRPG;
import net.divinerpg.api.entity.EntityDivineRPGVillager;
import net.divinerpg.client.GuiHandler;
import net.divinerpg.helper.Util;
import net.divinerpg.helper.items.IceikaItems;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.INpc;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAILookAtTradePlayer;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITradePlayer;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Tuple;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.village.Village;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityWorkshopMerchant extends EntityDivineRPGVillager {

	public EntityWorkshopMerchant(World var1) {
		super(var1);
	}

	@Override
	public void interact(Util api) {
		switch(this.rand.nextInt(4)) {
		case 0:
			Util.addChatMessage("Merchent: Hohoho.");
			break;
		case 1:
			Util.addChatMessage("Merchent: It's cold outside.");
			break;
		case 2:
			Util.addChatMessage("Merchent: It's cold inside.");
			break;
		case 3:
			Util.addChatMessage("Merchent: Burr!");
			break;
		}
	}

	@Override
	public int guiID() {
		return GuiHandler.merchent;
	}

	@Override
	public void addRecipies(MerchantRecipeList list) {
		list.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 4, 0), new ItemStack(IceikaItems.santaHead, 1, 0)));
		list.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 4, 0), new ItemStack(IceikaItems.santaBody, 1, 0)));
		list.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 4, 0), new ItemStack(IceikaItems.santaLegs, 1, 0)));
		list.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 4, 0), new ItemStack(IceikaItems.santaBoots, 1, 0)));
		list.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 1, 0), new ItemStack(IceikaItems.eggNog, 2, 0)));
		list.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 1, 0), new ItemStack(IceikaItems.chocolateLog, 5, 0)));
		list.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 1, 0), new ItemStack(IceikaItems.peppermints, 15, 0)));
		list.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 1, 0), new ItemStack(IceikaItems.fruitCake, 3, 0)));
		/*list.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 2, 0), new ItemStack(OverworldBlockHelper.BlueLight, 4, 0)));
		list.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 2, 0), new ItemStack(OverworldBlockHelper.GreenLight, 4, 0)));
		list.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 2, 0), new ItemStack(OverworldBlockHelper.RedLight, 4, 0)));
		list.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 2, 0), new ItemStack(OverworldBlockHelper.YellowLight, 4, 0)));
		list.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 2, 0), new ItemStack(OverworldBlockHelper.PurpleLight, 4, 0)));
		list.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 15, 0), new ItemStack(IceikaItems.icicleBane, 1, 0)));
		//list.add(new MerchantRecipe(new ItemStack(IceikaItems.snowFlake, 3, 0), new ItemStack(IceikaBlockHelper.giftBox, 1, 0)));
		list.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 2, 0), new ItemStack(OverworldBlockHelper.RedCane, 4, 0)));
		list.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 2, 0), new ItemStack(OverworldBlockHelper.GreenCane, 4, 0)));
		list.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 2, 0), new ItemStack(OverworldBlockHelper.BlueCane, 4, 0)));
		list.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 2, 1), new ItemStack(OverworldBlockHelper.YellowCane, 4, 0)));
		list.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 2, 1), new ItemStack(OverworldBlockHelper.PurpleCane, 4, 0)));*/
	}
}