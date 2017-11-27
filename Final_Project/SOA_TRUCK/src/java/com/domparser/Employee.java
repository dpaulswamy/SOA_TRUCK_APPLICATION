package com.domparser;

public class Employee {
	
	private String employeeID;
	private String firstName;
	private String lastName;
	private String email;
	private String extension;
	private String homePhone;
	private String cellPhone;
	private String jobTitle;
	private String socialSecurityNumber;
	private String driverLicenseNumber;
	private String address;
	private String city;
	private String state;
	private String postalCode;
	private String birthDate;
	private String dateHired;
	private String salary;
	private String notes;
	
	
	
	public String getEmployeeID(){
		return employeeID;
	}
	
	public void setEmployeeID(String employeeID){
		this.employeeID = employeeID;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}

	public String getExtension(){
		return extension;
	}
	
	public void setExtension(String extension){
		this.extension = extension;
	}
	
	public String getHomePhone(){
		return homePhone;
	}
	
	public void setHomePhone(String homePhone){
		this.homePhone = homePhone;
	}
	
	public String getCellPhone(){
		return cellPhone;
	}
	
	public void setCellPhone(String cellPhone){
		this.cellPhone = cellPhone;
	}
	
	public String getJobTitle(){
		return jobTitle;
	}
	
	public void setJobTitle(String jobTitle){
		this.jobTitle = jobTitle;
	}
	
	public String getSocialSecurityNumber(){
		return socialSecurityNumber;
	}
	
	public void setSocialSecurityNumber(String socialSecurityNumber){
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public String getDriverLicenseNumber(){
		return driverLicenseNumber;
	}
	
	public void setDriverLicenseNumber(String driverLicenseNumber){
		this.driverLicenseNumber = driverLicenseNumber;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address){
		this.address = address;
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
	
	public String getBirthDate(){
		return birthDate;
	}
	
	public void setBirthDate(String birthDate){
		this.birthDate = birthDate;
	}
	
	public String getDateHired(){
		return dateHired;
	}
	
	public void setDateHired(String dateHired){
		this.dateHired = dateHired;
	}
	
	public String getSalary(){
		return salary;
	}
	
	public void setSalary(String salary){
		this.salary = salary;
	}
	
	public String getNotes(){
		return notes;
	}
	
	public void setNotes(String notes){
		this.notes = notes;
	}
	
	public String toString() {
		return "Employee:: EmployeeID=" + this.employeeID + " FirstName=" + this.firstName + " LastName=" + this.lastName +
				" Email=" + this.email + " Extension=" + this.extension + " HomePhone=" + this.homePhone + " CellPhone=" + this.cellPhone +
				" JobTitle=" + this.jobTitle + " SocialSecurityNumber=" + this.socialSecurityNumber + " DriverLicenseNumber=" + this.driverLicenseNumber + " Address=" + this.address +
				" City=" + this.city + " State=" + this.state + " PostalCode=" + this.postalCode + " BirthDate=" + this.birthDate +
				" DateHired=" + this.dateHired + " Salary=" + this.salary + " Notes=" + this.notes;
	}
}
