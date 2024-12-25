 package com.mobile.Service;


import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.DTO.MobileDTO;
import com.mobile.Entity.Mobile;
import com.mobile.Exception.MobileAlreayExistsException;
import com.mobile.Exception.MobileNotFoundException;
import com.mobile.Repository.MobileRepository;
@Service
public class MobileServiceImpl implements MobileService {
	@Autowired
 private MobileRepository mobileRepository;
	
	Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Override
	public Long createMobile(MobileDTO mobileDTO) {
		logger.info("Creation request of Mobile {} :",mobileDTO);
		if(mobileRepository.existsById(mobileDTO.getMobileNumber())) {
			throw new MobileAlreayExistsException();
		}
		Mobile mob=mobileDTO.createEntity();
	Mobile mobrepo=	mobileRepository.save(mob);
		return mobrepo.getMobileNumber();
	}

	@Override
	public MobileDTO getByNum(Long mobileNumber) {
		
		
		if(mobileRepository.findByMobileNumber(mobileNumber)==null) {
			 throw new MobileNotFoundException();
		}
		Mobile mob=mobileRepository.findByMobileNumber(mobileNumber);
		MobileDTO mobDTO=MobileDTO.valueOf(mob);
		
		return mobDTO;
	}

}
