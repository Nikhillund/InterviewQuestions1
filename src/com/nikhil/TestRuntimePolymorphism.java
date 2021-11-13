package com.nikhil;
//sequence of constructor executions
public class TestRuntimePolymorphism {
	public TestRuntimePolymorphism() {
		System.out.println("Clas A");
	}
	
	public static void method1() {
		System.out.println("A method1");
	}

	public static void main(String[] args) {
		TestRuntimePolymorphism ac = new C();
		ac.method1();
	}
}

class B extends TestRuntimePolymorphism {
	public B() {
	
System.out.println("Class B");
	}
	
	public static void method1() {
		System.out.println("B method1");
	}
}

class C extends B {
	public C() {
		System.out.println("Class C");
	}
	
	public static void method1() {
		System.out.println("C method1");
	}
}

