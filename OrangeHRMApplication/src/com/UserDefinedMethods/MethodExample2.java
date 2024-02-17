package com.UserDefinedMethods;

public class MethodExample2 {
	
	public void addition()
	
	{
		int var1=30;
		int var2=50;
		int var3;
		
		System.out.println(var1+var2);
	}
	
	public static void main(String[] args) {
		
		MethodExample2 suri = new MethodExample2();
		
		suri.addition();
		suri.subtraction();
		
	}
	public void subtraction()
	{
		int var1=30;
		int var2=50;
		int var3;
		System.out.println(var1-var2);
	}
	
	

}
