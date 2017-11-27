using System;
using System.Configuration;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.HtmlControls;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Xml.Linq;
using SOA_TRUCK_WEB_APPLICATION.TruckService;

namespace SOA_TRUCK_WEB_APPLICATION
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        TruckService.TruckApplication proxy;
        protected void Page_Load(object sender, EventArgs e)
        {
            proxy = new TruckService.TruckApplication();
        }


        protected void btnComment_Click(object sender, EventArgs e)
        {
            try
            {
                /*gdvCommentData.DataSource = proxy.getComment();
                gdvCommentData.
                gdvCommentData.DataBind();
                gdvCommentData.Visible = true;
                //proxy.getComment()
                */
                string data = proxy.getComment();
                DataTable dt = new DataTable();
                DataColumn colCommentId = dt.Columns.Add("Comment ID", typeof(string));
                DataColumn colCommentName = dt.Columns.Add("Comment Name", typeof(string));
                foreach (string row in data.Split('\n'))
                {
                    string[] split = row.Split('\t');
                    DataRow dataRow = dt.NewRow();
                    if (split.Count() > 1)
                    {
                        dataRow[0] = split[0];
                        dataRow[1] = split[1];

                        dt.Rows.Add(dataRow);
                    }
                    
                }
                lblGridHeader.Text = "Table containing Comment ID and Comment Name";
                
                gdvCommentData.DataSource = dt;
                gdvCommentData.DataBind();

            }
            catch (FormatException)
            { }
        }

        protected void btnMax_Click(object sender, EventArgs e)
        {
            try
            {
                
                string data = proxy.getMaxTran();
                DataTable dt = new DataTable();
                DataColumn colTransactionID = dt.Columns.Add("Transaction ID", typeof(string));
                DataColumn colTranxAmt = dt.Columns.Add("Transaction Amount", typeof(string));
                foreach (string row in data.Split('\n'))
                {
                    string[] split = row.Split('\t');
                    DataRow dataRow = dt.NewRow();
                    if (split.Count() > 1)
                    {
                        dataRow[0] = split[0];
                        dataRow[1] = split[1];

                        dt.Rows.Add(dataRow);
                    }

                }
                lblGridHeader.Text = "Table containing Transaction ID and Transaction Amount";

                gdvCommentData.DataSource = dt;
                gdvCommentData.DataBind();

            }
            catch (FormatException)
            { }

        }

        protected void btnBill_Click(object sender, EventArgs e)
        {

            try
            {

                string data = proxy.getCustomer();
                DataTable dt = new DataTable();
                DataColumn colBillingAddress = dt.Columns.Add("Billing Address", typeof(string));
                DataColumn colContactName = dt.Columns.Add("Contact Name", typeof(string));
                foreach (string row in data.Split('\n'))
                {
                    string[] split = row.Split('\t');
                    DataRow dataRow = dt.NewRow();
                    if (split.Count() > 1)
                    {
                        dataRow[0] = split[0];
                        dataRow[1] = split[1];

                        dt.Rows.Add(dataRow);
                    }

                }
                lblGridHeader.Text = "Table containing Billing Address and Contact Name";
                gdvCommentData.DataSource = dt;
                gdvCommentData.DataBind();

            }
            catch (FormatException)
            { }
        }

        protected void btnLoc_Click(object sender, EventArgs e)
        {
            try
            {

                string data = proxy.getCustomerLocationID();
                DataTable dt = new DataTable();
                DataColumn colCustomerID = dt.Columns.Add("Customer ID/Location ID", typeof(string));
                DataColumn colContactName = dt.Columns.Add("Contact Name/Location Name", typeof(string));
                foreach (string row in data.Split('\n'))
                {
                    string[] split = row.Split('\t');
                    DataRow dataRow = dt.NewRow();
                    if (split.Count() > 1)
                    {
                        dataRow[0] = split[0];
                        dataRow[1] = split[1];

                        dt.Rows.Add(dataRow);
                    }

                }
                lblGridHeader.Text = "Table containing Customer ID/Location ID and Contact Name/Location Name";
                gdvCommentData.DataSource = dt;
                gdvCommentData.DataBind();

            }
            catch (FormatException)
            { }
        }

        protected void btnCode_Click(object sender, EventArgs e)
        {
            try
            {

                string data = proxy.getPostalCode();
                DataTable dt = new DataTable();
                DataColumn colPostalCode = dt.Columns.Add("Postal Code", typeof(string));
                DataColumn colstate = dt.Columns.Add("State", typeof(string));
                foreach (string row in data.Split('\n'))
                {
                    string[] split = row.Split('\t');
                    DataRow dataRow = dt.NewRow();
                    if (split.Count() > 1)
                    {
                        dataRow[0] = split[0];
                        dataRow[1] = split[1];

                        dt.Rows.Add(dataRow);
                    }

                }
                lblGridHeader.Text = "Table containing Postal Code and State";
                gdvCommentData.DataSource = dt;
                gdvCommentData.DataBind();

            }
            catch (FormatException)
            { }
        }

        protected void btnLoc1_Click(object sender, EventArgs e)
        {
            try
            {

                string data = proxy.getSubQuery();
                DataTable dt = new DataTable();
                DataColumn colLocationID = dt.Columns.Add("Location ID", typeof(string));
                DataColumn colisActive = dt.Columns.Add("isActive", typeof(string));
                DataColumn colPostalCode = dt.Columns.Add("Postal Code", typeof(string));
                foreach (string row in data.Split('\n'))
                {
                    string[] split = row.Split('\t');
                    DataRow dataRow = dt.NewRow();
                    if (split.Count() > 2)
                    {
                        dataRow[0] = split[0];
                        dataRow[1] = split[1];
                        dataRow[2] = split[2];

                        dt.Rows.Add(dataRow);
                    }

                }
                lblGridHeader.Text = "Table containing Location ID, isActive and Postal Code";
                gdvCommentData.DataSource = dt;
                gdvCommentData.DataBind();

            }
            catch (FormatException)
            { }
        }

        protected void btnCust_Click(object sender, EventArgs e)
        {
            try
            {

                string data = proxy.getCustomerDetails();
                DataTable dt = new DataTable();
                DataColumn colCustomerID = dt.Columns.Add("Customer ID", typeof(string));
                DataColumn colCustomerTitle = dt.Columns.Add("Customer Title", typeof(string));
                DataColumn colBusinessName = dt.Columns.Add("Business Name", typeof(string));
                DataColumn colLocationID = dt.Columns.Add("Location ID", typeof(string));
                DataColumn colBillingAddress = dt.Columns.Add("Billing Address", typeof(string));
                DataColumn colCity = dt.Columns.Add("City", typeof(string));
                DataColumn colState = dt.Columns.Add("State", typeof(string));
                DataColumn colPostalCode = dt.Columns.Add("Postal Code", typeof(string));
                DataColumn colCountry = dt.Columns.Add("Country", typeof(string));
                DataColumn colPhoneNumber = dt.Columns.Add("Phone Number", typeof(string));
                DataColumn colCellNumber = dt.Columns.Add("Cell Number", typeof(string));
                DataColumn colOtherNumber = dt.Columns.Add("Other Number", typeof(string));
                DataColumn colFaxNumber = dt.Columns.Add("Fax Number", typeof(string));
                DataColumn colEmailAddress = dt.Columns.Add("Email Address", typeof(string));
                DataColumn colCompanyName = dt.Columns.Add("Company Name", typeof(string));
                DataColumn colContactName = dt.Columns.Add("Contact Name", typeof(string));
                DataColumn colAlternateContactName = dt.Columns.Add("Alternate Contact Name", typeof(string));
                DataColumn colDateEntered = dt.Columns.Add("Date Entered", typeof(string));
                DataColumn colCustomerType = dt.Columns.Add("Customer Type", typeof(string));
                foreach (string row in data.Split('\n'))
                {
                    string[] split = row.Split('\t');
                    DataRow dataRow = dt.NewRow();
                    if (split.Count() > 18)
                    {
                        dataRow[0] = split[0];
                        dataRow[1] = split[1];
                        dataRow[2] = split[2];
                        dataRow[3] = split[3];
                        dataRow[4] = split[4];
                        dataRow[5] = split[5];
                        dataRow[6] = split[6];
                        dataRow[7] = split[7];
                        dataRow[8] = split[8];
                        dataRow[9] = split[9];
                        dataRow[10] = split[10];
                        dataRow[11] = split[11];
                        dataRow[12] = split[12];
                        dataRow[13] = split[13];
                        dataRow[14] = split[14];
                        dataRow[15] = split[15];
                        dataRow[16] = split[16];
                        dataRow[17] = split[17];
                        dataRow[18] = split[18];

                        dt.Rows.Add(dataRow);
                    }

                }
                lblGridHeader.Text = "Table containing Customer Details";
                gdvCommentData.DataSource = dt;
                gdvCommentData.DataBind();

            }
            catch (FormatException)
            { } 
        }

        protected void btnCustID_Click(object sender, EventArgs e)
        {
            try
            {

                string data = proxy.getInnerJoin();
                DataTable dt = new DataTable();
                DataColumn colOrderID = dt.Columns.Add("Order ID", typeof(string));
                DataColumn colOrderDate = dt.Columns.Add("Order Date", typeof(string));
                DataColumn colCustomerID = dt.Columns.Add("Customer ID", typeof(string));
                DataColumn colEmployeeID = dt.Columns.Add("Employee ID", typeof(string));
                DataColumn colTruckID = dt.Columns.Add("Truck ID", typeof(string));
                DataColumn colisSpecial = dt.Columns.Add("is Special", typeof(string));
                DataColumn colPurchaseOrderNumber = dt.Columns.Add("Purchase Order Number", typeof(string));
                DataColumn colOrderTotalAmount = dt.Columns.Add("Order Total Amount", typeof(string));
                DataColumn colTransactionID = dt.Columns.Add("Transaction ID", typeof(string));
                foreach (string row in data.Split('\n'))
                {
                    string[] split = row.Split('\t');
                    DataRow dataRow = dt.NewRow();
                    if (split.Count() > 8)
                    {
                        dataRow[0] = split[0];
                        dataRow[1] = split[1];
                        dataRow[2] = split[2];
                        dataRow[3] = split[3];
                        dataRow[4] = split[4];
                        dataRow[5] = split[5];
                        dataRow[6] = split[6];
                        dataRow[7] = split[7];
                        dataRow[8] = split[8];

                        dt.Rows.Add(dataRow);
                    }

                }
                lblGridHeader.Text = "Table containing Order Details";
                gdvCommentData.DataSource = dt;
                gdvCommentData.DataBind();

            }
            catch (FormatException)
            { }
        }

        protected void btnSub_Click(object sender, EventArgs e)
        {
            try
            {

                string data = proxy.getLike();
                DataTable dt = new DataTable();
                DataColumn colCustomerID = dt.Columns.Add("Customer ID", typeof(string));
                DataColumn colContactName = dt.Columns.Add("Contact Name", typeof(string));
                DataColumn colCity = dt.Columns.Add("City", typeof(string));
                DataColumn colState = dt.Columns.Add("State", typeof(string));
                DataColumn colCountry = dt.Columns.Add("Country", typeof(string));
                DataColumn colPhoneNumber = dt.Columns.Add("Phone Number", typeof(string));
                DataColumn colEmailAddress = dt.Columns.Add("Email Address", typeof(string));

                foreach (string row in data.Split('\n'))
                {
                    string[] split = row.Split('\t');
                    DataRow dataRow = dt.NewRow();
                    if (split.Count() > 6)
                    {
                        dataRow[0] = split[0];
                        dataRow[1] = split[1];
                        dataRow[2] = split[2];
                        dataRow[3] = split[3];
                        dataRow[4] = split[4];
                        dataRow[5] = split[5];
                        dataRow[6] = split[6];

                        dt.Rows.Add(dataRow);
                    }

                }
                lblGridHeader.Text = "Table containing Subset of Customer Details";
                gdvCommentData.DataSource = dt;
                gdvCommentData.DataBind();

            }
            catch (FormatException)
            { }
        }

        protected void btnExp_Click(object sender, EventArgs e)
        {
            try
            {

                string data = proxy.getInlineView();
                DataTable dt = new DataTable();
                DataColumn colExpenseID = dt.Columns.Add("Expense ID", typeof(string));
                DataColumn colAmountSpent = dt.Columns.Add("Amount Spent", typeof(string));
                foreach (string row in data.Split('\n'))
                {
                    string[] split = row.Split('\t');
                    DataRow dataRow = dt.NewRow();
                    if (split.Count() > 1)
                    {
                        dataRow[0] = split[0];
                        dataRow[1] = split[1];

                        dt.Rows.Add(dataRow);
                    }

                }
                lblGridHeader.Text = "Table containing Expense ID and Amount";
                gdvCommentData.DataSource = dt;
                gdvCommentData.DataBind();

            }
            catch (FormatException)
            { }
        }

        protected void btnTru_Click(object sender, EventArgs e)
        {
            try
            {

                string data = proxy.getTransaction();
                DataTable dt = new DataTable();
                DataColumn colTransactionID = dt.Columns.Add("Transaction ID", typeof(string));
                DataColumn colpriceID = dt.Columns.Add("Price ID", typeof(string));
                DataColumn colUnitPrice = dt.Columns.Add("Unit Price", typeof(string));
                DataColumn colDriverPrice = dt.Columns.Add("Driver Price", typeof(string));

                foreach (string row in data.Split('\n'))
                {
                    string[] split = row.Split('\t');
                    DataRow dataRow = dt.NewRow();
                    if (split.Count() > 3)
                    {
                        dataRow[0] = split[0];
                        dataRow[1] = split[1];
                        dataRow[2] = split[2];
                        dataRow[3] = split[3];

                        dt.Rows.Add(dataRow);
                    }

                }
                lblGridHeader.Text = "Table containing Price Details";
                gdvCommentData.DataSource = dt;
                gdvCommentData.DataBind();

            }
            catch (FormatException)
            { }
        }

        protected void btnAdd_Click(object sender, EventArgs e)
        {
            try
            {

                string data = proxy.getAddress();
                DataTable dt = new DataTable();
                DataColumn coladdressstreet1 = dt.Columns.Add("Address Street 1", typeof(string));
                DataColumn coladdressstreet2 = dt.Columns.Add("Address Street 2", typeof(string));
                foreach (string row in data.Split('\n'))
                {
                    string[] split = row.Split('\t');
                    DataRow dataRow = dt.NewRow();
                    if (split.Count() > 1)
                    {
                        dataRow[0] = split[0];
                        dataRow[1] = split[1];

                        dt.Rows.Add(dataRow);
                    }

                }
                lblGridHeader.Text = "Table containing Address Street 1 and Address Street 2";
                gdvCommentData.DataSource = dt;
                gdvCommentData.DataBind();

            }
            catch (FormatException)
            { }
        }

        protected void btnDet_Click(object sender, EventArgs e)
        {
            try
            {

                string data = proxy.getTruck();
                DataTable dt = new DataTable();
                DataColumn colTruckID = dt.Columns.Add("Truck ID", typeof(string));
                DataColumn colMake = dt.Columns.Add("Make", typeof(string));
                DataColumn colYear = dt.Columns.Add("Year", typeof(string));
                DataColumn colModel = dt.Columns.Add("Model", typeof(string));
                DataColumn colLicensePlateNo = dt.Columns.Add("License Plate No", typeof(string));
                DataColumn colEmployeeID = dt.Columns.Add("Employee ID", typeof(string));
                DataColumn colColor = dt.Columns.Add("Color", typeof(string));
                DataColumn colVIN = dt.Columns.Add("VIN", typeof(string));

                foreach (string row in data.Split('\n'))
                {
                    string[] split = row.Split('\t');
                    DataRow dataRow = dt.NewRow();
                    if (split.Count() > 7)
                    {
                        dataRow[0] = split[0];
                        dataRow[1] = split[1];
                        dataRow[2] = split[2];
                        dataRow[3] = split[3];
                        dataRow[4] = split[4];
                        dataRow[5] = split[5];
                        dataRow[6] = split[6];
                        dataRow[7] = split[7];

                        dt.Rows.Add(dataRow);
                    }

                }
                lblGridHeader.Text = "Table containing Truck Details";
                gdvCommentData.DataSource = dt;
                gdvCommentData.DataBind();

            }
            catch (FormatException)
            { }
        }

        protected void btnPrc_Click(object sender, EventArgs e)
        {
            try
            {

                string data = proxy.getPrice();
                DataTable dt = new DataTable();
                DataColumn colpriceID = dt.Columns.Add("Price ID", typeof(string));
                DataColumn colprice = dt.Columns.Add("Price", typeof(string));
                DataColumn collocationNameFrom = dt.Columns.Add("Location Name From", typeof(string));
                DataColumn collocationNameTo = dt.Columns.Add("Location Name To", typeof(string));
                

                foreach (string row in data.Split('\n'))
                {
                    string[] split = row.Split('\t');
                    DataRow dataRow = dt.NewRow();
                    if (split.Count() > 3)
                    {
                        dataRow[0] = split[0];
                        dataRow[1] = split[1];
                        dataRow[2] = split[2];
                        dataRow[3] = split[3];

                        dt.Rows.Add(dataRow);
                    }

                }
                lblGridHeader.Text = "Table containing Details of Price from Locations";
                gdvCommentData.DataSource = dt;
                gdvCommentData.DataBind();

            }
            catch (FormatException)
            { }
        }

        protected void btnPay_Click(object sender, EventArgs e)
        {
            try
            {

                string data = proxy.getPayment();
                DataTable dt = new DataTable();
                DataColumn colPaymentID = dt.Columns.Add("Payment ID", typeof(string));
                DataColumn colPaymentMethod = dt.Columns.Add("Payment Method", typeof(string));
                DataColumn colPaymentAmount = dt.Columns.Add("Payment Amount", typeof(string));

                foreach (string row in data.Split('\n'))
                {
                    string[] split = row.Split('\t');
                    DataRow dataRow = dt.NewRow();
                    if (split.Count() > 2)
                    {
                        dataRow[0] = split[0];
                        dataRow[1] = split[1];
                        dataRow[2] = split[2];

                        dt.Rows.Add(dataRow);
                    }

                }
                lblGridHeader.Text = "Table containing Payment Details";
                gdvCommentData.DataSource = dt;
                gdvCommentData.DataBind();

            }
            catch (FormatException)
            { }
        }

        protected void btnCmp_Click(object sender, EventArgs e)
        {
            try
            {

                string data = proxy.getExpense();
                DataTable dt = new DataTable();
                DataColumn colExpenseID = dt.Columns.Add("Expense ID", typeof(string));
                DataColumn colEmployeeID = dt.Columns.Add("Employee ID", typeof(string));
                DataColumn colExpenseType = dt.Columns.Add("Expense Type", typeof(string));
                DataColumn colPurposeofExpense = dt.Columns.Add("Purpose of Expense", typeof(string));
                DataColumn colAmountSpent = dt.Columns.Add("Amount Spent", typeof(string));
                DataColumn colDescription = dt.Columns.Add("Description", typeof(string));
                DataColumn colDatePurchased = dt.Columns.Add("Date Purchased", typeof(string));
                DataColumn colDateSubmitted = dt.Columns.Add("Date Submitted", typeof(string));
                DataColumn colAdvanceAmount = dt.Columns.Add("Advance Amount", typeof(string));
                DataColumn colPaymentMethod = dt.Columns.Add("Payment Method", typeof(string));

                foreach (string row in data.Split('\n'))
                {
                    string[] split = row.Split('\t');
                    DataRow dataRow = dt.NewRow();
                    if (split.Count() > 9)
                    {
                        dataRow[0] = split[0];
                        dataRow[1] = split[1];
                        dataRow[2] = split[2];
                        dataRow[3] = split[3];
                        dataRow[4] = split[4];
                        dataRow[5] = split[5];
                        dataRow[6] = split[6];
                        dataRow[7] = split[7];
                        dataRow[8] = split[8];
                        dataRow[9] = split[9];

                        dt.Rows.Add(dataRow);
                    }

                }
                lblGridHeader.Text = "Table containing Expense Details";
                gdvCommentData.DataSource = dt;
                gdvCommentData.DataBind();

            }
            catch (FormatException)
            { }
        }

        protected void btnEmp_Click(object sender, EventArgs e)
        {
            try
            {

                string data = proxy.getEmployee();
                DataTable dt = new DataTable();
                DataColumn colEmployeeID = dt.Columns.Add("Employee ID", typeof(string));
                DataColumn colFirstName = dt.Columns.Add("First Name", typeof(string));
                DataColumn colLastName = dt.Columns.Add("Last Name", typeof(string));
                DataColumn colEmail = dt.Columns.Add("Email", typeof(string));
                DataColumn colExtension = dt.Columns.Add("Extension", typeof(string));
                DataColumn colHomePhone = dt.Columns.Add("Home Phone", typeof(string));
                DataColumn colCellPhone = dt.Columns.Add("Cell Phone", typeof(string));
                DataColumn colJobTitle = dt.Columns.Add("Job Title", typeof(string));
                DataColumn colSocialSecurityNumber = dt.Columns.Add("Social Security Number", typeof(string));
                DataColumn colDriverLicenseNumber = dt.Columns.Add("Driver License Number", typeof(string));
                DataColumn colAddress = dt.Columns.Add("Address", typeof(string));
                DataColumn colCity = dt.Columns.Add("City", typeof(string));
                DataColumn colState = dt.Columns.Add("State", typeof(string));
                DataColumn colPostalCode = dt.Columns.Add("Postal Code", typeof(string));
                DataColumn colBirthDate = dt.Columns.Add("Birth Date", typeof(string));
                DataColumn colDateHired = dt.Columns.Add("Date Hired", typeof(string));
                DataColumn colSalary = dt.Columns.Add("Salary", typeof(string));
                DataColumn colNotes = dt.Columns.Add("Notes", typeof(string));
                
                foreach (string row in data.Split('\n'))
                {
                    string[] split = row.Split('\t');
                    DataRow dataRow = dt.NewRow();
                    if (split.Count() > 17)
                    {
                        dataRow[0] = split[0];
                        dataRow[1] = split[1];
                        dataRow[2] = split[2];
                        dataRow[3] = split[3];
                        dataRow[4] = split[4];
                        dataRow[5] = split[5];
                        dataRow[6] = split[6];
                        dataRow[7] = split[7];
                        dataRow[8] = split[8];
                        dataRow[9] = split[9];
                        dataRow[10] = split[10];
                        dataRow[11] = split[11];
                        dataRow[12] = split[12];
                        dataRow[13] = split[13];
                        dataRow[14] = split[14];
                        dataRow[15] = split[15];
                        dataRow[16] = split[16];
                        dataRow[17] = split[17];
                        

                        dt.Rows.Add(dataRow);
                    }

                }
                lblGridHeader.Text = "Table containing Employee Details";
                gdvCommentData.DataSource = dt;
                gdvCommentData.DataBind();

            }
            catch (FormatException)
            { }
        }

        protected void btnInvData_Click(object sender, EventArgs e)
        {
            try
            {

                string data = proxy.getInvoice();
                DataTable dt = new DataTable();
                DataColumn colInvoiceID = dt.Columns.Add("Invoice ID", typeof(string));
                DataColumn colOrderID = dt.Columns.Add("Order ID", typeof(string));
                DataColumn colOrderTotalAmount = dt.Columns.Add("Order Total Amount", typeof(string));

                foreach (string row in data.Split('\n'))
                {
                    string[] split = row.Split('\t');
                    DataRow dataRow = dt.NewRow();
                    if (split.Count() > 2)
                    {
                        dataRow[0] = split[0];
                        dataRow[1] = split[1];
                        dataRow[2] = split[2];

                        dt.Rows.Add(dataRow);
                    }

                }
                lblGridHeader.Text = "Table containing Invoice Details";
                gdvCommentData.DataSource = dt;
                gdvCommentData.DataBind();

            }
            catch (FormatException)
            { }
        }

        protected void btnPrice_Click(object sender, EventArgs e)
        {
            try
            {

                string data = proxy.getPricing();
                DataTable dt = new DataTable();
                DataColumn colpriceID = dt.Columns.Add("price ID", typeof(string));
                DataColumn collocationIDFrom = dt.Columns.Add("Location ID From", typeof(string));
                DataColumn collocationIDTo = dt.Columns.Add("Location ID To", typeof(string));
                DataColumn colprice = dt.Columns.Add("Price", typeof(string));
                DataColumn collocationCodeFrom = dt.Columns.Add("Location Code From", typeof(string));
                DataColumn collocationCodeTo = dt.Columns.Add("Location Code To", typeof(string));
                DataColumn collocationNameFrom = dt.Columns.Add("Location Name From", typeof(string));
                DataColumn collocationNameTo = dt.Columns.Add("Location Name To", typeof(string));
                DataColumn colCustomerID = dt.Columns.Add("Customer ID", typeof(string));
                DataColumn coltype = dt.Columns.Add("Type", typeof(string));
                DataColumn coltype1 = dt.Columns.Add("Type 1", typeof(string));

                foreach (string row in data.Split('\n'))
                {
                    string[] split = row.Split('\t');
                    DataRow dataRow = dt.NewRow();
                    if (split.Count() > 10)
                    {
                        dataRow[0] = split[0];
                        dataRow[1] = split[1];
                        dataRow[2] = split[2];
                        dataRow[3] = split[3];
                        dataRow[4] = split[4];
                        dataRow[5] = split[5];
                        dataRow[6] = split[6];
                        dataRow[7] = split[7];
                        dataRow[8] = split[8];
                        dataRow[9] = split[9];
                        dataRow[10] = split[10];

                        dt.Rows.Add(dataRow);
                    }

                }
                lblGridHeader.Text = "Table containing Pricing Details";
                gdvCommentData.DataSource = dt;
                gdvCommentData.DataBind();

            }
            catch (FormatException)
            { }
        }

        protected void btnCom_Click(object sender, EventArgs e)
        {
            try
            {

                string data = proxy.getCommentDetails();
                DataTable dt = new DataTable();
                DataColumn colCommentID = dt.Columns.Add("Comment ID", typeof(string));
                DataColumn colCommentTime = dt.Columns.Add("Comment Time", typeof(string));
                DataColumn colCommentName = dt.Columns.Add("Comment Name", typeof(string));
                DataColumn colCustomerID = dt.Columns.Add("Customer ID", typeof(string));
                DataColumn colTransactionID = dt.Columns.Add("Transaction ID", typeof(string));

                foreach (string row in data.Split('\n'))
                {
                    string[] split = row.Split('\t');
                    DataRow dataRow = dt.NewRow();
                    if (split.Count() > 2)
                    {
                        dataRow[0] = split[0];
                        dataRow[1] = split[1];
                        dataRow[2] = split[2];
                        dataRow[3] = split[3];
                        dataRow[4] = split[4];

                        dt.Rows.Add(dataRow);
                    }

                }
                lblGridHeader.Text = "Table containing Comment Details";
                gdvCommentData.DataSource = dt;
                gdvCommentData.DataBind();

            }
            catch (FormatException)
            { }
        }
    }
}