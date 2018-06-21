package com.wesdm.designpatterns.structural.adapter;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("Gobble gobble");
	}

	@Override
	public void fly() {
		System.out.println("Fly short distance");
	}

	@Override
	public void fly(int i) {
		System.out.println("Fly short distance");
		
	}

}
