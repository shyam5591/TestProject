package com.interview.oops;

public class D extends C {
	public void display(int j)
    {
    	System.out.println("in c"+j);
    }
	public void display(String s)
    {
    	System.out.println("in c"+s);
    }
	public static void main(String[] args) {
		C c=new C();
		c.display(1);
		D d=new D();
		d.display(2);
		d.display("4");
		C pref=new D();
		pref.display(1);
		
	}

}
