package com.java.map;

class Animal {
	String s1,s2;
	Animal() {
		System.out.println("animal is created");
	}
	
	Animal(String s1,String s2 ){
		this.s1 = s1;
		this.s2 = s2;
		System.out.println("animalB is created");
	}
}

class Dog extends Animal {
	Dog() {
		System.out.println("dog is created");
	}
}

class TestSuper3 {
	public static void main(String args[]) {
		Dog d = new Dog();
	}
}