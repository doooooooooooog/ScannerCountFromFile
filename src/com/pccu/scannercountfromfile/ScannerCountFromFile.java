package com.pccu.scannercountfromfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerCountFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = null;
		int mSum = 0;
		int mAmount = 0;
		String mCustomer = "";
		try {
		     scanner = new Scanner(new File("src/consume.txt"));
		     while (scanner.hasNext()) {
		    // handle customer name
		    mCustomer = scanner.next();
		
		   // handle amount
		   mAmount = scanner.nextInt();
		   mSum += mAmount;
		
		   System.out.println("Name: " + mCustomer +" " + "Amount: " +mAmount);
		         }
		
		} catch (FileNotFoundException e) {
		        e.printStackTrace();
	    } finally {
	    	scanner.close();
	    	 }
	    	System.out.println("Total: " + mSum);

	}

}
