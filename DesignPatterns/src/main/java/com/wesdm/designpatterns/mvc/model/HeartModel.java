package com.wesdm.designpatterns.mvc.model;

import com.wesdm.designpatterns.mvc.view.BeatObserver;
import com.wesdm.designpatterns.mvc.view.BpmObserver;

public class HeartModel implements IHeartModel,IBeatObservable, IBpmObservable {

	private int heartRate;
	
	@Override
	public int getHeartRate(){
		return heartRate;
	}
	
	@Override
	public void registerObserver(BpmObserver o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeObserver(BpmObserver o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void registerObserver(BeatObserver o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeObserver(BeatObserver o) {
		// TODO Auto-generated method stub

	}

}
