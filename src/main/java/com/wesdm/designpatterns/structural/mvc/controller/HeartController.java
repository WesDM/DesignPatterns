package com.wesdm.designpatterns.structural.mvc.controller;

import com.wesdm.designpatterns.structural.mvc.model.HeartAdapter;
import com.wesdm.designpatterns.structural.mvc.model.IHeartModel;
import com.wesdm.designpatterns.structural.mvc.view.DjView;

public class HeartController implements IController {
	IHeartModel model;
	DjView view;
	
	public HeartController(IHeartModel model) {
		this.model = model;
		view = new DjView(this, new HeartAdapter(model));
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	@Override
	public void increaseBpm() {
		// TODO Auto-generated method stub

	}

	@Override
	public void decreaseBpm() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setBpm(int bpm) {
		// TODO Auto-generated method stub

	}

}
