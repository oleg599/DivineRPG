package net.divinerpg.entity.vanilla;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

import net.divinerpg.DivineRPG;
import net.divinerpg.Sounds;
import net.divinerpg.helper.Util;
import net.divinerpg.helper.items.VanillaItemsArmor;
import net.divinerpg.helper.items.VanillaItemsOther;
import net.divinerpg.helper.items.VanillaItemsWeapons;
import net.divinerpg.api.entity.EntityDivineRPGMob;
import net.divinerpg.client.GuiHandler;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.INpc;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAILookAtTradePlayer;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIPlay;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITradePlayer;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
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

public class EntityJackOMan extends EntityVillager implements INpc, IMerchant
{
    private int randomTickDivider;
    private boolean isMating;
    private boolean isPlaying;
    Village villageObj;
    private EntityPlayer buyingPlayer;
    private MerchantRecipeList buyingList;
    private int timeUntilReset;
    private boolean needsInitilization;
    private int wealth;
    EntityDivineRPGMob s;
    private String field_82189_bL;
    private boolean field_82190_bM;
    private float field_82191_bN;
    public static final Map villagerStockList = new HashMap();
    public static final Map blacksmithSellingList = new HashMap();
    private static final ItemStack defaultHeldItem = new ItemStack(VanillaItemsWeapons.scythe, 1);



    public EntityJackOMan(World var1)
    {
        super(var1);
        this.randomTickDivider = 0;
        this.isMating = false;
        this.isPlaying = false;
        this.villageObj = null;
        this.getNavigator().setBreakDoors(true);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityZombie.class, 8.0F, 0.3F, 0.35F));
        this.tasks.addTask(2, new EntityAITradePlayer(this));
        this.tasks.addTask(3, new EntityAILookAtTradePlayer(this));
        this.tasks.addTask(4, new EntityAIMoveIndoors(this));
        this.tasks.addTask(5, new EntityAIRestrictOpenDoor(this));
        this.tasks.addTask(6, new EntityAIOpenDoor(this, true));
        this.tasks.addTask(7, new EntityAIPlay(this, 0.32F));
        this.tasks.addTask(8, new EntityAIWatchClosest2(this, EntityPlayer.class, 3.0F, 1.0F));
        this.tasks.addTask(9, new EntityAIWatchClosest2(this, EntityJackOMan.class, 5.0F, 0.02F));
        this.tasks.addTask(10, new EntityAIWander(this, 0.3F));
        this.tasks.addTask(11, new EntityAIWatchClosest(this, EntityLiving.class, 8.0F));
    }

    
    
    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }

    /**
     * main AI tick function, replaces updateEntityActionState
     */
    protected void updateAITick()
    {
        if (--this.randomTickDivider <= 0)
        {
            this.worldObj.villageCollectionObj.addVillagerPosition(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ));
            this.randomTickDivider = 70 + this.rand.nextInt(50);
            this.villageObj = this.worldObj.villageCollectionObj.findNearestVillage(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ), 32);

            if (this.villageObj == null)
            {
                this.detachHome();
            }
            else
            {
                ChunkCoordinates var1 = this.villageObj.getCenter();
                this.setHomeArea(var1.posX, var1.posY, var1.posZ, (int)((float)this.villageObj.getVillageRadius() * 0.6F));

                if (this.field_82190_bM)
                {
                    this.field_82190_bM = false;
                    this.villageObj.setDefaultPlayerReputation(5);
                }
            }
        }

        if (!this.isTrading() && this.timeUntilReset > 0)
        {
            --this.timeUntilReset;

            if (this.timeUntilReset <= 0)
            {
                if (this.needsInitilization)
                {
                    if (this.buyingList.size() > 1)
                    {
                        Iterator var3 = this.buyingList.iterator();

                        while (var3.hasNext())
                        {
                            MerchantRecipe var2 = (MerchantRecipe)var3.next();

                            if (var2.isRecipeDisabled())
                            {
                                var2.func_82783_a(this.rand.nextInt(6) + this.rand.nextInt(6) + 2);
                            }
                        }
                    }

                    this.addDefaultEquipmentAndRecipies(1);
                    this.needsInitilization = false;

                    if (this.villageObj != null && this.field_82189_bL != null)
                    {
                        this.worldObj.setEntityState(this, (byte)14);
                        this.villageObj.setReputationForPlayer(this.field_82189_bL, 1);
                    }
                }

                this.addPotionEffect(new PotionEffect(Potion.regeneration.id, 200, 0));
            }
        }

        super.updateAITick();
    }

    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    public boolean interact(EntityPlayer var1)
    {
        if (this.isEntityAlive() && !this.isTrading() && !this.isChild())
        {
            if (!this.worldObj.isRemote)
            {
                this.setCustomer(var1);
                
                switch (this.rand.nextInt(4))
            	{
            	case 0:
            		var1.addChatMessage(Util.addChatMessage("Jack'O Man: BOO!"));
            		break;
            	case 1:
            		var1.addChatMessage(Util.addChatMessage("Jack'O Man: I seem to have lost my head."));
            		break;
            	case 2:
            		var1.addChatMessage(Util.addChatMessage("Jack'O Man: HURAH!"));
            		break;
            	case 3:
            		var1.addChatMessage(Util.addChatMessage("Jack'O Man: Have you seen my head?"));
            		break;
            	}
                
                //var1.openGui(DivineRPG.instance, GuiHandler.JACKOMAN, this.worldObj, this.getEntityId(), 0, 0);
                //var1.addStat(AchievementPageDivineRPG.halloweenSpirit, 1); //TODO when achivements
            }

            return true;
        }
        else
        {
            return super.interact(var1);
        }
    }

    protected void entityInit()
    {
        super.entityInit();
    }

    
    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue((float)0.05);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1000);
        
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound var1)
    {
        super.writeEntityToNBT(var1);
        var1.setInteger("Profession", this.getProfession());
        var1.setInteger("Riches", this.wealth);

        if (this.buyingList != null)
        {
            //var1.setCompoundTag("Offers", this.buyingList.getRecipiesAsTags());
        }
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound var1)
    {
        super.readEntityFromNBT(var1);
        this.setProfession(var1.getInteger("Profession"));
        this.wealth = var1.getInteger("Riches");

        if (var1.hasKey("Offers"))
        {
            NBTTagCompound var2 = var1.getCompoundTag("Offers");
            this.buyingList = new MerchantRecipeList(var2);
        }
    }

 
    /**
     * Determines if an entity can be despawned, used on idle far away entities
     */
    protected boolean canDespawn()
    {
        return false;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return s.playSound(Sounds.jackOMan);
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return s.playSound(Sounds.jackOMan);
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return s.playSound(Sounds.jackOMan);
    }

    public void setProfession(int var1)
    {
        this.dataWatcher.updateObject(16, Integer.valueOf(var1));
    }

    public int getProfession()
    {
        return this.dataWatcher.getWatchableObjectInt(16);
    }

    public boolean isMating()
    {
        return this.isMating;
    }

    public void setMating(boolean var1)
    {
        this.isMating = var1;
    }

    public void setPlaying(boolean var1)
    {
        this.isPlaying = var1;
    }

    public boolean isPlaying()
    {
        return this.isPlaying;
    }

    public void setRevengeTarget(EntityLiving var1)
    {
        super.setRevengeTarget(var1);

        if (this.villageObj != null && var1 != null)
        {
            this.villageObj.addOrRenewAgressor(var1);

           

                if (this.isEntityAlive())
                {
                    this.worldObj.setEntityState(this, (byte)13);
                }
            }
        }
    

    public void setCustomer(EntityPlayer var1)
    {
        this.buyingPlayer = var1;
    }

    public EntityPlayer getCustomer()
    {
        return this.buyingPlayer;
    }

    public boolean isTrading()
    {
        return this.buyingPlayer != null;
    }

    public void useRecipe(MerchantRecipe var1)
    {
        var1.incrementToolUses();

        if (var1.hasSameIDsAs((MerchantRecipe)this.buyingList.get(this.buyingList.size() - 1)))
        {
            this.timeUntilReset = 40;
            this.needsInitilization = true;

            if (this.buyingPlayer != null)
            {
                this.field_82189_bL = this.buyingPlayer.getCommandSenderName();
            }
            else
            {
                this.field_82189_bL = null;
            }
        }
        this.wealth += var1.getItemToBuy().stackSize;
    }

    public MerchantRecipeList getRecipes(EntityPlayer var1)
    {
        if (this.buyingList == null)
        {
            this.addDefaultEquipmentAndRecipies(13);
        }

        return this.buyingList;
    }

    private float func_82188_j(float var1)
    {
        float var2 = var1 + this.field_82191_bN;
        return var2 > 0.9F ? 0.9F - (var2 - 0.9F) : var2;
    }

    private void addDefaultEquipmentAndRecipies(int var1)
    {
        if (this.buyingList != null)
        {
            this.field_82191_bN = MathHelper.sqrt_float((float)this.buyingList.size()) * 0.2F;
        }
        else
        {
            this.field_82191_bN = 0.0F;
        }

        MerchantRecipeList var2 = new MerchantRecipeList();

        switch (this.getProfession())
        {
            default:
                var2.add(new MerchantRecipe(new ItemStack(Blocks.pumpkin, 50), new ItemStack(Items.ender_eye, 10), new ItemStack(VanillaItemsArmor.jackOManHelmet)));
                var2.add(new MerchantRecipe(new ItemStack(Blocks.pumpkin, 50), new ItemStack(Items.ender_eye, 10), new ItemStack(VanillaItemsArmor.jackOManBody)));
                var2.add(new MerchantRecipe(new ItemStack(Blocks.pumpkin, 50), new ItemStack(Items.ender_eye, 10), new ItemStack(VanillaItemsArmor.jackOManLegs)));
                var2.add(new MerchantRecipe(new ItemStack(Blocks.pumpkin, 50), new ItemStack(Items.ender_eye, 10), new ItemStack(VanillaItemsArmor.jackOManBoots)));
                var2.add(new MerchantRecipe(new ItemStack(Items.skull, 3, 1), new ItemStack(VanillaItemsArmor.witherReaperHelmet)));
                var2.add(new MerchantRecipe(new ItemStack(Items.skull, 5, 1), new ItemStack(VanillaItemsArmor.witherReaperBody)));
                var2.add(new MerchantRecipe(new ItemStack(Items.skull, 4, 1), new ItemStack(VanillaItemsArmor.witherReaperLegs)));
                var2.add(new MerchantRecipe(new ItemStack(Items.skull, 2, 1), new ItemStack(VanillaItemsArmor.witherReaperBoots)));
                var2.add(new MerchantRecipe(new ItemStack(Items.skull, 6, 1), new ItemStack(Items.ender_eye, 60), new ItemStack(VanillaItemsWeapons.scythe)));

                if (this.buyingList == null)
                {
                    this.buyingList = new MerchantRecipeList();
                }

                for (int var3 = 0; var3 < var1 && var3 < var2.size(); ++var3)
                {
                    this.buyingList.addToListWithCheck((MerchantRecipe)var2.get(var3));
                }
        }
    }

    @SideOnly(Side.CLIENT)
    public void handleHealthUpdate(byte var1)
    {
        if (var1 == 12)
        {
            this.generateRandomParticles("heart");
        }
        else if (var1 == 13)
        {
            this.generateRandomParticles("angryVillager");
        }
        else if (var1 == 14)
        {
            this.generateRandomParticles("happyVillager");
        }
        else
        {
            super.handleHealthUpdate(var1);
        }
    }

    @SideOnly(Side.CLIENT)
    private void generateRandomParticles(String var1)
    {
        for (int var2 = 0; var2 < 5; ++var2)
        {
            double var3 = this.rand.nextGaussian() * 0.02D;
            double var5 = this.rand.nextGaussian() * 0.02D;
            double var7 = this.rand.nextGaussian() * 0.02D;
            this.worldObj.spawnParticle(var1, this.posX + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, this.posY + 1.0D + (double)(this.rand.nextFloat() * this.height), this.posZ + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, var3, var5, var7);
        }
    }

    /**
     * Returns the item that this EntityLiving is holding, if any.
     */
    public ItemStack getHeldItem()
    {
        return defaultHeldItem;
    }

    public void func_82187_q()
    {
        this.field_82190_bM = true;
    }

	public IMerchant leornaInv() {
		return this;
	}
}