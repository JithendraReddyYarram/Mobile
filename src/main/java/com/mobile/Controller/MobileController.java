package com.mobile.Controller;


import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.DTO.MobileDTO;
import com.mobile.Exception.MobileAlreayExistsException;
import com.mobile.Service.MobileService;

@RestController
public class MobileController {
	@Autowired
	private Environment env;
	Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
private MobileService mobileService;
	@RequestMapping(value="/mobile",method=RequestMethod.POST)
public ResponseEntity<String>  save(@RequestBody MobileDTO mobileDTO) throws MobileAlreayExistsException {
	logger.info("creation request of Mobile {} :",mobileDTO);
Long mobile=mobileService.createMobile(mobileDTO);
	 return new ResponseEntity<>(env.getProperty("API_INSERT_SUCCESS")+"of mobileNumber:-"+mobile,HttpStatus.CREATED);
}
	@RequestMapping(value="/mobile/{mobileNumber}",method=RequestMethod.GET)
public ResponseEntity<MobileDTO> getNumber(@PathVariable Long mobileNumber) {
		logger.info("Profile Request Mobile {}",mobileNumber);
MobileDTO mob= mobileService.getByNum(mobileNumber);
	return new ResponseEntity<>(mob,HttpStatus.ACCEPTED);
}
}
