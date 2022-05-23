package com.mobilebanking.service;

import java.util.List;

import com.mobilebanking.entity.MobileTransaction;



public interface MobileStatementService {
	
	//List<MobileTransaction> getMonthlyEStatement(long accountno, int month, int year);
	List<MobileTransaction> getLastfiveTransactions(long phonenumber);


}
