package com.wesdm.designpatterns.daofactory;

public abstract class DAOFactory {
	// List of DAO types supported by the factory
	public static final int CLOUDSCAPE = 1;
	public static final int ORACLE = 2;
	public static final int SYBASE = 3;

	// There will be a method for each DAO that can be
	// created. The concrete factories will have to
	// implement these methods.
	public abstract CustomerDAO getCustomerDAO();

	public abstract AccountDAO getAccountDAO();

	public abstract OrderDAO getOrderDAO();
	
	//Subclasses can't override this method.
	public static DAOFactory getDAOFactory(int whichFactory) {
		switch (whichFactory) {
		case CLOUDSCAPE:
			return new CloudscapeDAOFactory();
		case ORACLE:
			return new OracleDAOFactory();
		case SYBASE:
			return new SybaseDAOFactory();
		default:
			return null;
		}
	}
}
