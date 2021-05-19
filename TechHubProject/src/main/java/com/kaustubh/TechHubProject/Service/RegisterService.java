package com.kaustubh.TechHubProject.Service;

import java.util.List;

import com.kaustubh.TechHubProject.model.course;

public interface RegisterService {
	
	public boolean isAddCourse(course c);
	public List<course> getallCourse();

}
