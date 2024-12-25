package com.mobile.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="Mobile")
public class Mobile {
	@Id
	private Long mobileNumber;
	@Column
	 private String Name;
	 public Mobile() {}
	public Mobile(Long mobileNumber, String name) {
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
}
