package com.interview.oops;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Bank hdfc=new HDFCInterfImpl();
	hdfc.calInterest();
	hdfc.withdraw();
	hdfc.deposite();
	hdfc.newHDFCFeature();
	
	Bank icici=new ICICIInterfImpl();
    icici.calInterest();
	icici.withdraw();
	icici.deposite();

	}

}
