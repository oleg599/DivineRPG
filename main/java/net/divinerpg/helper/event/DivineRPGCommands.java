package net.divinerpg.helper.event;

import java.util.List;

import net.divinerpg.helper.config.ConfigurationHelper;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;

public class DivineRPGCommands extends CommandBase{

	@Override
	public String getCommandName() {
		return "DivineRPG";
	}

	@Override
	public String getCommandUsage(ICommandSender var1) {
		return "/DivineRPG <var1> <dimension>";
	}

	@Override
	public void processCommand(ICommandSender var1, String[] var2) {
		EntityPlayerMP playerMP = (EntityPlayerMP)var1;
		if(!playerMP.worldObj.isRemote){
			if (var2[0].equalsIgnoreCase("Eden")) {
				if (playerMP.dimension != ConfigurationHelper.Eden) {
					playerMP.mcServer.getConfigurationManager().transferPlayerToDimension(playerMP, ConfigurationHelper.Eden);
				}
			}

			if (var2[0].equalsIgnoreCase("WildWoods")) {
				if (playerMP.dimension != ConfigurationHelper.WildWoods) {
					playerMP.mcServer.getConfigurationManager().transferPlayerToDimension(playerMP, ConfigurationHelper.Eden);
				}
			}
		}
	}

	@Override
	public int getRequiredPermissionLevel() {
		return 1;
	}

	@Override
	public List addTabCompletionOptions(ICommandSender par1ICommandSender, String[] par2) {
		return par2.length == 1 ? getListOfStringsMatchingLastWord(par2, new String[] {"Eden", "WildWoods"}) : null;
	}
}