package com.practice.objectIntialization;
//object intialize by using Methods 
public class Bords {
		String name;
		int age;
		
	void m1(String n,int a){
		name= n;
		age=a;
		// System.out.println(name+" "+age);
	}
	
	void display(){
		System.out.println(name+"     "+age);

	}
	public static void main(String[] args) {
		Bords bird=new Bords();
		bird.m1("peacock", 5);
		bird.display();
	}
}

