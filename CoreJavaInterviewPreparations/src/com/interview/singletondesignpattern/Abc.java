package com.interview.singletondesignpattern;

public enum Abc {
INSTANCE;
int i;
public void show()
{
System.out.println(i);
}
public static void main(String[] args) {
Abc obj1=Abc.INSTANCE;
obj1.i=5;
obj1.show();
Abc obj2=Abc.INSTANCE;
obj2.i=6;
obj2.show();
}
}
