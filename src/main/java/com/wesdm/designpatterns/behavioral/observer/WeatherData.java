package com.wesdm.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
	
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers = new ArrayList<Observer>();
	}

	/**
	 * Called when the weather measurements have been updated
	 */
	public void measurementsChanged() {
		notifyObservers();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >= 0) {
			observers.remove(o);
		}
	}
	
	/**
	 * Push notification
	 */
	public void notifyObservers() {
		for(Observer o : observers){
			o.update(temperature, humidity, pressure);
		}
	}
	
	public void setMeasurements(float temp, float humidity, float pressure){
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
