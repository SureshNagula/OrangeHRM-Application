package com.Arrays;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
       Object array1[] = new Object[4];
       
       array1[0]=10;
       array1[1]="Webdriver";
       array1[2]='A';	   
       array1[3]=10.9288;	   
    	/*
    	System.out.println(array1[0]);
    	System.out.println(array1[1]);
    	System.out.println(array1[2]);
    	System.out.println(array1[3]);
		
		*/
    	
    	for(int index=0;index<4;index++)
    	{
    		System.out.println(array1[index]);
    	}
		
    	System.out.println(" ***************** For Each Loop ********************* ");

    	// Syntax of "For Each Loop"
    	/* for(dataType arrayIndex:arrayName)
    	{
    	System.out.println(index); // till the index of the array is existing the loop will iterate
    	}
		
		*/
    	for(Object arrayindex:array1)
    	{
    		System.out.println(arrayindex);
    	}
		
		
		
		
	}
	

}
