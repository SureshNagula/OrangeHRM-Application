package com.Arrays;

import java.util.ArrayList;

import java.util.List;

public class ListArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
        List<Object>arrayList1 = new ArrayList<>();
        
        arrayList1.add(10);
        arrayList1.add("selenium");
        arrayList1.add('A');
        arrayList1.add(10.998);
        
        
        /*
        System.out.println(arrayList1);
        System.out.println(arrayList1.get(0));
        System.out.println(arrayList1.get(1));
        System.out.println(arrayList1.get(2));
        */

        for(int index=0;index<arrayList1.size();index++)
        {
        System.out.println(arrayList1.get(index));
        }

        System.out.println(" *************** For Each Loop *************");


        for(Object arrayIndex:arrayList1)
        {
        System.out.println(arrayIndex);
        }


		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
