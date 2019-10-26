package com.interview.fdesignpattern;

public class PhoneFactory {
public static Phone getPhone(String type,String ram,String camera,String battery)
{
	if("Apple".equalsIgnoreCase(type))
	{
		return new Apple(ram,camera,battery);
	}
	else if("Samsung".equalsIgnoreCase(type))
	{
		return new Samsung(ram,camera,battery);
	}
	
	return null;


}
}
