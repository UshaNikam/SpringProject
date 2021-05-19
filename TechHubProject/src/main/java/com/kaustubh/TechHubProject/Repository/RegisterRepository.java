package com.kaustubh.TechHubProject.Repository;

import java.util.List;

import com.kaustubh.TechHubProject.model.course;

public interface RegisterRepository {
	
	public boolean isAddCourse(course c);
	public List<course> getallCourse();

}
