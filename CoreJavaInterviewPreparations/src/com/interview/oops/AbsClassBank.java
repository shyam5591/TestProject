package com.interview.oops;

 abstract class AbsClassBank {

	public void deposite() {
    System.out.println("common deposite method to all banks");	
    }
	public void withdraw() {
	    System.out.println("common withdraw method to all banks");	
	    }
   public abstract int calInterest();
   public void newHdfcFeature()
   {
	   
   }
   
}
