package com.wesdm.designpatterns.adapter;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.IntStream;

//implement who we are adapting to
public class TurkeyAdapter implements Duck {
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey){
		this.turkey = turkey;			//reference to object we are adapting
	}

	public void quack() {
		turkey.gobble();
	}

	public void fly() {
		Instant start = Instant.now();
		IntStream.range(0,100).forEach(turkey::fly);
		IntStream.range(0,100).forEach(i->turkey.fly());

		
//		for(int i = 0; i < 100000; i++){
//			turkey.fly();
//		}
		Instant end = Instant.now();
		System.out.println(Duration.between(start, end));
	}

}
