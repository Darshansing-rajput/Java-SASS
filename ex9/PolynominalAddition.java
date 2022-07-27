package com.sass.ex9;

import java.util.Scanner;
import java.io.*;

public class PolynominalAddition {

	static int[] method(String str) {

		String[] splitArray = str.split("");
		int[] array = new int[splitArray.length];

		for (int i = 0; i < splitArray.length; i++) {
			array[i] = Integer.parseInt(splitArray[i]);
		}
		return array;
	}

	public void takeInputPolyExpression() {

		Scanner sc = new Scanner(System.in);
System.out.println("Enter the first expression :");
		String ex1 = sc.next();
		System.out.println("Enter the second expression :");
		String ex2 = sc.next();
		int[] A = method(ex1);

		int B[] = method(ex2);

		int m = A.length;
		int n = B.length;
		System.out.println("First polynomial is");
		printPoly(A, m);
		System.out.println("\nSecond polynomial is");
		printPoly(B, n);
		int sum[] = add(A, B, m, n);
		int size = max(m, n);
		System.out.println("\nsum polynomial is");
		printPoly(sum, size);
	}

	public int max(int m, int n) {
		return (m > n) ? m : n;
	}

	public int[] add(int A[], int B[], int m, int n) {
		int size = max(m, n);
		int sum[] = new int[size];

		for (int i = 0; i < m; i++) {
			sum[i] = A[i];
		}

		for (int i = 0; i < n; i++) {
			sum[i] += B[i];
		}

		return sum;
	}

	public void printPoly(int poly[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(poly[i]);
			if (i != 0) {
				System.out.print("x^" + i);
			}
			if (i != n - 1) {
				System.out.print(" + ");
			}
		}
	}

}
