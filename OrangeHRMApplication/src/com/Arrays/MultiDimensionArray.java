package com.Arrays;

public class MultiDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String array1[][] = new String[2][2];
		
		array1[0][0]=" Manual Testing ";
		array1[0][1]=" Venkat ";
		array1[1][0]=" Selinium ";
		array1[1][1]=" Srinivas ";
	
		/*
		System.out.println(array1[0][0]);
        System.out.println(array1[0][1]);
        System.out.println(array1[1][0]);
        System.out.println(array1[1][1]);
        
        */
		
		
		for(int row=0;row<=1;row++)
		{
			for(int rowofcell=0;rowofcell<=1;rowofcell++)
			{
				System.out.println(array1[row][rowofcell]);
			}
		}
		
		System.out.println("%%%%%%%1%%%%%%%%%%%%%");
		
	for(int row=0;row<array1.length;row++)
	{
		for(int rowofcell=0;rowofcell<array1.length;rowofcell++)
		{
			System.out.print(array1[row][rowofcell]);
		}
	}
        
        
        
        
        
        
        
        
        
        
        
	}

}
