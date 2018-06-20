package com.wesdm.designpatterns.strategy.comparator;

import java.util.Arrays;
import java.util.Collections;


public class Client {
	public static void main(String[] args){
		Foo f1 = new Foo();
		f1.setVal(1);
		Foo f2 = new Foo();
		f2.setVal(2);
		
		Foo[] fa = {f1, f2};
		
		Collections.sort(Arrays.asList(fa), new AscComparator());		//supply strategy at runtime
		Collections.sort(Arrays.asList(fa), new DesComparator());
		
		Collections.sort(Arrays.asList(fa), (o1,o2) -> o2.getVal().compareTo(o1.getVal()));


		System.out.println(Arrays.toString(fa));
	}
}
