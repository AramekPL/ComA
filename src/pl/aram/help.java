package pl.aram;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public class help extends Command
{
  ComA plugin;

  public help(String name)
  {
    super(name);
  }

  public void execute(CommandSender sender, String[] args)
  {
	  sender.sendMessage(ChatColor.BLUE + "|+| ComA |+| " + ChatColor.DARK_RED + "Ta komenda zostala zablokowana!");
  }
}