package com.practice.objectIntialization;
// object intialize by using referance variable
public class Animal {
	
	String color;
	int age;
	
	public static void main(String[] args) {
		Animal tommy=new Animal();
		tommy.color="white";   
		tommy.age=15;
		
	System.out.println(tommy.color+"   "+tommy.age);
	}
}
