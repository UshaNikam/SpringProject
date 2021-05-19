package com.kaustubh.TechHubProject.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kaustubh.TechHubProject.Service.RegisterService;
import com.kaustubh.TechHubProject.model.admin;
import com.kaustubh.TechHubProject.model.course;

@Controller
public class HomeController {
	
	@Autowired
	RegisterService registerService;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("Admin");
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
		public String loginAdmin(admin a) {
		
		if(a.getUsername().equals("admin") && a.getPassword().equals("kaustubh")) {
			
			return "master";
		}
		else {
			
			return "Admin";
		}
		}
	
	@RequestMapping("/addcourse")
	public String addCourse(course c,Map m) {
		
		
		boolean b= registerService.isAddCourse(c);
		if(b) {
			m.put("msg", "Course Added Successfully");
		   
			
		}
		else {
			m.put("msg","Please check Problem");
		}
		return "addnewcourse";
		
	}
	@RequestMapping("/newcourse")
	public String Newcourse() {
		
		return "addnewcourse";
	}
	
	@RequestMapping("/viewcourse")
	public String viewCourse(Map m) {
		
	List<course> list=registerService.getallCourse();
		
		m.put("k", list);
		return "viewallcourse";
	}
	@RequestMapping("/addTopic")
	public String addNewTopic() {
		
		return "addtopic";
	}
	@RequestMapping(value="/topicadd", method=RequestMethod.POST)
	public String AddTopic() {
		
		return null;
	}

	  
	}

