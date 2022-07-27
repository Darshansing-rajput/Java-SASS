package com.sass.ex7;

import java.util.Scanner;

public class ZeroMatrix {


	public void removeZeroRowCol() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows ");
		int rows = sc.nextInt();
		System.out.println("Enter the no. of columns ");
		int clm = sc.nextInt();
		int arr[][]= new int [rows][clm];
		System.out.println("Enter the values : ");
		for(int i = 0; i < rows;i++)
		{
			for(int j = 0; j< clm ; j++)
			{
				 arr [i][j] = sc.nextInt(); 
			}
		}
		System.out.println("Given matrix values are as follows : ");
		for(int i = 0; i < rows;i++)
		{
			for(int j = 0; j< clm ; j++)
			{
				System.out.print(" arr["+i+"]["+j+"] "+ arr [i][j] );
				 
			}
			System.out.println();
		}
		System.out.println("After removal of zeros matrix values are as follows : ");
		
		
		int []column=new int[10];
		int []row=new int [10];
		
		for(int i =0; i<rows;i++)
		{
			int count = 0;
			
			for(int j=0; j<clm;j++)
			{
				if(arr[i][j]!=0)
				{
					column[j]+= arr[i][j];
				}
				else
					column[j]+= 0;
				
				if(arr[i][j]!=0)
				{
					count += 1;
				}
				else 
					count +=0;
			}
			row[i]=count;
		}
		
		for(int i = 0; i < rows; ++i)
	    {   
	         
	        // If all elements of   
	        // current row is 0   
	        if (row[i] == 0)
	        {   
	            continue;   
	        }   
	        for(int j = 0; j < clm; ++j)
	        {   
	             
	            // If all elements of   
	            // current column is 0   
	            if (column[j] != 0)   
	                System.out.print(arr[i][j]);   
	        }   
	        System.out.println();   
	    }   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
