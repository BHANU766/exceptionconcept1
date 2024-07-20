package com.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Filenotfound {

	public static void main(String[] args) {
		//file not found expection
		
		File file=new File("demo.txt");
		try {
	    	FileReader fr=new FileReader(file);
		}catch(FileNotFoundException e) {
		   e.printStackTrace();
		}
		
		
		

	}

}
