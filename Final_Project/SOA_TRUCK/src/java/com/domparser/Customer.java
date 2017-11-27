package com.domparser;

public class Customer {
	
	private String customerID;
	private String customerTitle;
	private String businessName;
	private String locationID;
	private String billingAddress;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	private String phoneNumber;
	private String cellNumber;
	private String otherNumber;
	private String faxNumber;
	private String emailAddress;
	private String companyName;
	private String contactName;
	private String alternateContactName;
	private String dateEntered;
	private String customerType;
	
	
	public String getCustomerID(){
		return customerID;
	}
	
	public void setCustomerID(String customerID){
		this.customerID = customerID;
	}
	
	public String getCustomerTitle(){
		return customerTitle;
	}
	
	public void setCustomerTitle(String customerTitle){
		this.customerTitle = customerTitle;
	}
	
	public String getBusinessName(){
		return businessName;
	}
	
	public void setBusinessName(String businessName){
		this.businessName = businessName;
	}
	
	public String getLocationID(){
		return locationID;
	}
	
	public void setLocationID(String locationID){
		this.locationID = locationID;
	}

	public String getBillingAddress(){
		return billingAddress;
	}
	
	public void setBillingAddress(String billingAddress){
		this.billingAddress = billingAddress;
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
	
	public String getCountry(){
		return country;
	}
	
	public void setCountry(String country){
		this.country = country;
	}
	
	public String getPhonenumber(){
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	public String getCellNumber(){
		return cellNumber;
	}
	
	public void setCellNumber(String cellNumber){
		this.cellNumber = cellNumber;
	}
	
	public String getOtherNumber(){
		return otherNumber;
	}
	
	public void setOtherNumber(String otherNumber){
		this.otherNumber = otherNumber;
	}
	
	public String getFaxNumber(){
		return faxNumber;
	}
	
	public void setFaxNumber(String faxNumber){
		this.faxNumber = faxNumber;
	}
	
	public String getEmailAddress(){
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress){
		this.emailAddress = emailAddress;
	}
	
	public String getCompanyName(){
		return companyName;
	}
	
	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}
	
	public String getContactName(){
		return contactName;
	}
	
	public void setContactName(String contactName){
		this.contactName = contactName;
	}
	
	public String getAlternateContactName(){
		return alternateContactName;
	}
	
	public void setAlternateContactName(String alternateContactName){
		this.alternateContactName = alternateContactName;
	}
	
	public String getDateEntered(){
		return dateEntered;
	}
	
	public void setDateEntered(String dateEntered){
		this.dateEntered = dateEntered;
	}
	
	public String getCustomerType(){
		return customerType;
	}
	
	public void setCustomerType(String customerType){
		this.customerType = customerType;
	}
	
	
	public String toString() {
		return "Customer:: CustomerID=" + this.customerID + " CustomerTitle=" + this.customerTitle + " BusinessName=" + this.businessName +
				" LocationID=" + this.locationID + " BillingAddress=" + this.billingAddress + " City=" + this.city + " State=" + this.state +
				" PostalCode=" + this.postalCode + " Country=" + this.country + " PhoneNumber=" + this.phoneNumber + " CellNumber=" + this.cellNumber +
				" OtherNumber=" + this.otherNumber + " FaxNumber=" + this.faxNumber + " EmailAddress=" + this.emailAddress + " CompanyName=" + this.companyName +
				" ContactName=" + this.contactName + " AlternateContactName=" + this.alternateContactName + " DateEntered=" + this.dateEntered + " CustomerType=" + this.customerType;
	}
}
