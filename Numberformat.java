package com.exception;

import java.util.Scanner;

public class Numberformat {

	public static void main(String[] args) {
		try {
			//numberformatexception
			Scanner sc = new Scanner(System.in);
			String text = sc.next();
			int num = Integer.parseInt(text);
			System.out.println(text);
		} catch (NumberFormatException e) {
			System.out.println("invalid number entered by user");
		}
				

	}

}
