package models;

import java.sql.SQLException;
import java.sql.Statement;

import connector.Connector;

public class DaoModel {
	
	Connector conn = new Connector();
	private Statement statement = null;
	
	public void CreateTable() throws Exception {
		
		try{
			
			statement = conn.getConnection().createStatement();
			
			String s = "DROP SCHEMA IF Exists soa;";
			
			statement.executeUpdate(s);
			System.out.println("Schema dropped\n");
			
			String soa = "CREATE SCHEMA soa;";
			
			statement.executeUpdate(soa);
			System.out.println("Created Schema soa\n");
			
			String use = "use soa;";
			
			statement.executeUpdate(use);
			
			String s1 = "create table customer" 
					+ "(CustomerID varchar(200) not null, primary key (CustomerID),"
					+ "CustomerTitle char(5),"
					+ "BusinessName varchar(20),"
					+ "LocationID varchar(200),"
					+ "BillingAddress varchar(200),"
					+ "City char(20),"
					+ "State char(2),"
					+ "PostalCode int(6),"
					+ "Country char(20),"
					+ "PhoneNumber varchar(15),"
					+ "CellNumber varchar(15),"
					+ "OtherNumber varchar(15),"
					+ "FaxNumber varchar(15),"
					+ "EmailAddress varchar(100),"
					+ "CompanyName varchar(100),"
					+ "ContactName char(100),"
					+ "AlternateContactName char(100),"
					+ "DateEntered date,"
					+ "CustomerType char(10));";
			
			statement.executeUpdate(s1);
			System.out.println("Created Table Customer\n");
			
			String s2 = "create table payment"
					 + "(PaymentID varchar(200) not null, primary key (PaymentID),"
					+ "TransactionID varchar(200),"
					+ "OrderID varchar(200),"
					+ "PaymentMethod char(20),"
					+ "PaymentAmount int(100),"
					+ "PaymentDate date,"
					+ "CheckNumber int(10),"
					+ "CreditCard char(3),"
					+ "CreditCardNumber varchar(19),"
					+ "CardholdersName char(100),"
					+ "CreditCardExpDate varchar(5),"
					+ "CreditCardAuthorizationNumber varchar(4));";
			
			statement.executeUpdate(s2);
			System.out.println("Created Table Payment\n");
			
			String s3 = "create table invoice"
					+ "(InvoiceID varchar(200) not null, primary key (InvoiceID),"
					+ "InvoiceDate date,"
					+ "DueDate date,"
					+ "OrderID varchar(200),"
					+ "CustomerID varchar(200),"
					+ "OrderTotalAmount int(10));";
			
			statement.executeUpdate(s3);
			System.out.println("Created Table Invoice\n");

			String s4 = "create table transaction"
					+ "(TransactionID varchar(200) not null, primary key (TransactionID),"
					+ "OrderID varchar(200),"
					+ "priceID varchar(200),"
					+ "TranxDate date,"
					+ "TranxDesc varchar(200),"
					+ "TranxAmt int(10),"
					+ "Make varchar(20),"
					+ "Model varchar(20),"
					+ "Year int(4),"
					+ "EmployeeID varchar(20),"
					+ "TruckNo varchar(20),"
					+ "Discount int(10),"
					+ "Quantity int(4),"
					+ "UnitPrice int(10),"
					+ "DriverPrice int(10),"
					+ "VIN varchar(20),"
					+ "RunNumber varchar(40),"
					+ "Special int(10),"
					+ "Rate int(4),"
					+ "Surcharge int(4),"
					+ "Tx_priceID varchar(20),"
					+ "Amount int(10),"
					+ "Qty int(4),"
					+ "Description varchar(200),"
					+ "Tx_date date,"
					+ "Tx_car_make varchar(20),"
					+ "Tx_car_model varchar(20),"
					+ "Tx_car_year int(4),"
					+ "Tx_car_VIN varchar(20));";
			
			statement.executeUpdate(s4);
			System.out.println("Created Table Transaction\n");

			String s5 = "create table location"
						+ "(LocationID varchar(200) not null, primary key (LocationID),"
						+ "locName varchar(20),"
						+ "locationCode varchar(200),"
						+ "isActive char(5),"
						+ "CustomerID varchar(200),"
						+ "addressstreet1 varchar(200),"
						+ "addressstreet2 varchar(200),"
						+ "city char(20),"
						+ "state char(20),"
						+ "postalCode int(6),"
						+ "region char(15),"
						+ "location_contact_name varchar(15),"
						+ "locPhone varchar(15),"
						+ "locFaxNumber varchar(15),"
						+ "locEmail varchar(100));";
			
			statement.executeUpdate(s5);
			System.out.println("Created Table Location\n");

			String s6 = "create table Employee"
						+ "(EmployeeID varchar(200) not null, primary key (EmployeeID),"
						+ "FirstName varchar(20),"
						+ "LastName varchar(20),"
						+ "Email varchar(100),"
						+ "Extension int(4),"
						+ "HomePhone int(10),"
						+ "CellPhone int(10),"
						+ "JobTitle varchar(200),"
						+ "SocialSecurityNumber int(10),"
						+ "DriverLicenseNumber int(4),"
						+ "Address varchar(200),"
						+ "City varchar(20),"
						+ "State varchar(20),"
						+ "PostalCode int(6),"
						+ "BirthDate date,"
						+ "DateHired date,"
						+ "Salary int(4),"
						+ "Notes varchar(200));";
			
			statement.executeUpdate(s6);
			System.out.println("Created Table Employee\n");

			String s7 = "create table Expense"
						+ "(ExpenseID varchar(200) not null, primary key (ExpenseID),"
						+ "EmployeeID varchar(200),"
						+ "ExpenseType varchar(20),"
						+ "PurposeofExpense varchar(20),"
						+ "AmountSpent int(10),"
						+ "Description varchar(200),"
						+ "DatePurchased date,"
						+ "DateSubmitted date,"
						+ "AdvanceAmount int(10),"
						+ "PaymentMethod varchar(200));";
			
			statement.executeUpdate(s7);
			System.out.println("Created Table Expense\n");

			String s8 = "create table pricing"
						+ "(priceID varchar(200) not null, primary key (priceID),"
						+ "locationIDFrom int(5),"
						+ "locationIDTo int(5),"
						+ "price int(4),"
						+ "locationCodeFrom int(4),"
						+ "locationCodeTo int(4),"
						+ "locationNameFrom varchar(200),"
						+ "locationNameTo varchar(200),"
						+ "CustomerID varchar(200),"
						+ "type varchar(20),"
						+ "type1 varchar(20));";
			
			statement.executeUpdate(s8);
			System.out.println("Created Table Pricing\n");

			String s9 = "create table orders"
						+ "(OrderID varchar(200) NOT NULL, PRIMARY KEY (OrderID),"
						+ "OrderDate date,"
						+ "CustomerID varchar(200),"
						+ "EmployeeID varchar(200),"
						+ "TruckID varchar(200),"
						+ "isSpecial varchar(10),"
						+ "PurchaseOrderNumber varchar(30),"
						+ "OrderTotalAmount int(100),"
						+ "TransactionID varchar(200));";
			
			statement.executeUpdate(s9);
			System.out.println("Created Table Orders\n");

			String s10 = "CREATE TABLE Truck"
					+ "(TruckID varchar(200), PRIMARY KEY (TruckID),"
					+ "Make char(30),"
					+ "Year int,"  
					+ "Model varchar(30),"
					+ "LicensePlateNo varchar(10),"
					+ "EmployeeID varchar(200),"
					+ "Color char(20),"
					+ "VIN varchar(30),"
					+ "CommentID varchar(200));";
			
			statement.executeUpdate(s10);
			System.out.println("Created Table Truck\n");

			String s11 = "CREATE TABLE Comments"
						+ "(CommentID varchar(200)NOT NULL, PRIMARY KEY (CommentID),"
						+ "CommentTime varchar(200),"
						+ "CommentName varchar(200),"
						+ "CustomerID varchar(200),"
						+ "TransactionID varchar(200));";
			
			statement.executeUpdate(s11);
			System.out.println("Created Table Comments\n");
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void UpdateTable() throws Exception {
		
		try {
			
			statement = conn.getConnection().createStatement();
			
			String a1 = "alter table location add constraint fk_loc foreign key (CustomerID) references customer(CustomerID);";
			
			statement.executeUpdate(a1);
			System.out.println("Table Updated\n");
			
			String a2 = "alter table payment add constraint fk_pay1 foreign key (TransactionID) references transaction(TransactionID);";
			
			statement.executeUpdate(a2);
			System.out.println("Table Updated\n");
			
			String a3 = "alter table payment add constraint fk_pay2 foreign key (OrderID) references orders(OrderID);";
			
			statement.executeUpdate(a3);
			System.out.println("Table Updated\n");
			
			String a4 = "alter table Expense add constraint fk_exp foreign key (EmployeeID) references Employee(EmployeeID);";
			
			statement.executeUpdate(a4);
			System.out.println("Table Updated\n");
			
			String a5 = "alter table pricing add constraint fk_prc foreign key (CustomerID) references customer(CustomerID);";
			
			statement.executeUpdate(a5);
			System.out.println("Table Updated\n");
			
			String a6 = "alter table invoice add constraint fk_inv1 foreign key (OrderID) references orders(OrderID);";
			
			statement.executeUpdate(a6);
			System.out.println("Table Updated\n");
			
			String a7 = "alter table invoice add constraint fk_inv2 foreign key (CustomerID) references customer(CustomerID);";
			
			statement.executeUpdate(a7);
			System.out.println("Table Updated\n");
			
			String a8 = "alter table comments add constraint fk_cmt1 foreign key (CustomerID) references customer(CustomerID);";
			
			statement.executeUpdate(a8);
			System.out.println("Table Updated\n");
			
			String a9 = "alter table comments add constraint fk_cmt2 foreign key (TransactionID) references transaction(TransactionID);";
			
			statement.executeUpdate(a9);
			System.out.println("Table Updated\n");
			
			String a10 = "alter table truck add constraint fk_trk1 foreign key (EmployeeID) references Employee(EmployeeID);";
			
			statement.executeUpdate(a10);
			System.out.println("Table Updated\n");
			
			String a11 = "alter table truck add constraint fk_trk2 foreign key (CommentID) references Comments(CommentID);";
			
			statement.executeUpdate(a11);
			System.out.println("Table Updated\n");
			
			String a12 = "alter table orders add constraint fk_ord1 foreign key (CustomerID) references customer(CustomerID);";
			
			statement.executeUpdate(a12);
			System.out.println("Table Updated\n");
			
			String a13 = "alter table orders add constraint fk_ord2 foreign key (EmployeeID) references Employee(EmployeeID);";
			
			statement.executeUpdate(a13);
			System.out.println("Table Updated\n");
			
			String a14 = "alter table orders add constraint fk_ord3 foreign key (TransactionID) references transaction(TransactionID);";
			
			statement.executeUpdate(a14);
			System.out.println("Table Updated\n");
			
			String a15 = "alter table orders add constraint fk_ord4 foreign key (TruckID) references Truck(TruckID);";
			
			statement.executeUpdate(a15);
			System.out.println("Table Updated\n");
			
			String a16 = "alter table transaction add constraint fk_trn1 foreign key (OrderID) references orders(OrderID);";
			
			statement.executeUpdate(a16);
			System.out.println("Table Updated\n");
			
			String a17 = "alter table transaction add constraint fk_trn2 foreign key (PriceID) references pricing(PriceID);";
			
			statement.executeUpdate(a17);
			System.out.println("Table Updated\n");
			
			String a18 = "alter table transaction add constraint fk_trn3 foreign key (EmployeeID) references Employee(EmployeeID);";
			
			statement.executeUpdate(a18);
			System.out.println("Table Updated\n");
			
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
	}
	public void InsertData() throws Exception {
		
		try{
			
			statement = conn.getConnection().createStatement();
			
			
			
			String sql = "LOAD XML LOCAL INFILE 'C:/Users/dpaul/workspace/Truck/XML_XSD_DTD/Customer.xml' INTO TABLE customer ROWS IDENTIFIED BY '<Customer>';";
			
			statement.executeUpdate(sql);
			System.out.println("Inserted Data into Customer\n");
			
			String sql1 = "LOAD XML LOCAL INFILE 'C:/Users/dpaul/workspace/Truck/XML_XSD_DTD/Comments.xml' INTO TABLE comments ROWS IDENTIFIED BY '<Comment>';";
			
			statement.executeUpdate(sql1);
			System.out.println("Inserted Data into Comments\n");
			
			String sql2 = "LOAD XML LOCAL INFILE 'C:/Users/dpaul/workspace/Truck/XML_XSD_DTD/Employee.xml' INTO TABLE employee ROWS IDENTIFIED BY '<Employee>';";
			
			statement.executeUpdate(sql2);
			System.out.println("Inserted Data into Employee\n");
			
			String sql3 = "LOAD XML LOCAL INFILE 'C:/Users/dpaul/workspace/Truck/XML_XSD_DTD/Expense.xml' INTO TABLE expense ROWS IDENTIFIED BY '<Expense>';";
			
			statement.executeUpdate(sql3);
			System.out.println("Inserted Data into Expense\n");
			
			String sql4 = "LOAD XML LOCAL INFILE 'C:/Users/dpaul/workspace/Truck/XML_XSD_DTD/Invoice.xml' INTO TABLE invoice ROWS IDENTIFIED BY '<Invoice>';";
			
			statement.executeUpdate(sql4);
			System.out.println("Inserted Data into Invoice\n");
			
			String sql5 = "LOAD XML LOCAL INFILE 'C:/Users/dpaul/workspace/Truck/XML_XSD_DTD/Location.xml' INTO TABLE location ROWS IDENTIFIED BY '<Location>';";
			
			statement.executeUpdate(sql5);
			System.out.println("Inserted Data into Location\n");
			
			String sql6 = "LOAD XML LOCAL INFILE 'C:/Users/dpaul/workspace/Truck/XML_XSD_DTD/Orders.xml' INTO TABLE orders ROWS IDENTIFIED BY '<Order>';";
			
			statement.executeUpdate(sql6);
			System.out.println("Inserted Data into Orders\n");
			
			String sql7 = "LOAD XML LOCAL INFILE 'C:/Users/dpaul/workspace/Truck/XML_XSD_DTD/Payment.xml' INTO TABLE payment ROWS IDENTIFIED BY '<Payment>';";
			
			statement.executeUpdate(sql7);
			System.out.println("Inserted Data into Payments\n");
			
			String sql8 = "LOAD XML LOCAL INFILE 'C:/Users/dpaul/workspace/Truck/XML_XSD_DTD/Pricing.xml' INTO TABLE pricing ROWS IDENTIFIED BY '<Pricing>';";
			
			statement.executeUpdate(sql8);
			System.out.println("Inserted Data into Pricing\n");
			
			String sql9 = "LOAD XML LOCAL INFILE 'C:/Users/dpaul/workspace/Truck/XML_XSD_DTD/Transaction.xml' INTO TABLE transaction ROWS IDENTIFIED BY '<Transaction>';";
			
			statement.executeUpdate(sql9);
			System.out.println("Inserted Data into Transaction\n");
			
			String sql10 = "LOAD XML LOCAL INFILE 'C:/Users/dpaul/workspace/Truck/XML_XSD_DTD/Trucks.xml' INTO TABLE truck ROWS IDENTIFIED BY '<Truck>';";
			
			statement.executeUpdate(sql10);
			System.out.println("Inserted Data into Truck\n");
			
			statement.close();
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}

}
