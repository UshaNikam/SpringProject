package org.techhub;
import java.util.*;

public class Admission {
	
	List studList;
	 public void setStudentList(List list)//Collection dependancy 
	 {
		 this.studList=list;
	 }
	 public void show()
	 {
		 Iterator i = studList.iterator();
		 while(i.hasNext())
		 {
			 Object obj = i.next();
			 System.out.println(obj);
		 }
	 }
}

