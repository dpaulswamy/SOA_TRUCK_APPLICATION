package com.domparser;

public class Payment {
	
	private String paymentID;
	private String transactionID;
	private String orderID;
	private String paymentMethod;
	private String paymentAmount;
	private String paymentDate;
	private String checkNumber;
	private String creditCard;
	private String creditCardNumber;
	private String cardholdersName;
	private String creditCardExpDate;
	private String creditCardAuthorizationNumber;
	
	public String getPaymentID(){
		return paymentID;
	}
	
	public void setPaymentID(String paymentID){
		this.paymentID = paymentID;
	}
	
	public String getTransactionID(){
		return transactionID;
	}
	
	public void setTransactionID(String transactionID){
		this.transactionID = transactionID;
	}
	
	public String getOrderID(){
		return orderID;
	}
	
	public void setOrderID(String orderID){
		this.orderID = orderID;
	}
	
	public String getPaymentMethod(){
		return paymentMethod;
	}
	
	public void setPaymentMethod(String paymentMethod){
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentAmount(){
		return paymentAmount;
	}
	
	public void setPaymentAmount(String paymentAmount){
		this.paymentAmount = paymentAmount;
	}
	
	public String getPaymentDate(){
		return paymentDate;
	}
	
	public void setPaymentDate(String paymentDate){
		this.paymentDate = paymentDate;
	}
	
	public String getCheckNumber(){
		return checkNumber;
	}
	
	public void setCheckNumber(String checkNumber){
		this.checkNumber = checkNumber;
	}
	
	public String getCreditCard(){
		return creditCard;
	}
	
	public void setCreditCard(String creditCard){
		this.creditCard = creditCard;
	}
	
	public String getCreditCardNumber(){
		return creditCardNumber;
	}
	
	public void setCreditCardNumber(String creditCardNumber){
		this.creditCardNumber = creditCardNumber;
	}
	
	public String getCardholdersName(){
		return cardholdersName;
	}
	
	public void setCardholdersName(String cardholdersName){
		this.cardholdersName = cardholdersName;
	}
	
	public String getCreditCardExpDate(){
		return creditCardExpDate;
	}
	
	public void setCreditCardExpDate(String creditCardExpDate){
		this.creditCardExpDate = creditCardExpDate;
	}
	
	public String getCreditCardAuthorizationNumber(){
		return creditCardAuthorizationNumber;
	}
	
	public void setCreditCardAuthorizationNumber(String creditCardAuthorizationNumber){
		this.creditCardAuthorizationNumber = creditCardAuthorizationNumber;
	}
	
	public String toString() {
		return "Payment:: PaymentID=" + this.paymentID + " TransactionID=" + this.transactionID + " OrderID=" + this.orderID +
				" PaymentMethod=" + this.paymentMethod + " PaymentAmount=" + this.paymentAmount + " PaymentDate=" + this.paymentDate + " CheckNumber=" + this.checkNumber +
				" CreditCard=" + this.creditCard + " CreditCardNumber=" + this.creditCardNumber + " CardholdersName=" + this.cardholdersName + " CreditCardExpDate=" + this.creditCardExpDate +
				" CreditCardAuthorizationNumber=" + this.creditCardAuthorizationNumber;
	}
}
