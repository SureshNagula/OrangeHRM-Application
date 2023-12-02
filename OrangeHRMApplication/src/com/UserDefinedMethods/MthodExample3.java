package com.UserDefinedMethods;

public class MthodExample3 {

	public void multiplication()
	{
		int var1=30;
		int var2=20;
		int var3;
		
		System.out.println(var1*var2);
	}
	
	public static void main(String[] args) {
		
		MthodExample3 m3 = new MthodExample3();
		m3.multiplication();
		System.out.println();
				
		MethodExample2 m2 = new MethodExample2();
		m2.addition();
		System.out.println("addtion values");
			
			
		}
		
		
		
	
}
