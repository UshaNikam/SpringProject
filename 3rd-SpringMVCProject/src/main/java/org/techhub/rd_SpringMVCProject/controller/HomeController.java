package org.techhub.rd_SpringMVCProject.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.techhub.SpringMVCProject.model.Register;
import org.techhub.rd_SpringMVCProject.model.LoginModel;
import org.techhub.rd_SpringMVCProject.service.RegisterService;

@Controller
public class HomeController {
	
	@Autowired
     RegisterService registerService;
	@RequestMapping(value="/")
	public String test(HttpServletResponse response) throws IOException{
		return  "home";
	}
	@RequestMapping(value="/validate",method=RequestMethod.POST)
	public String validateUser(LoginModel model,Map map)
	{
		 if(model.getName().equals("admin") && model.getPass().equals("admin"))
		 {
			 return "master";
		 }
		 else
		 {
			   map.put("msg","Invalid username and password");
		     return "home";//call master page here
		 }
	}
	@RequestMapping("/addnewrecord")  //this work as hyperlink or url in project
	public String addNewRecord()
	{
		return "addnewrecord";//call add new record .jsp from here 
	}
	@RequestMapping(value="/saverecord",method=RequestMethod.POST)
	public String saveRecord(Register register,Map map)
	{
		 boolean b=registerService.isRegister(register);
		 if(b)
		 {
			 map.put("msg","Record Save Success...........");
		 }
		 else
		 {
			  map.put("msg", "Some problem is there.............");
		 }
		return "addnewrecord";
	}
	
	@RequestMapping("/viewall")
	public String viewalldata(Map map)
	{
		List<Register> list=registerService.getAllRecords();
		 map.put("r", list);//r work as list on jsp page 
		return "viewalldata";
	}
	
	@RequestMapping(value="/del",method=RequestMethod.GET)
	public String deleteRecord(@RequestParam("id") Integer id,Map map)
	{
		boolean b=registerService.isDelete(id);
		List<Register> list=registerService.getAllRecords();
		 map.put("r", list);//r work as list on jsp page 
		return "viewalldata";
	}
	@RequestMapping(value="/upd",method=RequestMethod.GET)
	public String updateRecord(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("contact") String contact,@RequestParam("id") Integer id,Map map)
	{
		
		map.put("n",name);
		map.put("e",email);
		map.put("c",contact);
		map.put("id",id);
		
		return "update";
	}
	@RequestMapping(value="/finalupdate",method=RequestMethod.POST)
	public String finalUpdate(Register register,Map map)
	{ 
	      registerService.isUpdate(register);
	      List<Register> list=registerService.getAllRecords();
			 map.put("r", list);//r wor
		  return "viewalldata";
	}
}



























