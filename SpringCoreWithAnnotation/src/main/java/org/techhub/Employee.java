package org.techhub;

import org.springframework.beans.factory.annotation.Value;

public class Employee {

	@Value("1")
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Value("ram")
	private String name;
	@Value("10000")
	private int sal;
	
	public String toString()
	{
		return"["+name+","+id+","+sal+"]";
	}
}
