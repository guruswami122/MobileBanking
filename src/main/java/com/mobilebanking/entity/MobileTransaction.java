package com.mobilebanking.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class MobileTransaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
	private Integer transactionId;
	private BigDecimal amount;
	private String transactionType;
	private Long fromPhoneNumber;
	private Long toPhoneNumber;
	private LocalDateTime transactionDate;
	
	
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
	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDateTime localDate) {
		this.transactionDate = localDate;
	}


}
