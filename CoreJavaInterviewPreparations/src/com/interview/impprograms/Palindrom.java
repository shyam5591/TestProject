package com.interview.impprograms;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123,sum=0,r=0,temp=0;
		temp=n;
		while(n>0)
		{
			r=n%10;   //1  2  1
			sum=sum*10+r; //1 12 121
			n=n/10; //12 1 0
		}
		if (sum==temp) {
			
			System.out.println("its p");
		} else {
			System.out.println("its not p");
		}

	}

}
