package com.Inheritance;

public class Test1 {

	
	public void addition()
	{
		// Local Variables
		int var1=30;
		int var2=50;
		int var3;
		var3=var1+var2;
		System.out.println(" The value of the variable var3 after Addition is :- "+var3);
	}
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		t1.addition();
		
	}

}
