package com.wesdm.designpatterns.strategy.comparator;

public class Foo {
	private Integer val;

	public Integer getVal() {
		return val;
	}

	public void setVal(Integer val) {
		this.val = val;
	}
	
	@Override
	public String toString(){
		return String.valueOf(val);
	}
}
