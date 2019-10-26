package com.interview.fdesignpattern;

public class TestFDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone apPhone=PhoneFactory.getPhone("Apple", "4GB", "13MP", "1400");
		Phone samsungPhone=PhoneFactory.getPhone("Samsung", "6GB", "18MP", "2400");
		System.out.println("factory apple config "+apPhone);
		System.out.println("factory samsung config "+samsungPhone);
	}

}
