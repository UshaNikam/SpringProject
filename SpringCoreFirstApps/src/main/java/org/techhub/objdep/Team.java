package org.techhub.objdep;

public class Team {
	
	
Player p ;

public void setPlayer(Player p)
{
	this.p=p;
}
public void show()
{
	System.out.println(p.getName()+"\t"+p.getId()+"\t"+p.getRuns());
}
}