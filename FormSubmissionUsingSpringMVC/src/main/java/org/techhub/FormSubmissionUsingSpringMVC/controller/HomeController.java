package org.techhub.FormSubmissionUsingSpringMVC.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	private Register register;

	@RequestMapping(value="/")
	public String test(HttpServletResponse response) throws IOException{
		return "home";
	}
	
	@RequestMapping(value="/reg")
	public String registerHere()
	{
		return "register";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	
	/*public String saveRecord(HttpServletRequest request,Map map)*/
	
	public String saveRecord(Register register,Map map)
	{
		
		/*
		 * String name=request.getParameter("name"); String
		 * email=request.getParameter("email"); String
		 * contact=request.getParameter("contact");
		 * 
		 * map.put("n",name); map.put("e",email); map.put("c",contact); return
		 * "welcome";
		 */
		

		map.put("r",register); //here r work as register model object in map and using r we can access register object data on welcome page
		 return "welcome";
	}
}
