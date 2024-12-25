package com.mobile.Repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.mobile.Entity.Mobile;
@Repository
public interface MobileRepository extends CrudRepository<Mobile, Long> {
Mobile findByMobileNumber(Long mobileNumber);

}
