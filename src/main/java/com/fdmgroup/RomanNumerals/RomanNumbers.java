package com.fdmgroup.RomanNumerals;

public class RomanNumbers {
	public int toArabic(String roman) {
		char[] charArray = roman.toCharArray();
		int[] intArray = new int[charArray.length];
		int total = 0;
		for (int i = 0; i < charArray.length; i++) {
			intArray[i] = charToInt(charArray[i]);
			if (intArray[i] < 0)
				return -1;
		}

		for (int i = 0; i < intArray.length; i++) {
			if (i == 0) {
				total += intArray[i];
			} else {
				if (intArray[i - 1] < intArray[i]) {
					total += intArray[i] - 2 * intArray[i - 1];
				} else
					total += intArray[i];
			}
		}
		return total;
	}
	/*
	 * I: 1 II: 2 III: 3 IV: 4 (5-1) V: 5 VI: 6 (5+1) ... IX: 9 (10-1) X: 10 L: 50
	 * C: 100 D: 500 M: 1000
	 * 
	 * 2959: M M C ML IX 1000 + 1000 + 100 + 1000 + 50 + 1 + 10
	 */

	private int charToInt(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return -1;
		}
	}
}
