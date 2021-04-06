package com.practice.controstatement;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter a Number");
		int No=s.nextInt();
				
		if(No%2==0){
			System.out.println("Number is Even= "+No);
		}
		else{
			System.out.println("Number is Odd="+No);
		}
	}

}
