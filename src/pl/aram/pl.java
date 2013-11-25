package pl.aram;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public class pl extends Command
{
  ComA plugin;

  public pl(String name)
  {
    super(name);
  }

  public void execute(CommandSender sender, String[] args)
  {
      sender.sendMessage(ChatColor.BLUE + "|+| ComA |+| " + ChatColor.DARK_RED + "Sprawdzanie pluginow jest zabronione!");
  }
}