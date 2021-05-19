package org.techhub.clientapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.techhub.config.Config;
import org.techhub.model.Voter;
import org.techhub.service.VoterService;

public class ClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		VoterService voterService = (VoterService) context.getBean("voterService");
		 
		 Voter v = new Voter();
		  v.setName("Ram");
		  v.setAddress("Pune");
		  v.setAge(20);
		
		  boolean b = voterService.isAddVoter(v);
		   if(b)
		   {
			   System.out.println("Voter Added Successfully............");
		   }
		   else
		   {
			   System.out.println("Voter Not Addedd....................");
		   }
	}

}
