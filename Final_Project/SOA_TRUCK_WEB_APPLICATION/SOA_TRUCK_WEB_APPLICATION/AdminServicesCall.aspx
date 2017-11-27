<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="AdminServicesCall.aspx.cs" Inherits="SOA_TRUCK_WEB_APPLICATION.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <link href="bootstrap.min.css" rel="stylesheet" media="screen"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.2/css/bootstrap.min.css" integrity="sha384-y3tfxAZXuh4HwSYylfB+J125MxIs6mR5FOHamPBG064zB+AFeWH94NdvaCBm8qnd" crossorigin="anonymous"/>
     <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />

    <title>Admin Services Call</title>

</head>
<body>

    <form id="form1" runat="server">
        <div class="card">
             <div class="card-header">Truck Application</div>
        <div id="wrapper" class="container-fluid card-body">
            <h4 class="card-title"> Admin Web Page </h4>
<div class="btn-toolbar" role="toolbar" aria-label="Toolbar with button groups">
    <div class="btn-group">
        <asp:Button ID="btnComment" runat="server" class="btn btn-primary"  OnClick="btnComment_Click" Text="Comment" data-toggle="tooltip" data-placement="bottom" title="Click here to get Comment ID and Comment Name" />
        <asp:Button ID="btnMax" runat="server" OnClick="btnMax_Click" class="btn btn-primary"  Text="TransactionAmount" data-toggle="tooltip" data-placement="bottom" title="Click here to get Transaction ID and Transaction Amount" />
            <asp:Button ID="btnBill" runat="server" OnClick="btnBill_Click" class="btn btn-primary"  Text="BillingAddress" title="Click here to get Billing Address and Contact Name"/>
            <asp:Button ID="btnLoc" runat="server" OnClick="btnLoc_Click" class="btn btn-primary"  Text="CustomerLocationID" title="Click here to get Customer ID/Location ID and Contact Name/Location Name"/>
        <asp:Button ID="btnCode" runat="server" OnClick="btnCode_Click" class="btn btn-primary"  Text="PostalCode" title="Click here to get Postal Code and State"/>
        <asp:Button ID="btnLoc1" runat="server" OnClick="btnLoc1_Click" class="btn btn-primary"  Text="LocationDetails" title="Click here to get Location ID, isActive and Postal Code"/>
        <asp:Button ID="btnCust" runat="server" OnClick="btnCust_Click" class="btn btn-primary"  Text="CustomerDetails" title="Click here to get Customer Details"/>
        <asp:Button ID="btnCustID" runat="server" OnClick="btnCustID_Click" class="btn btn-primary"  Text="OrderDetails" title="Click here to get Order Details"/>
        <asp:Button ID="btnSub" runat="server" OnClick="btnSub_Click" class="btn btn-primary"  Text="CustomerDetailsSubset" title="Click here to get Subset of Customer Details"/>
        <asp:Button ID="btnExp" runat="server" OnClick="btnExp_Click" class="btn btn-primary"  Text="ExpenseDetails" title="Click here to get Expense ID and Amount"/>
        </div>
    <div class="btn-group">
        <asp:Button ID="btnTru" runat="server" OnClick="btnTru_Click" class="btn btn-primary"  Text="Price" title="Click here to get Price Details"/>
        <asp:Button ID="btnAdd" runat="server" OnClick="btnAdd_Click" class="btn btn-primary"  Text="Address" title="Click here to get Address Street 1 and Address Street 2"/>
        <asp:Button ID="btnDet" runat="server" OnClick="btnDet_Click" class="btn btn-primary"  Text="TruckDetails" title="Click here to get Truck Details"/>
        <asp:Button ID="btnPrc" runat="server" OnClick="btnPrc_Click" class="btn btn-primary"  Text="PriceFromLocation" title="Click here to get Details of Price from Locations"/>
        <asp:Button ID="btnPay" runat="server" OnClick="btnPay_Click" class="btn btn-primary"  Text="Payment" title="Click here to get Payment Details"/>
        <asp:Button ID="btnCmp" runat="server" OnClick="btnCmp_Click" class="btn btn-primary"  Text="CompleteExpenseDetails" title="Click here to get Expense Details"/>
        <asp:Button ID="btnEmp" runat="server" OnClick="btnEmp_Click" class="btn btn-primary"  Text="EmployeeDetails" title="Click here to get Employee Details"/>
        <asp:Button ID="btnInv" runat="server" OnClick="btnInvData_Click" class="btn btn-primary"  Text="InvoiceDetails" title="Click here to get Invoice Details"/>
        <asp:Button ID="btnPrice" runat="server" OnClick="btnPrice_Click" class="btn btn-primary"  Text="PricingDetails" title="Click here to get Pricing Details"/>
        <asp:Button ID="btnCom" runat="server" OnClick="btnCom_Click" class="btn btn-primary"  Text="CommentDetails" title="Click here to get Comment Details"/>        
        </div>
    </div>
            <div class="container-fluid">
                <asp:Label ID="lblGridHeader" Visible="true" CssClass="card-subtitle" runat="server"></asp:Label>
            
        <div class="table table-striped">
        <asp:GridView ID="gdvCommentData" runat="server">
        </asp:GridView>
            </div>
            </div>
    
        </div>
                   <div class="card-footer text-muted">
    <small class="text-muted">copy write Deepak</small>
  </div> 
            </div>
    </form>
    <script src="http://code.jquery.com/jquery.js"></script>
    <script src="bootstrap.min.js"></script>

</body>
</html>
