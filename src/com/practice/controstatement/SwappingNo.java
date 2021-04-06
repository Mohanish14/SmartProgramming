package com.practice.controstatement;

public class SwappingNo {
	public static void main(String[] args) {
		int a=50;
		int b=20;
		/*	int x;
			x=a;
			a=b;      // using Third variable 
			b=x;*/
		
		a=a+b;
		b=a-b;  //Another approch without using Third veriable 
		a=a-b;
			
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
