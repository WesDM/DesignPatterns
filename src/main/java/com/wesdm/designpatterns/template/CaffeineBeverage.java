package com.wesdm.designpatterns.template;

public abstract class CaffeineBeverage {
	
	//Template method
	protected final void prepareRecipe(){
		boilWater();
		brew();						//brew is example of Hollywood principle. Don't call us, we'll call you.
		pourInCup();
		if(customerWantsCondiments()){
			addCodiments();
		}
	}
	
	public abstract void brew();
	
	public abstract void addCodiments();
	
	public void boilWater(){
		
	}
	
	public void pourInCup(){
		
	}
	
	/**
	 * This is a default implementaiton of a hook method.  Subclasses have the option to override this or not.
	 * @return
	 */
	public boolean customerWantsCondiments(){
		return true;
	}
}
