package pl.aram;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public class info extends Command
{
  ComA plugin;

  public info(String name)
  {
    super(name);
  }

  public void execute(CommandSender sender, String[] args)
  {
      sender.sendMessage(ChatColor.BLUE + "#=============" + ChatColor.YELLOW + " ComA " + ChatColor.BLUE + "=============#");
      sender.sendMessage(ChatColor.BLUE + "#" + ChatColor.YELLOW + " ComA by AramekPL are now enabled");
      sender.sendMessage(ChatColor.BLUE + "#" + ChatColor.YELLOW + " Any questions on TS: pogadaj.net");
      sender.sendMessage(ChatColor.BLUE + "#" + ChatColor.YELLOW + " Thank for download this plugin!");
      sender.sendMessage(ChatColor.BLUE + "#=============" + ChatColor.YELLOW + " ComA " + ChatColor.BLUE + "=============#");
  }
}