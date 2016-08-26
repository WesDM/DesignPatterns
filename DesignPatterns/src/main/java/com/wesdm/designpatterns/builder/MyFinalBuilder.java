package com.wesdm.designpatterns.builder;

public class MyFinalBuilder {
	
	private final int field;
	
	public static class ThisBuilder implements Builder<MyFinalBuilder> {
		
		private final int field = 3;

		public MyFinalBuilder build() {
			return new MyFinalBuilder(this);
		}
		
	}

	private MyFinalBuilder(ThisBuilder b){
		field = b.field;
	}
}
