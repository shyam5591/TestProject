package com.interview.collection;

import java.util.ArrayList;

public class Merge2AListsWithoutDupli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> first=new ArrayList<String>();
		first.add("S");
		first.add("P");
		first.add("S");
		ArrayList<String> second=new ArrayList<String>();
		second.add("A");
		second.add("B");
		second.add("C");
		for (Object x : second){
			   if (!first.contains(x))
				   first.add("x");
			}
		System.out.println(first);

	}

}
