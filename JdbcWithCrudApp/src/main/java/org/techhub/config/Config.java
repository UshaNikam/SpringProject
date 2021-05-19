package org.techhub.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.techhub.repo.VoterRepository;
import org.techhub.service.VoterService;

@Configuration
@ComponentScan(basePackages = {"org.techhub.service","org.techhub.repo","org.techhub.service;"})
public class Config {

	@Bean(name="dataSource")
	public DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource d = new DriverManagerDataSource();
		d.setDriverClassName("com.mysql.cj.jdbc.Driver");
		d.setUsername("root");
		d.setPassword("system");
		d.setUrl("jdbc:mysql://localhost:3306/voterdb");
		return d;
		
	}
	@Bean(name="template")
	public JdbcTemplate getTemplate()
	{
		return new JdbcTemplate(getDataSource());
	}
	@Bean(name="voterService")
	public VoterService getVoter()
	
	{
		return new VoterService();
	}
	
	@Bean(name="voterRepo")
	public VoterRepository getVoterRepo()
	
	{
		return new VoterRepository();
	}
	
}