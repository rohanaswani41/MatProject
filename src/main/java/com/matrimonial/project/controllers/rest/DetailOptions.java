package com.matrimonial.project.controllers.rest;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matrimonial.project.daos.details.BuiltDao;
import com.matrimonial.project.daos.details.CityDao;
import com.matrimonial.project.daos.details.ComplexionDao;
import com.matrimonial.project.daos.details.CultureDao;
import com.matrimonial.project.daos.details.DietDao;
import com.matrimonial.project.daos.details.DrinkDao;
import com.matrimonial.project.daos.details.EducationDao;
import com.matrimonial.project.daos.details.EyeColourDao;
import com.matrimonial.project.daos.details.HairColourDao;
import com.matrimonial.project.daos.details.HeightDao;
import com.matrimonial.project.daos.details.MaritalStatusDao;
import com.matrimonial.project.daos.details.NationalityDao;
import com.matrimonial.project.daos.details.PhonePrivacyDao;
import com.matrimonial.project.daos.details.PlaceOfBirthDao;
import com.matrimonial.project.daos.details.ProfessionDao;
import com.matrimonial.project.daos.details.SmokeDao;
import com.matrimonial.project.daos.details.StateDao;
import com.matrimonial.project.daos.details.WeightDao;
import com.matrimonial.project.models.details.Built;
import com.matrimonial.project.models.details.City;
import com.matrimonial.project.models.details.Complexion;
import com.matrimonial.project.models.details.Culture;
import com.matrimonial.project.models.details.Diet;
import com.matrimonial.project.models.details.Drink;
import com.matrimonial.project.models.details.Education;
import com.matrimonial.project.models.details.EyeColour;
import com.matrimonial.project.models.details.HairColour;
import com.matrimonial.project.models.details.Height;
import com.matrimonial.project.models.details.MaritalStatus;
import com.matrimonial.project.models.details.Nationality;
import com.matrimonial.project.models.details.PhonePrivacy;
import com.matrimonial.project.models.details.PlaceOfBirth;
import com.matrimonial.project.models.details.Profession;
import com.matrimonial.project.models.details.Smoke;
import com.matrimonial.project.models.details.State;
import com.matrimonial.project.models.details.Weight;


@RestController
public class DetailOptions {

	@Autowired
	BuiltDao builtdao;
	
	@Autowired
	CityDao citydao;
	
	@Autowired
	ComplexionDao cmpdao;
	
	@Autowired
	CultureDao cultdao;
	
	@Autowired
	DietDao dietdao;
	
	@Autowired
	DrinkDao drinkdao;
	
	@Autowired
	EducationDao edudao;
	
	@Autowired
	EyeColourDao eyecoldao;
	
	@Autowired
	HairColourDao haircoldao;
	
	@Autowired
	HeightDao heightdao;
	
	@Autowired
	MaritalStatusDao marstadao;
	
	@Autowired
	NationalityDao natdao;
	
	@Autowired
	PhonePrivacyDao phpridao;
	
	@Autowired
	PlaceOfBirthDao plofbirth;
	
	@Autowired
	ProfessionDao profdao;
	
	@Autowired
	SmokeDao smokedao;
	
	@Autowired
	StateDao statedao;
	
	@Autowired
	WeightDao weightdao;
	
	
	@RequestMapping("/details/built")
	public String built(){
	
		List<Built> l = builtdao.findAll();
		JSONArray jsr = new JSONArray();
		for(Built a : l){
			JSONObject jsb = new JSONObject();
			try {
				jsb.put("id", a.getId());
				jsb.put("value", a.getDetail());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			jsr.put(jsb);
		
		}
		return jsr.toString();
	}
	
	@RequestMapping("/details/City")
	public String city(){
		
		List<City> l = citydao.findAll();
		JSONArray jsr = new JSONArray();
		for(City a : l){
			JSONObject jsb = new JSONObject();
			try {
				jsb.put("id", a.getId());
				jsb.put("value", a.getDetail());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			jsr.put(jsb);
		
		}
		return jsr.toString();
	}
	
	@RequestMapping("/details/Complexion")
	public String complexion(){
		List<Complexion> l = cmpdao.findAll();
		JSONArray jsr = new JSONArray();
		for(Complexion a : l){
			JSONObject jsb = new JSONObject();
			try {
				jsb.put("id", a.getId());
				jsb.put("value", a.getDetail());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			jsr.put(jsb);
		
		}
		return jsr.toString();
		
		
	}
	@RequestMapping("/details/Culture")
	public String culture(){
		List<Culture> l = cultdao.findAll();
		JSONArray jsr = new JSONArray();
		for(Culture a : l){
			JSONObject jsb = new JSONObject();
			try {
				jsb.put("id", a.getId());
				jsb.put("value", a.getDetail());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			jsr.put(jsb);
		
		}
		return jsr.toString();
		
		
	}
	@RequestMapping("/details/Diet")
	public String diet(){
		
		List<Diet> l = dietdao.findAll();
		JSONArray jsr = new JSONArray();
		for(Diet a : l){
			JSONObject jsb = new JSONObject();
			try {
				jsb.put("id", a.getId());
				jsb.put("value", a.getDetail());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			jsr.put(jsb);
		
		}
		return jsr.toString();
		
	}
	@RequestMapping("/details/Drink")
	public String drink(){
		List<Drink> l = drinkdao.findAll();
		JSONArray jsr = new JSONArray();
		for(Drink a : l){
			JSONObject jsb = new JSONObject();
			try {
				jsb.put("id", a.getId());
				jsb.put("value", a.getDetail());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			jsr.put(jsb);
		
		}
		return jsr.toString();
	}
	@RequestMapping("/details/Education")
	public String education(){
		List<Education> l = edudao.findAll();
		JSONArray jsr = new JSONArray();
		for(Education a : l){
			JSONObject jsb = new JSONObject();
			try {
				jsb.put("id", a.getId());
				jsb.put("value", a.getDetail());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			jsr.put(jsb);
		
		}
		return jsr.toString();
	}
	@RequestMapping("/details/EyeColour")
	public String eyeColour(){
		List<EyeColour> l = eyecoldao.findAll();
		JSONArray jsr = new JSONArray();
		for(EyeColour a : l){
			JSONObject jsb = new JSONObject();
			try {
				jsb.put("id", a.getId());
				jsb.put("value", a.getDetail());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			jsr.put(jsb);
		
		}
		return jsr.toString();
	}
	@RequestMapping("/details/HairColour")
	public String hairColour(){
		List<HairColour> l = haircoldao.findAll();
		JSONArray jsr = new JSONArray();
		for(HairColour a : l){
			JSONObject jsb = new JSONObject();
			try {
				jsb.put("id", a.getId());
				jsb.put("value", a.getDetail());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			jsr.put(jsb);
		
		}
		return jsr.toString();
	}
	@RequestMapping("/details/Height")
	public String height(){
		List<Height> l = heightdao.findAll();
		JSONArray jsr = new JSONArray();
		for(Height a : l){
			JSONObject jsb = new JSONObject();
			try {
				jsb.put("id", a.getId());
				jsb.put("value", a.getDetail());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			jsr.put(jsb);
		
		}
		return jsr.toString();
	}
	@RequestMapping("/details/MaritalStatus")
	public String maritalstatus(){
		List<MaritalStatus> l = marstadao.findAll();
		JSONArray jsr = new JSONArray();
		for(MaritalStatus a : l){
			JSONObject jsb = new JSONObject();
			try {
				jsb.put("id", a.getId());
				jsb.put("value", a.getDetail());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			jsr.put(jsb);
		
		}
		return jsr.toString();
	}
	@RequestMapping("/details/Nationality")
	public String nationality(){
		
		List<Nationality> l = natdao.findAll();
		JSONArray jsr = new JSONArray();
		for(Nationality a : l){
			JSONObject jsb = new JSONObject();
			try {
				jsb.put("id", a.getId());
				jsb.put("value", a.getDetail());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			jsr.put(jsb);
		
		}
		return jsr.toString();
	}
	@RequestMapping("/details/PhonePrivacy")
	public String phoneprivacy(){
	
		List<PhonePrivacy> l = phpridao.findAll();
		JSONArray jsr = new JSONArray();
		for(PhonePrivacy a : l){
			JSONObject jsb = new JSONObject();
			try {
				jsb.put("id", a.getId());
				jsb.put("value", a.getDetail());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			jsr.put(jsb);
		
		}
		return jsr.toString();
		
	}
	@RequestMapping("/details/PlaceOfBirth")
	public String placeofbirth(){
		List<PlaceOfBirth> l = plofbirth.findAll();
		JSONArray jsr = new JSONArray();
		for(PlaceOfBirth a : l){
			JSONObject jsb = new JSONObject();
			try {
				jsb.put("id", a.getId());
				jsb.put("value", a.getDetail());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			jsr.put(jsb);
		
		}
		return jsr.toString();
	}
	@RequestMapping("/details/Profession")
	public String profession(){
		List<Profession> l = profdao.findAll();
		JSONArray jsr = new JSONArray();
		for(Profession a : l){
			JSONObject jsb = new JSONObject();
			try {
				jsb.put("id", a.getId());
				jsb.put("value", a.getDetail());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			jsr.put(jsb);
		
		}
		return jsr.toString();
	}
	@RequestMapping("/details/Smoke")
	public String smoke(){
		List<Smoke> l = smokedao.findAll();
		JSONArray jsr = new JSONArray();
		for(Smoke a : l){
			JSONObject jsb = new JSONObject();
			try {
				jsb.put("id", a.getId());
				jsb.put("value", a.getDetail());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			jsr.put(jsb);
		
		}
		return jsr.toString();
		
	}
	@RequestMapping("/details/State")
	public String state(){
		List<State> l = statedao.findAll();
		JSONArray jsr = new JSONArray();
		for(State a : l){
			JSONObject jsb = new JSONObject();
			try {
				jsb.put("id", a.getId());
				jsb.put("value", a.getDetail());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			jsr.put(jsb);
		
		}
		return jsr.toString();
	}
	@RequestMapping("/details/Weight")
	public String weight(){
		List<Weight> l = weightdao.findAll();
		JSONArray jsr = new JSONArray();
		for(Weight a : l){
			JSONObject jsb = new JSONObject();
			try {
				jsb.put("id", a.getId());
				jsb.put("value", a.getDetail());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			jsr.put(jsb);
		
		}
		return jsr.toString();
	}
	
}
