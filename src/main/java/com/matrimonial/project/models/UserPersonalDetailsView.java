package com.matrimonial.project.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="complete_table")
public class UserPersonalDetailsView {

	@Id
	private Long id;
	private int maritalStatus;
	private int culture;
	private int placeOfBirth;
	private int nationality;
	/**
	 * education and career
	 * */
	
	private int education;
	private int profession;
	
	/**
	 * location and contact
	 * */
	private int state;
	private int city;
	private int phonePrivacy;
	
	/*
	 *other details 
	 * 
	 */
	private int height;
	private int weight;
	private int built;
	private int complexion;
	private int eyeColor;
	private int hairColor;
	private int diet;
	private int drink;
	private int smoke;

	
	/** string..**/
	
	
	private String strMaritalStatus;
	private String strCulture;
	private String strPlaceOfBirth;
	private String strNationality;
	/**
	 * education and career
	 * */
	
	private String strEducation;
	private String strProfession;
	
	/**
	 * location and contact
	 * */
	private String strState;
	public String getStrMaritalStatus() {
		return strMaritalStatus;
	}
	public void setStrMaritalStatus(String strMaritalStatus) {
		this.strMaritalStatus = strMaritalStatus;
	}
	public String getStrCulture() {
		return strCulture;
	}
	public void setStrCulture(String strCulture) {
		this.strCulture = strCulture;
	}
	public String getStrPlaceOfBirth() {
		return strPlaceOfBirth;
	}
	public void setStrPlaceOfBirth(String strPlaceOfBirth) {
		this.strPlaceOfBirth = strPlaceOfBirth;
	}
	public String getStrNationality() {
		return strNationality;
	}
	public void setStrNationality(String strNationality) {
		this.strNationality = strNationality;
	}
	public String getStrEducation() {
		return strEducation;
	}
	public void setStrEducation(String strEducation) {
		this.strEducation = strEducation;
	}
	public String getStrProfession() {
		return strProfession;
	}
	public void setStrProfession(String strProfession) {
		this.strProfession = strProfession;
	}
	public String getStrState() {
		return strState;
	}
	public void setStrState(String strState) {
		this.strState = strState;
	}
	public String getStrCity() {
		return strCity;
	}
	public void setStrCity(String strCity) {
		this.strCity = strCity;
	}
	public String getStrPhonePrivacy() {
		return strPhonePrivacy;
	}
	public void setStrPhonePrivacy(String strPhonePrivacy) {
		this.strPhonePrivacy = strPhonePrivacy;
	}
	public String getStrHeight() {
		return strHeight;
	}
	public void setStrHeight(String strHeight) {
		this.strHeight = strHeight;
	}
	public String getStrWeight() {
		return strWeight;
	}
	public void setStrWeight(String strWeight) {
		this.strWeight = strWeight;
	}
	public String getStrBuilt() {
		return strBuilt;
	}
	public void setStrBuilt(String strBuilt) {
		this.strBuilt = strBuilt;
	}
	public String getStrComplexion() {
		return strComplexion;
	}
	public void setStrComplexion(String strComplexion) {
		this.strComplexion = strComplexion;
	}
	public String getStrEyeColour() {
		return strEyeColour;
	}
	public void setStrEyeColour(String strEyeColor) {
		this.strEyeColour = strEyeColour;
	}
	public String getStrHairColour() {
		return strHairColour;
	}
	public void setStrHairColor(String strHairColor) {
		this.strHairColour = strHairColour;
	}
	public String getStrDiet() {
		return strDiet;
	}
	public void setStrDiet(String strDiet) {
		this.strDiet = strDiet;
	}
	public String getStrDrink() {
		return strDrink;
	}
	public void setStrDrink(String strDrink) {
		this.strDrink = strDrink;
	}
	public String getStrSmoke() {
		return strSmoke;
	}
	public void setStrSmoke(String strSmoke) {
		this.strSmoke = strSmoke;
	}
	private String strCity;
	private String strPhonePrivacy;
	
	/*
	 *other details 
	 * 
	 */
	private String strHeight;
	private String strWeight;
	private String strBuilt;
	private String strComplexion;
	private String strEyeColour;
	private String strHairColour;
	private String strDiet;
	private String strDrink;
	private String strSmoke;

	
	
	
	/**
	 * parents information
	 * */
	private String fathersName;
	private int fathersOccupation;
	private String mothersName;
	private int mothersOccupation;
	/**
	 * hobby information
	 * */
	private String aboutMyself;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(int maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public int getCulture() {
		return culture;
	}
	public void setCulture(int culture) {
		this.culture = culture;
	}
	public int getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(int placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	public int getNationality() {
		return nationality;
	}
	public void setNationality(int nationality) {
		this.nationality = nationality;
	}
	public int getEducation() {
		return education;
	}
	public void setEducation(int education) {
		this.education = education;
	}
	public int getProfession() {
		return profession;
	}
	public void setProfession(int profession) {
		this.profession = profession;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getCity() {
		return city;
	}
	public void setCity(int city) {
		this.city = city;
	}
	public int getPhonePrivacy() {
		return phonePrivacy;
	}
	public void setPhonePrivacy(int phonePrivacy) {
		this.phonePrivacy = phonePrivacy;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getBuilt() {
		return built;
	}
	public void setBuilt(int built) {
		this.built = built;
	}
	public int getComplexion() {
		return complexion;
	}
	public void setComplexion(int complexion) {
		this.complexion = complexion;
	}
	public int getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(int eyeColor) {
		this.eyeColor = eyeColor;
	}
	public int getHairColor() {
		return hairColor;
	}
	public void setHairColor(int hairColor) {
		this.hairColor = hairColor;
	}
	public int getDiet() {
		return diet;
	}
	public void setDiet(int diet) {
		this.diet = diet;
	}
	public int getDrink() {
		return drink;
	}
	public void setDrink(int drink) {
		this.drink = drink;
	}
	public int getSmoke() {
		return smoke;
	}
	public void setSmoke(int smoke) {
		this.smoke = smoke;
	}
	public String getFathersName() {
		return fathersName;
	}
	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}
	public int getFathersOccupation() {
		return fathersOccupation;
	}
	public void setFathersOccupation(int fathersOccupation) {
		this.fathersOccupation = fathersOccupation;
	}
	public String getMothersName() {
		return mothersName;
	}
	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}
	public int getMothersOccupation() {
		return mothersOccupation;
	}
	public void setMothersOccupation(int mothersOccupation) {
		this.mothersOccupation = mothersOccupation;
	}
	public String getAboutMyself() {
		return aboutMyself;
	}
	public void setAboutMyself(String aboutMyself) {
		this.aboutMyself = aboutMyself;
	}

	
}
