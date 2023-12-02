package com.UserDefinedMethods;

public class MethodExample9 {
	
	// Method names should be always Unique
	// Method withOut parameters
	public void addition()
	{
	// Local Variables
	int var1=30;
	int var2=50;
	int var3;
	var3=var1+var2;
	System.out.println(" The value of the variable var3 after Addition is :- "+var3);
	}
	 
	// Its Method OverLoading - Methods are similar but Method with different Signature
	//  Method with Parameters
	public void addition(int var1,int var2)
	{
	// Local Variables
	//int var1=30;
	//int var2=50;

	//int var1;
	//int var2;

	int var3;
	var3=var1+var2;
	System.out.println(" The value of the variable var3 after Addition is :- "+var3);
	}


	public void addition(int var1,int var2,int var3)
	{
	// Local Variables
	//int var1=30;
	//int var2=50;

	//int var1;
	//int var2;
	// int var3;
	var3=var1+var2+var3;
	System.out.println(" The value of the variable var3 after Addition is :- "+var3);
	}

	public void addition(int var1,int var2,double var3 )
	{
	// Local Variables
	//int var1=30;
	//int var2=50;

	//int var1;
	//int var2;

	double var4;
	var4=var1+var2+var3;
	System.out.println(" The value of the variable var3 after Addition is :- "+var4);
	}

	public static void main(String[] args) {

	MethodExample9 m9 = new MethodExample9();
	System.out.println(" Calling the Addition Method - WithOut Parameters ");
	m9.addition();
	System.out.println();

	System.out.println(" Calling the Addition Method - With 2 Parameters ");
	m9.addition(60, 90);
	System.out.println();
	m9.addition(100, 60);
	System.out.println();

	System.out.println(" Calling the Addition Method - With 3 Parameters ");
	m9.addition(30, 40, 50);
	System.out.println();

	System.out.println(" Calling the Addition Method - With 3 Parameters with different dataTypes ");
	m9.addition(20, 50, 90.123);

	}


}
