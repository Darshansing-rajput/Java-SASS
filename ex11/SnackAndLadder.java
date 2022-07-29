package com.sass.ex11;

import java.util.*;

public class SnackAndLadder {

	public void playSnackAndLadder() {
		
		System.out.println("Enter the input values : ");
		int valueA = 0; //player 1
		int valueB = 0; //player 2

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //no. of snaks and ladder

		Map<Integer, Integer> map = new HashMap<>();

		int i = 0;
		while (i < N) {
			      //(snake and ladder) (start , end )  
			map.put(sc.nextInt(), sc.nextInt());
			++i;

		}
               
		int chances = sc.nextInt(); //no. of moves

		i = 0; 
		int a, b;

		boolean chanceA = true; //first chance to player 1
		while (i < chances) {
			if (chanceA) {

				a = sc.nextInt();
				valueA += a;

				while (map.containsKey(valueA)) {
					valueA = map.get(valueA);

				}

				chanceA = false;
			} else {
				b = sc.nextInt();
				valueB += b;

				while (map.containsKey(valueB)) {
					valueB = map.get(valueB);

				}

				chanceA = true;
			}
			++i;
		}

		if (valueA > valueB)
			System.out.println("Output : \n"+"A  " + valueA);
		else
			System.out.println("Output : \n"+"B " + valueB);

	}
}
