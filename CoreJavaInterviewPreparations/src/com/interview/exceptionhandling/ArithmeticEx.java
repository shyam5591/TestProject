package com.interview.exceptionhandling;

public class ArithmeticEx {
	
		 public static void main(String args[]) {
		  int d = 0;
		  int n = 20;
		  try {
		   int fraction = n / d;
		   System.out.println("This line will not be Executed");
		  } catch (ArithmeticException e) {
		   System.out.println("In the catch Block due to Exception = " + e);
		  }
		  finally {
			  System.out.println("in finally");
		  }
		  System.out.println("End Of Main");
		 }
}

