package com.noah.Main;

import java.util.Scanner;

/**
 * <h1>Includes method for formating the width of a number.</h1>
 * @author Noah Smith
 */

public class Main {
	/**
	 * Usage:
	 * 
	 * <pre>
	 * {@code format(34, 5) returns "00034"
	 * format(3, 5) returns "00003"}
	 * </pre>
	 * 
	 * @param number (int; number to be formated)
	 * @param width (int; width for number to be formated to)
	 * @return res (String; formated number)
	 */
	public static String format(int number, int width) {
		String res = "";
		String numStr = Integer.toString(number);
		int newWidth = width - numStr.length();
		
		for (int i = 0; i < newWidth; i++) {
			res += 0;
		}
		
		res = res.concat(numStr);
		return res;
	}
}