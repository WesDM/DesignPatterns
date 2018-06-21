package com.wesdm.designpatterns.behavioral.observable;

import com.wesdm.designpatterns.behavioral.observer.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	private float temp;
	private float humidity;
	private Observable weatherData;
	
	public CurrentConditionsDisplay(Observable weatherData){
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}

	public void display() {
		System.out.println("Current conditions PULL : "+temp+" F degrees and "+humidity+"% humidity");
	}

	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData data = (WeatherData) o;
			this.temp = data.getTemperature();
			this.humidity = data.getHumidity();
			display();
		}
	}
	
	
}
