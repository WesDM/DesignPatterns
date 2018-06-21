package com.wesdm.designpatterns.creational.daofactory;

import java.util.Collection;

import javax.sql.RowSet;

public interface CustomerDAO {
	 public int insertCustomer();
	  public boolean deleteCustomer();
	  public Customer findCustomer();
	  public boolean updateCustomer();
	  public RowSet selectCustomersRS();
	  public Collection selectCustomersTO();
}
