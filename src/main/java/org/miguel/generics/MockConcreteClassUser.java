package org.miguel.generics;

import java.lang.reflect.InvocationTargetException;

public class MockConcreteClassUser <T extends AbstractClass> extends ConcreteSuperClassUser{
	
	
	Class<? extends AbstractClass> classReference;
	T actionMock;
	
	public MockConcreteClassUser(Class<? extends AbstractClass> classRef) {
		this.classReference = classRef;
	}
	
	public void mockSuperMethod() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException{
		actionMock = (T) classReference.getDeclaredConstructors()[0].newInstance(this);
		super.doProcess(actionMock);
	}
	
	public static void main (String [] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException{
		MockConcreteClassUser<AbstractClass> mock = new MockConcreteClassUser<AbstractClass>(ConcreteClass.class);
		
		mock.mockSuperMethod();
	}
	
	
//	class SubClass extends MockControladorLite<ActionMultiple>{
//		
//		
//	}
}
