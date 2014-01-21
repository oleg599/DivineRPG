package net.divinerpg.vanilla.entity.mobs;

import net.divinerpg.api.entity.EntityDivineRPGMob;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.divinerpg.helper.items.VanillaItems;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class EntityTheEye extends EntityDivineRPGMob
{
    /**
     * Counter to delay the teleportation of an enderman towards the currently attacked target
     */
    private int teleportDelay = 0;
    private int field_70826_g = 0;

    private boolean hasPotion = false;

    public EntityTheEye(World par1World)
    {
        super(par1World);
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.RPG.TheEye";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.RPG.TheEyeHit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.RPG.TheEyeHit";
    }

    protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(40.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.7D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(17.0D);
	}

    /**
     * Finds the closest player within 16 blocks to attack, or null if this Entity isn't interested in attacking
     * (Animals, Spiders at day, peaceful PigZombies).
     */
    /*protected Entity findPlayerToAttack()
    {
        EntityPlayer var1 = this.worldObj.getClosestVulnerablePlayerToEntity(this, 64.0D);

        if (var1 != null)
        {
            if (this.shouldAttackPlayer(var1))
            {
                if (this.field_70826_g == 0)
                {
                    this.worldObj.playSoundAtEntity(var1, "mob.endermen.stare", 1.0F, 1.0F);
                }

                if (this.field_70826_g++ == 5)
                {
                    this.field_70826_g = 0;
                    return var1;
                }
            }
            else
            {
                this.field_70826_g = 0;
            }
        }

        return null;
    }*/

    /**
     * Checks to see if this enderman should be attacking this player
     */
    /*private boolean shouldAttackPlayer(EntityPlayer par1EntityPlayer)
    {
        ItemStack var2 = par1EntityPlayer.inventory.armorInventory[3];

        if (var2 != null && var2 == Blocks.pumpkin)
        {
            return false;
        }
        else
        {
            Vec3 var3 = par1EntityPlayer.getLook(1.0F).normalize();
            Vec3 var4 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX - par1EntityPlayer.posX, this.boundingBox.minY + (double)(this.height / 2.0F) - (par1EntityPlayer.posY + (double)par1EntityPlayer.getEyeHeight()), this.posZ - par1EntityPlayer.posZ);
            double var5 = var4.lengthVector();
            var4 = var4.normalize();
            double var7 = var3.dotProduct(var4);
            return var7 > 1.0D - 0.025D / var5 ? par1EntityPlayer.canEntityBeSeen(this) : false;
        }
    }*/

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        super.onLivingUpdate();

        if (this.entityToAttack instanceof EntityPlayerMP)
        {
            ((EntityPlayerMP)entityToAttack).addPotionEffect(new PotionEffect(Potion.blindness.id, 2 * 40, 2));
            //((EntityPlayer) entityToAttack).triggerAchievement(AchievementPageDivineRPG.eyeOfEvil); //TODO when achivements
        }
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected Item func_146068_u()
    {
        return Item.func_150898_a(Blocks.torch);
    }

    /**
     * Drop 0-2 items of this living's type
     */
    protected void dropFewItems(boolean par1, int par2)
    {
        int var3;
        int var4;
        var3 = this.rand.nextInt(2 + par2) + 1;

        this.func_145779_a(VanillaItems.rupeeIngot, 1);
        
        this.func_145779_a(Item.func_150898_a(Blocks.torch), 16 * var3);
    }
    /**
     * Checks to make sure the light is not too bright where the mob is spawning
     */
    @Override
    protected boolean isValidLightLevel()
    {
        return true;
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    @Override
    public boolean getCanSpawnHere()
    {
        return this.posY < 15.0D && super.getCanSpawnHere();
    }

	@Override
	public String mobName() {
		return "The Eye";
	}
}
