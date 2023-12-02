package com.UserDefinedMethods;

public class MethodExample6 {
	
	void addition()
	{
		int var1=5;
		int var2=5;
		int var3;
		var3=var1+var2;
		System.out.println("The addition of the var3 is "+var3);
	}

	public static void main(String[] args) {
		MethodExample6 m6 = new MethodExample6();
		m6.addition();
		
		MethodExample5 m5 = new MethodExample5();
				m5.dividion();
	}
}
