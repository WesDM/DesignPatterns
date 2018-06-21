package com.wesdm.designpatterns.structural.mvc.model;

import com.wesdm.designpatterns.structural.mvc.view.BpmObserver;

public interface IBpmObservable {
	void registerObserver(BpmObserver o);
	void removeObserver(BpmObserver o);
}
