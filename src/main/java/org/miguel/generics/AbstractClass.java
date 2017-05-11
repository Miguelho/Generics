package org.miguel.generics;

public abstract class AbstractClass <T extends Input, U extends Output, S extends RandomClass> extends SuperAbstractClass {

	protected AbstractClass(ConcreteSuperClassUser controladorLite){
		
	}
	
	protected void doExecute(){
		System.out.println("AbstractClass.ejecutarAlgo()");
	}
}
