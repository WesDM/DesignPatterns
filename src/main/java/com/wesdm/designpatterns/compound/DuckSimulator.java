package com.wesdm.designpatterns.compound;

public class DuckSimulator {
	public static void main(String[] args){
		DuckSimulator s = new DuckSimulator();
		DuckFactory df = new CountingDuckFactory();
		
		s.simulate(df);
	}
	
	void simulate(DuckFactory df){
		Flock f = new Flock();
		Quackologist q = new Quackologist(f);
//		f.registerObserver(q);
		f.add(df.createDuckCall());
		f.add(df.createMallardDuck());
		f.add(df.createRubberDuck());
		f.add(new GooseAdapter(new Goose()));
		f.registerObserver(q);

		simulate(f);
		
		System.out.println("Ducks quacked "+QuackCounter.getNumberOfQuacks()+" times");
	}
	
	void simulate(Quackable duck){
		duck.quack();
	}
}	
