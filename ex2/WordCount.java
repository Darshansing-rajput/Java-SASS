package com.sass.ex2;

import java.util.Scanner;

public class WordCount {

	

		static final int OUT = 0;
		static final int IN = 1;
		
		public void wordCount()
		{
			System.out.println("Enter your Text for word count");
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			int state = OUT;
			int wc = 0; 
			int i = 0;
		
			while (i < str.length())
			{
			
				if (str.charAt(i) == ' ' || str.charAt(i) == '\n'
						|| str.charAt(i) == '\t')
					state = OUT;
				
				else if (state == OUT)
				{
					state = IN;
					++wc;
				}
		
		
				++i;
			}
	System.out.println("The Word Count is : "+ wc);
		}
}
