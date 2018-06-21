package com.wesdm.designpatterns.behavioral.state;

public class SoldOutState implements State {
	GumballMachine machine;
	
	public SoldOutState(GumballMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("Machine sold out");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted yet");

	}

	@Override
	public void turnCrank() {
		System.out.println("Sold out");

	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");

	}

}
