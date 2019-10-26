package com.interview.oops;

public class B extends A {
	public static int calSum(int c,int d)
	{
		System.out.println("in overriden method");
		return c+d;
		
	}
	public static void main(String[] args) {
		A a=new B();
		int sum=a.calSum(1, 2);
		System.out.println(sum);
	}

}
