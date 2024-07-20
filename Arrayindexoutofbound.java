package com.exception;

import java.util.Scanner;

public class Arrayindexoutofbound {

	public static void main(String[] args) {
		//arrayindexoutofbound
		System.out.println("starter line -1");
		
		int[] array=new int[5];
		
		try {
		array[6]=67;
		System.out.println(array[6]);
		}catch (Exception e) {
			System.out.println("array is crossing maaximum limit for size");
		}
		
		System.out.println("rest code -1");
		System.out.println("rest code -2");
		System.out.println("rest code -3");
		
		

		
		
	}

}
