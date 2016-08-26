package com.wesdm.designpatterns.adapter;

public class Dirtybirdz {
	public static void main(String[] args) {
		Turkey t = new WildTurkey();
		TurkeyAdapter ta = new TurkeyAdapter(t);
		Duck d = new MallardDuck();
		
		System.out.println("Mallard Duck...");
		testDuck(d);
		
		System.out.println("Turkey Adapater...");
		testDuck(ta);
	}
	
	public static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}
}
