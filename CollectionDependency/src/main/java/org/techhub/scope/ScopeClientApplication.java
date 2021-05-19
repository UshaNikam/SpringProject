package org.techhub.scope;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ScopeClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource r = new ClassPathResource("admission.xml");
		BeanFactory bf=new XmlBeanFactory(r);
				Test t1=(Test)bf.getBean("t");
				Test t2=(Test)bf.getBean("t");
				Test t3=(Test)bf.getBean("t");
				Test t4=(Test)bf.getBean("t");

	}

}
