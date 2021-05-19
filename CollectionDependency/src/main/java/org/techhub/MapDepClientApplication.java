package org.techhub;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MapDepClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource r = new ClassPathResource("admission.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		StudentRecord ad=(StudentRecord)bf.getBean("ad");
		ad.show();

	}

}
