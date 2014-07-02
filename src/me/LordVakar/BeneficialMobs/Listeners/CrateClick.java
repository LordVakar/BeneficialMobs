package me.LordVakar.BeneficialMobs.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

public class CrateClick implements Listener
{
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event){
        Player player = event.getPlayer();
   
        if(event.getAction() == Action.RIGHT_CLICK_BLOCK){
        	if (event.getClickedBlock().getData() == 6) {
        		player.sendMessage("DATA OF 6");
        	}
       
        }
    }
}
