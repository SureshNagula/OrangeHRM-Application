package com.UserDefinedMethods;

public class MethodExample10 {

	public static void main(String[] args) {

		MethodExample2 m2 = new MethodExample2();
		System.out.println(" ******* Addition Method of MethodExample2 ******* ");
		m2.addition(); // public method
		System.out.println(" ******* Subtraction Method of MethodExample2 ******* ");
		m2.subtraction(); // public method
		System.out.println();

		MthodExample3 m3 = new MthodExample3();
	    m3.multiplication();
		System.out.println(" ******* Multiplication Method of MethodExample3 ******* ");
         m3.multiplication();
		
		MethodExample5 m5 = new MethodExample5();
		System.out.println(" ******* Division Method of MethodExample5 ******* ");
		m5.dividion(); // portected Method
		System.out.println();
		
		MethodExample11 m11 = new MethodExample11();
		m11.division();
		

	}
	
}
