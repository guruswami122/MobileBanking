package com.mobilebanking.fiegn;

import javax.validation.Valid;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mobilebanking.dto.MobileTransferRequestDto;
import com.mobilebanking.dto.MobileTransferResponseDto;


@FeignClient(value = "mobilebanking", url = "http://localhost:9090/bank")
public interface AccountService {
	
	@PostMapping("/fundTransferGooglepay")
	public ResponseEntity<String> performGooglepayFundTransfer(@Valid @RequestBody MobileTransferRequestDto mobileTransferRequestDto);


}
