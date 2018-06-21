package com.wesdm.designpatterns.behavioral.observable;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable {

	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	private boolean changed;

	public WeatherData() {
		observers = new ArrayList<Observer>();
		changed = false;
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	/**
	 * Called when the weather measurements have been updated
	 */
	public void measurementsChanged() {
		setChanged();
		notifyObservers(null);
	}

	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public void setChanged() {
		changed = true;
	}

	public void addObserver(Observer o) {
		observers.add(o);

	}

	public void deleteObserver(Observer o) {

		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(o);
		}

	}
	
	/**
	 * Let observers pull what they want
	 */
	public void notifyObservers(Object arg) {
		if (changed) {
			for (Observer o : observers) {
				o.update(this, arg);
			}
			changed = false;
		}
	}
}
