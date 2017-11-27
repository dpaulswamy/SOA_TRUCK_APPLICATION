package com.domparser;

public class Order {
	
	private String orderID;
	private String orderDate;
	private String customerID;
	private String employeeID;
	private String truckID;
	private String isSpecial;
	private String purchaseOrderNumber;
	private String orderTotalAmount;
	
	public String getOrderID(){
		return orderID;
	}
	
	public void setOrderID(String orderID){
		this.orderID = orderID;
	}
	
	public String getOrderDate(){
		return orderDate;
	}
	
	public void setOrderDate(String orderDate){
		this.orderDate = orderDate;
	}
	
	public String getCustomerID(){
		return customerID;
	}
	
	public void setCustomerID(String customerID){
		this.customerID = customerID;
	}
	
	public String getEmployeeID(){
		return employeeID;
	}
	
	public void setEmployeeID(String employeeID){
		this.employeeID = employeeID;
	}

	public String getTruckID(){
		return truckID;
	}
	
	public void setTruckID(String truckID){
		this.truckID = truckID;
	}
	
	public String getIsSpecial(){
		return isSpecial;
	}
	
	public void setIsSpecial(String isSpecial){
		this.isSpecial = isSpecial;
	}
	
	public String getPurchaseOrderNumber(){
		return purchaseOrderNumber;
	}
	
	public void setPurchaseOrderNumber(String purchaseOrderNumber){
		this.purchaseOrderNumber = purchaseOrderNumber;
	}
	
	public String getOrderTotalAmount(){
		return orderTotalAmount;
	}
	
	public void setOrderTotalAmount(String orderTotalAmount){
		this.orderTotalAmount = orderTotalAmount;
	}
	
	public String toString() {
		return "Order:: OrderID=" + this.orderID + " OrderDate=" + this.orderDate + " CustomerID=" + this.customerID +
				" EmployeeID=" + this.employeeID + " TruckID=" + this.truckID + " IsSpecial=" + this.isSpecial
				+ " PurchaseOrderNumber=" + this.purchaseOrderNumber + " OrderTotalAmount=" + this.orderTotalAmount;
	}
}
