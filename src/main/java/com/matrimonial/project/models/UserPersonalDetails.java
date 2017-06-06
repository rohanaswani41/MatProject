package com.matrimonial.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserPersonalDetails {

	
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
