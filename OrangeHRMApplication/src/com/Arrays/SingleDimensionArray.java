package com.Arrays;

public class SingleDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int array1[] = new int[4];
		
		array1[0]=10;
		array1[1]=20;
		array1[2]=30;
		array1[3]=40;
		
		//System.out.println(array1[0]);
		//System.out.println(array1[1]);
		//System.out.println(array1[2]);
		//System.out.println(array1[3]);
		
		//Instead of printing Print 4 time we are use for loop concept
		
		for(int Index=0;Index<4;Index++)
		{
			System.out.println(array1[0]);
		}
	
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		
		for(int index=0;index<4;index++)
		{
		System.out.println(array1[index]);
		}

		

		
		
		System.out.println(" ********** 2 *********** ");

		for(int index=0;index<=3;index++)
		{
		System.out.println(array1[index]);
		}
		
		
		System.out.println(" ********** 3 *********** ");

		for(int index=0;index<=4;index++)
		{
		System.out.println(array1[index]);
		}


		
		
		
		
		
	}

}
