package jshi.Jason.LearnOne;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable()
	{
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[LearnOne]: Plugin is Enabled");
	}
	
	@Override
	public void onDisable()
	{
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "[LearnOne]: Plugin is Disabled");
	}
}
//https://www.youtube.com/watch?v=6Fl2KFsSVsU&list=PL65-DKRLvp3Yn7iglPfxKoc7bl0N80XgG&index=3