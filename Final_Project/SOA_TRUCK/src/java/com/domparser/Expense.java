package com.domparser;

public class Expense {
	
	private String expenseID;
	private String employeeID;
	private String expenseType;
	private String purposeofExpense;
	private String amountSpent;
	private String description;
	private String datePurchased;
	private String dateSubmitted;
	private String advanceAmount;
	private String paymentMethod;
	
	public String getExpenseID(){
		return expenseID;
	}
	
	public void setExpenseID(String expenseID){
		this.expenseID = expenseID;
	}
	
	public String getEmployeeID(){
		return employeeID;
	}
	
	public void setEmployeeID(String employeeID){
		this.employeeID = employeeID;
	}
	
	public String getExpenseType(){
		return expenseType;
	}
	
	public void setExpenseType(String expenseType){
		this.expenseType = expenseType;
	}
	
	public String getPurposeofExpense(){
		return purposeofExpense;
	}
	
	public void setPurposeofExpense(String purposeofExpense){
		this.purposeofExpense = purposeofExpense;
	}

	public String getAmountSpent(){
		return amountSpent;
	}
	
	public void setAmountSpent(String amountSpent){
		this.amountSpent = amountSpent;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public String getDatePurchased(){
		return datePurchased;
	}
	
	public void setDatePurchased(String datePurchased){
		this.datePurchased = datePurchased;
	}
	
	public String getDateSubmitted(){
		return dateSubmitted;
	}
	
	public void setDateSubmitted(String dateSubmitted){
		this.dateSubmitted = dateSubmitted;
	}
	
	public String getAdvanceAmount(){
		return advanceAmount;
	}
	
	public void setAdvanceAmount(String advanceAmount){
		this.advanceAmount = advanceAmount;
	}
	
	public String getPaymentMethod(){
		return paymentMethod;
	}
	
	public void setPaymentMethod(String paymentMethod){
		this.paymentMethod = paymentMethod;
	}
	
	public String toString() {
		return "Expense:: ExpenseID=" + this.expenseID + " EmployeeID=" + this.employeeID + " ExpenseType=" + this.expenseType +
				" PurposeofExpense=" + this.purposeofExpense + " AmountSpent=" + this.amountSpent + " Description=" + this.description
				+ " DatePurchased=" + this.datePurchased + " DateSubmitted=" + this.dateSubmitted+ " AdvanceAmount=" + this.advanceAmount + " PaymentMethod=" + this.paymentMethod;
	}
}
