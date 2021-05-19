package org.techhub;
import java.util.*;


public class StudentRecord {
	
	Map map;
	
	public void setStudentList(Map map)
	
	{
		this.map=map;
		
	}
	public void show()
	{
		Set keys = map.keySet();
		Iterator i = keys.iterator();
		while(i.hasNext())
		{
			Object key = i.next();
			Object value=map.get(key);
			System.out.println(key+"\t"+value);
		}
		
	}

}
