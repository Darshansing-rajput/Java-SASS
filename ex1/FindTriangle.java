package com.sass.ex1;
import java.util.*;
import java.lang.Math;
public class FindTriangle {

	private float a,b,c;
	 public void findMyTriangleType()
	{
		 System.out.println("Enter the dimensions of sides of a triangle \n Enter side a ");
		 Scanner sc = new Scanner(System.in);
		 a = sc.nextFloat();
		 System.out.println("Enetr side b");
		 b = sc.nextFloat();
		 System.out.println("Enetr side c");
		 c = sc.nextFloat();
		 if((a+b>c && b+c>a && c+a>b) && (a>0 && b>0 && c>0))
		 {
			 if(a==b && c==b)
			 {
				 System.out.println("Its a Equilateral Trangle");
			 }
			 else 
				 if(
						 Math.sqrt(Math.pow((a*a+b*b-c*c), 2))<0.000001 ||
						 Math.sqrt(Math.pow((c*c+b*b-a*a), 2))<0.000001 ||
						 Math.sqrt(Math.pow((a*a+c*c-b*b), 2))<0.000001 
						 )
				 {
					 System.out.println("Its a Right Angled Traiangle");
				 }
				 else 
					 if(a==b || b==c || c==a)
					 {
						 System.out.println("Its a Isosceles Triangle");
					 }
					 else 
						 System.out.println("Notspecial");
		 }
		 else
			 System.out.println("Error : Invalid Input!! \n Please provide right diamensions ");
		
	}
}
