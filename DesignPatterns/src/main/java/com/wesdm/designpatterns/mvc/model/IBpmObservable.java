package com.wesdm.designpatterns.mvc.model;

import com.wesdm.designpatterns.mvc.view.BpmObserver;

public interface IBpmObservable {
	void registerObserver(BpmObserver o);
	void removeObserver(BpmObserver o);
}
