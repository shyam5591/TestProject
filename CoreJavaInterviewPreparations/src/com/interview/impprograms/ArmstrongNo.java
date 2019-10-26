package com.interview.impprograms;

public class ArmstrongNo {
public static void main(String[] args) {
	int n=153,temp=0,sum=0,r=0;
	temp=n;
	while(n>0) 
	{
		r=n%10;  // 3 5 1 
		sum=sum+(r*r*r); // 27+125+1  
		n=n/10; // 15 1 0
	}
	if (sum==temp) {
		System.out.println("it's arms");
		
	} else {
		System.out.println("it's not arms");
	}
}
}
