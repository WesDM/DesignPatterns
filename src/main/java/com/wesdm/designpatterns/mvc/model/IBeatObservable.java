package com.wesdm.designpatterns.mvc.model;

import com.wesdm.designpatterns.mvc.view.BeatObserver;

public interface IBeatObservable {
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
}
