package jshi.Jason.KitPVP.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor{
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player)
		{
			Player player = (Player) sender;
			if(label.equalsIgnoreCase("kit"))
			{
				if(args[1].equalsIgnoreCase("pvp"))
				{
					//player.getEquipment().setBoots();
					return true;
				}
			}
		}
		return false;
	}
}