package com.rudraksh.springdemo.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
	
	@NotNull(message="required")
	@Size(min=1, message="required")
	private String firstName;
	@NotNull(message="required")
	@Size(min=1, message="required")
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private String[] favoriteOS;	
	private LinkedHashMap<String, String> countryOptions;
	
	@NotNull(message="required")
	@Min(value=1, message="must be greater than or equals to one")
	@Max(value=12, message="must be less than or equals to 12")
	private Integer standard;
	
	@Pattern(regexp="^[A-Z]{5}[0-9]{4}[A-Z]{1}", message="Invalid PAN number")
	private String panNumber;
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Student() {
		
		// populate country options: used ISO country code
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("IN", "India");
		countryOptions.put("NP", "Nepal");
		countryOptions.put("BR", "Brazil");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getFavoriteOS() {
		return favoriteOS;
	}

	public void setFavoriteOS(String[] favoriteOS) {
		this.favoriteOS = favoriteOS;
	}

	public Integer getStandard() {
		return standard;
	}

	public void setStandard(Integer standard) {
		this.standard = standard;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	

	
	
	

}
