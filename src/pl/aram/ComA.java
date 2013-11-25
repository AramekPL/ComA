package pl.aram;

import java.io.IOException;
import java.io.PrintStream;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.plugin.PluginManager;

public class ComA extends Plugin 
{
	public void onEnable()
	{
		System.out.println("#============= ComA =============#");
		System.out.println("# ComA by AramekPL are now enabled");
		System.out.println("# Any questions on TS: pogadaj.net");
		System.out.println("# Thank for download this plugin!");
		System.out.println("#============= ComA =============#");
		
	    ProxyServer.getInstance().getPluginManager()
	      .registerCommand(this,new pl("pl"));
	    ProxyServer.getInstance().getPluginManager()
	      .registerCommand(this,new vip("vip"));
	    ProxyServer.getInstance().getPluginManager()
	      .registerCommand(this,new info("info"));
	    ProxyServer.getInstance().getPluginManager()
	      .registerCommand(this,new ver("ver"));
	    ProxyServer.getInstance().getPluginManager()
	      .registerCommand(this,new bungee("bungee"));
	    ProxyServer.getInstance().getPluginManager()
	      .registerCommand(this,new version("version"));
	    ProxyServer.getInstance().getPluginManager()
	      .registerCommand(this,new pl("plugins"));
	    ProxyServer.getInstance().getPluginManager()
	      .registerCommand(this,new help("?"));
	    ProxyServer.getInstance().getPluginManager()
	      .registerCommand(this,new help("help"));
	    
	}

}