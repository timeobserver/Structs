package com.struts;

import com.opensymphony.xwork2.ActionSupport;

public class StrutsTest extends ActionSupport {

	@Override
	public String execute() throws Exception {	
		System.out.println("ִ��Action");
		return SUCCESS;
	}
	public static void main(String[] args) {
		
	}
	
	
	

}
