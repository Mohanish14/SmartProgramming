package com.practice.controstatement;
//WAP to find Grter no. betn three numbers
public class NestedIf {
	public static void main(String[] args) {
		int a=110;
		int b=80;
		int c=120;
		
		if (a>b)
		{
			if(a>c){
				System.out.println(" A is gtrater="+a);
			}else{
				System.out.println("C is grater="+c);
			}
		}
		else if(b>c){
			System.out.println("B is grater="+b);
		}
		
			
	}
}
