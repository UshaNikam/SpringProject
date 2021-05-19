package org.techhub;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class SelectClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		JdbcTemplate template = (JdbcTemplate) context.getBean("template");
		
		List<Employee> list = template.query("select *from mreg", new RowMapper<Employee>() {

			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Employee emp1 = new Employee();
				  emp1.setName(rs.getString(1));
				  emp1.setEmail(rs.getString(2));
				  emp1.setContact(rs.getString(3));
				return emp1;
			}
		});
		for(Employee emp:list)
		{
			System.out.println(emp.getName()+"\t"+emp.getEmail()+"\t"+emp.getContact());
		}	

	}

}
