package com.interview.oops;

public interface Bank {
	 void deposite();
	 void withdraw();
	 void calInterest();
	 default void newHDFCFeature() 
	    { 
	      System.out.println("newHDFCFeature"); 
	    } 

}
