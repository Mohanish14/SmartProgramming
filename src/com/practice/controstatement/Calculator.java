package com.practice.controstatement;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
	
		
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter First No.");
				int no1=scan.nextInt();
			System.out.println("Enter Second No.");
			 	int no2=scan.nextInt();
			 	
			System.out.println("Select Operation (+,-,*,/)");
			 String opn=scan.next();
			 int result;
			 
	 		switch(opn){
		 	case"+" :result=no1+no2;
		 	System.out.println("Addition is ="+result);
		 	break;
		 	
		 	case"-" :result=no1-no2;
		 	System.out.println("Subtraction is ="+result);
		 	break;
		 	
		 	case"*" :result=no1*no2;
		 	System.out.println("Multiplication is ="+result);
		 	break;
		 	
		 	case"/" :result=no1/no2;
		 	System.out.println("Division is ="+result);
		 	break;
		 	
		 	default:System.out.println("Invalid Operation");
		 	
		 	

	 	
	}
}
}