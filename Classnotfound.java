package com.exception;

public class Classnotfound {

	public static void main(String[] args) {
		
		try {
			Class.forName("test1");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
			System.out.println("class that you trying to search deos not exist");
		}
		
		
		

	}

}
