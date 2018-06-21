package com.wesdm.designpatterns.creational.daofactory;

import java.util.Collection;

public class DAOClient {
	public static void main(String... args) {
		// create the required DAO Factory
		DAOFactory cloudscapeFactory = DAOFactory.getDAOFactory(DAOFactory.CLOUDSCAPE);

		// Create a DAO
		CustomerDAO custDAO = cloudscapeFactory.getCustomerDAO();

		// create a new customer
		int newCustNo = custDAO.insertCustomer();

		// Find a customer object. Get the Transfer Object.
		Customer cust = custDAO.findCustomer();

		// modify the values in the Transfer Object.
		// cust.setAddress();
		// cust.setEmail();
		// update the customer object using the DAO
		custDAO.updateCustomer();

		// delete a customer object
		custDAO.deleteCustomer();
		// select all customers in the same city
		Customer criteria = new Customer();
		// criteria.setCity("New York");
		Collection customersList = custDAO.selectCustomersTO();
		// returns customersList - collection of Customer
		// Transfer Objects. iterate through this collection to
		// get values.
	}
}
