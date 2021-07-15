package com.assign1;

import java.util.Scanner;
import java.lang.*;
public class Consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Please enter a string: ");
		String inputString = myObj.nextLine();  // Read user input
		char reso[] = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
		int n = inputString.length();
		int m = reso.length;
		int count = 0;
		String replacingString = "";
		for (int i=0; i<n; i++ )
		{
			for (int j=0; j<m; j++)
			{
				if (Character.toLowerCase(inputString.charAt(i))==reso[j])
					count++;
			}
			
		} 
		for (int j=0; j<m; j++)
		{
			replacingString = inputString.replaceAll(String.valueOf(reso[j]), "*");
			inputString = replacingString;
			replacingString = inputString.replaceAll(String.valueOf(Character.toUpperCase(reso[j])), "*");
			inputString = replacingString;
		}
		System.out.println("Number of resonants character: " + count);
		System.out.println("Replaced string: "+ replacingString);
	}

}
