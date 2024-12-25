package com.mobile.Service;

import com.mobile.DTO.MobileDTO;
import com.mobile.Exception.MobileAlreayExistsException;
import com.mobile.Exception.MobileNotFoundException;


public interface MobileService {
public Long createMobile(MobileDTO mobileDTO) throws MobileAlreayExistsException;
public MobileDTO getByNum(Long mobileNumber) throws MobileNotFoundException;


}
