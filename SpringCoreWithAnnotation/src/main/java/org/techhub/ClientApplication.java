package org.techhub;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext config=new AnnotationConfigApplicationContext(Config.class);
		Employee e=(Employee)config.getBean("e");
		System.out.println(e);
	}

}
