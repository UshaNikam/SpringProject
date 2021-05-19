package org.techhub;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import java.util.*;
public class DeleteApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(Config.class);
		JdbcTemplate template = (JdbcTemplate) config.getBean("template");
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the email");
		final String email=xyz.nextLine();
		int val=template.update("delete from mreg where email=?",new PreparedStatementSetter() {

			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setString(1,email);
			}
			
		});
		if(val>0)
		{
			System.out.println("Record Deleted Successfully...............");
		}
		else
		{
			System.out.println("Some problem is there..................");
		}		
	}
}