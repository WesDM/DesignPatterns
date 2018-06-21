package com.wesdm.designpatterns.structural.mvc.model;

import com.wesdm.designpatterns.structural.mvc.view.BeatObserver;
import com.wesdm.designpatterns.structural.mvc.view.BpmObserver;

public class HeartAdapter implements IBeatModel {
	IHeartModel model;
	
	public HeartAdapter(IHeartModel model) {
		this.model = model;
	}

	@Override
	public void registerObserver(BeatObserver o) {
		model.registerObserver(o);
	}

	@Override
	public void removeObserver(BeatObserver o) {
		model.removeObserver(o);
	}

	@Override
	public void registerObserver(BpmObserver o) {
		model.registerObserver(o);
	}

	@Override
	public void removeObserver(BpmObserver o) {
		model.removeObserver(o);
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public void on() {
		// TODO Auto-generated method stub

	}

	@Override
	public void off() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setBpm(int bpm) {
	}

	@Override
	public int getBpm() {
		return model.getHeartRate();
	}

}
