package com.practice.controstatement;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
			System.out.println("Enter a Year");
			int year=sc.nextInt();
			System.out.println(+year);
		if (year%4==0){
			if(year%100==0){
				if(year%400==0){
					System.out.println(" Leap Year");
				}
				else{
					System.out.println("Not Leap Year");
				}
			}
			else {
				System.out.println(" Leap Year");
			}
		}
	
		else {
			System.out.println("Not a Leap Year");
		}

		
		// Another program for same approch
		System.out.println(" Second program Output");
		if((year%4==0)&&(year%100!=0)||(year%400==0)){
			System.out.println("Leap Year");
		}else
		{
			System.out.println("Not a Leap year");
		}
	}
}
