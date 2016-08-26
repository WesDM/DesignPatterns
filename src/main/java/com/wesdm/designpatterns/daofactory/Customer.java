package com.wesdm.designpatterns.daofactory;

/**
 * Transfer object to send and receive data from clients
 * @author Wesley
 *
 */
public class Customer implements java.io.Serializable {

	private static final long serialVersionUID = -3148856303968910242L;
	
	int CustomerNumber;
	String name;
	String streetAddress;
	String city;
}
