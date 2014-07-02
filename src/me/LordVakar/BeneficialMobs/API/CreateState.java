package me.LordVakar.BeneficialMobs.API;

import java.util.ArrayList;

import org.bukkit.entity.Player;

public class CreateState 
{
	private static CreateState cs = new CreateState();
	public int state = 0;
    private ArrayList<String> playersCreating = new ArrayList<String>();
	
    public static CreateState getStateManager()
    {
        return cs;
    }
    
    public void setCreating(Player player, int State)
    {
    	playersCreating.add(player.getName());
    	this.state = State;
    }
    
    public void setCreating(Player player)
    {
    	playersCreating.add(player.getName());
    	this.state = 0;
    }
    
    public void setState(Player player, int State) {
    	if (playersCreating.contains(player.getName())) {
        	this.state = State;
    	}
    	else {
        	playersCreating.add(player.getName());
        	this.state = State;
    	}
    }
    
    public void stopCreating(Player player) {
    	playersCreating.remove(player.getName());	
    }
    
    /*public void setState(int State) {
		this.state = State;
    }*/
 
    public boolean isCreating(Player player)
    {
        return playersCreating.contains(player.getName());
    }
    
    public int getState(Player player) {
		return state;    	
    }
}