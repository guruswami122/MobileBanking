package com.mobilebanking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mobilebanking.entity.MobileTransaction;
import com.mobilebanking.service.MobileStatementService;

@RestController
@Validated
public class MobileStatmentController {

	@Autowired
	MobileStatementService mobileStatementService;
	
	
	@GetMapping("/lastfivetransactions/{phonenumber}")
	public List<MobileTransaction> getLastfiveTransactions(@PathVariable long phonenumber) {
	  return mobileStatementService.getLastfiveTransactions(phonenumber);
	}
	

}
