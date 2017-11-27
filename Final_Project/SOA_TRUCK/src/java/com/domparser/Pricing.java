package com.domparser;

public class Pricing {
	
	private String priceID;
	private String locationIDFrom;
	private String locationIDTo;
	private String price;
	private String locationCodeFrom;
	private String locationCodeTo;
	private String locationNameFrom;
	private String locationNameTo;
	private String customerID;
	private String type;
	private String type1;
	
	public String getPriceID(){
		return priceID;
	}
	
	public void setPriceID(String priceID){
		this.priceID = priceID;
	}
	
	public String getLocationIDFrom(){
		return locationIDFrom;
	}
	
	public void setLocationIDFrom(String locationIDFrom){
		this.locationIDFrom = locationIDFrom;
	}
	
	public String getLocationIDTo(){
		return locationIDTo;
	}
	
	public void setLocationIDTo(String locationIDTo){
		this.locationIDTo = locationIDTo;
	}
	
	public String getPrice(){
		return price;
	}
	
	public void setPrice(String price){
		this.price = price;
	}

	public String getLocationCodeFrom(){
		return locationCodeFrom;
	}
	
	public void setLocationCodeFrom(String locationCodeFrom){
		this.locationCodeFrom = locationCodeFrom;
	}
	
	public String getLocationCodeTo(){
		return locationCodeTo;
	}
	
	public void setLocationCodeTo(String locationCodeTo){
		this.locationCodeTo = locationCodeTo;
	}
	
	public String getLocationNameFrom(){
		return locationNameFrom;
	}
	
	public void setLocationNameFrom(String locationNameFrom){
		this.locationNameFrom = locationNameFrom;
	}
	
	public String getLocationNameTo(){
		return locationNameTo;
	}
	
	public void setLocationNameTo(String locationNameTo){
		this.locationNameTo = locationNameTo;
	}
	
	public String getCustomerID(){
		return customerID;
	}
	
	public void setCustomerID(String customerID){
		this.customerID = customerID;
	}
	
	public String getType(){
		return type;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getType1(){
		return type1;
	}
	
	public void setType1(String type1){
		this.type1 = type1;
	}
	
	public String toString() {
		return "Price:: PriceID=" + this.priceID + " LocationIDFrom=" + this.locationIDFrom + " LocationIDTo=" + this.locationIDTo +
				" Price=" + this.price + " LocationCodeFrom=" + this.locationCodeFrom + " LocationCodeTo=" + this.locationCodeTo
				+ " LocationNameFrom=" + this.locationNameFrom + " LocationNameTo=" + this.locationNameTo+ " CustomerID=" + this.customerID + " Type=" + this.type + " Type1=" + this.type1;
	}
}
