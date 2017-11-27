package com.domparser;

public class Location {
	
	private String locationID;
	private String locName;
	private String locationCode;
	private String isActive;
	private String customerID;
	private String addressstreet1;
	private String addressstreet2;
	private String city;
	private String state;
	private String postalCode;
	private String region;
	private String location_contact_name;
	private String locPhone;
	private String locFaxNumber;
	private String locEmail;
	
	
	
	public String getLocationID(){
		return locationID;
	}
	
	public void setLocationID(String locationID){
		this.locationID = locationID;
	}
	
	public String getLocName(){
		return locName;
	}
	
	public void setLocName(String locName){
		this.locName = locName;
	}
	
	public String getLocationCode(){
		return locationCode;
	}
	
	public void setLocationCode(String locationCode){
		this.locationCode = locationCode;
	}
	
	public String getIsActive(){
		return isActive;
	}
	
	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getCustomerID(){
		return customerID;
	}
	
	public void setCustomerID(String customerID){
		this.customerID = customerID;
	}
	
	public String getAddressStreet1(){
		return addressstreet1;
	}
	
	public void setAddressStreet1(String addressstreet1){
		this.addressstreet1 = addressstreet1;
	}
	
	public String getAddressStreet2(){
		return addressstreet2;
	}
	
	public void setAddressStreet2(String addressstreet2){
		this.addressstreet2 = addressstreet2;
	}
	
	public String getCity(){
		return city;
	}
	
	public void setCity(String city){
		this.city = city;
	}
	
	public String getState(){
		return state;
	}
	
	public void setState(String state){
		this.state = state;
	}
	
	public String getPostalCode(){
		return postalCode;
	}
	
	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}
	
	public String getRegion(){
		return region;
	}
	
	public void setRegion(String region){
		this.region = region;
	}
	
	public String getLocation_contact_name(){
		return location_contact_name;
	}
	
	public void setLocation_contact_name(String location_contact_name){
		this.location_contact_name = location_contact_name;
	}
	
	public String getLocPhone(){
		return locPhone;
	}
	
	public void setLocPhone(String locPhone){
		this.locPhone = locPhone;
	}
	
	public String getLocFaxNumber(){
		return locFaxNumber;
	}
	
	public void setLocFaxNumber(String locFaxNumber){
		this.locFaxNumber = locFaxNumber;
	}
	
	public String getLocEmail(){
		return locEmail;
	}
	
	public void setLocEmail(String locEmail){
		this.locEmail = locEmail;
	}
	
	public String toString() {
		return "Location:: LocationID=" + this.locationID + " LocName=" + this.locName + " LocationCode=" + this.locationCode +
				" IsActive=" + this.isActive + " CustomerID=" + this.customerID + " AddressStreet1=" + this.addressstreet1 + " AddressStreet2=" + this.addressstreet2 +
				" City=" + this.city + " State=" + this.state + " PostalCode=" + this.postalCode + " Region=" + this.region +
				" Location_contact_name=" + this.location_contact_name + " LocPhone=" + this.locPhone + " LocFaxNumber=" + this.locFaxNumber + " LocEmailr=" + this.locEmail;
	}
}
