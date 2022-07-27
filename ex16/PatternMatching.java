package com.sass.ex16;

import java.util.Scanner;

public class PatternMatching {

	private String master;
	private String scan;

	public void findMaxStringLength() {
		System.out.println("Enter the master String :");
		Scanner sc = new Scanner(System.in);
		master = sc.next();
		System.out.println("Enter the scan string :");
		scan = sc.next();
		int currLen = 0, maxLen = 0;
		char charBeforeStar = '~';
		int i = 0, j = 0, k = 0;
		int masterLen = master.length();
		int scanLength = scan.length();

		for (k = 0; k < masterLen; ++k) {

			charBeforeStar = '~';
			currLen = 0;
			for (i = 0, j = k; i < scanLength; ++i) {
				if (j >= masterLen)
					break;

				if (i < scanLength - 1) {
					if (scan.charAt(i + 1) == '*') {
						charBeforeStar = scan.charAt(i);
						i++;
						continue;
					}
				}

				if (scan.charAt(i) == '.' || scan.charAt(i) == master.charAt(j)) {
					++j;
					++currLen;
					if (i == scanLength - 1) {
						if (currLen > maxLen)
							maxLen = currLen;
					}

					if (charBeforeStar != '~' && i == scanLength - 1 && j < masterLen)
						;
					else {
						charBeforeStar = '~';
						continue;
					}
				}

				if (charBeforeStar != '~') {
					if (charBeforeStar == '.' || charBeforeStar == master.charAt(j)) {
						++j;
						++currLen;
						--i;
						continue;
					} else
						charBeforeStar = '~';
				}

				break;
			}
			if (currLen > maxLen && i == scanLength) {
				maxLen = currLen;
			}
			currLen = 0;
			if (masterLen - k < maxLen)
				break;
		}
		System.out.println( maxLen);
	}

}
