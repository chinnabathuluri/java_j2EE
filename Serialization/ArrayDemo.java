package Serialization;


	//package com.array.demo;

	import java.util.Arrays;

	public class ArrayDemo 
	{

	public static void main(String[] args)
	{
	    // TODO Auto-generated method stub

	    // array initialization
		int id;
		char name;
		
	    int salary;
	    
	int[] arr = {101,20000,111,33};

	    int size = arr.length;

	    int i,pos; // loop counter

	    System.out.println(arr); // // prints something like '[I@3343c8b3'

	    System.out.println("Elements in the array" + Arrays.toString(arr));

	    System.out.println(" The size of the array is  " + size);

	    // array-search
	    int searchKey = 11;

	    for ( i = 0; i < size; i++)
	    {
	        if (arr[i] == searchKey)
	            break;
	    }

	    if(i==size)
	        System.out.println(" Element not found");
	    else
	        System.out.println("Element found in the position " +i);


	   int elemDel=101;
	    //int eleDel=22;


	    for ( pos = 0; pos < size; pos++)
	    {
	        if (arr[pos] == elemDel)
	            break;
	    }

	    if(pos==size)
	        System.out.println("Element not found");
	    else
	    {
	        while(pos<size-1)
	        {
	            arr[pos] = arr[pos+1];
	            pos++;
	        }
	        size--;
	    }

	// display the element after deletion
	for(i=0;i<size;i++){
	    System.out.print(arr[i] + " ");
	}
	    //System.out.println("Elements in the array" + Arrays.toString(arr));




	}

	}


