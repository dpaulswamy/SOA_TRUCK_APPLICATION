package com.domparser;

public class Transaction {
	
	private String TransactionID;
	private String OrderID;
	private String PriceID;
	private String TranxDate;
	private String TranxDesc;
	private String TranxAmt;
	private String Make;
	private String Model;
	private String Year;
	private String EmployeeID;
	private String TruckNo;
	private String Discount;
	private String Quantity;
	private String UnitPrice;
	private String DriverPrice;
	private String VIN;
	private String RunNumber;
	private String Special;
	private String Rate;
	private String Surcharge;
	private String Tx_priceID;
	private String Amount;
	private String Qty;
	private String Description;
	private String Tx_date;
	private String Tx_car_make;
	private String Tx_car_model;
	private String Tx_car_year;
	private String Tx_car_VIN;
	
	
	public String getTransactionID(){
		return TransactionID;
	}
	
	public void setTransactionID(String TransactionID){
		this.TransactionID = TransactionID;
	}
	
	public String getOrderID(){
		return OrderID;
	}
	
	public void setOrderID(String OrderID){
		this.OrderID = OrderID;
	}
	
	public String getPriceID(){
		return PriceID;
	}
	
	public void setPriceID(String PriceID){
		this.PriceID = PriceID;
	}
	
	public String getTranxDate(){
		return TranxDate;
	}
	
	public void setTranxDate(String TranxDate){
		this.TranxDate = TranxDate;
	}

	public String getTranxDesc(){
		return TranxDesc;
	}
	
	public void setTranxDesc(String TranxDesc){
		this.TranxDesc = TranxDesc;
	}
	
	public String getTranxAmt(){
		return TranxAmt;
	}
	
	public void setTranxAmt(String TranxAmt){
		this.TranxAmt = TranxAmt;
	}
	
	public String getMake(){
		return Make;
	}
	
	public void setMake(String Make){
		this.Make = Make;
	}
	
	public String getModel(){
		return Model;
	}
	
	public void setModel(String Model){
		this.Model = Model;
	}
	
	public String getYear(){
		return Year;
	}
	
	public void setYear(String Year){
		this.Year = Year;
	}
	
	public String getEmployeeID(){
		return EmployeeID;
	}
	
	public void setEmployeeID(String EmployeeID){
		this.EmployeeID = EmployeeID;
	}
	
	public String getTruckNo(){
		return TruckNo;
	}
	
	public void setTruckNo(String TruckNo){
		this.TruckNo = TruckNo;
	}
	
	public String getDiscount(){
		return Discount;
	}
	
	public void setDiscount(String Discount){
		this.Discount = Discount;
	}
	
	public String getQuantity(){
		return Quantity;
	}
	
	public void setQuantity(String Quantity){
		this.Quantity = Quantity;
	}
	
	public String getUnitPrice(){
		return UnitPrice;
	}
	
	public void setUnitPrice(String UnitPrice){
		this.UnitPrice = UnitPrice;
	}
	
	public String getDriverPrice(){
		return DriverPrice;
	}
	
	public void setDriverPrice(String DriverPrice){
		this.DriverPrice = DriverPrice;
	}
	
	public String getVIN(){
		return VIN;
	}
	
	public void setVIN(String VIN){
		this.VIN = VIN;
	}
	
	public String getRunNumber(){
		return RunNumber;
	}
	
	public void setRunNumber(String RunNumber){
		this.RunNumber = RunNumber;
	}
	
	public String getSpecial(){
		return Special;
	}
	
	public void setSpecial(String Special){
		this.Special = Special;
	}
	
	public String getRate(){
		return Rate;
	}
	
	public void setRate(String Rate){
		this.Rate = Rate;
	}
	
	public String getSurcharge(){
		return Surcharge;
	}
	
	public void setSurcharge(String Surcharge){
		this.Surcharge = Surcharge;
	}
	
	public String getTx_priceID(){
		return Tx_priceID;
	}
	
	public void setTx_priceID(String Tx_priceID){
		this.Tx_priceID = Tx_priceID;
	}
	
	public String Amount(){
		return Amount;
	}
	
	public void setAmount(String Amount){
		this.Amount = Amount;
	}

	public String getQty(){
		return Qty;
	}
	
	public void setQty(String Qty){
		this.Qty = Qty;
	}
	
	public String getDescription(){
		return Description;
	}
	
	public void setDescription(String Description){
		this.Description = Description;
	}
	
	public String getTx_date(){
		return Tx_date;
	}
	
	public void setTx_date(String Tx_date){
		this.Tx_date = Tx_date;
	}
	
	public String getTx_car_make(){
		return Tx_car_make;
	}
	
	public void setTx_car_make(String Tx_car_make){
		this.Tx_car_make = Tx_car_make;
	}
	
	public String getTx_car_model(){
		return Tx_car_model;
	}
	
	public void setTx_car_model(String Tx_car_model){
		this.Tx_car_model = Tx_car_model;
	}
	
	public String getTx_car_year(){
		return Tx_car_year;
	}
	
	public void setTx_car_year(String Tx_car_year){
		this.Tx_car_year = Tx_car_year;
	}
	
	public String getTx_car_VIN(){
		return Tx_car_VIN;
	}
	
	public void setTx_car_VIN(String Tx_car_VIN){
		this.Tx_car_VIN = Tx_car_VIN;
	}
	
	
	public String toString() {
		return "Transaction:: TransactionID=" + this.TransactionID + " OrderID=" + this.OrderID + " PriceID=" + this.PriceID +
				" TranxDate=" + this.TranxDate + " TranxDesc=" + this.TranxDesc + " TranxAmt=" + this.TranxAmt + " Make=" + this.Make +
				" Model=" + this.Model + " Year=" + this.Year + " EmployeeID=" + this.EmployeeID + " TruckNo=" + this.TruckNo +
				" Discount=" + this.Discount + " Quantity=" + this.Quantity + " UnitPrice=" + this.UnitPrice + " DriverPrice=" + this.DriverPrice +
				" VIN=" + this.VIN + " RunNumber=" + this.RunNumber + " Special=" + this.Special + " Rate=" + this.Rate + " Surcharge=" + this.Surcharge + " Tx_priceID=" + this.Tx_priceID +
						" Amount=" + this.Amount + " Qty=" + this.Qty + " Description=" + this.Description + " Tx_date=" + this.Tx_date +
						" Tx_car_make=" + this.Tx_car_make + " Tx_car_model=" + this.Tx_car_model + " Tx_car_year=" + this.Tx_car_year + " Tx_car_VIN=" + this.Tx_car_VIN;
	}
}
