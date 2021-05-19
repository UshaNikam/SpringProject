package org.techhub;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r = new ClassPathResource("admission.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		Admission ad=(Admission)bf.getBean("a");
		ad.show();
		

	}

}
