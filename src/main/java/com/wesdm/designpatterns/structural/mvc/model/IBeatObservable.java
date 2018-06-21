package com.wesdm.designpatterns.structural.mvc.model;

import com.wesdm.designpatterns.structural.mvc.view.BeatObserver;

public interface IBeatObservable {
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
}
