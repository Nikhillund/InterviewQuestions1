package com.nikhil;

import java.util.HashSet;
import java.util.Set;

public class SubClass extends Parent {
	
	@Override
	public void myMethod() {
		System.out.println("Subclass class myMethod");
	}

	public void SubClassMethod() {
		System.out.println("SubClassMethod");
	}

	public static void main(String[] args) {
		Parent p = new SubClass();
//		p.myMethod();
//		p.SubClassMethod();
		
		Set<Student> set = new HashSet<Student>();
		Student s1 = new Student("11", "Mike");
		Student s2 = new Student("11", "Mike");
		set.add(s1);
		set.add(s2);
		System.out.println(set.size());
	}
}

class Parent {
	public void myMethod() {
		System.out.println("Parent class myMethod");
	}
}

