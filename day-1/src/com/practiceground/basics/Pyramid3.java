package com.practiceground.basics;
/*** 
 * 
 * 
 * @author practice ground
     			1
               1 2
              1 2 3
             1 2 3 4
            1 2 3 4 5
 *
 */

public class Pyramid3 {

	public static void main(String args[]) {
		pyramid();
	}

	private static void pyramid() {
		int mid = 15;

		for (int i = 1; i<=5; i++) {
			for( int k = i ; k<=mid; k++)
				System.out.print(" ");
			
			for (int j=1 ; j<=i; j++) 
				System.out.print(" "+j);
			
			System.out.println();
		}
	}
}
