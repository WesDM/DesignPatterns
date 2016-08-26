package com.wesdm.designpatterns.singleton;

public class Singleton {
	private volatile static Singleton unique;
	
	private Singleton(){}
	
	public static Singleton getInstance(){
		if(unique == null){
			synchronized (Singleton.class) {
				if(unique == null){
					unique = new Singleton();
				}
			}
		}
		return unique;
	}
}
