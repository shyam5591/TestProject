package com.interview.oops;

public class AbsClassDemo {
public static void main(String[] args) {
AbsClassBank hdfc=new HDFC();
hdfc.deposite();
hdfc.withdraw();
hdfc.calInterest();

AbsClassBank icici=new ICICI();
icici.deposite();
icici.withdraw();
icici.calInterest();

}
}
