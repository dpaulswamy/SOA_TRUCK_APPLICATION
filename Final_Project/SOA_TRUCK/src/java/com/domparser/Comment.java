package com.domparser;

public class Comment {
	
	private String commentID;
	private String commentName;
	private String customerID;
	private String transactionID;
	private String commentTime;
	
	public String getCommentID(){
		return commentID;
	}
	
	public void setCommentID(String commentID){
		this.commentID = commentID;
	}
	
	public String getCommentName(){
		return commentName;
	}
	
	public void setCommentName(String commentName){
		this.commentName = commentName;
	}
	
	public String getCustomerID(){
		return customerID;
	}
	
	public void setCustomerID(String customerID){
		this.customerID = customerID;
	}
	
	public String getTransactionID(){
		return transactionID;
	}
	
	public void setTransactionID(String transactionID){
		this.transactionID = transactionID;
	}

	public String getCommentTime(){
		return commentTime;
	}
	
	public void setCommentTime(String commentTime){
		this.commentTime = commentTime;
	}
	
	public String toString() {
		return "Comment:: CommentID=" + this.commentID + " CommentName=" + this.commentName + " CustomerID=" + this.customerID +
				" TransactionID=" + this.transactionID + " commentTime=" + this.commentTime;
	}
}
