package me.LordVakar.BeneficialMobs.Commands;

import me.LordVakar.BeneficialMobs.BeneficialMobs;
import me.LordVakar.BeneficialMobs.API.CreateState;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdBeneficialMobs implements CommandExecutor {

	BeneficialMobs main;
	String prefix = ChatColor.GOLD + "" + ChatColor.BOLD + "BeneficialMobs> ";
	
	public CmdBeneficialMobs(BeneficialMobs plugin) {
    	this.main = (BeneficialMobs) BeneficialMobs.pl;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		if (cmd.getName().equalsIgnoreCase("beneficialmobs")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage(prefix + "You're not a player, silly!");
			} else {
				Player p = (Player) sender;
				if (args.length == 0) {
					p.sendMessage(prefix + "Please specify some arguments!");
				} 
				else if (args[0].equalsIgnoreCase("create")) {
					CreateState.getStateManager().setCreating(p);
					p.sendMessage(prefix + "You are now creating a new BeneficialMob!");
					p.sendMessage(prefix + "Please now input a name for your new BeneficialMob");
				}
			}
		}
		return false;
	}
}
