package com.sass.ex9;

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class PolynominalAddition {

	public void addPolynominal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Polynominal Expression :");
		String ai = sc.nextLine();
		System.out.println("Enter Second Polynominal Expression :");
		String bi = sc.nextLine();
		String[] a = ai.split(" ");
		String[] b = bi.split(" ");

		TreeMap<Integer, Integer> m1 = new TreeMap<Integer, Integer>();
		TreeMap<Integer, Integer> m2 = new TreeMap<Integer, Integer>();
		TreeMap<Integer, Integer> m3 = new TreeMap<Integer, Integer>(Collections.reverseOrder());
		int key, value;
		for (int i = 0; i < a.length - 1; i = i + 2) {
			if (a[i].equals("-1") && a[i + 1].equals("-1")) {
				break;
			}
			value = Integer.parseInt(String.valueOf(a[i]));
			key = Integer.parseInt(String.valueOf(a[i + 1]));
			m1.put(key, value);
		}
		for (int i = 0; i < b.length - 1; i = i + 2) {
			if (b[i].equals("-1") && b[i + 1].equals("-1")) {
				break;
			}
			value = Integer.parseInt(String.valueOf(b[i]));
			key = Integer.parseInt(String.valueOf(b[i + 1]));
			m2.put(key, value);
		}
	
		Set<Integer> set1 = m1.keySet();
		Set<Integer> set2 = m2.keySet();
		Object[] arr1 = new Integer[set1.size()];
		Object[] arr2 = new Integer[set2.size()];
		arr1 = set1.toArray();
		arr2 = set2.toArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i = 0;
		int j = 0;
		while (i < arr1.length && j < arr2.length) {
			if ((int) arr1[i] < (int) arr2[j]) {
				m3.put((int) arr1[i], (int) m1.get((int) arr1[i]));
				++i;
			}
			if ((int) arr2[j] < (int) arr1[i]) {
				m3.put((int) arr2[j], (int) m2.get((int) arr2[j]));
				++j;
			}
			if ((int) arr1[i] == (int) arr2[j]) {
				int key1 = (int) arr1[i];
				int sum = (int) m1.get(key1) + (int) m2.get(key1);
				m3.put(key1, sum);
				i++;
				j++;
			}
		}
	
		while (i < arr1.length) {
			m3.put((int) arr1[i], (int) m1.get((int) arr1[i]));
			++i;
		}
		while (j < arr2.length) {
			m3.put((int) arr2[j], (int) m2.get((int) arr2[j]));
			++j;
		}
	
		if (m3.containsValue(0)) {
			int zero = 0;

			Set<Integer> keys1 = m3.keySet();
			for (Integer key3 : keys1) {
				if (m3.get(key3) == 0) {
					zero = key3;
				}
			}
			m3.remove(zero);
		}
		Set<Integer> keys2 = m3.keySet();
		// using for loop
		System.out.println("Addition of Above Polynominal Expression is :");
		for (Integer key3 : keys2) {
			System.out.print(m3.get(key3) + " " + key3 + " ");
		}
	}
}
