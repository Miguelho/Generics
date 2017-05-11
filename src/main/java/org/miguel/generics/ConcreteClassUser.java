package org.miguel.generics;

public class ConcreteClassUser extends ConcreteSuperClassUser{

	
	public void postMethod(){
		super.doProcess(new ConcreteClass(this));
	}
}
