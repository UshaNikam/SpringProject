package com.kaustubh.TechHubProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaustubh.TechHubProject.Repository.RegisterRepoImpl;
import com.kaustubh.TechHubProject.model.course;

@Service("registerService")
public class RegisterServiceImpl implements RegisterService{
	
	@Autowired
	RegisterRepoImpl registerRepo;

	@Override
	public boolean isAddCourse(course c) {
		// TODO Auto-generated method stub
		boolean b= registerRepo.isAddCourse(c);
		return b;
	}

	
	public List<course> getallCourse() {
		// TODO Auto-generated method stub
		return registerRepo.getallCourse();
	}

}
