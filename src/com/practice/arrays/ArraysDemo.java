package com.practice.arrays;
// Print two dimensional array
public class ArraysDemo {
	
	public static void main(String[] args) {
		
		/*
		 * int[][] a;
		 *  a = new int[3][];
		 *   a[0]=new int[4]; 
		 *   a[1]=new int [2]; 
		 *   a[2]=new int[3];
		 * 
		 * a[0][0]=10;
		 * a[0][1]=20;
		 * a[0][2]=30; 
		 * a[0][3]=40;
		 * a[1][0]=50;
		 * a[1][1]=60;
		 * a[2][0]=70;
		 * a[2][1]=80;
		 * a[2][2]=90;
		 */

		
	int[][] a = {{10,20,30,40},{50,60},{70,80,90}};
		
		//System.out.println(a.length);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
