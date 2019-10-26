package com.interview.stringprograms;
public class RepeatedCharsInString {
public static void main(String[] args) {
	String s="shyamya";
    char[] chars=s.toCharArray();
    int c=0;
    for(int i=0; i<s.length(); i++)
    {
    	for(int j=i+1; j<s.length(); j++)
    	{
    		if(chars[i]==chars[j])
    		{
    			System.out.print(chars[j]);
    			c++;
    			break;
    		}
    	}
    }
    System.out.println("count::" +c);

}
}
