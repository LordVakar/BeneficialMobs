package me.LordVakar.BeneficialMobs;

import me.LordVakar.BeneficialMobs.API.ConfigurationAPI;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class BeneficialMobs extends JavaPlugin {

	public static Plugin pl;
	public static FileConfiguration config;
	public static ConfigurationAPI configapi;

	public void onEnable() {
		pl = this;
		config = pl.getConfig();
		configapi = new ConfigurationAPI();
		registerEvents(this// , new
		);
	}

	public void onDisable() {

	}

	// Main Utils
	public void registerCommands() {
		// registerCommand("sg", new CmdSurvivalGames(this));
	}

	public void registerCommand(String command, CommandExecutor commandexecutor) {
		Bukkit.getServer().getPluginCommand(command)
				.setExecutor(commandexecutor);
	}

	public static void registerEvents(org.bukkit.plugin.Plugin plugin,
			Listener... listeners) {
		for (Listener listener : listeners) {
			Bukkit.getServer().getPluginManager()
					.registerEvents(listener, plugin);
		}
	}
}
