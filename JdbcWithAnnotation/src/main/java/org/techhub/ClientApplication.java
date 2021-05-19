package org.techhub;

//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//public class ClientApplication {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//AnnotationConfigApplicationContext config =new AnnotationConfigApplicationContext(Config.class);
//		
//		JdbcTemplate template=(JdbcTemplate)config.getBean("template");
//		template.execute("insert into mreg values('dinesh','dinesh@gmail.com','1122334455')");
//		
//		System.out.println("Rrecord Save Success................");
//
//	}
//
//}
//but we want to accept the input from keyboard and then want to save in database


//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.jdbc.core.JdbcTemplate;
//import java.util.*;
//public class ClientApplication {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		AnnotationConfigApplicationContext config =new AnnotationConfigApplicationContext(Config.class);		
//		Scanner xyz = new Scanner(System.in);
//		System.out.println("Enter the name");
//		String name=xyz.nextLine();
//		String email=xyz.nextLine();
//		String contact=xyz.nextLine();
//		JdbcTemplate template=(JdbcTemplate)config.getBean("template");
//		template.execute("insert into mreg values('"+name+"','"+email+"','"+contact+"')");
//		System.out.println("Rrecord Save Success................");
//	}
//}
//

//we normally write the PreparedStatementSetter by using anonymous inner class.  //without using sqlinjection
	
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class ClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(Config.class);

		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the name");
		final String name = xyz.nextLine();
		final String email = xyz.nextLine();
		final String contact = xyz.nextLine();
		JdbcTemplate template = (JdbcTemplate) config.getBean("template");
		int val = template.update("insert into mreg values(?,?,?)", new PreparedStatementSetter() {

			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setString(1, name);
				ps.setString(2, email);
				ps.setString(3, contact);

			}

		});
		if (val > 0) {
			System.out.println("Record Save Success................");
		} else {
			System.out.println("Some problem is their.....................");
		}

	}
}

