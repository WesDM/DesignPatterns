package com.wesdm.designpatterns.behavioral.observable;

public class WeatherStation {
	
	public static void main(String[] args){
		WeatherData data = new WeatherData();
		
		CurrentConditionsDisplay ccDisplay = new CurrentConditionsDisplay(data);
		
		data.setMeasurements(77, 69, 88.2f);
		data.setMeasurements(80, 55, 44.2f);
		data.setMeasurements(88, 22, 33.2f);
	}
}
