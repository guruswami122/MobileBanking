package com.mobilebanking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobilebanking.entity.MobileTransaction;

@Repository
public interface MobilebankingRepository extends JpaRepository<MobileTransaction, Integer>{
	
	List<MobileTransaction> findByFromPhoneNumberOrToPhoneNumber(Long Long1,Long Long2);

}
