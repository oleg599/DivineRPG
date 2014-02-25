package divinerpg.helper.mobs;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;
import divinerpg.helper.DimensionHelper;
import divinerpg.twilight.entity.mob.EntityAngryBunny;
import divinerpg.twilight.entity.mob.EntityApalachiaArcher;
import divinerpg.twilight.entity.mob.EntityApalachiaCadillion;
import divinerpg.twilight.entity.mob.EntityApalachiaGolem;
import divinerpg.twilight.entity.mob.EntityApalachiaTomo;
import divinerpg.twilight.entity.mob.EntityApalachiaWarrior;
import divinerpg.twilight.entity.mob.EntityBaslisk;
import divinerpg.twilight.entity.mob.EntityBunny;
import divinerpg.twilight.entity.mob.EntityCadillion;
import divinerpg.twilight.entity.mob.EntityCori;
import divinerpg.twilight.entity.mob.EntityCori2;
import divinerpg.twilight.entity.mob.EntityEdenTomo;
import divinerpg.twilight.entity.mob.EntityMadivel;
import divinerpg.twilight.entity.mob.EntityMoonWolf;
import divinerpg.twilight.entity.mob.EntityMortumCadillion;
import divinerpg.twilight.entity.mob.EntityMortumDemon;
import divinerpg.twilight.entity.mob.EntityNesro;
import divinerpg.twilight.entity.mob.EntitySamek;
import divinerpg.twilight.entity.mob.EntitySkythernArcher;
import divinerpg.twilight.entity.mob.EntitySkythernFiend;
import divinerpg.twilight.entity.mob.EntitySkythernGolem;
import divinerpg.twilight.entity.mob.EntitySoulStealer;
import divinerpg.twilight.entity.mob.EntityVerek;
import divinerpg.twilight.entity.mob.EntityWildWoodGolem;
import divinerpg.twilight.entity.mob.EntityWildWoodTomo;

public class MobSpawning {

	public static void addSpawns(){
		EntityRegistry.addSpawn(EntityEdenTomo.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Eden});
		EntityRegistry.addSpawn(EntityCadillion.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Eden});
		EntityRegistry.addSpawn(EntityBunny.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Eden});
		EntityRegistry.addSpawn(EntityCori.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Eden});
        EntityRegistry.addSpawn(EntityNesro.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Eden});
		EntityRegistry.addSpawn(EntityMadivel.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Eden});
        
		EntityRegistry.addSpawn(EntityCadillion.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.WildWoods});
        EntityRegistry.addSpawn(EntityWildWoodTomo.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.WildWoods});
        EntityRegistry.addSpawn(EntityWildWoodGolem.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.WildWoods});
        EntityRegistry.addSpawn(EntityVerek.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.WildWoods});
        EntityRegistry.addSpawn(EntityMoonWolf.class, 1, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {DimensionHelper.WildWoods});;
        
        EntityRegistry.addSpawn(EntityApalachiaCadillion.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Apalachia});
        EntityRegistry.addSpawn(EntityApalachiaGolem.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Apalachia});
        EntityRegistry.addSpawn(EntityApalachiaTomo.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Apalachia});
        EntityRegistry.addSpawn(EntityApalachiaWarrior.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Apalachia});
        EntityRegistry.addSpawn(EntityApalachiaArcher.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Apalachia});
        
        EntityRegistry.addSpawn(EntitySkythernFiend.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Skythern});
        EntityRegistry.addSpawn(EntitySkythernGolem.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Skythern});
        EntityRegistry.addSpawn(EntitySkythernArcher.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Skythern});
        EntityRegistry.addSpawn(EntitySamek.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Skythern});
        EntityRegistry.addSpawn(EntityCori2.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Skythern});
        
        EntityRegistry.addSpawn(EntityAngryBunny.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Mortum});
        EntityRegistry.addSpawn(EntityMortumDemon.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Mortum});
        EntityRegistry.addSpawn(EntityBaslisk.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Mortum});
        EntityRegistry.addSpawn(EntitySoulStealer.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Mortum});
        EntityRegistry.addSpawn(EntityMortumCadillion.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Mortum});
        EntityRegistry.addSpawn(EntityApalachiaArcher.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionHelper.Mortum});
	}
}