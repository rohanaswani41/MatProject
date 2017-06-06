package com.matrimonial.project.controllers.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class PersonalDetailsWeb  {

	@RequestMapping("/personal/web")
	public String webdisplay(){
		return "ProfilePage";
	}

}
