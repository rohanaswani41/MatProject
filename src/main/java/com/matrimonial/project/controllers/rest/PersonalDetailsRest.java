package com.matrimonial.project.controllers.rest;


import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.matrimonial.project.daos.UserDao;
import com.matrimonial.project.daos.UserPersonalDetailsDao;
import com.matrimonial.project.daos.UserPersonalDetailsViewDao;
import com.matrimonial.project.models.User;
import com.matrimonial.project.models.UserPersonalDetails;
import com.matrimonial.project.models.UserPersonalDetailsView;

@RestController
public class PersonalDetailsRest {

	@Autowired
	UserPersonalDetailsViewDao userpersonaldetailsdao;
	
	
	@RequestMapping(value="/personal/get",method = RequestMethod.POST)
	public String profileGet(@RequestParam("id") Long id){
		String f=null;
		UserPersonalDetailsView user = userpersonaldetailsdao.findById(id);
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			 f = mapper.writeValueAsString(user);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(f==null){
		return f;
		}
		else{
			return "{'status':'nothing found'}";
		}
	}
	
	
	
	@RequestMapping(value="/personal/set")
	@ResponseBody
	public String profileSet(@RequestBody UserPersonalDetails upd){
		
		try {
			return (new JSONObject().put("status", "working")).toString();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "0";
		}
		
	}
	
	
	
	
}
