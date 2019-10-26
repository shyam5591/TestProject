package com.interview.impprograms;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int n,rev=0;
		System.out.println("enter the no");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0) 
		{
		  
		  rev=rev*10+n%10;
		  n=n/10;
		}
		System.out.println("rev no is "+rev);
		
	}

}
