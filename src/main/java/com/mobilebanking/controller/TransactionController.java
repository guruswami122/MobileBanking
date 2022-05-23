package com.mobilebanking.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobilebanking.dto.MobileTransferRequestDto;
import com.mobilebanking.dto.MobileTransferResponseDto;
import com.mobilebanking.service.MobileTransactionService;


@RestController
@Validated
public class TransactionController {

	@Autowired
	MobileTransactionService transacionservice;
	
	@PostMapping("/googlepaytransfer")
	public ResponseEntity<MobileTransferResponseDto> fundTransfer(@RequestBody MobileTransferRequestDto mobileTransferRequestDto) {
		
		return ResponseEntity.status(HttpStatus.OK).body(transacionservice.performGooglepayFundTransfer(mobileTransferRequestDto));
		}
	
	
	
	
}
