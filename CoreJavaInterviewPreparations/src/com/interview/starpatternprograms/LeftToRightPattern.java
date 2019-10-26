package com.interview.starpatternprograms;

import java.util.Scanner;

public class LeftToRightPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows");
		int r=sc.nextInt();
		
		for(int i=1;i < r;i++)
		{
			for(int j=1;j <= i;j++)
			{
				System.out.println("*");
			}
			System.out.println();
		}
		
	}

}
