package com.mobile.DTO;

import com.mobile.Entity.Mobile;

public class MobileDTO {
 private Long mobileNumber;
 private String Name;
 public MobileDTO() {}
public MobileDTO(Long mobileNumber, String name) {
	super();
	this.mobileNumber = mobileNumber;
	Name = name;
}
public Long getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(Long mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
@Override
public String toString() {
	return "MobileDTO [mobileNumber=" + mobileNumber + ", Name=" + Name + "]";
}
 public Mobile createEntity() {
	 Mobile mob=new Mobile();
	 mob.setMobileNumber(this.getMobileNumber());
	 mob.setName(this.getName());
	 return mob;
 }
 public static MobileDTO valueOf(Mobile mobile) {
	 MobileDTO mobDTO=new MobileDTO();
	 mobDTO.setMobileNumber(mobile.getMobileNumber());
	 mobDTO.setName(mobile.getName());
	 return mobDTO;
 }
}
