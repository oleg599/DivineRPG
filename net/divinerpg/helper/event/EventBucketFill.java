package net.divinerpg.helper.event;

import net.divinerpg.helper.blocks.VanillaBlocks;
import net.divinerpg.helper.items.VanillaItems;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.eventhandler.Event.Result;

public class EventBucketFill {

	@SubscribeEvent
	public void onBucketFilledEvent(FillBucketEvent e){
		if(e.current.getItem() != Items.bucket){
			return;
		}

		ItemStack filledBucket = getLiquid(e.world, e.target);

		if(filledBucket == null)
			return;

		e.world.setBlockToAir(e.target.blockX, e.target.blockY, e.target.blockZ);
		e.result = filledBucket;
		e.setResult(Result.ALLOW);
	}

	public ItemStack getLiquid(World w, MovingObjectPosition m){
		Block block = w.getBlock(m.blockX, m.blockY, m.blockZ);
		if(block == VanillaBlocks.tar){
			return new ItemStack(VanillaItems.tarBucket);
		}

		return null;
	}

}
