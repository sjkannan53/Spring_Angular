package org.arpit.java2blog.springmvc.controller;  
  
import org.arpit.java2blog.springmvc.controller.bean.HelloWorldBean;
import org.arpit.java2blog.springmvc.controller.bean.HelloWorldResultBean;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;  
  
@Controller 
@RequestMapping(value = "app/call")
public class HelloWorldController {
	   
	 @RequestMapping(value = "/registation")  
	 public ModelAndView hello() {  	   
	  String helloWorldMessage = "Hello world from java2blog!";  
	  return new ModelAndView("registation", "message", helloWorldMessage);  
	 }  
	 
	 @RequestMapping(value = "/helloworldf")  
	 public @ResponseBody boolean hellor() {	  
	  return true;  
	 }  
	 @RequestMapping(value = "/login")  
	 public @ResponseBody HelloWorldResultBean  login(@RequestBody HelloWorldBean bean) {  
		 HelloWorldResultBean rbean=new HelloWorldResultBean();
		 if(bean.getUsername().equals("Test") && bean.getPassword().equals("Test01")){
			 rbean.setMessage("Login Successfully");
			 rbean.setSuccess(true);
		 }else{
			 rbean.setMessage("Wrong Username and Password");
			 rbean.setSuccess(false);
		 }
	  return rbean;  
	 }  
	 
}
