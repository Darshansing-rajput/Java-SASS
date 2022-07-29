package com.sass.ex3;

import java.util.Scanner;

public class RealNumber {

	public void formateRealNumber() {
		System.out.println("Enter the number for formating ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String g = "";
		String j = "";
		int i = 0;//counter
		for (i = 0; str.charAt(i) != '.'; i++) {
			j = j + str.charAt(i);
		}
		++i;
		while (i < str.length() && str.charAt(i) == '0') {
			i++;
		}
		for (int i2 = i; i2 < str.length(); i2++, i++) {
			g = g + str.charAt(i2);
		}
		for (int k = g.length(); k < 5; k++) {
			g = g + '#';
		}
		g = g + '.' + j;
		String fin = "";
		for (int i3 = g.length() - 1; i3 >= 0; i3--) {
			fin = fin + g.charAt(i3);
		}
		i = 0;
		while (fin.charAt(i) == '0') {
			i++;
		}
		String final2 = "";
		for (int i3 = i; i3 < fin.length(); i3++) {
			final2 = final2 + fin.charAt(i3);
		}
		String final3 = "";
		for (int i3 = final2.length() - 1; i3 >= 0; i3--) {
			final3 = final3 + final2.charAt(i3);
		}
		System.out.println(final3);
	}
}
