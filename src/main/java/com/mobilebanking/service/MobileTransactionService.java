package com.mobilebanking.service;

import java.util.List;
import com.mobilebanking.dto.MobileTransferRequestDto;
import com.mobilebanking.dto.MobileTransferResponseDto;


public interface MobileTransactionService {
	
	public MobileTransferResponseDto performGooglepayFundTransfer(MobileTransferRequestDto mobileTransferRequestDto);
	


	

}
