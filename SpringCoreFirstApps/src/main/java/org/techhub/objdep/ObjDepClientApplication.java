package org.techhub.objdep;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ObjDepClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r = new ClassPathResource("employee.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Team t=(Team)bf.getBean("team");
		t.show();

	}

}
