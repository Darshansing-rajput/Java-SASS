package com.sass.ex8;

import java.util.Arrays;
import java.util.Scanner;

public class StringPermutation {

	public void permutation(String str, int n) {
		char[] ch = str.toCharArray();
		Arrays.sort(ch); // sort in ascending order
		int i = 2;
		// next_permutation(ch);

		while (next_permutation(ch)) {
			if (i == n)
				break;
			i++;
		}
		System.out.println(n + "th permutation of gives set is...");
		System.out.println(String.valueOf(ch));
	}

	public static boolean next_permutation(char[] c) {
		for (int i = c.length - 2; i >= 0; --i)
			if (c[i] < c[i + 1])
				for (int j = c.length - 1;; --j)
					if (c[j] > c[i]) {
						char a = c[i];
						c[i] = c[j];
						c[j] = a;
						for (++i, j = c.length - 1; i < j; ++i, --j) {
							a = c[i];
							c[i] = c[j];
							c[j] = a;
						}
						return true;
					}
		return false;
	}

}
