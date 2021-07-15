package com.assign1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Please enter a string: ");
		String inputString = myObj.nextLine();  // Read user input
		int n = inputString.length();
		boolean isPalin = true;
		String reversedString = "";
		for (int i=0; i<n; i++)
		{
			if (inputString.charAt(i)!=inputString.charAt(n-1-i))
				isPalin = false;
			reversedString = inputString.charAt(i) + reversedString;
		}	
		System.out.println("The reversed string is " + reversedString);	
		if (isPalin)
			System.out.println("This is a palindrome string");
		else
			System.out.println("This is NOT a palindrome string");
	}

}
