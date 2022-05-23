package com.mobilebanking.service.impl;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mobilebanking.entity.MobileTransaction;
import com.mobilebanking.repository.MobilebankingRepository;
import com.mobilebanking.service.MobileStatementService;



@Service
public class MobileStatementServiceImpl implements MobileStatementService{

	@Autowired
	MobilebankingRepository mobilebankingRepository;
	
	
	@Override
	public List<MobileTransaction> getLastfiveTransactions(long phonenumber) {
		// TODO Auto-generated method stub
        return mobilebankingRepository.findByFromPhoneNumberOrToPhoneNumber(phonenumber, phonenumber).stream().sorted(Comparator.comparing(MobileTransaction::getTransactionDate).reversed()).limit(5).toList();
		
	}
	
	
}
