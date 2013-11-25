package pl.aram;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public class bungee extends Command
{
  ComA plugin;

  public bungee(String name)
  {
    super(name);
  }

  public void execute(CommandSender sender, String[] args)
  {
      sender.sendMessage(ChatColor.BLUE + "This server is running BungeeCord version git-aramek-bungee api-1.7.2-FULL-42673-231 by AramekPL");
  }
}