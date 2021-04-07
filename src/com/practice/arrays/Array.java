package com.practice.arrays;
// Print 1-D arrays
public class Array {
	public static void main(String[] args) {
		
		/*declaration creation initialization of an array 
		 * int[] a; 
		 * a=new int[7];
		 *  a[0]=10; 
		 *  a[1]=50; 
		 *  a[2]=40; 
		 *  a[3]=3; 
		 *  a[4]=0; 
		 *  a[5]=40;
		 *  a[6]=50;
		 */
	
		//declaration creation initialization of an array in a single line 
		int[] a = {10,50,40,3,0,40,50};
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
