package net.divinerpg.entity.iceika;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

import net.divinerpg.DivineRPG;
import net.divinerpg.client.GuiHandler;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.items.IceikaItems;
import net.divinerpg.helper.items.VanillaItemsWeapons;
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

public class EntityWorkshopTickerer extends EntityVillager implements INpc, IMerchant, IMob {
	
    private int randomTickDivider;
    private Village villageObj;
    private EntityPlayer buyingPlayer;
    private MerchantRecipeList buyingList;
    private int timeUntilReset;
    private boolean needsInitilization;
    private int wealth;
    private String field_82189_bL;
    private boolean field_82190_bM;
    private float field_82191_bN;

    public EntityWorkshopTickerer(World var1)  {
        super(var1);
        this.randomTickDivider = 0;
        this.villageObj = null;
        this.getNavigator().setBreakDoors(true);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityZombie.class, 8.0F, 0.3F, 0.35F));
        this.tasks.addTask(1, new EntityAITradePlayer(this));
        this.tasks.addTask(1, new EntityAILookAtTradePlayer(this));
        this.tasks.addTask(2, new EntityAIMoveIndoors(this));
        this.tasks.addTask(3, new EntityAIRestrictOpenDoor(this));
        this.tasks.addTask(4, new EntityAIOpenDoor(this, true));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 0.3F));
        this.tasks.addTask(9, new EntityAIWatchClosest2(this, EntityPlayer.class, 3.0F, 1.0F));
        this.tasks.addTask(9, new EntityAIWander(this, 0.3F));
        this.tasks.addTask(10, new EntityAIWatchClosest(this, EntityLiving.class, 8.0F));
    }
    
    @Override
    protected void applyEntityAttributes() {
    	super.applyEntityAttributes();
    	this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5F);
    }

    @Override
    public boolean isAIEnabled() {
        return true;
    }

    @Override
    protected void updateAITick() {
        if (--this.randomTickDivider <= 0) {
            this.worldObj.villageCollectionObj.addVillagerPosition(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ));
            this.randomTickDivider = 70 + this.rand.nextInt(50);
            this.villageObj = this.worldObj.villageCollectionObj.findNearestVillage(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ), 32);

            if (this.villageObj == null) {
                this.detachHome();
            } else {
                ChunkCoordinates var1 = this.villageObj.getCenter();
                this.setHomeArea(var1.posX, var1.posY, var1.posZ, (int)((float)this.villageObj.getVillageRadius() * 0.6F));

                if (this.field_82190_bM) {
                    this.field_82190_bM = false;
                    this.villageObj.setDefaultPlayerReputation(5);
                }
            }
        }

        if (!this.isTrading() && this.timeUntilReset > 0) {
            --this.timeUntilReset;

            if (this.timeUntilReset <= 0) {
                if (this.needsInitilization) {
                    if (this.buyingList.size() > 1) {
                        Iterator var3 = this.buyingList.iterator();

                        while (var3.hasNext()) {
                            MerchantRecipe var2 = (MerchantRecipe)var3.next();

                            if (var2.isRecipeDisabled()) {
                                var2.func_82783_a(this.rand.nextInt(6) + this.rand.nextInt(6) + 2);
                            }
                        }
                    }

                    this.addDefaultEquipmentAndRecipies(1);
                    this.needsInitilization = false;

                    if (this.villageObj != null && this.field_82189_bL != null) {
                        this.worldObj.setEntityState(this, (byte)14);
                        this.villageObj.setReputationForPlayer(this.field_82189_bL, 1);
                    }
                }

                this.addPotionEffect(new PotionEffect(Potion.regeneration.id, 200, 0));
            }
        }

        super.updateAITick();
    }
 
    @Override
    public boolean interact(EntityPlayer var1) {
        if (this.isEntityAlive() && !this.isTrading() && !this.isChild()) {
            if (!this.worldObj.isRemote) {
                this.setCustomer(var1);

                switch (this.rand.nextInt(4)) {
                    case 0:
                        DivineAPI.addChatMessage("Tinkerer: Hohoho.");
                        break;
                    case 1:
                    	DivineAPI.addChatMessage("Tinkerer: It's cold outside.");
                        break;
                    case 2:
                    	DivineAPI.addChatMessage("Tinkerer: It's cold inside.");
                        break;
                    case 3:
                    	DivineAPI.addChatMessage("Tinkerer: Burr!");
                        break;
                }

                var1.openGui(DivineRPG.instance, GuiHandler.tinker, this.worldObj, getEntityId(), 0, 0);
            }
            return true;
        } else {
            return super.interact(var1);
        }
    }
 
    @Override
    public void writeEntityToNBT(NBTTagCompound var1) {
        super.writeEntityToNBT(var1);
        var1.setInteger("Profession", this.getProfession());
        var1.setInteger("Riches", this.wealth);

        if (this.buyingList != null) {
            var1.setTag("Offers", this.buyingList.getRecipiesAsTags());
        }
    }
 
    @Override
    public void readEntityFromNBT(NBTTagCompound var1) {
        super.readEntityFromNBT(var1);
        this.setProfession(var1.getInteger("Profession"));
        this.wealth = var1.getInteger("Riches");

        if (var1.hasKey("Offers")) {
            NBTTagCompound var2 = var1.getCompoundTag("Offers");
            this.buyingList = new MerchantRecipeList(var2);
        }
    }

    @Override
    public void useRecipe(MerchantRecipe var1) {
        var1.incrementToolUses();

        if (var1.hasSameIDsAs((MerchantRecipe)this.buyingList.get(this.buyingList.size() - 1))) {
            this.timeUntilReset = 40;
            this.needsInitilization = true;

            if (this.buyingPlayer != null) {
                this.field_82189_bL = this.buyingPlayer.getCommandSenderName();
            } else {
                this.field_82189_bL = null;
            }
        }

        if (var1.getItemToBuy().getItem() == IceikaItems.snowflake) {
            this.wealth += var1.getItemToBuy().stackSize;
        }
    }

    private void addDefaultEquipmentAndRecipies(int var1) {
        if (this.buyingList != null) {
            this.field_82191_bN = MathHelper.sqrt_float(this.buyingList.size()) * 0.2F;
        } else {
            this.field_82191_bN = 0.0F;
        }

        MerchantRecipeList var2 = new MerchantRecipeList();

        switch(this.getProfession()) {
            default:
                var2.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 1, 1), new ItemStack(VanillaItemsWeapons.shuriken, 16, 0), new ItemStack(IceikaItems.snowflakeShuriken, 16, 0)));
                var2.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 4, 1), new ItemStack(VanillaItemsWeapons.serenadeStriker, 1, 0), new ItemStack(IceikaItems.serenadeOfIce, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 7, 1), new ItemStack(VanillaItemsWeapons.slimeSword, 1, 0), new ItemStack(IceikaItems.glacierSword, 1, 0)));
                //var2.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 12, 1), new ItemStack(VanillaItemsWeapons.shadowBow, 1, 0),new ItemStack(IceikaItems.icicleBow, 1, 0)));
                //var2.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 12, 1), new ItemStack(VanillaItemsWeapons.crabClawCannon, 1, 0),new ItemStack(IceikaItems.frostClawCannon, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 12, 1), new ItemStack(VanillaItemsWeapons.frostCannon, 1, 0),new ItemStack(IceikaItems.fractiteCannon, 1, 0)));
                //var2.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 15, 1),new ItemStack(VanillaItemsWeapons.frostSword, 1, 0), new ItemStack(IceikaItems.frostKingSword, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 18, 1), new ItemStack(IceikaItems.soundOfMusic, 1, 0), new ItemStack(IceikaItems.soundOfCarols, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 25, 1), new ItemStack(VanillaItemsWeapons.enderSword, 1, 0), new ItemStack(IceikaItems.enderice, 1, 0)));
                //var2.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 30, 1), new ItemStack(VanillaItemsWeapons.bluefirebow, 1, 0), new ItemStack(IceikaItems.snowStormBow, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 45, 1), new ItemStack(VanillaItemsWeapons.bedrockMaul, 1, 0), new ItemStack(IceikaItems.frozenMaul, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 40, 1), new ItemStack(VanillaItemsWeapons.divineSword, 1, 0), new ItemStack(IceikaItems.icineSword, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(IceikaItems.snowflake, 15, 1), new ItemStack(VanillaItemsWeapons.sandslash, 1, 0), new ItemStack(IceikaItems.snowSlash, 1, 0)));

                if (this.buyingList == null) {
                    this.buyingList = new MerchantRecipeList();
                }

                for (int var3 = 0; var3 < var1 && var3 < var2.size(); ++var3) {
                    this.buyingList.addToListWithCheck((MerchantRecipe)var2.get(var3));
                }
        }
    }
}