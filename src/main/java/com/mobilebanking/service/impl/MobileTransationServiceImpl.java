package com.mobilebanking.service.impl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.mobilebanking.dto.MobileTransferRequestDto;
import com.mobilebanking.dto.MobileTransferResponseDto;
import com.mobilebanking.entity.MobileTransaction;
import com.mobilebanking.fiegn.AccountService;
import com.mobilebanking.repository.MobilebankingRepository;
import com.mobilebanking.service.MobileTransactionService;

@Service
public class MobileTransationServiceImpl implements MobileTransactionService{

	@Autowired
	AccountService accountService;
	
	@Autowired
	MobilebankingRepository mobilebankingRepository;
	
  

	@Override
	public MobileTransferResponseDto performGooglepayFundTransfer(
			MobileTransferRequestDto mobileTransferRequestDto) {
		// TODO Auto-generated method stub
        accountService.performGooglepayFundTransfer(mobileTransferRequestDto);
		MobileTransaction transaction=new MobileTransaction();
		transaction.setFromPhoneNumber(mobileTransferRequestDto.getFromPhoneNumber());
		transaction.setToPhoneNumber(mobileTransferRequestDto.getToPhoneNumber());
		transaction.setTransactionType(mobileTransferRequestDto.getTransactionType());
		transaction.setTransactionDate(LocalDateTime.now());
		transaction.setAmount(mobileTransferRequestDto.getAmount());
		mobilebankingRepository.save(transaction);
		MobileTransferResponseDto mobileTransferResponseDto=new MobileTransferResponseDto();
		BeanUtils.copyProperties(transaction, mobileTransferResponseDto);
		return mobileTransferResponseDto;
	}

	

}
