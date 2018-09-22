package org.testing.assertions;

public class assertion {
	
	
	public static boolean assert1(String exp,String act)
	{
		if(exp.equals(act))
		{
			System.out.println("Assertion pass"); 
			return true;
		}
		else
		{
			System.out.println("assertion failed");
			return false;
		}
	}
	

	public static boolean assert1(int exp,int act)
	{
		if(exp==act)
		{
			System.out.println("Assertion pass"); 
			return true;
		}
		else
		{
			System.out.println("assertion failed");
			return false;
		}
	}
	
}
