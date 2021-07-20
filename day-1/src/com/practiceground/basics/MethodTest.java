package com.practiceground.basics;

/***
 * 
 * @author Practice ground
 * create a method that takes n number and print 1 to n 
 *
 */
public class MethodTest {

	public void printNumbers(int number) {
		for ( int count = 1 ; count <= number ; count ++) {
			System.out.println(count);
		}
	}
	
	public static void main(String args[]) {
		MethodTest test = new MethodTest();
		test.printNumbers(15);
	}
}
