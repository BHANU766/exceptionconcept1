package com.exception;

public class Stringindexoutofbound {

	public static void main(String[] args) {
		
		//string index out of bound exception
		
		try {
			String word = "lavish jain";
			System.out.println(word.charAt(34));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("string index out of bound exception"); 
				
			
			
		}
		
       
	}

}
