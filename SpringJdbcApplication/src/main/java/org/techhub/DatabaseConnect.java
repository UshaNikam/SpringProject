package org.techhub;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DatabaseConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Resource r=new ClassPathResource("conn.xml");
		BeanFactory bf=new XmlBeanFactory(r);
//		DriverManagerDataSource d=(DriverManagerDataSource)bf.getBean("dataSource");
//		if(d!=null)
//		{
//			System.out.println("Connected");
//			
//	
//		}
//		else 
//		{
//			System.out.println("Not Connected");
//			
//		}

		
		JdbcTemplate template=(JdbcTemplate)bf.getBean("template");
		template.execute("insert into spj values('ram','ram@gmail.com','1111111111')");
		System.out.println("Record Saved Success..........");
		
	}

}
