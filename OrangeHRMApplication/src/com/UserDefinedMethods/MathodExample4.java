package com.UserDefinedMethods;

public class MathodExample4 {
	
	private void division()
	{
		int var1=35;
		int var2=5;
		int var3;
		var3=var1/var2;
		System.out.println("The division of the var3 is"+ var3);
		
	}
	public static void main(String[] args) {
		
	MathodExample4 m4 = new MathodExample4();
	
	m4.division();
	
System.out.println("division metho of method example4");

MethodExample2 m2 = new MethodExample2();
m2.addition();
System.out.println("adition metho of method example2");
	}
	

}
