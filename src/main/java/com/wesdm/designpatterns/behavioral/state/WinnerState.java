package com.wesdm.designpatterns.behavioral.state;

public class WinnerState implements State {
	
	GumballMachine machine;
	
	public WinnerState(GumballMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		throw new RuntimeException();
	}

	@Override
	public void ejectQuarter() {
		throw new RuntimeException();

	}

	@Override
	public void turnCrank() {
		throw new RuntimeException();

	}

	@Override
	public void dispense() {
		System.out.println("You're a winner!");
		machine.releaseBall();
		if(machine.getCount() == 0){
			machine.setState(machine.getSoldOutState());
		} else {
			machine.releaseBall();
			if(machine.getCount() > 0){
				machine.setState(machine.getNoQuarterState());
			} else {
				System.out.println("Out of balls");
				machine.setState(machine.getSoldOutState());
			}
		}
	}

}
