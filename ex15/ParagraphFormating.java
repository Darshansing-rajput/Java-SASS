package com.sass.ex15;

import java.util.Scanner;

public class ParagraphFormating {

	
	public void formatePara()
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char [] ch = str.toCharArray();
		int count1=30;
		int count2=20;
		for(int i=0; i<ch.length;i++)
		{
			
			System.out.print(ch[i]);
			if(i==count1)
			{
				
				System.out.println();
				count1+=30;
			}
			if(i==count2)
			{
				
				System.out.println();
				count2+=20;
			}
		}
		
	}
	
	
	
	
	
	
	
}
