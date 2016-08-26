package com.wesdm.designpatterns.state;

public class SoldState implements State {
	
	GumballMachine machine;
	
	public SoldState(GumballMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Please wait, gumball dispensing");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, crank turned");

	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball");

	}

	@Override
	public void dispense() {
		machine.releaseBall();
		if (machine.getCount() == 0) {
			System.out.println("Out of gumballs");
			machine.setState(machine.getSoldOutState());
		} else {
			machine.setState(machine.getNoQuarterState());
		}
	}

}
