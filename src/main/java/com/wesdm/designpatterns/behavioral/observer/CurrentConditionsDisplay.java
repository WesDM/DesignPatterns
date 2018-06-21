package com.wesdm.designpatterns.behavioral.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	private float temp;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void display() {
		System.out.println("Current conditions: "+temp+" F degrees and "+humidity+"% humidity");
	}

	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();
	}
	
	
}
