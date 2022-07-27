package com.sass.ex4;

import java.util.Scanner;

public class AckermannFunction {

	private int m, n;

	public void Ackermann_Function() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two integer values for ackermann function");
		m = sc.nextInt();
		n = sc.nextInt();
		if (m <= 5 && n <= 5) {

			System.out.println(ack(m, n));

		} else
			System.out.println("Error: Do not try values larger then 5");
	}

	public int ack(int m, int n) {
		if (m == 0) {
			return n + 1;
		} else if ((m > 0) && (n == 0)) {
			return ack(m - 1, 1);
		} else if ((m > 0) && (n > 0)) {
			return ack(m - 1, ack(m, n - 1));
		} else
			return n + 1;
	}
}
