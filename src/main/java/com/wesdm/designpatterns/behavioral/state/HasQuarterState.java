/**
 * 
 */
package com.wesdm.designpatterns.behavioral.state;

import java.util.Random;

/**
 * @author Wesley
 *
 */
public class HasQuarterState implements State {
	GumballMachine machine;
	Random randomWinner = new Random(System.currentTimeMillis());

	public HasQuarterState(GumballMachine machine) {
		this.machine = machine;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wesdm.designpatterns.state.State#insertQuarter()
	 */
	@Override
	public void insertQuarter() {
		System.out.println("Can't insert another quarter");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wesdm.designpatterns.state.State#ejectQuarter()
	 */
	@Override
	public void ejectQuarter() {
		machine.setState(machine.getNoQuarterState());
		System.out.println("Quarter returned");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wesdm.designpatterns.state.State#turnCrank()
	 */
	@Override
	public void turnCrank() {
		System.out.println("Turned...");
		int winner = randomWinner.nextInt(10);
		if((winner == 0) && machine.getCount() > 1){
			machine.setState(machine.getWinnerState());
		} else {
			machine.setState(machine.getSoldState());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wesdm.designpatterns.state.State#dispense()
	 */
	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

}
