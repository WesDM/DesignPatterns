package com.wesdm.designpatterns.behavioral.strategy.comparator;

import java.util.Comparator;

/**
 * Strategy to sort in natural order
 * @author Wesley
 *
 */
public class AscComparator implements Comparator<Foo>{

	public int compare(Foo o1, Foo o2) {
		return o1.getVal().compareTo(o2.getVal());
	}

}