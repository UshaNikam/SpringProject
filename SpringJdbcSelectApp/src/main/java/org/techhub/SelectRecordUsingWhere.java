package org.techhub;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import java.util.Scanner;

public class SelectRecordUsingWhere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		JdbcTemplate template = (JdbcTemplate) context.getBean("template");
		Scanner xyz = new Scanner(System.in);

		System.out.println("Enter the email");
		String email=xyz.nextLine();
		List<Employee> list = template.query("select *from mreg where email=?", new Object[] {email},
				new RowMapper<Employee>() {

					public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
						// TODO Auto-generated method stub
						Employee emp = new Employee();
						emp.setName(rs.getString(1));
						emp.setEmail(rs.getString(2));
						emp.setContact(rs.getString(3));
						return emp;
					}

				});

		for(Employee e:list)
		{
			System.out.println(e.getName()+"\t"+e.getEmail()+"\t"+e.getContact());
		}
	}
}
