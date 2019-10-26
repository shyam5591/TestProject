package com.interview.impprograms;

public class ShiftZeroAtEndOfAnArray {

	public static void main(String[] args) {
	int[] a= {1,0,2,0,5};
	int l=a.length;
	int c=0;
	for(int i=0;i<l;i++)
	{
		if(a[i]!=0)
		{
			a[c++]=a[i];
		}
	}
	while(c<l)
	{
		a[c++]=0;
	}

   System.out.println("array after moving zero at end");
	for(int j=0;j<l;j++)
	{
		System.out.print(a[j]+ " ");
	}
}
}
