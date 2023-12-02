package com.UserDefinedMethods;

public class MethodExample11 {

	
	protected void division()
	{
		try
		{
		int var1=30;
		int var2=0;
		int var3;
		var3=var1/var2;
		System.out.println("the division of the var3 is  "+var3);
		}
		catch (Exception divisionException) 
			// TODO: handle exception
			{
		System.out.println("the exception is for this method "+divisionException);
	  }
		}
	
	
	public static void main(String[] args) {
		MethodExample11 m11 = new MethodExample11();
		m11.division();
		
		
		
	}
	
	
	
	
	
	
}
