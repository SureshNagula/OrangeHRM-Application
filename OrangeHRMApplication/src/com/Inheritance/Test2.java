package com.Inheritance;

public class Test2 extends Test1 {
	
	private void subtraction()
	{
		int var1=30;
		int var2=50;
		int var3;
		
		var3=var1-var2;
		System.out.println(" The value of the variable var3 after Subtraction is :- "+var3);
	}


	
	
	public static void main(String[] args) {

		Test2 t2 = new Test2();
		t2.addition();
		t2.subtraction();
		
	}

}
