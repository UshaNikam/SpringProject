package org.techhub;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ConstructorClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Resource r = new ClassPathResource("employee.xml"); BeanFactory bf = new
		 * XmlBeanFactory(r); Object obj = bf.getBean("t"); Test t1=(Test)obj;
		 */
	
	
	Resource r = new ClassPathResource("employee.xml");
	BeanFactory bf = new XmlBeanFactory(r);
	Object obj = bf.getBean("t");
	Test t1=(Test)obj;

}
}
