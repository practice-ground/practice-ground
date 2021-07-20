package com.practiceground.basics;

public class Tables {
	
	public void printMultiplicationTable(int number ) {
		for (int i =1 ; i <=12; i++) {
			System.out.printf("%d * %d = %d" , number, i , number*i ).println();
		}
		
	}
	
	public static void main(String args[]) {
		
		Tables table  = new Tables();
		table.printMultiplicationTable(3);
				
	}

}
