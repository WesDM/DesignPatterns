package com.wesdm.designpatterns.behavioral.state;

public class NoQuarterState implements State {
	GumballMachine machine;
	
	public NoQuarterState(GumballMachine machine) {
		this.machine = machine;
	}
	@Override
	public void insertQuarter() {
		machine.setState(machine.getHasQuarterState());
		System.out.println("Quarter inserted");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted yet");
	}

	@Override
	public void turnCrank() {
		System.out.println("You haven't inserted yet");
	}

	@Override
	public void dispense() {
		System.out.println("Pay first");
	}

}
