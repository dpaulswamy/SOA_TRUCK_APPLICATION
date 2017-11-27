package com.domparser;

import models.DaoModel;

public class InsertData {
	
	public static void main(String[] args) {
		
		DaoModel dao = new DaoModel();
		
		try {
			dao.CreateTable();
			dao.InsertData();
			dao.UpdateTable();
		}catch(Exception e){
                    e.printStackTrace();
		}
	}

}
