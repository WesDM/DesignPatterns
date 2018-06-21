package com.wesdm.designpatterns.creational.singleton;

/**
 *  Singleton example.  FYI Enums make for much better implemenations of the Singleton design pattern.
 * @author Wesley
 *
 */
public class Singleton {
	private volatile static Singleton unique;
	
	private Singleton(){}
	
	public static Singleton getInstance(){
		if(unique == null){
			synchronized (Singleton.class) {		//must use double check locking prior to java 5
				if(unique == null){
					unique = new Singleton();
				}
			}
		}
		return unique;
	}
}
