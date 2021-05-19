package org.techhub;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config {

	@Bean(name = "dataSource")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource d = new DriverManagerDataSource();
		d.setDriverClassName("com.mysql.cj.jdbc.Driver");
		d.setUsername("root");
		d.setPassword("system");
		d.setUrl("jdbc:mysql://localhost:3306/mysql");
		return d;
	}

	@Bean(name = "template")
	public JdbcTemplate getTemplate() {
		return new JdbcTemplate(getDataSource());
	}

}