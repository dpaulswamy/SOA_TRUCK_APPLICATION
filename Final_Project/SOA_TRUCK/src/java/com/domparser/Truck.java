package com.domparser;

public class Truck {
	
	private String truckNo;
	private String make;
	private String year;
	private String model;
	private String licensePlateNo;
	private String employeeID;
	private String color;
	private String vIN;
	
	public String getTruckNo(){
		return truckNo;
	}
	
	public void setTruckNo(String truckNo){
		this.truckNo = truckNo;
	}
	
	public String getMake(){
		return make;
	}
	
	public void setMake(String make){
		this.make = make;
	}
	
	public String getYear(){
		return year;
	}
	
	public void setYear(String year){
		this.year = year;
	}
	
	public String getModel(){
		return model;
	}
	
	public void setModel(String model){
		this.model = model;
	}

	public String getLicensePlateNo(){
		return licensePlateNo;
	}
	
	public void setLicensePlateNo(String licensePlateNo){
		this.licensePlateNo = licensePlateNo;
	}
	
	public String getEmployeeID(){
		return employeeID;
	}
	
	public void setEmployeeID(String employeeID){
		this.employeeID = employeeID;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public String getVIN(){
		return vIN;
	}
	
	public void setVIN(String vIN){
		this.vIN = vIN;
	}
	
	public String toString() {
		return "Truck:: TruckNo=" + this.truckNo + " Make=" + this.make + " Year=" + this.year +
				" Model=" + this.model + " LicensePlateNo=" + this.licensePlateNo + " EmployeeID=" + this.employeeID
				+ " Color=" + this.color + " VIN=" + this.vIN;
	}
}
