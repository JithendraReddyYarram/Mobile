package com.mobile.Exception;

public class MobileNotFoundException extends RuntimeException {
String msg;
	public MobileNotFoundException() {}
	public MobileNotFoundException(String msg) {
		super(msg);
		this.msg=msg;
	}
}
