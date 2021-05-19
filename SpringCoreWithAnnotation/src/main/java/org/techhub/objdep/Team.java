package org.techhub.objdep;

import org.springframework.beans.factory.annotation.Autowired;

public class Team {
	
	
    @Autowired   
	private Player player;  //Player player=new Player();
	                        //player.setId(1);
	public void setPlayer(Player player)
	{
		
		this.player=player;
	}
	public void show()
	{
		System.out.println(player.getName()+"\t"+player.getId()+"\t"+player.getRuns());
	}
	
}
