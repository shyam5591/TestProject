package com.interview.impprograms;

public class Swap2NoWithoutTempVariable {

	public static void main(String[] args) {
		int x,y;
		x=3;
		y=4;
		x=x+y; //7
		y=x-y; //3 
		x=x-y;  //4
		System.out.println("after swapping x="+x+ " y="+y);
		
	}
}
