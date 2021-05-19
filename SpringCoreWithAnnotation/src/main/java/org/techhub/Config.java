package org.techhub;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.techhub.objdep.Player;
import org.techhub.objdep.Team;

@Configuration

public class Config {
	
	@Bean(name="e")
	public Employee getBean()
	{
		return new Employee();
	}
	@Bean(name="p")
	public Player getPlayer()
	{
		return new Player();
	}
	
	
	@Bean(name="t")
	public Team getTeam()
	{
		return new Team();
	}

}
