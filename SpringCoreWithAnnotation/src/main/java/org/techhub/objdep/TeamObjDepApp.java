package org.techhub.objdep;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.techhub.Config;


public class TeamObjDepApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext config=new AnnotationConfigApplicationContext(Config.class);
		Team t=(Team)config.getBean("t");
		t.show();

	}

}
