package com.exception;

public class Nullpointer {

	public static void main(String[] args) {
		//nullpointer exception
		
		try {
			String str1=null;
			System.out.println(str1.charAt(0));
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("null pointer exception");
			
		}

	}

}
