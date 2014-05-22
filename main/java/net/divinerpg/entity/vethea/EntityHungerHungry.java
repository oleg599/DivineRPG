package net.divinerpg.entity.vethea;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

import net.divinerpg.DivineRPG;
import net.divinerpg.client.GuiHandler;
import net.divinerpg.helper.Util;
import net.divinerpg.helper.blocks.VetheaBlocks;
import net.divinerpg.helper.items.VetheanItems;
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
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
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

public class EntityHungerHungry extends EntityVillager implements INpc, IMerchant, IMob
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
    private String field_82189_bL;
    private boolean field_82190_bM;
    private float field_82191_bN;
    public static final Map villagerStockList = new HashMap();
    public static final Map blacksmithSellingList = new HashMap();

    public EntityHungerHungry(World var1)
    {
        this(var1, 0);
    }

    public EntityHungerHungry(World var1, int var2)
    {
        super(var1);
        this.randomTickDivider = 0;
        this.isMating = false;
        this.isPlaying = false;
        this.villageObj = null;
        double moveSpeed = 0.5F;
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

    /**
     * Returns true if the newer Entity AI code should be run
     */
    @Override
    public boolean isAIEnabled()
    {
        return true;
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    @Override
    public boolean getCanSpawnHere()
    {
        return this.posY < 40.0D && this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox);
    }
    
    @Override
    protected String getLivingSound()
    {
        return this.isTrading() ? "" : "";
    }
    
    @Override
    protected String getHurtSound()
    {
        return "";
    }

    @Override
    protected String getDeathSound()
    {
        return "";
    }

    /**
     * main AI tick function, replaces updateEntityActionState
     */
    @Override
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
    @Override
    public boolean interact(EntityPlayer var1)
    {
        if (this.isEntityAlive() && !this.isTrading() && !this.isChild())
        {
            if (!this.worldObj.isRemote)
            {
                this.setCustomer(var1);

                switch (this.rand.nextInt(3))
                {
                    case 0:
                        Util.addChatMessage("The Hunger: mmm. I'm hungry.");
                        break;
                    case 1:
                        Util.addChatMessage("The Hunger: Can you come a little closer?");
                        break;
                    case 2:
                        Util.addChatMessage("The Hunger: You need to fatten yourself up.");
                        break;
                }

                var1.openGui(DivineRPG.instance, GuiHandler.hunger, this.worldObj, this.getEntityId(), 0, 0);
            }

            return true;
        } else
            return super.interact(var1);
    }

    @Override
    protected void entityInit()
    {
        super.entityInit();
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.15F); // speed
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1000); // MaxHP
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    @Override
    public void writeEntityToNBT(NBTTagCompound var1)
    {
        super.writeEntityToNBT(var1);
        var1.setInteger("Profession", this.getProfession());
        var1.setInteger("Riches", this.wealth);
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    @Override
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
    @Override
    protected boolean canDespawn()
    {
        return false;
    }

    @Override
    public void setProfession(int var1)
    {
        this.dataWatcher.updateObject(16, Integer.valueOf(var1));
    }

    @Override
    public int getProfession()
    {
        return this.dataWatcher.getWatchableObjectInt(16);
    }

    @Override
    public boolean isMating()
    {
        return this.isMating;
    }

    @Override
    public void setMating(boolean var1)
    {
        this.isMating = var1;
    }

    @Override
    public void setPlaying(boolean var1)
    {
        this.isPlaying = var1;
    }

    @Override
    public boolean isPlaying()
    {
        return this.isPlaying;
    }

    @Override
    public void setRevengeTarget(EntityLivingBase var1)
    {
        super.setRevengeTarget(var1);

        if (this.villageObj != null && var1 != null)
        {
            this.villageObj.addOrRenewAgressor(var1);

            if (var1 instanceof EntityPlayer)
            {
                byte var2 = -1;

                if (this.isChild())
                {
                    var2 = -3;
                }

                this.villageObj.setReputationForPlayer(((EntityPlayer)var1).getCommandSenderName(), var2);

                if (this.isEntityAlive())
                {
                    this.worldObj.setEntityState(this, (byte)13);
                }
            }
        }
    }

    @Override
    public void setCustomer(EntityPlayer var1)
    {
        this.buyingPlayer = var1;
    }

    @Override
    public EntityPlayer getCustomer()
    {
        return this.buyingPlayer;
    }

    @Override
    public boolean isTrading()
    {
        return this.buyingPlayer != null;
    }

    @Override
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

        if (var1.getItemToBuy().getItem() == VetheanItems.dirtyPearls
                || var1.getItemToBuy().getItem() == VetheanItems.cleanPearls
                || var1.getItemToBuy().getItem() == VetheanItems.shinyPearls
                || var1.getItemToBuy().getItem() == VetheanItems.polishedPearls)
        {
            this.wealth += var1.getItemToBuy().stackSize;
        }
    }

    @Override
    public MerchantRecipeList getRecipes(EntityPlayer var1)
    {
        if (this.buyingList == null)
        {
            this.addDefaultEquipmentAndRecipies(15);
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
            this.field_82191_bN = MathHelper.sqrt_float(this.buyingList.size()) * 0.2F;
        }
        else
        {
            this.field_82191_bN = 0.0F;
        }

        MerchantRecipeList var2 = new MerchantRecipeList();

        switch (this.getProfession())
        {
            default:

                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.dirtyPearls, 1, 0), new ItemStack(VetheanItems.dreamCarrot, 2, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.dirtyPearls, 3, 0), new ItemStack(VetheanItems.dreamMelon, 4, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.dirtyPearls, 5, 0), new ItemStack(VetheanItems.dreamPie, 5, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.dirtyPearls, 10, 0), new ItemStack(VetheanItems.dreamCake, 8, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.dirtyPearls, 3, 0), new ItemStack(VetheanItems.diskTemplate, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.dirtyPearls, 3, 0), new ItemStack(VetheanItems.cannonTemplate, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.dirtyPearls, 3, 0), new ItemStack(VetheanItems.backswordTemplate, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.dirtyPearls, 3, 0), new ItemStack(VetheanItems.hammerTemplate, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.dirtyPearls, 3, 0), new ItemStack(VetheanItems.bowTemplate, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.dirtyPearls, 3, 0), new ItemStack(VetheanItems.staffTemplate, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.dirtyPearls, 3, 0), new ItemStack(VetheanItems.clawTemplate, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.dirtyPearls, 5, 0), new ItemStack(VetheanItems.degradedTemplate, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.dirtyPearls, 4, 0), new ItemStack(VetheanItems.barredDoorItem, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.dirtyPearls, 1, 0), new ItemStack(VetheaBlocks.dreamBricks1, 16, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.dirtyPearls, 1, 0), new ItemStack(VetheaBlocks.dreamBricks2, 16, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.dirtyPearls, 1, 0), new ItemStack(VetheaBlocks.smoothGlass, 16, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.dirtyPearls, 4, 0), new ItemStack(VetheaBlocks.firelight, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.dirtyPearls, 4, 0), new ItemStack(Blocks.chest, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.dirtyPearls, 2, 0), new ItemStack(VetheanItems.vetheanArrow, 32, 0)));

                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.cleanPearls, 1, 0), new ItemStack(VetheanItems.dreamSweets, 4, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.cleanPearls, 5, 0), new ItemStack(VetheanItems.finishedTemplate, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.cleanPearls, 2, 0), new ItemStack(VetheanItems.vetheanArrow2, 32, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.cleanPearls, 4, 0), new ItemStack(VetheanItems.vetheanWarArrow, 32, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.cleanPearls, 6, 0), new ItemStack(VetheanItems.vetheanWrathArrow, 32, 0)));

                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.polishedPearls, 20, 0), new ItemStack(VetheanItems.dreamFlint, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.polishedPearls, 5, 0), new ItemStack(VetheanItems.glisteningTemplate, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.polishedPearls, 5, 0), new ItemStack(VetheanItems.demonizedTemplate, 1, 0)));

                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.shinyPearls, 40, 0), new ItemStack(VetheanItems.moonClock, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.shinyPearls, 1, 0), new ItemStack(VetheanItems.dreamSours, 4, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.shinyPearls, 5, 0), new ItemStack(VetheanItems.tormentedTemplate, 1, 0)));
                var2.add(new MerchantRecipe(new ItemStack(VetheanItems.shinyPearls, 5, 0), new ItemStack(Items.bed, 1, 0)));

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

    @Override
    @SideOnly(Side.CLIENT)
    public void setRecipes(MerchantRecipeList var1) {}

    public static void addMerchantItem(MerchantRecipeList var0, Item var1, Random var2, float var3)
    {
        if (var2.nextFloat() < var3)
        {
            var0.add(new MerchantRecipe(getRandomSizedStack(var1, var2), VetheanItems.dirtyPearls));
        }
    }

    private static ItemStack getRandomSizedStack(Item var0, Random var1)
    {
        return new ItemStack(var0, getRandomCountForItem(var0, var1), 0);
    }

    private static int getRandomCountForItem(Item var0, Random var1)
    {
        Tuple var2 = (Tuple)villagerStockList.get(Integer.valueOf(Item.getIdFromItem(var0)));
        return var2 == null ? 1 : (((Integer)var2.getFirst()).intValue() >= ((Integer)var2.getSecond()).intValue() ? ((Integer)var2.getFirst()).intValue() : ((Integer)var2.getFirst()).intValue() + var1.nextInt(((Integer)var2.getSecond()).intValue() - ((Integer)var2.getFirst()).intValue()));
    }

    private static int getRandomCountForBlacksmithItem(int var0, Random var1)
    {
        Tuple var2 = (Tuple)blacksmithSellingList.get(Integer.valueOf(var0));
        return var2 == null ? 1 : (((Integer)var2.getFirst()).intValue() >= ((Integer)var2.getSecond()).intValue() ? ((Integer)var2.getFirst()).intValue() : ((Integer)var2.getFirst()).intValue() + var1.nextInt(((Integer)var2.getSecond()).intValue() - ((Integer)var2.getFirst()).intValue()));
    }

    @Override
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
            this.worldObj.spawnParticle(var1, this.posX + this.rand.nextFloat() * this.width * 2.0F - this.width, this.posY + 1.0D + this.rand.nextFloat() * this.height, this.posZ + this.rand.nextFloat() * this.width * 2.0F - this.width, var3, var5, var7);
        }
    }

    public void func_82187_q()
    {
        this.field_82190_bM = true;
    }
}
