package pl.aram;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public class ver extends Command
{
  ComA plugin;

  public ver(String name)
  {
    super(name);
  }

  public void execute(CommandSender sender, String[] args)
  {
	  sender.sendMessage(ChatColor.BLUE + "|+| ComA |+| " + ChatColor.DARK_RED + "Nie mozesz sprawdzic versji silnika!");
  }
}