package com.domparser;

public class Invoice {
	
	private String invoiceID;
	private String invoiceDate;
	private String orderID;
	private String customerID;
	private String orderTotalAmount;
	private String dueDate;
	
	public String getinvoiceID(){
		return invoiceID;
	}
	
	public void setInvoiceID(String invoiceID){
		this.invoiceID = invoiceID;
	}
	
	public String getInvoiceDate(){
		return invoiceDate;
	}
	
	public void setInvoiceDate(String invoiceDate){
		this.invoiceDate = invoiceDate;
	}
	
	public String getCustomerID(){
		return customerID;
	}
	
	public void setCustomerID(String customerID){
		this.customerID = customerID;
	}
	
	public String OrderTotalAmount(){
		return orderTotalAmount;
	}
	
	public void setOrderTotalAmount(String orderTotalAmount){
		this.orderTotalAmount = orderTotalAmount;
	}

	public String getOrderID(){
		return orderID;
	}
	
	public void setOrderID(String orderID){
		this.orderID = orderID;
	}
	
	public String getDueDate(){
		return dueDate;
	}
	
	public void setDueDate(String dueDate){
		this.dueDate = dueDate;
	}
	
	public String toString() {
		return "Invoice:: InvoiceID=" + this.invoiceID + " InvoiceDate=" + this.invoiceDate + " CustomerID=" + this.customerID +
				" OrderID=" + this.orderID + " OrderTotalAmount=" + this.orderTotalAmount + " DueDate=" + this.dueDate;
	}
}
