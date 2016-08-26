package com.wesdm.designpatterns.strategy.comparator;

import java.util.Comparator;

/**
 * Strategy to sort in reverse order
 * @author Wesley
 *
 */
public class DesComparator implements Comparator<Foo>{

	public int compare(Foo o1, Foo o2) {
		return o2.getVal().compareTo(o1.getVal());
	}
	
}
