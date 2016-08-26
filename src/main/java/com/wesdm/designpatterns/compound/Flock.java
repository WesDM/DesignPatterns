package com.wesdm.designpatterns.compound;

import java.util.ArrayList;
import java.util.List;

//Composite
public class Flock implements Quackable {
	List<Quackable> flock = new ArrayList<>();
	Observable observable;
	
	public Flock(){
		observable = new Observable(this);
	}
	
	public void add(Quackable quacker){
		flock.add(quacker);
		notifyObservers();
	}
	
	@Override
	public void quack() {
		for(Quackable quacker : flock){
			quacker.quack();
		}
	}

	@Override
	public void registerObserver(Observer o) {
		for(QuackObservable q : flock){
			q.registerObserver(o);
		}
		observable.registerObserver(o);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}

}
