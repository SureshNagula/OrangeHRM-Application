package com.UserDefinedMethods;

public class MethodExample8 {
	
	public void addition()
	{
		int var1=30;
		int var2=30;
		int var3;
		var3=var1+var2;
		System.out.println("the var3 valie is "+var3);
	}

	int var1=40;
	int var2=50;
	
	public void division()
	{
		//int var1;
		//int var2;
		int var3;
		var3=var2-var1;
		System.out.println("the vr3 valus is "+var3);
		
	}
	
	public static void main(String[] args) {
		MethodExample8 m8 = new MethodExample8();
		m8.division();
		m8.addition();
		
		
	}
	
	
}
