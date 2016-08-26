package com.wesdm.designpatterns.state;

public class GumballMachine {

	State soldOutState;
	State soldState;
	State noQuarterState;
	State hasQuarterState;
	State winnerState; 		//Add winner state. We're extending this class.



	State state = soldOutState;
	int count = 0;
	String location;

	public GumballMachine(String location, int count) {
		this.soldOutState = new SoldOutState(this);
		this.soldState = new SoldState(this);
		this.noQuarterState = new NoQuarterState(this);
		this.hasQuarterState = new HasQuarterState(this);
		this.winnerState = new WinnerState(this);
		this.location = location;
		this.count = count;
		if (count > 0) {
			state = noQuarterState;
		}
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public int getCount() {
		return count;
	}
	
	public State getWinnerState() {
		return winnerState;
	}

	public String getLocation() {
		return location;
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	public void releaseBall() {
		System.out.println("Here it comes...");
		if (count != 0) {
			count--;
		}
	}

	public void refill(int count) {
		if(count > 0 && getState().equals(getSoldOutState())){
			this.count = count;
			setState(getNoQuarterState());
		}
	}
}
