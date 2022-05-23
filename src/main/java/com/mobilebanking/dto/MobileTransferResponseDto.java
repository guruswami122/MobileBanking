package com.mobilebanking.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class MobileTransferResponseDto {
	
	private BigDecimal amount;
	private String transactionType;
	private Long fromPhoneNumber;
	private Long toPhoneNumber;
	private LocalDateTime transactionDate;
	
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public Long getFromPhoneNumber() {
		return fromPhoneNumber;
	}
	public void setFromPhoneNumber(Long fromPhoneNumber) {
		this.fromPhoneNumber = fromPhoneNumber;
	}
	public Long getToPhoneNumber() {
		return toPhoneNumber;
	}
	public void setToPhoneNumber(Long toPhoneNumber) {
		this.toPhoneNumber = toPhoneNumber;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}

	
}
