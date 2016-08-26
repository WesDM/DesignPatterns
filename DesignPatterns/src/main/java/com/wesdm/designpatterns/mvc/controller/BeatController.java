package com.wesdm.designpatterns.mvc.controller;

import com.wesdm.designpatterns.mvc.model.IBeatModel;
import com.wesdm.designpatterns.mvc.view.DjView;

public class BeatController implements IController {
	IBeatModel model;
	DjView view;
	
	public BeatController(IBeatModel model) {
		this.model = model;
		view = new DjView(this, model);
		view.createView();
		view.createControls();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
		model.init();
	}

	@Override
	public void start() {
		model.on();
		view.disableStartMenuItem();
		view.enableStopMenuItem();
	}

	@Override
	public void stop() {
		model.off();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
	}

	@Override
	public void increaseBpm() {
		model.setBpm(model.getBpm() + 1);
	}

	@Override
	public void decreaseBpm() {
		model.setBpm(model.getBpm() - 1);
	}

	@Override
	public void setBpm(int bpm) {
		model.setBpm(bpm);
	}

}
