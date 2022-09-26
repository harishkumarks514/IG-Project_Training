package com.pack;

import java.util.StringTokenizer;

public class Calculation1 {

//	method that returns maximum number
	public static int findMax(int arr[]) {
		// TODO Auto-generated method stub

		int max = 0;
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}

//	method that returns cube of the given number
	public static int cube(int n) {
		// TODO Auto-generated method stub
		return n * n * n;
	}
	
	public static String reverseWords(String str) {
		// TODO Auto-generated method stub

		StringBuilder result = new StringBuilder();
		StringTokenizer tokenizer = new StringTokenizer(str," ");
	
		while(tokenizer.hasMoreTokens())
		{
			StringBuilder sb = new StringBuilder();
			sb.append(tokenizer.nextToken());
			sb.reverse();
			
			result.append(sb);
			result.append(" ");
		}
		return result.toString();
	}
	
}
