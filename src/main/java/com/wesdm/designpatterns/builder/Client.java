package com.wesdm.designpatterns.builder;

public class Client {
	public static void main(String... args) {
		NutritionFacts cocaCola = new NutritionFacts.ThisBuilder(240, 8).
				calories(100).sodium(35).carbohydrate(27).build();
		
		Client c = new Client();
		Integer i =0;
		c.inc(i);
		System.out.println(i);
	}
	
	public void inc(Integer i){
		;
	}
}


class Coke{
	private String formula;
	
	
	public Coke buildCoke(Builder<? extends MyFinalBuilder> builder){
		
		return new Coke();
	}
}