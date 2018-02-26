package com.sang.serialization;

import java.io.Serializable;

public class Address implements Serializable{
String buildingno;
String street;
String city;
String statte;
String country;
public String getBuildingno() {
	return buildingno;
}
public void setBuildingno(String buildingno) {
	this.buildingno = buildingno;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getStatte() {
	return statte;
}
public void setStatte(String statte) {
	this.statte = statte;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return buildingno+city+country+statte+street;
	}
}
