package com.struts;

import com.opensymphony.xwork2.ActionSupport;

public class StrutsTest extends ActionSupport {

	@Override
	public String execute() throws Exception {	
		System.out.println("Ö´ÐÐAction");
		return SUCCESS;
	}
	public static void main(String[] args) {
		
	}
	
	
	

}
