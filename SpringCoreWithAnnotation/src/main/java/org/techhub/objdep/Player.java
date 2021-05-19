package org.techhub.objdep;

import org.springframework.beans.factory.annotation.Value;

public class Player {
	@Value("1")
	private int id;
	
	@Value("ram")
	private String name;
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
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	@Value("10000")
	private int runs;

}
