package org.arpit.java2blog.springmvc.controller.bean;

public class HelloWorldResultBean {
 
	public String message;
	public boolean success;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	
}
