package com.sass.ex6;

import java.util.Scanner;

public class RomanConversion {

	public void convertNumberToRoman() {

		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Enter 1 : NUMERIC TO ROMAN");
		System.out.println("Enter 2 : ROMAN TO NUMERIC");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			String num;
			System.out.println("Enter a digit To convert from Numeric to Roman :-");
			num = sc.next();
			int len = String.valueOf(num).length();

			System.out.println(num + " in Roman written as :-");
			for (int i = 0; i < len; i++) {
				if (len == 4) {
					if (i == 0) {
						char q = num.charAt(i);
						int w = Character.getNumericValue(q);
						switch (w) {
						case 1:
							System.out.print("M");
							break;
						case 2:
							System.out.print("MM");
							break;
						case 3:
							System.out.print("MMM");
							break;
						case 4:
							System.out.print("M_V");
							break;
						case 5:
							System.out.print("_V");
							break;
						case 6:
							System.out.print("_VM");
							break;
						case 7:
							System.out.print("_VMM");
							break;
						case 8:
							System.out.print("_VMMM");
							break;
						case 9:
							System.out.print("_IX");
							break;
						default:
							break;
						}
					}
				}
				if (len == 4 || len == 3) {
					int e = 0;
					switch (len) {
					case 4:
						e = 1;
						break;
					case 3:
						e = 0;
						break;
					default:
						break;
					}
					if (i == e) {
						char q = num.charAt(i);
						int w = Character.getNumericValue(q);
						switch (w) {
						case 1:
							System.out.print("C");
							break;
						case 2:
							System.out.print("CC");
							break;
						case 3:
							System.out.print("CCC");
							break;
						case 4:
							System.out.print("CD");
							break;
						case 5:
							System.out.print("D");
							break;
						case 6:
							System.out.print("DC");
							break;
						case 7:
							System.out.print("DCC");
							break;
						case 8:
							System.out.print("DCCC");
							break;
						case 9:
							System.out.print("CM");
							break;
						default:
							break;
						}
					}
				}
				if (len == 4 || len == 3 || len == 2) {
					int r = 0;
					switch (len) {
					case 4:
						r = 2;
						break;
					case 3:
						r = 1;
						break;
					case 2:
						r = 0;
					default:
						break;
					}
					if (i == r) {
						char q = num.charAt(i);
						int w = Character.getNumericValue(q);
						switch (w) {
						case 1:
							System.out.print("X");
							break;
						case 2:
							System.out.print("XX");
							break;
						case 3:
							System.out.print("XXX");
							break;
						case 4:
							System.out.print("XL");
							break;
						case 5:
							System.out.print("L");
							break;
						case 6:
							System.out.print("LX");
							break;
						case 7:
							System.out.print("LXX");
							break;
						case 8:
							System.out.print("LXXX");
							break;
						case 9:
							System.out.print("XC");
							break;
						default:
							break;
						}
					}
				}
				if (len == 4 || len == 3 || len == 2 || len == 1) {
					int t = 0;
					switch (len) {
					case 4:
						t = 3;
						break;
					case 3:
						t = 2;
						break;
					case 2:
						t = 1;
					case 1:
						t = 1;
					default:
						break;
					}
					if (i == t) {
						char q = num.charAt(i);
						int w = Character.getNumericValue(q);
						switch (w) {
						case 1:
							System.out.print("I");
							break;
						case 2:
							System.out.print("II");
							break;
						case 3:
							System.out.print("III");
							break;
						case 4:
							System.out.print("IV");
							break;
						case 5:
							System.out.print("V");
							break;
						case 6:
							System.out.print("VI");
							break;
						case 7:
							System.out.print("VII");
							break;
						case 8:
							System.out.print("VIII");
							break;
						case 9:
							System.out.print("IX");
							break;
						default:
							break;
						}
					}
				}
			}
			break;
		case 2:
			String Roman;
			int sum = 0, a = 0, b = 0;
			System.out.println("Enter a Roman number To convert into Numeric  :-");
			Roman = sc.next();
			for (int i = 0; i < Roman.length(); i++) {
				char c = Roman.charAt(i);
				String s = Character.toString(c);
			
				switch (s) {
				case "I":
					a = 1;
					if (a > b)
						sum = (sum - b) + (a - b);
					else
						sum = sum + 1;
					b = a;
					break;
				case "V":
					a = 5;
					if (a > b)
						sum = (sum - b) + (a - b);
					else
						sum = sum + 5;
					b = a;
					break;
				case "X":
					a = 10;
					if (a > b)
						sum = (sum - b) + (a - b);
					else
						sum = sum + 10;
					b = a;
					break;
				case "L":
					a = 50;
					if (a > b)
						sum = (sum - b) + (a - b);
					else
						sum = sum + 50;
					b = a;
					break;
				case "C":
					a = 100;
					if (a > b)
						sum = (sum - b) + (a - b);
					else
						sum = sum + 100;
					b = a;
					break;
				case "D":
					a = 500;
					if (a > b)
						sum = (sum - b) + (a - b);
					else
						sum = sum + 500;
					b = a;
					break;
				case "M":
					a = 1000;
					if (a > b)
						sum = (sum - b) + (a - b);
					else
						sum = sum + 1000;
					b = a;
					break;
				default:
					break;
				}
			}
			System.out.println(Roman + " in Numeric written as :-");
			System.out.println(sum);
			break;
		default:
			System.out.println("Error : INVALID INPUT");
			break;
		}
	}

}
