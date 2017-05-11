package org.miguel.generics;

public class ConcreteSuperClassUser {
	
	protected ConcreteSuperClassUser(){
		System.out.println("ConcreteSuperClassUser<Init>");
	}

	public void doProcess(AbstractClass a){
		System.out.println("ConcreteSuperClassUser.doProcess() IN");
		
		a.doExecute();
		
		System.out.println("ConcreteSuperClassUser.doProcess() OUT");
	}
}
