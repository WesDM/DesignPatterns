/**
 * 
 */
package com.wesdm.designpatterns.compound;

/**
 * @author Wesley
 *
 */
public class Quackologist implements Observer {
	QuackObservable o;
	
	public Quackologist(QuackObservable o) {
			this.o = o;
			o.registerObserver(this);
	}

	@Override
	public void update(QuackObservable duck) {
		if(duck instanceof Flock){
			System.out.println("Flock added a duck");
		}
		else{System.out.println("Quackologist: "+duck.getClass().getSimpleName()+" just quacked.");}
	}

}
